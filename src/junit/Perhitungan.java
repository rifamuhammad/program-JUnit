/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit;

/**
 *
 * @author arni
 */
class Perhitungan {
    public double salary(double jamker, double gajinormal, double gajilem){
        double gaji;
        if (jamker <= 40){
            gaji = gajinormal * jamker;
        }else{
            gaji = (40*gajinormal)+((jamker-40)*gajilem);
        }
        return gaji;
    }
    
    public double pengeluaran(double pengeluaran){
        return pengeluaran;
    }
}
