package id.ac.polban.service;

import id.ac.polban.model.Barang;
import id.ac.polban.model.Pesanan;
import java.util.Scanner;

public class SistemKoperasi {
   public static void main(String[] args) {
      Scanner input = new Scanner(System.in);

      Barang[] daftar = {
         new Barang("Pulpen", 2000, 12),
         new Barang("Spidol", 5000, 9),
         new Barang("Pensil", 1000, 12),
         new Barang("Penghapus", 500, 10),
         new Barang("Tipex", 3000, 12),
         new Barang("Raket", 30000, 5),
         new Barang("Kursi", 100000, 3)
      };

      boolean lanjut = true;
      while(lanjut){
         System.out.println("=========LIST BARANG YANG TERSEDIA=========");
         System.out.println("    NAMA     |    HARGA    |    STOCK    ");
         System.out.println("1. Pulpen        Rp2.000         " + daftar[0].getStock());
         System.out.println("2. Spidol        Rp5.000         " + daftar[1].getStock());
         System.out.println("3. Pensil        Rp1.000         " + daftar[2].getStock());
         System.out.println("4. Penghapus     Rp500           " + daftar[3].getStock());
         System.out.println("5. Tipex         Rp3.000         " + daftar[4].getStock());
         System.out.println("6. Raket         Rp30.000        " + daftar[5].getStock());
         System.out.println("7. Kursi Roda    Rp100.000       " + daftar[6].getStock());

         int pilihan;
         do {
            System.out.print("Pilih Barang (1-7) Yang Ingin Anda Beli: ");
            pilihan = input.nextInt();

            if(pilihan < 1 || pilihan > 7){
               System.out.println("Barang Tidak Tersedia");
            }
         } while(pilihan < 1 || pilihan > 7);

         System.out.print("Jumlah yang ingin anda pesan: ");
         int jumlah = input.nextInt();

         Barang dipilih = daftar[pilihan - 1];

         if(jumlah > dipilih.getStock()){
            System.out.println("Stok tidak mencukupi. Pesanan dibatalkan.");
            return;
         }     

         Pesanan order = new Pesanan(jumlah, dipilih);

         dipilih.kurangiStock(jumlah);

         System.out.println("\n=====STRUK PESANAN=====");
         System.out.println("Barang: " + order.getItem().getNama());
         System.out.println("Jumlah: " + order.getJumlah());
         System.out.println("Total: " + order.getTotalHarga());

         System.out.print("\nApakah ingin pesan lagi? (y/n): ");
         String jawab = input.next();
         if (jawab.equalsIgnoreCase("n")) {
            lanjut = false;
         }
      }
      input.close();
   }
}
