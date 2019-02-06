package Classes;
/**Create a base person class
 * 
 * @author Ekue Kpodar
 *
 */

public class Person {
	private String firstName;
	private String lastName;
	private int age;
	private String ID;
	private Occupation occupation;
	private Gender gender;
	
	
	/**Create Default Constructor
	 * 
	 */
	public Person() {
	
	}



	/**Create Default Constructor
	 * 
	 * @param firstName
	 * 		  The Person's first name
	 * @param lastName
	 * 		  The Person's Last name
	 * @param age
	 * 		  The Person's age
	 * @param iD
	 * 		  The Person's ID
	 * @param occupation
	 * 		  The Person's occupation
	 * @Geneder
	 * 		  The Person's Gender
	 * 
	 * 
	 * 		  
	 */
	public Person(String firstName, String lastName, int age, String iD, Occupation occupation, Gender gender) {
	
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
		this.ID = iD;
		this.occupation = occupation;
		this.gender = gender;
	}



	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}



	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}



	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}



	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}



	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}



	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}



	/**
	 * @return the iD
	 */
	public String getID() {
		return ID;
	}



	/**
	 * @param iD the iD to set
	 */
	public void setID(String iD) {
		ID = iD;
	}



	/**
	 * @return the occupation
	 */
	public Occupation getOccupation() {
		return occupation;
	}



	/**
	 * @param occupation the occupation to set
	 */
	public void setOccupation(Occupation occupation) {
		this.occupation = occupation;
	}



	/**
	 * @return the gender
	 */
	public Gender getGender() {
		return gender;
	}



	/**
	 * @param gender the gender to set
	 */
	public void setGender(Gender gender) {
		this.gender = gender;
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

}
