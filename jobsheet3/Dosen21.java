class Dosen21 {
    String kode;
    String nama;
    Boolean jenisKelamin;
    int usia;

    public Dosen21( String kode, String nama, Boolean jenisKelamin, int usia ) {
        this.kode = kode;
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.usia = usia;
    }

    public String getKode() { return kode; }
    public String getNama() { return nama; }
    public boolean isJenisKelamin() { return jenisKelamin; }
    public int getUsia() { return usia; }

    public void tampilkanInfo() {
        System.out.println("Kode: " + kode);
        System.out.println("Nama: " + nama);
        System.out.println("Jenis Kelamin: " + (jenisKelamin ? "Laki-Laki" : "Perempuan"));
        System.out.println("Usia: " + usia + " tahun");
        System.out.println("------------------------------");
    }
}