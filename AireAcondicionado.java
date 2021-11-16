public class AireAcondicionado {
    //Crea temperatura
    private double temperatura;
    //Creamos maximo de temperatura
    private double max;
    //Creamos minimo temperatura
    private double min;
    //Creamos incremento de temperatura
    private double incremento;
    //Numero de veces cambiado el aire acondicionado
    private int numeroCambios;
    //Creamos temperatura m�xima
    private double tempMax;
    //Creamos temperatura minima
    private double tempMin;
    
    /**
     * Creamos el aire acondicionado.
     */
    public AireAcondicionado(double minimo, double maximo) {
        temperatura = 15.0;
        incremento = 5.0;
        min = minimo;
        max = maximo;
        numeroCambios = 0;
        tempMax = 15;
        tempMin = 15;
    }
    
    /**
     * Sube la temperatura en x grados
     */
    public void subirTemperatura() { 
        if ((temperatura + incremento) > max){
            System.out.println("##ERROR##");
        }
        else{
            temperatura = temperatura + incremento;
            numeroCambios = numeroCambios + 1;
            if (temperatura > tempMax){
                tempMax = temperatura;    
            }
            
        }
    }
    
    /**
     * Baja la temperatura en x grados
     */
    public void bajarTemperatura() {
        if ((temperatura - incremento) < min){
            System.out.println("##ERROR##");
        }
        else{
            temperatura = temperatura - incremento;
            numeroCambios = numeroCambios + 1;
            if (temperatura < tempMin){
                tempMin = temperatura;    
            }
        }
    }
    
    /**
     * Devuelve el valor de la temperatura
     */
    public double getTemperatura() {
        return temperatura;
    }
    
    /**
     * Modifica el valor del incremento
     */ 
    public void setIncremento(double setIncremento) {
        if (setIncremento <= 0 ) {
            System.out.println("##ERROR##");
        }
        else {
            incremento = setIncremento;
        }
    }
    
    /**
     * Muestra los detalles del aire acondicionado
     */
    public String mostrarDetalles() {
        return "Temperatura actual: "+ temperatura + " - Temp. m�xima posible: "+ max + " - Temp. m�nima posible: "+ min + " - Temp. m�xima seleccionada: "+ tempMax+" - Temp. m�nima seleccionada: " + tempMin +" - Temperatura cambiada "+ numeroCambios + " veces";
    }
    
    /**
     * Imprime las estad�sticas del aire
     */
    public void imprimirDetalles() {
        System.out.println("Temperatura actual: " + temperatura);
        System.out.println("Temperatura m�xima posible: "+ max);
        System.out.println("Temperatura m�nima posible: " + min);
        System.out.println("Temperatura m�xima seleccionada: "+ tempMax);
        System.out.println("Temperatura m�nima seleccionada: " + tempMin);
        System.out.println("Temperatura cambiada "+ numeroCambios + " veces");
    }
}