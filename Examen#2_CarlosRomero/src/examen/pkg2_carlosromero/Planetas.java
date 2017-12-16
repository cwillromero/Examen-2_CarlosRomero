/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_carlosromero;

import java.io.Serializable;

/**
 *
 * @author Will
 */
public class Planetas implements Serializable{

    private String NombrePlaneta;
    private int TemperaturaMedia;
    private String Anillos;
    private String TipoDeSuperficie;
    private double DistanciaATierra;
    private static final long SerialVersionUID=2010L;

    public Planetas() {
    }

    public Planetas(String NombrePlaneta, int TemperaturaMedia, String Anillos, String TipoDeSuperficie, double DistanciaATierra) {
        this.NombrePlaneta = NombrePlaneta;
        this.TemperaturaMedia = TemperaturaMedia;
        this.Anillos = Anillos;
        this.TipoDeSuperficie = TipoDeSuperficie;
        this.DistanciaATierra = DistanciaATierra;
    }

    public String getNombrePlaneta() {
        return NombrePlaneta;
    }

    public void setNombrePlaneta(String NombrePlaneta) {
        this.NombrePlaneta = NombrePlaneta;
    }

    public int getTemperaturaMedia() {
        return TemperaturaMedia;
    }

    public void setTemperaturaMedia(int TemperaturaMedia) {
        this.TemperaturaMedia = TemperaturaMedia;
    }

    public String getAnillos() {
        return Anillos;
    }

    public void setAnillos(String Anillos) {
        this.Anillos = Anillos;
    }

    public String getTipoDeSuperficie() {
        return TipoDeSuperficie;
    }

    public void setTipoDeSuperficie(String TipoDeSuperficie) {
        this.TipoDeSuperficie = TipoDeSuperficie;
    }

    public double getDistanciaATierra() {
        return DistanciaATierra;
    }

    public void setDistanciaATierra(double DistanciaATierra) {
        this.DistanciaATierra = DistanciaATierra;
    }

    @Override
    public String toString() {
        return NombrePlaneta;
    }

}
