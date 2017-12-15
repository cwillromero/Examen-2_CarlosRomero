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
public abstract class Naves {

    private String NumeroDeSerie;
    private Planetas PlanetaDestino;
    private int Velocidad;

    public Naves() {
    }

    public Naves(String NumeroDeSerie, Planetas PlanetaDestino, int Velocidad) {
        this.NumeroDeSerie = NumeroDeSerie;
        this.PlanetaDestino = PlanetaDestino;
        this.Velocidad = Velocidad;
    }

    public String getNumeroDeSerie() {
        return NumeroDeSerie;
    }

    public void setNumeroDeSerie(String NumeroDeSerie) {
        this.NumeroDeSerie = NumeroDeSerie;
    }

    public Planetas getPlanetaDestino() {
        return PlanetaDestino;
    }

    public void setPlanetaDestino(Planetas PlanetaDestino) {
        this.PlanetaDestino = PlanetaDestino;
    }

    public int getVelocidad() {
        return Velocidad;
    }

    public void setVelocidad(int Velocidad) {
        this.Velocidad = Velocidad;
    }

    public abstract int[] CalcularTiempo();
}
