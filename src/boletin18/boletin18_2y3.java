/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package boletin18;

import javax.swing.JOptionPane;

/**
 *
 * @author usuario
 */
public class boletin18_2y3 {
    
    
    int[] notas = new int[31];

// Visualizar notas de aprobados y suspensos
    public void notas() {
        int suspenso = 0;
        int aprobado = 0;
        for (int i = 0; i < notas.length; i++) {
            notas[i] = (int) (Math.random() * 10) + 1;
            if (notas[i] < 5) {
                suspenso++;
            } else {
                aprobado++;
            }
        }
        System.out.println("Aprobados: " + aprobado + " Suspensos: " + suspenso);
    }
// Visualizar la nota media
    public void media() {
        int total = 0;
        for (int i = 0; i < notas.length; i++) {
        total=notas[i]+total;           
        }
        System.out.println("Media de la clase: "+total/notas.length);
        
// Visualizar la nota más alta de la clase
    }
    public void notaAlta(){
        int numeroalto=0;
        for (int i=0 ;i<notas.length; i++){
            if (numeroalto<notas[i]){
                numeroalto=notas[i];
            }
        }
        System.out.println("La nota "+numeroalto+" es la mejor nota de clase");
    }
    public int[] crearArray(int[] Lista) {
        for (int i = 0; i < Lista.length; i++) {
            Lista[i] = (int) (Math.random() * ((10 - 0) + 1));
        }
        return Lista;
    }

    public String[] crearArray(String[]nombre){
        for(int i=0;i<nombre.length;i++){
            nombre[i]=JOptionPane.showInputDialog(null,"Introduzca nombre");
        }
        return nombre;
    }
     public void notaOrdenada(int[] Lista, String[] nombre) {
        int aux;
        String auxnom;
        for (int i = 0; i < Lista.length - 1; i++) {
            for (int j = 0; j < Lista.length; j++) {
                if (Lista[i] > Lista[j]) {
                    aux = Lista[i];
                    Lista[i] = Lista[j];
                    Lista[j] = aux;
                    auxnom = nombre[i];
                    nombre[i] = nombre[j];
                    nombre[j] = auxnom;
                }
            }
        }
        for (int i = 0; i < Lista.length; i++) {
            JOptionPane.showMessageDialog(null, Lista[i] + nombre[i]);
        }
    }

    public void nota(int[] Lista, String[] nombre) {

        String buscado = JOptionPane.showInputDialog(null, "Introduzca nombre del alumno a buscar su nota");
        for (int i = 0; i < Lista.length - 1; i++) {
            for (int j = 0; j < nombre.length - 1; j++) {
                if (nombre[j].equals(buscado)) {
                    JOptionPane.showMessageDialog(null, "La nota de " + buscado + " es: " + Lista[i]);
                    break;
                }
            }
            break;
        }
    }
    
    public void listaAprobados(int[]nota,String[]nombre){
        String []aprobados=new String[nota.length];
        int j=0;
        for(int i=0;i<nota.length;i++){
            if(nota[i]>=5)
                aprobados[j]=nombre[i];
            j++;
        }
    }
}
