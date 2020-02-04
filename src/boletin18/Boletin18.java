
package boletin18;

public class Boletin18 {

    public static void main(String[] args) {
     boletin18_1 obx1 = new boletin18_1();
     obx1.ArrayAleatorio();
     boletin18_2y3 obx = new boletin18_2y3();
        obx.notas();
        obx.media();
        obx.notaAlta();
        
        boletin18_2y3 obj = new boletin18_2y3();
        int[] notas = new int[6];
        String[] nombre = new String[6];
        
        notas = obj.crearArray(notas);
        nombre = obj.crearArray(nombre);
        obj.notaOrdenada(notas, nombre);
        obj.nota(notas, nombre);
        obj.listaAprobados(notas, nombre);
        
         
        boletin18_4 NIF = new boletin18_4();
        int[] numero={3,11,20,9,22,7,4,18,13,21,19,5,12,8,16,1,15,0,17,2,10,6,14};
        char[] letra=new char []{'a','b','c','d','e','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z'};
        NIF.DNIMuestra(numero, letra);
    }
    
}
