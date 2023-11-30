package id.ac.undiksha.siak.people;

public class Dosen {

	public String nip;
	public String nama_dosen;
	public String jurusan; 
	public String bidang_keahlian; 
	public String tanggalLahir;
	public String alamat;
	public boolean JenisKelamin;
	
	
	public String getNip() {
		return nip;
	}
	public void setNip(String nip) {
		this.nip = nip;
	}
	public String getNama_dosen() {
		return nama_dosen;
	}
	public void setNama_dosen(String nama_dosen) {
		this.nama_dosen = nama_dosen;
	}
	public String getJurusan() {
		return jurusan;
	}
	public void setJurusan(String jurusan) {
		this.jurusan = jurusan;
	}
	public String getBidang_keahlian() {
		return bidang_keahlian;
	}
	public void setBidang_keahlian(String bidang_keahlian) {
		this.bidang_keahlian = bidang_keahlian;
	}
	public String getTanggalLahir() {
		return tanggalLahir;
	}
	public void setTanggalLahir(String tanggalLahir) {
		this.tanggalLahir = tanggalLahir;
	}
	public String getAlamat() {
		return alamat;
	}
	public void setAlamat(String alamat) {
		this.alamat = alamat;
	}
	
	public boolean isJenisKelamin() {
		return JenisKelamin;
	}

    public String getJenisKelamin() {
        if (this.isJenisKelamin()) {
        	return "laki-laki";
        } else {
            return "perempuan";
        }
    }

    public void setJenisKelamin(boolean jenisKelamin) {
        this.JenisKelamin = jenisKelamin;
    }
	
}
