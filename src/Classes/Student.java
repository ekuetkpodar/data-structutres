package Classes;

public class Student extends Person {
	
	private String schoolName;
	private Year year;
	

	
	
	/**Create a new Student Object with field
	 * 
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param iD
	 * @param occupation
	 * @param gender
	 */
	public Student(String firstName, String lastName, int age, String iD, Occupation occupation, Gender gender,String schoolName,Year year) {
		super(firstName, lastName, age, iD, occupation, gender);
		
		this.schoolName = schoolName;
		this.year = year;
		
	}
	
	





	/**
	 * @return the schoolName
	 */
	public String getSchoolName() {
		return schoolName;
	}





	/**
	 * @param schoolName the schoolName to set
	 */
	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}





	/**
	 * @return the year
	 */
	public Year getYear() {
		return year;
	}





	/**
	 * @param year the year to set
	 */
	public void setYear(Year year) {
		this.year = year;
	}

	
	
	
}
