/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package registroep;

/**
 *
 * @author Familiar
 */
public class Conductor {
    int id;
    public String placa;
    public String nombre;
    public int cedula;
    public String tipovehiculo;
    public int numplanta;
    public int numaparcamiento;
    String date;
    String hour;

    public Conductor(String placa, String nombre, int cedula, String tipovehiculo, int numplanta, int numaparcamiento, String date, String hour) {
        this.placa = placa;
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipovehiculo = tipovehiculo;
        this.numplanta = numplanta;
        this.numaparcamiento = numaparcamiento;
        this.date = date;
        this.hour = hour;
    }

    
    public Conductor(String placa) {
        this.placa = placa;
    }

    
    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCedula() {
        return cedula;
    }

    public void setCedula(int cedula) {
        this.cedula = cedula;
    }

    public String getTipovehiculo() {
        return tipovehiculo;
    }

    public void setTipovehiculo(String tipovehiculo) {
        this.tipovehiculo = tipovehiculo;
    }

    public int getNumplanta() {
        return numplanta;
    }

    public void setNumplanta(int numplanta) {
        this.numplanta = numplanta;
    }

    public int getNumaparcamiento() {
        return numaparcamiento;
    }

    public void setNumaparcamiento(int numaparcamiento) {
        this.numaparcamiento = numaparcamiento;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }

    
    
}
