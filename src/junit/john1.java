



/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;
import java.util.Scanner;
/**
 *
 * @author arni, rifa , syah fauzan
 */
public class john1 {
    public static void main(String[] args) {
        double gaji;
        double gajinormal = 15000;
        double gajilem = 1.5 * 15000;
        double tabung;
        
        
        Scanner input = new Scanner (System.in);
        System.out.println("Program Perhitungan Gaji Mr.John");
        System.out.println("================================");
        
        System.out.print("Masukan Nama               : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan Jam Kerja          : ");
        int jamker = input.nextInt();

        System.out.print("Masukan Jumlah pengeluaran : ");
        int pengeluaran = input.nextInt();

        if (jamker <= 40){
            gaji = gajinormal * jamker;
        }else{
            gaji = (40*gajinormal)+((jamker-40)*gajilem);
        }
        if (gaji == pengeluaran){
            System.out.println("================================");
            System.out.println("Harus mencari dana tambahan");
        }else if (gaji >= pengeluaran) {
            tabung = gaji - pengeluaran;
            System.out.println("================================");
            System.out.println("Bisa menabung");
            System.out.println("Total Tabungan Rp. " +tabung);
        }else {
            System.out.println("================================");
            System.out.println("tidak bisa menabung");
        }
        
        System.out.println("================================");
        System.out.println("Total Gaji Rp. " +gaji);
        
    }
    
} 
