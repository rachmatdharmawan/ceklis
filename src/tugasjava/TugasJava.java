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
        
        for(i=0;i<panjang;i++) {
            for(j=i;j<panjang;j++) {
                System.out.print("*");
            }
        System.out.println();
        }
        
        for(i=0; i<=panjang; i++) {
            for(j=0; j<(panjang-i); j++) {
                System.out.print(" ");
            }
            for(int k=0; k<i; k++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
        
        for(i=0; i<panjang; i++) {
            for(int k=0; k<i; k++) {
                System.out.print(" ");
            }
            for(j=0; j<(panjang-i); j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        
         for(i=0; i<=panjang; i++) {
            for (int m=1; m<=panjang-i; m++) {
                System.out.print (" ");
            }
            for (int m=1; m<2*i; m++) {
                System.out.print ("*");
            }
        System.out.println (" ");
        }