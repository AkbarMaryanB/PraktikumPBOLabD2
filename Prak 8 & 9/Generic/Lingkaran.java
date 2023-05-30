/**
 * File      	: Lingkaran.java 30/05/23
 * Penulis 		: Akbar Maryan Bagaskara
 * Deskripsi 	: implementasi Lingkaran sebagai BangunDatar
 *                
 */

public class Lingkaran extends BangunDatar{
	private double jejari;
	
	public Lingkaran(double jejari){
		this.jejari = jejari;
	}
	public double hitungKeliling(){
		return 2*jejari*3.14;
	}
}