package pe.edu.upc.easydrive.dtos;

public class CantidadRvDTO {
    private String nombre;
    private int cantidadReserva;
    private int cantidadResenia;

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCantidadReserva() {
        return cantidadReserva;
    }

    public void setCantidadReserva(int cantidadReserva) {
        this.cantidadReserva = cantidadReserva;
    }

    public int getCantidadResenia() {
        return cantidadResenia;
    }

    public void setCantidadResenia(int cantidadResenia) {
        this.cantidadResenia = cantidadResenia;
    }

}
