/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplikasiMahasiswa;

/**
 *
 * @author lilissonia(18090051)
 */
public class Data {

    private String nama;
    private String nim;
    private String kelas;
    private String alamat;

    public Data() {
        nama = "";
        nim = "";
        kelas = "";
        alamat = "";
    }

    public Data(String nama, String nim, String kelas, String alamat) {
        this.nama = nama;
        this.nim = nim;
        this.kelas = kelas;
        this.alamat = alamat;
    }

    public void setnim(String nim) {
        this.nim = nim;
    }

    public String getnim() {
        return nim;
    }
    
    public void setnama(String nama) {
        this.nama = nama;
    }

    public String getnama() {
        return nama;
    }
    
    public void setkelas(String kelas) {
        this.kelas = kelas;
    }

    public String getkelas() {
        return kelas;
    }
    
    public void setalamat(String alamat) {
        this.alamat = alamat;
    }

    public String getalamat() {
        return alamat;
    }
}
