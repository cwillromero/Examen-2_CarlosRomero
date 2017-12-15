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
public class Expedicion extends Thread{
    private Naves Nave;
    private Planetas PlanetaDestino;
    private int TiempoIda;
    private int TiempoRegreso;
    private Boolean Hilo=true;
    private Boolean vive=true;

    public Expedicion() {
    }

    public Expedicion(Naves Nave, Planetas PlanetaDestino, int TiempoIda, int TiempoRegreso) {
        this.Nave = Nave;
        this.PlanetaDestino = PlanetaDestino;
        this.TiempoIda = TiempoIda;
        this.TiempoRegreso = TiempoRegreso;
    }

    public Naves getNave() {
        return Nave;
    }

    public void setNave(Naves Nave) {
        this.Nave = Nave;
    }

    public Planetas getPlanetaDestino() {
        return PlanetaDestino;
    }

    public void setPlanetaDestino(Planetas PlanetaDestino) {
        this.PlanetaDestino = PlanetaDestino;
    }

    public Boolean getHilo() {
        return Hilo;
    }

    public void setHilo(Boolean Hilo) {
        this.Hilo = Hilo;
    }

    public Boolean getVive() {
        return vive;
    }

    public void setVive(Boolean vive) {
        this.vive = vive;
    }

    public int getTiempoIda() {
        return TiempoIda;
    }

    public void setTiempoIda(int TiempoIda) {
        this.TiempoIda = TiempoIda;
    }

    public int getTiempoRegreso() {
        return TiempoRegreso;
    }

    public void setTiempoRegreso(int TiempoRegreso) {
        this.TiempoRegreso = TiempoRegreso;
    }
    
    @Override
    public void run() {
        while(Hilo==true){
            
        }
    }
}
