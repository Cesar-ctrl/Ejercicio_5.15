package Ejercicio5_15;

public class NegativoException extends Exception{
    public NegativoException(String message){
        super("Esto es negativo o no es un numero: "+ message);
    }

    @Override
    public String getMessage(){ return super.getMessage(); }
}
