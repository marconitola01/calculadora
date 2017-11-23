
package menuconfunciones;


import javax.swing.JOptionPane;


public class Menuconfunciones {


    public static void main(String[] args) {
        senox seno=new senox();
        cosenox coseno=new cosenox();
        int opcion=0;
        double n1,n2,s,m,r,y,multiplicacion,division,base,expo;
        float x,grados,j;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("//Calculadora// "+
            "*    "+ "1) SENO "+ "2) COSENO"+ "3) POTENCIA"+ "4) FACTORIAL" +"5) series de pi"+"6) tangente"+ " Ingresa una opcion:"));

            switch(opcion)
            {
                case 1://seno
                    
                    grados=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados"));
                    float g=grados; 
                    x=(float) (g*(3.141592/180));
                    y=seno.senodex(x);
                    JOptionPane.showMessageDialog(null,"seno "+(grados)+"="+ y);
                    break;
                
                case 2://coseno
                    grados=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados"));
                    float h=grados; 
                    j=(float) (h * (3.141592/180));
                    y=coseno.cosenox(j);
                    JOptionPane.showMessageDialog(null,"coseno "+(grados)+"="+ y);
                    break;
                
                case 3://potencia
                    base=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero "));
                    expo=Double.parseDouble(JOptionPane.showInputDialog("Ingrese exponente"));
                    double resultado = 1;
                    for(double i=1; i<=expo;i++){
                        resultado = resultado*base;
                    }
                    JOptionPane.showMessageDialog(null,"La potencia es:"+ resultado);
                    break;
                
                case 4: //factorial
            double numero = Double.parseDouble(JOptionPane.showInputDialog("ingrese el numero"));
                    double sumaFacto=1;
                    while (numero>0)
                    {
                        sumaFacto *= numero;
                        numero --;
                    }
         JOptionPane.showMessageDialog(null,"el factorial es ="+sumaFacto);
         break;
                
                case 5: //series de pi
            int termin = Integer.parseInt(JOptionPane.showInputDialog("cuantos terminos desea"));
                    int terminos=termin;
                    double suma=1;
                    double pi=0;
                    for (int i=1;i<terminos;i=i+2)
                    {
                        pi += suma/i;
                        suma= -suma;
                    }
                   JOptionPane.showMessageDialog(null,"pi es igual a:"+pi*4);
               break;
               
                case 6://tangente 
                 grados=Float.parseFloat(JOptionPane.showInputDialog("ingrese los grados"));
            float ñ = grados;
            double l = ñ * 3.1416/180;
            
                 

            }
        }while(opcion!=7);
    }
}
  