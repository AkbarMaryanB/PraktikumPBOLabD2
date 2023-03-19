/**
 * File : MKubus.java 15/03/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : kelas yang berisi program untuk menjalankan kelas Mkubus dan menggunakan bangunruang serta bangundatar.
 * 
 */ 


package org.main;

import org.bangunruang.*;
import org.bangundatar.*;

public class MKubus{
	public static void main(String[] args){
		BujurSangkar bujurSangkar = new BujurSangkar(4);
		Kubus kubus = new Kubus(bujurSangkar);
		System.out.println("Luas Permukaan Kubus dengan panjang sisi 4 satuan : "+kubus.hitungLuasAlas());
		System.out.println("Volume Kubus dengan panjang sisi 4 satuan : "+kubus.hitungVolume());
	}
}