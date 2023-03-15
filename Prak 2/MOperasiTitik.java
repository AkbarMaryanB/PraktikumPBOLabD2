/**
 * File : MOperasiTitik.java 21/02/23
 * Penulis : Asisten Praktikum Lab D
 * Deskripsi : kelas yang berisi program untuk menjalankan kelas Titik.
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