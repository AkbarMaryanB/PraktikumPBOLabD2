/**
 * File : MOperasiTitik.java 01/03/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : kelas yang berisi program untuk menjalankan kelas OperasiTitik.
 * 
 */ 
 
 class MOperasiTitik{
	 public static void main(String[] args){
		Titik t = new Titik(4,4);
		OperasiTitik o = new OperasiTitik();
		//run program
		System.out.println("Titik : ("+t.getAbsis()+","+t.getOrdinat()+")");
		// Refleksi Sumbu X
		//o.refleksiSumbuX(t);
		//System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
		System.out.println("Titik : (" + t.getAbsis() + "," + o.refleksiX(t) + ")");
		// Refleksi Sumbu Y
		//o.refleksiSumbuY(t);
		//System.out.println("Titik : (" + t.getAbsis() + "," + t.getOrdinat() + ")");
		System.out.println("Titik : (" + o.refleksiY(t) + "," + t.getOrdinat() + ")");
	 }
 }