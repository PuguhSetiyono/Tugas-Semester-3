package id.ac.undiksha.siak.people;

public class Mahasiswa extends Manusia {


	private String nim;
	private String prodi;
	

	
	public Mahasiswa() {
		this.nim 			= "<masukan nim>";
		this.prodi 			= "<masukan prodi>";
	}
	public Mahasiswa(
			String nim, 
			String nama, 
			String alamat, 
			String prodi, 
			String tanggalLahir, 
			boolean jeniskelamin) {
		super();
		this.nim = nim;
		this.prodi = prodi;
	}
	
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return this.nim;
	}

	public String getProdi() {
		return prodi;
	}

	public void setProdi(String prodi) {
		this.prodi = prodi;
	}

	
	public void printAll() {
		System.out.println(this.getNim());
		System.out.println(this.getProdi());
		
	}
	
	
}