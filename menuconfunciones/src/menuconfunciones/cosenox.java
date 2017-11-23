
package menuconfunciones;


class cosenox {
    
    public double cosenox(double valor){
          int contador=1;
        double potencia1=1;
        double potencia2=3;
        double y;
        double sumapositiva=0;
        double sumanegativa=0;
        
        factorial facto = new factorial();
        do{
            sumapositiva= sumapositiva-(Math.pow(valor,potencia1))/facto.calcular_factorial(potencia1);
            sumanegativa= sumanegativa+(Math.pow(valor,potencia2))/facto.calcular_factorial(potencia2);
            potencia2=4;
            contador++;
        }
        while (contador<4);
        y=1+sumapositiva+sumanegativa;
        return y;
                
        
    }

}

