/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tugasjava;

/**
 *
 * @author AMALIA N A
 */
import javax.swing.JOptionPane;
public class TugasJava {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int i, j;
        int panjang;
        
        panjang =Integer.valueOf(JOptionPane.showInputDialog("Jumlah Karakter Segitiga:"));
        System.out.print("Hasil Karakter yang ditampilkan");
         for(i=0;i<=panjang;i++) {
            for(j=0; j<i; j++) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
        System.out.println();