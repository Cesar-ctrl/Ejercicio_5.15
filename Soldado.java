package Ejercicio5_15;

public class Soldado {
    private String nomb;
    private String tip;
    private float potFuego;

    private void comprobarPotencia(float fuego) throws NegativoException{
        try{
            if (fuego < 0) throw new NegativoException("Debe ser positivo");
        }catch (Exception e){
            throw new NegativoException(e.getMessage());
        }
    }

    public Soldado(String nombre, String tipo, float potenciaFuego){
        this.nomb = nombre;
        this.tip = tipo;
        this.potFuego = potenciaFuego;
    }

    public String getNomb() {
        return nomb;
    }

    public void setNomb(String nomb) {
        this.nomb = nomb;
    }

    public String getTip() {
        return tip;
    }

    public void setTip(String tip) {
        this.tip = tip;
    }

    public float getPotFuego() {
        return potFuego;
    }

    public void setPotFuego(float potFuego) throws NegativoException{
        comprobarPotencia(potFuego);
        this.potFuego = potFuego;
    }

    @Override
    public String toString() {
        return "Soldado{" +
                "nomb='" + nomb + '\'' +
                ", tip='" + tip + '\'' +
                ", potFuego=" + potFuego +
                '}';
    }
}
/*
* private void compruebaNum(int ptox) throws NumberException{
        try{
            if( ptox < 0 ) throw new NumberException("Las coordenadas positivas");
        }catch (Exception e){
            throw new NumberException(e.getMessage());
        }
    }
*
* */