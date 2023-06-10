/**
 * DAOManager.java 04/05/23
 * Penulis : Akbar Maryan Bagaskara
 * Deskripsi : pengelola DAO dalam program
 * 
 */
 public class DAOManager{
	private PersonDAO personDAO;

	public void setPersonDAO(PersonDAO person){
		personDAO = person;
	}
	public PersonDAO getPersonDAO(){
		return personDAO;
	}
}