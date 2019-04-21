package entity;

public class mobil  {

    private String id;
    private String merk;
    private String type;
    private String tahun_pembuatan;

    public boolean equals(Object obj) {
        mobil smr = (mobil) obj;
        return id.equals(smr.getid());
    }

    public mobil(String id, String merk, String type, String tahun_pembuatan) {
        this.id = id;
        this.merk = merk;
        this.type = type;
        this.tahun_pembuatan = tahun_pembuatan;
    }

    public String getid() {
        return id;
    }

    public void setid(String id) {
        this.id = id;
    }

    public String getmerk() {
        return merk;
    }

    public void setmerk(String merk) {
        this.merk = merk;
    }

    public String gettype() {
        return type;
    }

    public void settype(String type) {
        this.type = type;
    }
    public String gettahun_pembuatan() {
        return tahun_pembuatan = tahun_pembuatan;
    }

    public void settahun_pembuatan(String pembuatan_tahun) {
        this.tahun_pembuatan = tahun_pembuatan;
    }
}