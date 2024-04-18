import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Mapping listMahasiswa = new Mapping();
        Scanner s = new Scanner(System.in);

        while (true) {
            System.out.println("1. Tambah Mahasiswa");
            System.out.println("2. Hapus Mahasiswa");
            System.out.println("3. Input Nilai Mahasiswa");
            System.out.println("4. Tampilkan Nilai Mahasiswa");
            System.out.println("5. Keluar");
            int pilihan = s.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.println("Masukkan NIM Mahasiswa: ");
                    String nim = s.next(); s.nextLine();
                    System.out.println("Masukkan nama Mahasiswa: ");
                    String nama = s.next(); s.nextLine();
                    System.out.println("Masukkan kelas Mahasiswa: ");
                    String kelas = s.next(); s.nextLine();

                    listMahasiswa.tambahMahasiswa(new Mahasiswa(nim, kelas, nama));
                    break;
                case 2:
                    System.out.println("Masukkan NIM Mahasiswa: ");
                    nim = s.next(); s.nextLine();
                    System.out.println("Masukkan nama Mahasiswa: ");
                    nama = s.next(); s.nextLine();
                    System.out.println("Masukkan kelas Mahasiswa: ");
                    kelas = s.next(); s.nextLine();

                    listMahasiswa.hapusMahasiswa(new Mahasiswa(nim, kelas, nama));
                    break;
                case 3:
                    System.out.println("Masukkan NIM Mahasiswa: ");
                    nim = s.next(); s.nextLine();
                    System.out.println("Masukkan nama Mahasiswa: ");
                    nama = s.next(); s.nextLine();
                    System.out.println("Masukkan kelas Mahasiswa: ");
                    kelas = s.next(); s.nextLine();
                    System.out.println("Masukkan nilai Mahasiswa: ");
                    double nilai = s.nextInt(); s.nextLine();

                    listMahasiswa.simpanNilai(new Mahasiswa(nim, kelas, nama), nilai);
                    break;
                case 4:
                    listMahasiswa.tampilNilai();
                    break;
                case 5:
                    System.exit(0);
            }
        }
    }
}
