/**
 * File : Poligon.java 21/02/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : kelas yang berisi program untuk membuat kelas poligon dan methodnya.
 * 
 */ 

package org.poligon;

public class Poligon{
	protected int jumlahSisi;
	public void poligon(){
		this.jumlahSisi = 0;
	}
	public void setJumlahSisi(int sisi){
		this.jumlahSisi = sisi;
	}
	public int getJumlahSisi(){
		return this.jumlahSisi;
	}
}