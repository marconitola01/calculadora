
package menuconfunciones;


import javax.swing.JOptionPane;


public class Menuconfunciones {


    public static void main(String[] args) {
        senox seno=new senox();
        cosenox coseno=new cosenox();
        int opcion=0;
        double n1,n2,s,m,r,y,suma,resta,multiplicacion,division,base,expo,raizes;
        float x,grados,j;
        do{
            opcion=Integer.parseInt(JOptionPane.showInputDialog("//Calculadora// "+
            "*    "+ "1) SENO "+ "2) COSENO"+ "3) POTENCIA"+ "4) FACTORIAL"+ "5) SUMA"+"6) RESTA"+"7) MULTIPLICACION"+"8) DIVISION"
            +"9) ECUACION CUADRATICA" +  "Ingresa una opcion:"));

            switch(opcion)
            {
                case 1://seno
                    
                    grados=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados"));
                    float g=grados; 
                    x=g*3,1416/180;
                    y=seno.senodex(x);
                    JOptionPane.showMessageDialog(null,"seno "+(grados)+"="+ y);
                    break;
                
                case 2://coseno
                    grados=Float.parseFloat(JOptionPane.showInputDialog("Ingrese los grados"));
                    float h=grados; 
                    j=h*3,1416/180;
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
                
                case 4://factorial
                    double sumaFacto=1;
                    n1=Double.parseDouble(JOptionPane.showInputDialog("Ingrese numero 1"));
                    for(double i=n1;i>1;i++){
                        sumaFacto=sumaFacto*i;
                    }
                    JOptionPane.showMessageDialog(null,"el factorial es:"+ sumaFacto);
                    break;
                case 5://suma
                    n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese numero 2"));
                    suma= n1+n2;
                    JOptionPane.showMessageDialog(null,"la suma es ="+ suma);
                    break;    
                case 6://la resta
                    n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese numero 2"));
                     resta= n1-n2;
                    JOptionPane.showMessageDialog(null,"la resta es ="+ resta);
                case 7://la multiplicacion
                    n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese numero 2"));
                    multiplicacion= n1*n2;
                    JOptionPane.showMessageDialog(null,"la multiplicacion es"+multiplicacion);
                    break;
                case 8://division
                    n1=Double.parseDouble(JOptionPane.showInputDialog("ingrese numero 1"));
                    n2=Double.parseDouble(JOptionPane.showInputDialog("ingrese numero 2"));
                    division = n1/n2;
                    JOptionPane.showMessageDialog(null,"la division es"+ division);
                    break;
                case 9://ecuacion cuadratica ax+bx+c
                    
                    int a=0; int b=0; int c=0;
                    int x1, x2;
                    
                    a=Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de a"));
                    b=Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de b"));
                    c=Integer.parseInt(JOptionPane.showInputDialog("ingrese valor de c"));
                    raizes = (b*(-1)) - (4*a*c);
                    if(raizes>0; a>0){
                        x1= (int) ((int) (-b)+(Math.sqrt(raizes)/2*a));
                        x2= (int) ((int) (-b)-(Math.sqrt(raizes)/2*a));      
                    }
                    JOptionPane.showMessageDialog(null,"la solucion x1 = "+x1+"  la solucion x2 = "+x2);
                    break;
                
                case 10://series de pi
                  n1=Double.parseDouble(JOptionPane.showInputDialog("cuantos terminos desea"));
                    double terminos=n1;
                    double d=1,signo=1;
                    double w, q=0;
                    for (int i=1;i<= terminos;i++){
                        w=(double) 1 / d*signo;
                        q += w;
                        d += 2;
                        signo *= -1;
                    }
                return (double) q * 4;
                
                case 11://suma de remman
                   
                    double acumulador=0;
                    double inicio=Double.parseDouble(JOptionPane.showInputDialog("ingrese el inicio"));
                    double fin=Double.parseDouble(JOptionPane.showInputDialog("ingrese el fin"));
                    double paso=Double.parseDouble(JOptionPane.showInputDialog("ingrese el paso"));
                    for (double i = inicio; i<fin; i=i+paso){
                        acumulador = (acumulador + paso*Math.pow(i, 2);
                    }
                    return acumulador;        
        
               
                    

            }
        }while(opcion!=11);
    }
}
  