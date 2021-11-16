public class AireAcondicionado {
    //Crea temperatura
    private double temperatura;
    
    
    /**
     * Creamos el aire acondicionado.
     */
    public AireAcondicionado() {
        temperatura = 15.0;
    }
    
    /**
     * Sube la temperatura en 5 grados
     */
    public void subirTemperatura(){
        temperatura = temperatura + 5.0;
    }
    
    /**
     * Baja la temperatura en 5 grados
     */
    public void bajarTemperatura(){
        temperatura = temperatura - 5.0;
    }
    
    /**
     * Devuelve el valor de la temperatura
     */
    public double getTemperatura(){
        return temperatura;
    }
}