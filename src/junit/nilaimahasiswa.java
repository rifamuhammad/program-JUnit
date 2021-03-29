/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author Arni
 */
public class nilaimahasiswa {
    String NIM;
    String Nama;
    int nilai_Absen;
    int nilai_Tugas;
    int nilai_Uts;
    int nilai_Uas;
    int nilai_Akhir;
    
    void Nilai(){
        nilai_Akhir = (nilai_Absen*10/100) + (nilai_Tugas*20/100) + (nilai_Uts*30/100) + (nilai_Uas*40/100);
    }
    
    void CetakNilai(){
        System.out.println("NIM               : " + NIM);
        System.out.println("Nama              : " + Nama);
        System.out.println("==================================");
        System.out.println("Nilai Absen [10%] : " + nilai_Absen);
        System.out.println("Nilai Tugas [20%] : " + nilai_Tugas);
        System.out.println("Nilai UTS   [30%] : " + nilai_Uts);
        System.out.println("Nilai UAS   [40%] : " + nilai_Uas);
        System.out.println("Nilai Akhir       : " + nilai_Akhir);
        System.out.println("==================================");
        
    }
    
    public static void main(String[] args) {
        nilaimahasiswa mahasiswa = new nilaimahasiswa ();
        
        mahasiswa.NIM         = "1810631170105";
        mahasiswa.Nama        = "Arni Sepharni";
        mahasiswa.nilai_Absen = 100;
        mahasiswa.nilai_Tugas = 90;
        mahasiswa.nilai_Uts   = 90;
        mahasiswa.nilai_Uas   = 100;
        mahasiswa.Nilai();
        mahasiswa.CetakNilai(); 
    }
 }
