import java.util.Scanner;

public class DosenDemo21 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);

        System.out.print("Masukkan jumlah dosen: ");
        int jumlah = input.nextInt();
        input.nextLine();

        Dosen21[] daftarDosen = new Dosen21[jumlah];

        for (int i = 0; i < jumlah; i++) {
            System.out.println("\nMasukkan data dosen ke-" + (i+1));
            System.out.print("Kode: ");
            String kode = input.nextLine();

            System.out.print("Nama: ");
            String nama = input.nextLine();

            System.out.print("Jenis Kelamin (L/P): ");
            char jk = input.next().charAt(0);
            boolean jenisKelamin = (jk == 'L' || jk == 'l');

            System.out.print("Usia: ");
            int usia = input.nextInt();
            input.nextLine();

            daftarDosen[i] = new Dosen21(kode, nama, jenisKelamin, usia);
        }

        System.out.println("\nData Dosen: ");
        for (Dosen21 d : daftarDosen) {
            d.tampilkanInfo();
        }

        System.out.println("------------------------------");

        System.out.println("\nData Semua Dosen:");
        DataDosen21.dataSemuaDosen(daftarDosen);

        System.out.println("Jumlah Dosen Per Jenis Kelamin:");
        DataDosen21.jumlahDosenPerJenisKelamin(daftarDosen);

        System.out.println("Rata-rata Usia Dosen Per Jenis Kelamin:");
        DataDosen21.rerataUsiaDosenPerJenisKelamin(daftarDosen);

        System.out.println("Informasi Dosen dengan Usia Tertua:");
        DataDosen21.infoDosenPalingTua(daftarDosen);

        System.out.println(" Informasi Dosen dengan Usia Termuda:");
        DataDosen21.infoDosenPalingMuda(daftarDosen);

        input.close();
    }
}