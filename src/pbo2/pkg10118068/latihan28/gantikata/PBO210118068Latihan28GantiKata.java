/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo2.pkg10118068.latihan28.gantikata;

import java.util.Scanner;

/**
 *
 * @author
 * NAMA     : Satria Aji Putra
 * KELAS    : IF-2
 * NIM      : 10118068
 * Deskripsi Program : Program untuk mengganti kata dalam suatu kalimat secara
 * otomatis
 */
public class PBO210118068Latihan28GantiKata {
    
    public static String kalimat, kata, toKata;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("====Program Mengganti Kata====\n\n");
        System.out.print("Masukkan Kalimat : ");
        kalimat = scanner.nextLine(); // input kalimat
        
        System.out.print("Ganti Kata : ");
        kata = scanner.next(); // input kata
        
        System.out.print("Menjadi Kata : ");
        toKata = scanner.next(); // input kata ganti
        
        System.out.println("\n====Hasil Formatting====");
        System.out.println("Kalimat awal : " + kalimat);
        
        // mengganti kata
        kalimat = kalimat.replace(kata, toKata);
        System.out.println("Kalimat baru : " + kalimat);
        
    }
    
}
