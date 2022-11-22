package src.edu.yana.gui;

public class Mahasiswa {
    private String nama;
    private String email;
    private String nomor;
    private String jurusan;

    public Mahasiswa() {
    }

    public Mahasiswa(String nama, String email, String nomor, String jurusan) {
        this.nama = nama;
        this.email = email;
        this.nomor = nomor;
        this.jurusan = jurusan;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNomor() {
        return nomor;
    }

    public void setNomor(String nomor) {
        this.nomor = nomor;
    }

    public String getJurusan() {
        return jurusan;
    }

    public void setJurusan(String jurusan) {
        this.jurusan = jurusan;
    }

    @Override
    public String toString() {
        return "Mahasiswa{" +
                "nama='" + nama + '\'' +
                ", email='" + email + '\'' +
                ", nomor='" + nomor + '\'' +
                ", jurusan='" + jurusan + '\'' +
                '}';
    }
}
