public class MataKuliah21 {
    String kodeMK;
    String nama;
    int sks;
    int jumlahJam;

    void tampilkanInformasi() {
        System.out.println("Kode Mata Kuliah: " + kodeMK);
        System.out.println("Nama Mata Kuliah: " + nama);
        System.out.println("SKS: " + sks);
        System.out.println("Jumlah Jam: " + jumlahJam);
        System.out.println();
    }

    void ubahSKS(int sksBaru) {
        sks = sksBaru;
        System.out.println("SKS telah diubah menjadi " + sks);
    }

    void tambahJam(int jam) {
        jumlahJam += jam;
        System.out.println("Jumlah Jam telah ditambahkan menjadi " + jumlahJam);
    }

    void kurangiJam(int jam) {
        if (jumlahJam >= jam) {
            jumlahJam -= jam;
            System.out.println("Jumlah Jam telah dikurangi menjadi " + jumlahJam);
        } else {
            System.out.println("Jumlah Jam tidak cukup untuk dikurangi");
        }
    }

    public MataKuliah21() {
    }

    public MataKuliah21(String kode, String nm, int sks, int jml) {
        this.kodeMK = kode;
        this.nama = nm;
        this.sks = sks;
        this.jumlahJam = jml;
    }
}
