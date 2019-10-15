/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo11k.pkg10118904.latihan37.programrataratanilai;
import java.util.*;
/**
 *
 * @author Firman Alfinas
 */
public class RatarataNilai {
    private static Scanner input = new Scanner(System.in);
    private int jumlahMahasiswa;
    private int nilaiSatuan;
    private int totalNilai;
    private double avNilai;
    private void masukanNilai(int varJumlahMahasiswa) {
        for(int i = 1; i<=varJumlahMahasiswa;i++) {
            System.out.print("Nilai mahasiswa Ke-"+i+" : ");
            nilaiSatuan = input.nextInt();
            totalNilai = totalNilai + nilaiSatuan;
        }
        avNilai = (double) totalNilai/varJumlahMahasiswa;
        System.out.println("");
        System.out.println("Maka, Rata-rata nilainya adalah "+ avNilai);
        System.out.println("Developed by : Firman Alfinas ");
    }
    
    public void hitungRatarataNilai(int varJumlahMahasiswa) {
        jumlahMahasiswa = varJumlahMahasiswa;
        masukanNilai(jumlahMahasiswa);
    }
    
}

