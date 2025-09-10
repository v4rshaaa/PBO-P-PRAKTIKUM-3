package id.ac.polban.model;

public class Pesanan {
   private int jumlah;
   private Barang item;

   // Constructor
   public Pesanan(int jumlah, Barang item) {
      this.jumlah = jumlah;
      this.item = item;
   }

   // Getter
   public int getJumlah() {
      return jumlah;
   }

   public Barang getItem() {
      return item;
   }

   public int getTotalHarga() {
      return item.getHarga() * jumlah;
   }
}
