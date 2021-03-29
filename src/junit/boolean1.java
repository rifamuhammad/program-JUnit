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
public class boolean1 {
    public static void main(String[] args) {
        int a=100, b=30;
        
        boolean ab = a>b;
        boolean cd = a<b;
        boolean ef = a>=b;
        boolean gh = a<=b;
        boolean ij = a==b;
        boolean kl = a!=b;
        
        System.out.println(a+">"+b+"=>"+ab);
        System.out.println(a+"<"+b+"=>"+cd);
        System.out.println(a+">="+b+"=>"+ef);
        System.out.println(a+"<="+b+"=>"+gh);
        System.out.println(a+"="+b+"=>"+ij);
        System.out.println(a+"!="+b+"=>"+kl);
        
    }
    
}

