package Ejercicio5_15;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class Ej515_test {
    Soldado soldado1;
    Soldado soldado2;
    Soldado soldado3;
    Escuadron miEscuadron;

    @BeforeEach
    void crear1(){
        soldado1 = new Soldado("Javi", "Soldado", 1);
        soldado2 = new Soldado("Antonio", "Cabo", 2);
        soldado3 = new Soldado("Alex", "Cabo Mayor", 3);
        miEscuadron = new Escuadron("Escuadron1", "JfOrtega", soldado1);
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getSetSoldados() throws NegativoException {
        assertEquals("Javi", soldado1.getNomb());
        assertEquals("Cabo", soldado2.getTip());
        assertEquals(3 , soldado3.getPotFuego());
        soldado1.setNomb("PePe");
        soldado2.setTip("Soldado de Primera");
        soldado3.setPotFuego(5);
        assertEquals("PePe", soldado1.getNomb());
        assertEquals("Soldado de Primera", soldado2.getTip());
        assertEquals(5, soldado3.getPotFuego());
    }

    @Test
    void Escuadron1(){
        miEscuadron.nuevoRecluta(soldado2);
        //No se que pasa le doy al test y me paracece que lo que se espera y lo que recibe son distintos, pero le das a See differences y te dices que son iguales.
        assertEquals("[Soldado{nomb='Javi', tip='Soldado', potFuego=1.0}, Soldado{nomb='Antonio', tip='Cabo', potFuego=2.0}]", miEscuadron.getSoldados());
    }

    @Test
    void toStringSoldado() {
        assertEquals("Soldado{nomb='Javi', tip='Soldado', potFuego=1.0}", soldado1.toString());
    }

    @Test
    void demasEscuadrones(){
        miEscuadron.nuevoRecluta(soldado2);
        assertEquals("Escuadron1", miEscuadron.getNomScuad());
        assertEquals("JfOrtega", miEscuadron.getCapiAlMando());
        assertEquals(3, miEscuadron.potencia_Fuego());
        miEscuadron.setNomScuad("Chavales");
        miEscuadron.setCapiAlMando("Joserraxd");
        miEscuadron.nuevoRecluta(soldado3);
        assertEquals("Chavales", miEscuadron.getNomScuad());
        assertEquals("Joserraxd", miEscuadron.getCapiAlMando());
        assertEquals(6, miEscuadron.potencia_Fuego());
    }

    @Test
    void toStringEscuadron(){
        assertEquals("Escuadron{soldados=[Soldado{nomb='Javi', tip='Soldado', potFuego=1.0}], nomScuad='Escuadron1', capiAlMando='JfOrtega'}", miEscuadron.toString());
    }
}
