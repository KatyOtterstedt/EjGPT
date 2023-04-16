package Dominio;


public class Reserva {
    protected String nombre;
    protected int cantNoches;
    protected char medioPago;
    protected char tipoHabitacion;
    protected double precioTotal;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantNoches() {
        return cantNoches;
    }

    public void setCantNoches(int cantNoches) {
        this.cantNoches = cantNoches;
    }

    public char getMedioPago() {
        return medioPago;
    }

    public void setMedioPago(char medioPago) {
        this.medioPago = medioPago;
    }

    public char getTipoHabitacion() {
        return tipoHabitacion;
    }

    public void setTipoHabitacion(char tipoHabitacion) {
        this.tipoHabitacion = tipoHabitacion;
    }

    public double getPrecioTotal() {
        return precioTotal;
    }

    public void setPrecioTotal(double precioTotal) {
        this.precioTotal = precioTotal;
    }
    
    
}
