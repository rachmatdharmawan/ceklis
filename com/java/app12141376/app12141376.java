package com.java.app12141376;
import java.util.Scanner;

public class app12141376 {
	  String nama;
	byte level = 1;
	byte kesempatan = 5, sisa;
	short tebak;
	short banyak=0;
	int random, score=0;
	char jawab, pilih;
	int total = 0, x=0;
	int[] riwayat = new int[5];
public int Level(){
        return level*100;
    }

    public void hasilmenebak() {
      sisa--;
      banyak++;


System.out.println("Tebakan anda ? " + tebak);
        if (tebak<random){
            System.out.print("Tebakan Anda telalu kecil!");
        }
        if (tebak>random){
            System.out.print("Tebakan Anda telalu besar!");
        }
        if (tebak==random){
            System.out.print("Selamat Anda berhasil menebak sebanyak " + banyak + " kali tebakan");
        }

        if (sisa>0&&tebak!=random){
            System.out.println("Anda mempunyai kesempatan " + sisa + " kali lagi.");
        }
        if (sisa<=0) {
            System.out.println("Game Over");
        }
    }

    public void Nilai() {
        if (banyak>0){
            score= 100*level;
        }
        if (banyak>1){
            score= 70*level;
        }
        if (banyak>2){
            score= 50*level;
        }
        if (banyak>3){
            score= 30*level;
        }
        if (banyak>4){
            score= 0*level;
}
        System.out.println();
        System.out.println(nama + "\t: " + score);
        total=total+score;
    }

    public void History(){
        riwayat[x]=total;
    }

public void totalNilai(){
        System.out.println("Total score anda : " + total);        
    }

public void Reset(){        
    level = 1;
    kesempatan = 5;
    banyak=0;
    total=0;
    }

    public static void main(String[] args) {
        app12141376 main = new app12141376();



        Scanner inputString = new Scanner(System.in);
        Scanner inputAngka = new Scanner(System.in);

        do{
        System.out.println("Masukkan nama Anda untuk memulai game atau tekan 'T' untuk keluar dari game.");
        main.nama=inputString.nextLine();

if ("T".equals(main.nama)){
              break;
          }
          else{
            do {
            main.random = (short) (Math.random()*main.Level());
            System.out.println("# Level " + main.level);  
            System.out.println("Selamat datang " + main.nama);   
            System.out.println("Silakan tebak angka antara 1 s/d " + main.Level());    
            System.out.println("Anda memiliki kesempatan menebak " + main.kesempatan + " kali"); 
            main.sisa=main.kesempatan;

do{
                System.out.println();   
                System.out.println("Silahkan Masukkan tebakan anda : "); 
                main.tebak = inputAngka.nextShort();
                main.hasilmenebak();
            }while(main.tebak!=main.random&&main.sisa>0);


            if (main.tebak==main.random){
                main.Nilai();
                System.out.println("Apakah anda ingin melanjutkan ke level slanjutnya ? (y/t)");
                main.jawab=inputString.nextLine().charAt(0);
                main.level++;
                main.banyak=0;
            }
            else {     break;}
}while(main.jawab=='y');
            main.totalNilai();
            main.Reset();
          }
}while(!"T".equals(main.nama)); 

    }    
}
