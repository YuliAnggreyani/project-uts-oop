
package service;

import java.util.*;
import entity.*;


public class mobilservice {

    private static List<mobil> data = new LinkedList<mobil>();

    public void tambahData(mobil mbl) {
        data.add(mbl);
        System.out.println("Data sudah tersimpan");
    }

    public void ubahData(mobil mbl) {
        int idx = data.indexOf(mbl);
        if(idx >= 0) data.set(idx, mbl);
        System.out.println("Data sudah berubah");
    }

    public void hapusData(String id) {
        int idx = data.indexOf(new mobil(id, "", "", ""));
        if(idx >= 0) data.remove(idx);
        System.out.println("Data telah terhapus");
    }

    public void tampilkanData() {
        System.out.println("\n--= Isi Data =--");
        int urutan = 1;
        for(mobil mbl : data) {
            System.out.println("data ke-" + urutan++);
            System.out.println("  NAMA : " + mbl.getid());
            System.out.println("  MERK : " + mbl.getmerk());
            System.out.println("  TYPE : " + mbl.gettype());
            System.out.println("  Tahun_pembuatan : " + mbl.gettahun_pembuatan());
        }
    }

}