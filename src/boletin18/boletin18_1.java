
package boletin18;

public class boletin18_1 {
    int[] numeros = new int[6];
    
    public void ArrayAleatorio(){
    for (int i = 0; i < numeros.length; i++) {
            numeros[i] = (int) (Math.random() * 50) + 1;
            System.out.println("****"+numeros[i]);
    }
}
}
