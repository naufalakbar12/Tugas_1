/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package javaapplication1;

class SDN1DEPOK{
    String nama;
    String NISN;
}

public class TugasOOP1 {
    public static void main(String[] args) {
        SDN1DEPOK murid1 = new SDN1DEPOK ();
        SDN1DEPOK murid2 = new SDN1DEPOK ();
        SDN1DEPOK murid3 = new SDN1DEPOK ();
        
        murid1.nama = "Acong Tongtong";
        murid1.NISN = "10031451";
        murid2.nama = "Burhan";
        murid2.NISN = "10031452";
        murid3.nama = "Casman";
        murid3.NISN = "10031453";
        
        System.out.println("Nama Murid: "+ murid1.nama);
        System.out.println("NISN: "+ murid1.NISN);
        System.out.println("Nama Murid: "+ murid2.nama);
        System.out.println("NISN: "+ murid2.NISN);
        System.out.println("Nama Murid: "+ murid3.nama);
        System.out.println("NISN: "+ murid3.NISN);
    }
    
}
