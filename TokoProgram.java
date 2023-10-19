import java.util.Scanner;

public class TokoProgram {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("== UTS PRAKTIKUM DASAR PEMROGRAMAN ==");
        System.out.println("Dibuat oleh : Muhmmad Dimas Ajie Nugroho");
        System.out.println("Kelas/No : 1F/18");
        System.out.println("NIM : 2341720033");
        System.out.println("===========================================");

        int totalHarga = 0;
        int hargaAkhir = 0; // Perbaikan: Inisialisasi hargaAkhir
        int totalhargaMinuman = 0;
        String daftarBarang = "";

        while (true) {
            System.out.print("Jenis barang (minuman/makanan): ");
            String jenisBarang = scanner.next();

            System.out.print("Masukkan jumlah minuman: ");
            int totalMinuman = scanner.nextInt(); // Perbaikan: Total minuman harus dihitung per barang

            System.out.print("Nama barang: ");
            String namaBarang = scanner.next();

            System.out.println("Harga barang");
            int hargaBarang = scanner.nextInt();

            daftarBarang += "Nama barang : " + namaBarang + ", Harga " + hargaBarang + "\n";
            totalHarga += hargaBarang;

            System.out.print("Apakah ingin menambah barang lagi? (y/t): ");
            String jawaban = scanner.next();
            if (jawaban.equals("t")) {
                if (jenisBarang.equals("minuman")) {
                    totalhargaMinuman += totalMinuman; // Perbaikan: Menambahkan jumlah minuman ke totalhargaMinuman
                }
                break;
            }
        }
        if (totalhargaMinuman >= 3) { // Perbaikan: Memeriksa totalhargaMinuman
            double diskonMinuman = totalhargaMinuman * 0.05 ;
            totalHarga -= diskonMinuman;
            System.out.println("Harga setelah potongan 5% : " + totalHarga); // Perbaikan: Cetak totalHarga
        } else {
            System.out.println("Tidak ada potongan harga.");    
        }
        System.out.print("Apakah ingin membeli kantong plastik? (y/t): ");
        String beliPlastik = scanner.next();
        if (beliPlastik.equals("y")) {
            totalHarga += 200;
        }
        if (totalHarga >= 1000000) {
            double ppn = totalHarga * 0.07;
            hargaAkhir = (int) (totalHarga - ppn);
            System.out.println("Diskon 7% untuk total harga di atas 1.000.000: Rp. " + ppn);
        } else {
            hargaAkhir = totalHarga; // Perbaikan: Jika tidak ada diskon, hargaAkhir sama dengan totalHarga
        }
        System.out.println("Daftar Barang yang Dibeli:\n" + daftarBarang);
        System.out.println("Total harga yang harus dibayar: Rp. " + hargaAkhir); // Perbaikan: Cetak hargaAkhir
    }
}