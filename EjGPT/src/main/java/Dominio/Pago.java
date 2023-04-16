package Dominio;

public interface Pago {

    //Al ser constantes van con mayúsculas y separadas por _ las palabras
    double HABITACION_A = 1000;
    double HABITACION_B = 2000;
    double HABITACION_C = 3000;

    void realizarPago(); //Así creo el método abstracto q después implemento en las clases
}
