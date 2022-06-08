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

    public String placa;
    public String nombre;
    public int cedula;
    public String tipovehiculo;
    public int numplanta;
    public int numaparcamiento;

    public Conductor(String placa, String nombre, int cedula, String tipovehiculo, int numplanta, int numaparcamiento) {
        this.placa = placa;
        this.nombre = nombre;
        this.cedula = cedula;
        this.tipovehiculo = tipovehiculo;
        this.numplanta = numplanta;
        this.numaparcamiento = numaparcamiento;
    }

    public Conductor() {
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

}
