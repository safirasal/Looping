/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ukl;

/**
 *
 * @author sfrsl
 */
import java.util.Scanner;
public class SK1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       int id[]= {1,2,3,4};
       int gol[]= {1,3,2,3};
       String nama []={"Galuh","Indro","Jedi","Kanu"};
       String alamat[]={"Sawojajar","Kedungkandang","Ijen","Dinoyo"};
       
       Scanner obj = new Scanner(System.in);
        System.out.println("Masukkan id pelanggan:");
        String Idn = obj.nextLine();
        int Idnp= Integer.valueOf(Idn);
        
        System.out.println("Golongan :");
        String golongan = obj.nextLine();
        int iGolongan = Integer.valueOf(golongan);
        
        int bayar = 0;
        int kwh;
        if (iGolongan == 1){
            kwh = 450*720/1000;
            bayar = 1000*kwh;
            System.out.println("Banyak pemakaian listrik sebesar "+kwh);
        }
        else if (iGolongan == 2){
            kwh = 1300*720/1000;
            bayar = 1300*kwh;
            System.out.println("Banyak pemakaian listrik sebesar "+kwh);
        }
        else if (iGolongan == 3){
            kwh = 2200*720/1000;
            bayar = 1500*kwh;
            System.out.println("Banyak pemakaian listrik sebesar "+kwh);
        }
        else{
            System.out.println("Golongan yang anda masukkan tidak terdaftar ");                    
        }
        
        
        System.out.println("=====Print Out====");
        System.out.println("ID:"+Idn);
        
        System.out.println("Nama:"+nama[Idnp-1]);
        System.out.println("Golongan:"+gol[Idnp-1]);
        System.out.println("Alamat:"+alamat[Idnp-1]);
        System.out.println("Tagihan Rp."+(bayar+13000));
       
       
    }
    
}
