package id.ac.undiksha.siak.people;

import id.ac.undiksha.siak.organisasi.Prodi;

public class Mahasiswa extends Manusia {


	private String nim;
	//private String prodi;
	private Prodi prodi = new Prodi();

	//menurunkan sifat manusia
	public Mahasiswa() {
		this.nim 			= "<masukan nim>";
		//this.prodi 			= "<masukan prodi>";
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
		//this.prodi = prodi;
	}
	
	
	public void setNim(String nim) {
		this.nim = nim;
	}
	
	public String getNim() {
		return this.nim;
	}

   // public String getProdi() {
		//return prodi;
	//}

	public void setProdi(String prodi) {
		//this.prodi = prodi;
	}

	
	public void printAll() {
		super.printAll();         //Dapat memanggil seluruh object dengan memakai superclassnya
		System.out.println(this.getNim());
		//System.out.println(this.getProdi());
		
	}
	

	public void setProdi(Prodi prodi) {
		this.prodi = prodi;
	}
	
}