/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_carlosromero;

/**
 *
 * @author Will
 */
public class Astronautas {

    private String NombreAstronuta;
    private String Nacinalidad;
    private double Sueldo;
    private String Experiecia;
    private String Sexo;
    private double Peso;

    public Astronautas() {
    }

    public Astronautas(String NombreAstronuta, String Nacinalidad, double Sueldo, String Experiecia, String Sexo, double Peso) {
        this.NombreAstronuta = NombreAstronuta;
        this.Nacinalidad = Nacinalidad;
        this.Sueldo = Sueldo;
        this.Experiecia = Experiecia;
        this.Sexo = Sexo;
        this.Peso = Peso;
    }

    public String getNombreAstronuta() {
        return NombreAstronuta;
    }

    public void setNombreAstronuta(String NombreAstronuta) {
        this.NombreAstronuta = NombreAstronuta;
    }

    public String getNacinalidad() {
        return Nacinalidad;
    }

    public void setNacinalidad(String Nacinalidad) {
        this.Nacinalidad = Nacinalidad;
    }

    public double getSueldo() {
        return Sueldo;
    }

    public void setSueldo(double Sueldo) {
        this.Sueldo = Sueldo;
    }

    public String getExperiecia() {
        return Experiecia;
    }

    public void setExperiecia(String Experiecia) {
        this.Experiecia = Experiecia;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public double getPeso() {
        return Peso;
    }

    public void setPeso(double Peso) {
        this.Peso = Peso;
    }

    @Override
    public String toString() {
        return NombreAstronuta;
    }

}
