package warkopccit;

import java.util.Scanner;
public class WarkopCCIT {
    
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner terdeteksi=new Scanner(System.in);
        int pilih;
        System.out.println("WARKOP CCIT");
        System.out.println("1.KOPI ABC");
        System.out.println("2.TEH TARIK");
        System.out.println("3.INDOMIE GORENG");
        System.out.println("4.ES TEH");
        System.out.println("5.GORENGAN");
        System.out.println("MASUKAN MENU PILIHAN");
        
        pilih=terdeteksi.nextInt();
        if (pilih==1)
            System.out.println("KOPI ABC = 3000");
        else if (pilih==2)
            System.out.println("TEH TARIK = 5000");
        else if (pilih==3)
            System.out.println("INDOMIE GORENG = 7000");
        else if (pilih==4)
            System.out.println("ES TEH = 3000");
        else if (pilih==5)
            System.out.println("GORENGAN = 2000");
        else
            System.out.println("MENU YANG ANDA PILIH TIDAK TERSEDIA");
        for(int i=1; i>0; i--)
        {
            for(int j=1; j>0; j++)
            {
                System.out.println("Apakah Menu Yang Anda Sudah Benar?");
                System.out.println("1.Lanjutkan");
                System.out.println("2.Ubah pesanan");
                System.out.println("pilih:");
                pilih=terdeteksi.nextInt();
                if (pilih==1)
                System.out.println("Enjoy The Food");
                else if (pilih==2)
                System.out.println("Masukan Ubahan Pesanan Anda");
                pilih=terdeteksi.nextInt();
                if (pilih==1)
                    System.out.println("KOPI ABC = 3000");
                else if (pilih==2)
                    System.out.println("TEH TARIK = 5000");
                else if (pilih==3)
                    System.out.println("INDOMIE GORENG = 7000");
                else if (pilih==4)
                    System.out.println("ES TEH = 3000");
                else  if (pilih==5)
                    System.out.println("GORENGAN = 2000");
                else
                    System.out.println("MENU YANG ANDA PILIH TIDAK TERSEDIA");
            }
        }
        
    }
    
}
