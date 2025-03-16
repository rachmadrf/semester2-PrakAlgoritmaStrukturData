public class NilaiMahasiswa {
    String nama;
    int nim, tahunMasuk, nilaiUTS, nilaiUAS;

    NilaiMahasiswa(String nama, int nim, int tahunMasuk, int nilaiUTS, int nilaiUAS) {
        this.nama = nama;
        this.nim = nim;
        this.tahunMasuk = tahunMasuk;
        this.nilaiUTS = nilaiUTS;
        this.nilaiUAS = nilaiUAS;
    }

    static int cariMaksUTS(int[] uts, int kiri, int kanan) {
        if (kiri == kanan) {
            return uts[kiri];
        }
        int tengah = (kiri + kanan) / 2;
        int maksKiri = cariMaksUTS(uts, kiri, tengah);
        int maksKanan = cariMaksUTS(uts, tengah + 1, kanan);
        return Math.max(maksKiri, maksKanan);
    }

    static int cariMinUTS(int[] uts, int kiri, int kanan) {
        if (kiri == kanan) {
            return uts[kiri];
        }
        int tengah = (kiri + kanan) / 2;
        int minKiri = cariMinUTS(uts, kiri, tengah);
        int minKanan = cariMinUTS(uts, tengah + 1, kanan);
        return Math.min(minKiri, minKanan);
    }

    static double hitungRataUAS(NilaiMahasiswa[] daftarMahasiswa) {
        int total = 0;
        for (NilaiMahasiswa m : daftarMahasiswa) {
            total += m.nilaiUAS;
        }
        return (double) total / daftarMahasiswa.length;
    }
}