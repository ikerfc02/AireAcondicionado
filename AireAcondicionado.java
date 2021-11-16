public class AireAcondicionado {
    //Crea temperatura
    private double temperatura;
    //Creamos maximo de temperatura
    private double max;
    //Creamos minimo temperatura
    private double min;
    //Creamos incremento de temperatura
    private double incremento;
    
    /**
     * Creamos el aire acondicionado.
     */
    public AireAcondicionado(double minimo, double maximo) {
        temperatura = 15.0;
        incremento = 5.0;
        min = minimo;
        max = maximo;
    }
    
    /**
     * Sube la temperatura en 5 grados
     */
    public void subirTemperatura(){
        if ((temperatura + incremento) > max){
            System.out.println("##ERROR##");
        }
        else{
            temperatura = temperatura + incremento;
        }
    }
    
    /**
     * Baja la temperatura en 5 grados
     */
    public void bajarTemperatura(){
        if ((temperatura - incremento) < min){
            System.out.println("##ERROR##");
        }
        else{
            temperatura = temperatura - incremento;
        }
    }
    
    /**
     * Devuelve el valor de la temperatura
     */
    public double getTemperatura(){
        return temperatura;
    }
    
    /**
     * Modifica el valor del incremento
     */
    public void setIncremento(double setIncremento){
        if (setIncremento <= 0 ) {
            System.out.println("##ERROR##");
        }
        else {
            incremento = setIncremento;
        }
    }
}