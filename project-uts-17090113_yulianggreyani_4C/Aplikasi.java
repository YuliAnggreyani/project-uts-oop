import entity.*;
import service.*;
import java.util.*;


public class Aplikasi {

    private static Scanner scanner;
    private static mobilservice service;

    public static void main(String[] args) {
        int opsi = 5;
        scanner = new Scanner(System.in);
        service = new mobilservice();
        do {
            tampilkanMenu();
            scanner = new Scanner(System.in);
            try {
                opsi = scanner.nextInt();
            } catch(Exception e) {
                System.err.println("Ada kesalahan input");
                opsi = 0;
            }
            proses(opsi);
        } while(opsi != 5);
    }

    private static void proses(int opsi) {
        switch(opsi) {
            case 1:
                tampilkanFormTambahData();
                break;
            case 2:
                tampilkanFormUbahData();
                break;
            case 3:
                tampilkanFormHapusData();
                break;
            case 4:
                service.tampilkanData();
                break;
            case 5:
                System.out.println("Terima kasih telah menggunakan");
                System.out.println("Aplikasi kami.");
        }
    }

    private static void tampilkanFormHapusData() {
        scanner = new Scanner(System.in);
        String id;

        System.out.println("\n--= Form Hapus Data");
        System.out.print  ("ID : ");
        id= scanner.nextLine();
        service.hapusData(id);
    }



    private static void tampilkanFormUbahData() {
        scanner = new Scanner(System.in);
        String id, merk, type, tahun_pembuatan;

        System.out.println("\n--= Form Ubah Data");
        System.out.print  ("ID : ");
        id = scanner.nextLine();
        System.out.print("MERK : ");
        merk = scanner.nextLine();
        System.out.print("TYPE : ");
        type = scanner.nextLine();
        System.out.print("Tahun pembuatan : ");
        tahun_pembuatan = scanner.nextLine();
        service.ubahData(new mobil(id, merk, type, tahun_pembuatan));
    }

    private static void tampilkanFormTambahData() {
        scanner = new Scanner(System.in);
        String id, merk, type, tahun_pembuatan;

        System.out.println("\n--= Form Tambah Data");
        System.out.print  ("ID : ");
        id = scanner.nextLine();
        System.out.print("MERK : ");
        merk = scanner.nextLine();
        System.out.print("TYPE : ");
        type = scanner.nextLine();
        System.out.print("tahun_pembuatan : ");
        tahun_pembuatan= scanner.nextLine();
        service.tambahData(new mobil(id, merk, type, tahun_pembuatan));
    }

    private static void tampilkanMenu() {
        System.out.println("\n--= Menu Aplikasi Invetaris Mobil =--");
        System.out.println("1. Tambah Data");
        System.out.println("2. Ubah Data");
        System.out.println("3. Hapus Data");
        System.out.println("4. Tampilkan Data");
        System.out.println("5. KELUAR");
        System.out.println("----------------");
        System.out.print  ("Pilihan > ");
    }

}