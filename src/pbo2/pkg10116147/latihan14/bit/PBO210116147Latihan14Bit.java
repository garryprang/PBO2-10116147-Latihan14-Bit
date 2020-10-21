/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package pbo2.pkg10116147.latihan14.bit;

/**
 * @author
 * Nama                 : Garry Prang
 * NIM                  : 10116147
 * Kelas                : PBO-2
 * Deskripsi Program    : Program untuk mengimplementasikan bilangan bit.
 */

public class PBO210116147Latihan14Bit {
    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        int a = 60 ;
        int b = 13;
        int c = 0;
        
        c = a & b;
        /* 12 = 0000 1100*/
        System. out.println("a & b = " + c);
        c = a | b;
        /* 61 = 0011 1101*/
        System.out.println("a | b = " + c);
        c = a ^ b;
        /* 61 = 0011 0001*/
        System. out.println("a ^ b = " + c);
        c = ~a;
        /* 61 = 1100 1101*/
        System. out.println("~a = " + c);
        c = a << 2;
        /* 61 = 1111 0000*/
        System. out.println("a << 2 = " + c);
        c = a >> 2;
        /* 61 = 0000 1111*/
        System. out.println("a >> 2 = " + c);      
     }   
}
