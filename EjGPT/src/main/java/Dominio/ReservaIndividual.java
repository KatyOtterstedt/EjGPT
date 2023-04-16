package Dominio;

import java.util.Scanner;

/*
La clase ReservaIndividual debe calcular el pago según la cantidad de noches y el precio por noche de la
habitación
 */
public class ReservaIndividual extends Reserva implements Pago {

    private int DNI;

    static Scanner read = new Scanner(System.in);

    @Override
    public void realizarPago() {
        System.out.println("Ingrese el nombre de la persona que va a pagar por la reserva");
        this.nombre = read.next();
        System.out.println("Ingrese el DNI de " + this.nombre);
        this.DNI = read.nextInt();
        System.out.println("Ingrese la cantidad de noches que desea alojarse");
        this.cantNoches = read.nextInt();
        System.out.println("Ingrese el tipo de habitación seleccionada (A/B/C)");
        this.tipoHabitacion = read.next().charAt(0); //Esto es el quilombito para leer tipo char
        switch (Character.toUpperCase(this.tipoHabitacion)) {
            case 'A':
                this.precioTotal = HABITACION_A * this.cantNoches;
                System.out.println("Precio a pagar: " + this.precioTotal);
                break;
            case 'B':
                this.precioTotal = HABITACION_B * this.cantNoches;
                System.out.println("Precio a pagar: " + this.precioTotal);
                break;
            case 'C':
                this.precioTotal = HABITACION_C * this.cantNoches;
                System.out.println("Precio a pagar: " + this.precioTotal);
                break;
            default:
                System.out.println("La opción ingresada no es válida");

        }
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

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

}
