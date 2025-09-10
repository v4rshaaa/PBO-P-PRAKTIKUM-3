package id.ac.polban.model;

public class Barang {
   private String nama;
   private int harga;
   private int stock;

   // Constructor
   public Barang(String nama, int harga, int stock) {
      this.nama = nama;
      this.harga = harga;
      this.stock = stock;
   }

   // Method
   public void kurangiStock(int jml) {
      this.stock -= jml;
   }

   // Getter
   public String getNama() {
      return nama;
   }

   public int getHarga() {
      return harga;
   }

   public int getStock() {
      return stock;
   }
}
