import java.util.Scanner;

public class MainDosen21 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DataDosen21 daftarDosen = new DataDosen21();
        int pilihan;

        do {
            System.out.println("\n=== MENU DATA DOSEN ===");
            System.out.println("1. Tambah Data Dosen");
            System.out.println("2. Tampil Data Dosen");
            System.out.println("3. Sorting ASC (Termuda ke Tertua)");
            System.out.println("4. Sorting DSC (Tertua ke Termuda)");
            System.out.println("5. Cari Dosen (Nama) [Sequential Search]");
            System.out.println("6. Cari Dosen (Usia) [Binary Search]");
            System.out.println("0. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = sc.nextInt();
            sc.nextLine();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Kode Dosen  : ");
                    String kode = sc.nextLine();
                    System.out.print("Masukkan Nama Dosen  : ");
                    String nama = sc.nextLine();
                    System.out.print("Jenis Kelamin (L = 1, P = 0) : ");
                    boolean jk = sc.nextInt() == 1;
                    System.out.print("Masukkan Usia Dosen  : ");
                    int usia = sc.nextInt();
                    daftarDosen.tambah(new Dosen21(kode, nama, jk, usia));
                    break;
                case 2:
                    daftarDosen.tampil();
                    break;
                case 3:
                    daftarDosen.sortingASC();
                    daftarDosen.tampil();
                    break;
                case 4:
                    daftarDosen.sortingDSC();
                    daftarDosen.tampil();
                    break;
                case 5:
                    System.out.print("Masukkan Nama Dosen yang dicari: ");
                    String cariNama = sc.nextLine();
                    daftarDosen.pencarianDataSequential21(cariNama);
                    break;
                case 6:
                    System.out.print("Masukkan Usia Dosen yang dicari: ");
                    int cariUsia = sc.nextInt();
                    daftarDosen.pencarianDataBinary21(cariUsia);
                    break;
                case 0:
                    System.out.println("Keluar dari program...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid!");
            }
        } while (pilihan != 0);

        sc.close();
    }
}
