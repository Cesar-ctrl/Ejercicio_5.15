package Ejercicio5_15;

import java.util.ArrayList;


public class Escuadron {
    private final ArrayList<Soldado> soldados = new ArrayList<Soldado>(10);
    private String nomScuad;
    private String capiAlMando;

    public Escuadron(String nombreEscuadron, String capitanAlMando, Soldado soldado){
        this.nomScuad = nombreEscuadron;
        this.capiAlMando = capitanAlMando;
        soldados.add(soldado);
    }

    public void nuevoRecluta(Soldado soldado){
        soldados.add(soldado);
    }

    public String getNomScuad() {
        return nomScuad;
    }

    public void setNomScuad(String nomScuad) {
        this.nomScuad = nomScuad;
    }

    public String getCapiAlMando() {
        return capiAlMando;
    }

    public void setCapiAlMando(String capiAlMando) {
        this.capiAlMando = capiAlMando;
    }

    public float potencia_Fuego(){
        float total = 0;
        for (Soldado soldado : soldados){
            total += soldado.getPotFuego();
        }
        return total;
    }

    public ArrayList<Soldado> getSoldados(){
        return soldados;
    }

    @Override
    public String toString() {
        return "Escuadron{" +
                "soldados=" + soldados +
                ", nomScuad='" + nomScuad + '\'' +
                ", capiAlMando='" + capiAlMando + '\'' +
                '}';
    }


}
