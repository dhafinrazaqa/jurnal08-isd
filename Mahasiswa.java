public class Mahasiswa {
    String nim;
    String kelas;
    String nama;

    public Mahasiswa(String nim, String kelas, String nama) {
        this.nim = nim;
        this.kelas = kelas;
        this.nama = nama;
    }

    public String getNim() {
        return nim;
    }

    public String getKelas() {
        return kelas;
    }

    public String getNama() {
        return nama;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        } 
        if (o == null || this.getClass() != o.getClass()) {
            return false; 
        }
  
        Mahasiswa mahasiswa = (Mahasiswa) o;
        return nim.equals(mahasiswa.nim) && kelas.equals(mahasiswa.kelas) && nama.equals(mahasiswa.nama);
    }

    @Override
    public int hashCode() {
        final int HASH_MULTIPLIER = 37;

        int h1 = nim.hashCode();
        int h2 = nama.hashCode();
        int h3 = kelas.hashCode();

        int h = HASH_MULTIPLIER * h1 + h2;
        h = HASH_MULTIPLIER * h + h3;
        return h;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nim='" + nim + '\'' +
                ", kelas='" + kelas + '\'' +
                ", nama='" + nama + '\'' +
                '}';
    }
}