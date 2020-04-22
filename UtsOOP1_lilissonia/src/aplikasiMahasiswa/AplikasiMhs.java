package aplikasiMahasiswa;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author lilissonia(18090051)
 */
public class AplikasiMhs {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        AplikasiMhs app = new AplikasiMhs();
        while (true) {
            app.printMenu();
            int pilihan = scan.nextInt();
            switch (pilihan) {
                case 1:
                    System.out.println("Tambah Data Baru");
                    System.out.println("====================");
                    app.addData();
                    break;
                case 2:
                    System.out.println("====================");
                    System.out.println("Data Mahasiswa");
                    app.listData();
                    System.out.println("Ubah Data");
                    app.ubahData();
                    break;
                case 3:
                    System.out.println("====================");
                    System.out.println("Data Mahasiswa");
                    app.listData();
                    System.out.println("Hapus Data");
                    app.hapusData();
                    break;
                case 4:
                    System.out.println("====================");
                    System.out.println("Data Mahasiswa");
                    app.listData();
                    break;
                case 5:
                    System.out.println("====================");
                    System.out.println("\nApakah anda yakin akan keluar dari form? ?");
                    System.out.println("1.Ya \t2.Tidak");
                    char persetuju = scan.next().charAt(0);
                    if (persetuju == '1') {
                        app.printMenu();
                        
                    } else if (persetuju == '2') {
                        System.out.println("thank you for coming.");
                        System.exit(0);
                    }
            }
        }
    }
    
    public void printMenu() {
        Scanner scan = new Scanner(System.in);
        System.out.println("===============================");
        System.out.println("=== APLIKASI DATA MAHASISWA ===");
        System.out.println("===============================");
        System.out.println("1. Tambah Data Mahasiswa" + "\n2. Ubah Data Mahasiswa" 
                + "\n3. Hapus Data Mahasiswa" + "\n4. Lihat Data Mahasiswa" + "\n5. Exit");
        System.out.print("Pilihan: ");
    }

    public void hapusData() {
        Scanner scan = new Scanner(System.in);
        System.out.print("Urutan data yang dihapus: ");
        int idx = Integer.parseInt(scan.nextLine());
        // proses hapus data
        ProsesData.removeData(idx - 1);
    }

    public void ubahData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Urutan data yang diubah: ");
        int idx = Integer.parseInt(scan.nextLine());
        System.out.println("--------------------------");
        System.out.print("nama       : ");
        String nama = scan.nextLine();
        System.out.print("nim      : ");
        String nim = scan.nextLine();
        System.out.print("kelas     : ");
        String kelas = scan.nextLine();
        System.out.print("alamat    : ");
        String alamat = scan.nextLine();
        // proses ubah data
        ProsesData.editData(new Data(nama, nim ,kelas, alamat), idx - 1);
    }

    public void listData() {
        List<Data> result = ProsesData.getListData();
        for (int i = 0; i < result.size(); i++) {
            System.out.println();
            System.out.println("Data ke-" + (i + 1));
            System.out.println("  nama      : " + result.get(i).getnama());
            System.out.println("  nim       : " + result.get(i).getnim());
            System.out.println("  kelas     : " + result.get(i).getkelas());
            System.out.println("  alamat    : " + result.get(i).getalamat());
        }
    }

    public void addData() {
        Scanner scan = new Scanner(System.in);
        System.out.println();
        System.out.print("Nama : ");
        String nama = scan.nextLine();
        System.out.print("NIM : ");
        String nim = scan.nextLine();
        System.out.print("kelas : ");
        String kelas = scan.nextLine();
        System.out.print("alamat : ");
        String alamat = scan.nextLine();
        
        // proses tambah data
        ProsesData.addData(new Data(nama, nim, kelas, alamat));
    }

    
}
