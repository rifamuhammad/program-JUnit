/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

    
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

import java.util.Scanner;

/**
 *
 * @author arni
 */
public class Gaji {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Perhitungan p = new Perhitungan();
        Scanner input = new Scanner (System.in);
        System.out.println("Program Perhitungan Gaji Mr.John");
        System.out.println("================================");
        
        System.out.print("Masukan Nama               : ");
        String nama = input.nextLine();
        
        System.out.print("Masukan Jam Kerja          : ");
        int jamker = input.nextInt();

        System.out.print("Masukan Jumlah pengeluaran : ");
        int pengeluaran = input.nextInt();
        
        
        double gaji = p.salary(jamker,1000,10);
//        double pengeluaran = p.pengeluaran(1000);
        double tabung;
        
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
    }
    
}
