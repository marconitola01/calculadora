
package menuconfunciones;

/**
 *
 * @author Marco Nitola
 */
class factorial {
    public int calcular_factorial(double z){
        int f=1;
        for (int i=1;i<=z;i++){
            f=f*i;
        }
        return f;
    }
}
