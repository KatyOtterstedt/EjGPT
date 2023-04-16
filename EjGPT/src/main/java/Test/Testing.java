/*
Cada reserva debe implementar la interfaz Pago para poder realizar el pago correspondiente a la reserva.
Además, hay dos tipos de reserva: ReservaIndividual y ReservaGrupal. Cada tipo de reserva tiene diferentes
atributos y métodos específicos, pero ambos deben implementar la interfaz Pago.
Tu tarea es crear las clases ReservaIndividual y ReservaGrupal, que extiendan a la clase Reserva e
implementen la interfaz Pago. La clase ReservaIndividual debe tener un atributo adicional dni para el
número de identificación del huésped que realiza la reserva, mientras que la clase ReservaGrupal
debe tener un atributo adicional numHabitaciones para el número de habitaciones reservadas.
Cada tipo de reserva debe implementar el método realizarPago() de manera diferente.
La clase ReservaIndividual debe calcular el pago según la cantidad de noches y el precio por noche de la
habitación, mientras que la clase ReservaGrupal debe calcular el pago según el número de habitaciones 
reservadas y un descuento por reserva grupal.
Finalmente, crea un programa principal que permita crear y mostrar reservas individuales y grupales, 
así como realizar el pago correspondiente a cada reserva.
 */
package Test;

import Dominio.ReservaGrupal;
import Dominio.ReservaIndividual;
import java.util.Scanner;

public class Testing {

    static Scanner read = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("Desea realizar una reserva individual o grupal?");
        String respuesta = read.next();
        respuesta = respuesta.toLowerCase();
        switch (respuesta) {
            case "individual" : 
                ReservaIndividual reservaIndividual = new ReservaIndividual();
                reservaIndividual.realizarPago();
                break;
            case "grupal" :
                ReservaGrupal reservaGrupal = new ReservaGrupal();
                reservaGrupal.realizarPago();
                break;
        }
    }
    
}
