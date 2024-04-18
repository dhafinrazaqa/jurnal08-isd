import java.util.HashMap;

public class Mapping {
    HashMap<Mahasiswa, Double> mapMahasiswa = new HashMap<>();

    public void tambahMahasiswa(Mahasiswa mahasiswa) {
        mapMahasiswa.put(mahasiswa, 0.0);
    }

    public void hapusMahasiswa(Mahasiswa mahasiswa) {
        mapMahasiswa.remove(mahasiswa);
    }

    public void simpanNilai(Mahasiswa mahasiswa, double nilai) {
        if (mapMahasiswa.containsKey(mahasiswa)) {
            mapMahasiswa.put(mahasiswa, nilai);
            System.out.println("Nilai mahasiswa " + mahasiswa.getNim() + " berhasil diupdate");
        } else {
            System.out.println("Mahasiswa dengan NIM " + mahasiswa.getNim() + " tidak ditemukan");
        }
    }

    public void tampilNilai() {
        for (HashMap.Entry<Mahasiswa, Double> entry : mapMahasiswa.entrySet()) {
            System.out.println("NIM: " + entry.getKey().getNim());
            System.out.println("Nama: " + entry.getKey().getNama());
            System.out.println("Kelas: " + entry.getKey().getKelas());
            System.out.println("Nilai: " + entry.getValue());
            System.out.println("==========");
        }
        System.out.println("Rata-rata: " + hitungRataRata());
    }

    public double hitungRataRata() {
        double sum = 0;
        int count = 0;

        for (double nilai : mapMahasiswa.values()) {
            sum += nilai;
            count++;
        }
        return sum / count;
    }
}
