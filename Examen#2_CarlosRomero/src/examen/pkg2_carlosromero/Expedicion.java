/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen.pkg2_carlosromero;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author Will
 */
public class Expedicion extends Thread {

    private Naves Nave;
    private Planetas PlanetaDestino;
    private int TiempoIda;
    private int TiempoRegreso;
    private boolean Hilo = true;
    private boolean Hida = true;
    private boolean Hregreso = true;
    private boolean vve = true;
    JLabel lbNave;
    JLabel estado;

    public Expedicion() {
    }

    public Expedicion(Naves Nave, Planetas PlanetaDestino, JLabel lbNave, JLabel estado) {
        this.Nave = Nave;
        this.PlanetaDestino = PlanetaDestino;
        this.lbNave = lbNave;
        this.estado = estado;
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

    public boolean isVve() {
        return vve;
    }

    public void setVve(boolean vve) {
        this.vve = vve;
    }

    @Override
    public void run() {
        while (Hilo == true) {
            while (vve == true) {
                JOptionPane.showMessageDialog(null, "Viaje de Nave: " + Nave.getNumeroDeSerie().toString() + " Iniciado");
                if (Nave instanceof Sonda) {
                    TiempoIda = ((Sonda) Nave).CalcularTiempo()[0];
                    System.out.println("Ida: "+TiempoIda);
                    try {
                        lbNave.setText(Nave.getNumeroDeSerie().toString());
                        estado.setText("Ida a " + PlanetaDestino.toString());
                        Thread.sleep(TiempoIda * 1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Expedicion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "La Nave llegó a:" + PlanetaDestino.toString());
                    TiempoRegreso = ((Sonda) Nave).CalcularTiempo()[1];
                    System.out.println("Regreso: "+ TiempoRegreso);
                    try {
                        JOptionPane.showMessageDialog(null, "La Nave regresa a Tierra");
                        estado.setText("De Regreso a Tierra");
                        Thread.sleep(TiempoRegreso * 1000);
                        estado.setText("De Regreso a Tierra");
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Expedicion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "La Nave llegó a Tierra");
                    estado.setText("Ya en la Tierra");
                    vve = false;
                } else {
                    TiempoIda = ((NaveTripulada) Nave).CalcularTiempo()[0];
                    System.out.println("Ida: "+TiempoIda);
                    try {
                        lbNave.setText(Nave.getNumeroDeSerie().toString());
                        estado.setText("Ida a " + PlanetaDestino.toString());
                        Thread.sleep(TiempoIda * 1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Expedicion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "La Nave llegó a:" + PlanetaDestino.toString());
                    TiempoRegreso = ((NaveTripulada) Nave).CalcularTiempo()[1];
                    System.out.println("Regreaso "+ TiempoRegreso);
                    try {
                        JOptionPane.showMessageDialog(null, "La Nave llegó a Tierra");
                        estado.setText("De Regreso a Tierra");
                        Thread.sleep(TiempoRegreso * 1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(Expedicion.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(null, "La Nave Regresó a Tierra");
                    vve = false;
                    estado.setText("Ya en la Tierra");
                }
                vve = false;
            }
        }
    }
}
