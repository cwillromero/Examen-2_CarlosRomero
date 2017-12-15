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
public class Sonda extends Naves {

    private String Material;
    private double PesoNaveSonda;

    public Sonda(String Material, double PesoNaveSonda, String NumeroDeSerie, Planetas PlanetaDestino, int Velocidad) {
        super(NumeroDeSerie, PlanetaDestino, Velocidad);
        this.Material = Material;
        this.PesoNaveSonda = PesoNaveSonda;
    }

    public Sonda() {
    }

    public String getMaterial() {
        return Material;
    }

    public void setMaterial(String Material) {
        this.Material = Material;
    }

    public double getPesoNaveSonda() {
        return PesoNaveSonda;
    }

    public void setPesoNaveSonda(double PesoNaveSonda) {
        this.PesoNaveSonda = PesoNaveSonda;
    }
    
    
    @Override
    public int[] CalcularTiempo() {
        Planetas p=super.getPlanetaDestino();
        int ida=((int)p.getDistanciaATierra())/super.getVelocidad();
        int regreso=(int)9.8*ida;
        int[] ar={ida,regreso};
        return ar;
    }

}
