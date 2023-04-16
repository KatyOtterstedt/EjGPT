package Dominio;

import java.util.Scanner;

/*
La clase ReservaGrupal debe calcular el pago según el número de habitaciones 
reservadas y un descuento por reserva grupal.
 */
public class ReservaGrupal extends Reserva implements Pago {

    private int numHabitaciones;
    private double precioHabitacion;

    static Scanner read = new Scanner(System.in);

    @Override
    public void realizarPago() {
        System.out.println("Ingrese el número de habitaciones que desea reservar");
        this.numHabitaciones = read.nextInt();
        this.precioTotal = 0;
        for (int i = 0; i < this.numHabitaciones; i++) {
            System.out.println("Ingrese el tipo de habitación seleccionada (A/B/C) para la habitación número " + i);
            this.tipoHabitacion = read.next().charAt(0); //Esto es el quilombito para leer tipo char

            switch (Character.toUpperCase(this.tipoHabitacion)) {
                case 'A':
                    this.precioHabitacion = HABITACION_A * this.cantNoches;
                    break;
                case 'B':
                    this.precioHabitacion = HABITACION_B * this.cantNoches;
                    break;
                case 'C':
                    this.precioHabitacion = HABITACION_C * this.cantNoches;
                    break;
                default:
                    System.out.println("La opción ingresada no es válida");
            }
            this.precioTotal += this.precioHabitacion;
        }
        
        if (this.numHabitaciones >3) {
            System.out.println("Usted tiene un descuento del 10%");
            this.precioTotal *= .9;
        } else if (this.numHabitaciones > 5) {
            System.out.println("Usted tiene un descuento del 15%");
            this.precioTotal *= .85;
        } else if (this.numHabitaciones>10) {
            System.out.println("Usted tiene un descuento del 20%");
            this.precioTotal *= .8;
        }
        System.out.println("Precio a pagar: " + this.precioTotal);
        System.out.println(" ");
         System.out.println("Ingrese el medio de pago (E/D/C)");
        this.medioPago = read.next().charAt(0);
        this.medioPago = Character.toUpperCase(medioPago); //Así para cambiar de mayus a minusc en tipo char
        switch (this.medioPago) {
            case 'E':
                System.out.println("El precio en efectivo se abona al llegar");
                break;
            case 'D':
                System.out.println("En un momento le pediremos los datos de su tarjeta para hacer el pago");
                break;
            case 'C':
                System.out.println("Al pagar con crédito, tiene un 10% de recargo");
                this.precioTotal = 1.1*this.precioTotal;
                break;
            default:
                System.out.println("La opción ingresada no es válida");

        }
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public double getPrecioHabitacion() {
        return precioHabitacion;
    }

    public void setPrecioHabitacion(double precioHabitacion) {
        this.precioHabitacion = precioHabitacion;
    }

}
