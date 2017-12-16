/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_carlosromero;

import java.util.ArrayList;

/**
 *
 * @author Will
 */
public class NaveTripulada extends Naves {

    private String LugarDespeja;
    private ArrayList<Astronautas> atronautas = new ArrayList();

    public NaveTripulada() {
    }

    public NaveTripulada(String LugarDespeja, String NumeroDeSerie, Planetas PlanetaDestino, int Velocidad) {
        super(NumeroDeSerie, PlanetaDestino, Velocidad);
        this.LugarDespeja = LugarDespeja;
    }

    public String getLugarDespeja() {
        return LugarDespeja;
    }

    public void setLugarDespeja(String LugarDespeja) {
        this.LugarDespeja = LugarDespeja;
    }

    public ArrayList<Astronautas> getAtronautas() {
        return atronautas;
    }

    public void setAtronautas(ArrayList<Astronautas> atronautas) {
        this.atronautas = atronautas;
    }

    @Override
    public int[] CalcularTiempo() {
        Planetas p=super.getPlanetaDestino();
        int peso=0;
        for (int i = 0; i < atronautas.size(); i++) {
            peso+=atronautas.get(i).getPeso();
        }
        int ida=(int)((p.getDistanciaATierra())/(((peso*peso)*super.getVelocidad())/100));
        int regreso=(int)((p.getDistanciaATierra())/(((peso)*super.getVelocidad())/100));
        int[] ar={ida,regreso};
        return ar;
    }

}
