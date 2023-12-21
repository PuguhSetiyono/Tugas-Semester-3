package id.ac.undiksha.siak;

import id.ac.undiksha.siak.people.Manusia;
import id.ac.undiksha.siak.people.Mahasiswa;
import id.ac.undiksha.siak.people.Dosen;
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Mahasiswa AnkitPgh =  new Mahasiswa();
		
		AnkitPgh.setNim("2215101081");
		AnkitPgh.setNama("AnkitPgh");
		AnkitPgh.setTanggalLahir("1 Januari 2002");
		AnkitPgh.setProdi("Ilmu Komputer");
		AnkitPgh.setAlamat("Singaraja");
		AnkitPgh.setJeniskelamin(false); 


		
		/*ani.nim = "2215092";
		ani.nama = "ani";
		ani.tanggalLahir = "1 Januari 2000";
		ani.jeniskelamin = true;
		ani.prodi = "Ilmu Komputer";
		ani.alamat = "Singaraja";
		*/
		
		System.out.println(AnkitPgh.getNim());
		System.out.println(AnkitPgh.getNama());
		System.out.println(AnkitPgh.getTanggalLahir());
		//System.out.println(AnkitPgh.getProdi());
		System.out.println(AnkitPgh.getAlamat());
		System.out.println(AnkitPgh.getJenisKelamin());
		
		
		 Dosen Michael = new Dosen();
	        Michael.setNip("0899213");
	        Michael.setNama_dosen("Michael");
	        Michael.setAlamat("Denpasar");
	        Michael.setBidang_keahlian("Cyber Security");
	        Michael.setJenisKelamin(true);

	        System.out.println("---------");
	        
	        System.out.println(Michael.getNip());
	        System.out.println(Michael.getNama_dosen());
	        System.out.println(Michael.getAlamat());
	        System.out.println(Michael.getJenisKelamin());
	        System.out.println(Michael.getBidang_keahlian());
		
	        System.out.println("-----------");
		
	}

}
