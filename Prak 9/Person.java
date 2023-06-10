/**
 * Person.java 04/05/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : Person database model
 * 
 */
 public class Person{
	private int id;
	private String name;
	
	public Person(String n){
		name = n;
	}
	
	public int getid(){
		return id;
	}
	
	public String getName(){
		return name;
	}
}