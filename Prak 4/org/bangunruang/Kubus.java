/**
 * File : Kubus.java 21/02/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : kelas yang berisi program untuk membuat kelas kubus dan methodnya.
 * 
 */ 

package org.bangunruang ;

import org.bangundatar.BujurSangkar ;

public class Kubus {
	private BujurSangkar permukaan ;
	public Kubus(BujurSangkar permukaan){
		 this.permukaan = permukaan ;
	}
	public double hitungVolume(){
		double panjangSisi = permukaan.getPanjangSisi() ;
		return panjangSisi * panjangSisi * panjangSisi ;
	}

	public double hitungLuasAlas(){
		double panjangSisi = permukaan.getPanjangSisi() ;
		return panjangSisi * panjangSisi ;
	}
}