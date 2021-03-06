package models;

/**
 * Created by Administrador on 04/11/2015.
 */
public class Vehiculo_Usuario {

    private int ID_vehiculo;
    private String marca;
    private String modelo;
    private int year;
    private String color;
    private int kilometraje;
    private String FK_ID_usuario;
    private int contador;

    public int getContador() {
        return contador;
    }

    public void setContador(int contador) {
        this.contador = contador;
    }

    public Vehiculo_Usuario(int ID_vehiculo, String marca, String modelo,
                            int year, String color, int kilometraje,
                            String FK_ID_usuario) {

        this.ID_vehiculo = ID_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.kilometraje = kilometraje;
        this.FK_ID_usuario = FK_ID_usuario;
    }

    public Vehiculo_Usuario(String marca, String modelo, int year,
                            String color, int kilometraje,
                            String FK_ID_usuario) {

        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.kilometraje = kilometraje;
        this.FK_ID_usuario = FK_ID_usuario;
    }

    public Vehiculo_Usuario(int ID_vehiculo, String marca, String modelo,
                            int year, String color, int kilometraje,
                            String FK_ID_usuario, int contador) {
        this.ID_vehiculo = ID_vehiculo;
        this.marca = marca;
        this.modelo = modelo;
        this.year = year;
        this.color = color;
        this.kilometraje = kilometraje;
        this.FK_ID_usuario = FK_ID_usuario;
        this.contador = contador;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getKilometraje() {
        return kilometraje;
    }

    public void setKilometraje(int kilometraje) {
        this.kilometraje = kilometraje;
    }

    public String getFK_ID_usuario() {
        return FK_ID_usuario;
    }

    public void setFK_ID_usuario(String FK_ID_usuario) {
        this.FK_ID_usuario = FK_ID_usuario;
    }

    public int getID_vehiculo() {
        return ID_vehiculo;
    }

    public void setID_vehiculo(int ID_vehiculo) {
        this.ID_vehiculo = ID_vehiculo;
    }
}
