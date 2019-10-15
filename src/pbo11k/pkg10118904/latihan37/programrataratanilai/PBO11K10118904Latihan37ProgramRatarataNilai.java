/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan37.programrataratanilai;
import java.util.*;
/**
 *
 * @author ACER
 * Nama     : Firman Alfinas
 * Kelas    : IF 11-K
 * Nim      : 10118904
 * Deskripsi Program : Program ini berisi tentang program rata-rata nilai
 */
public class PBO11K10118904Latihan37ProgramRatarataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        RatarataNilai rrn = new RatarataNilai();
        int n;
        System.out.print("Masukan banyaknya mahasiswa : ");
        n = input.nextInt();
        rrn.hitungRatarataNilai(n);
    }
    
}
