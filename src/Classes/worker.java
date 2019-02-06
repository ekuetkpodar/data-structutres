/**
 * 
 */
package Classes;

/**Create a worker 
 * @author Ekue Kpodar
 *
 */
public class worker extends Person {
	private JobType jobType;
	private String CompanyName;

	/**Create a default worker
	 * 
	 */
	public worker() {
		// TODO Auto-generated constructor stub
	}

	/**Create a worker
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param iD
	 * @param occupation
	 * @param gender
	 */
	public worker(String firstName, String lastName, int age, String iD, Occupation occupation, Gender gender,JobType jobType, String CompanyName) {
		super(firstName, lastName, age, iD, occupation, gender);
		
		this.jobType = jobType;
		this.CompanyName = CompanyName;
	}

	/**
	 * @return the jobType
	 */
	public JobType getJobType() {
		return jobType;
	}

	/**
	 * @param jobType the jobType to set
	 */
	public void setJobType(JobType jobType) {
		this.jobType = jobType;
	}

	/**
	 * @return the companyName
	 */
	public String getCompanyName() {
		return CompanyName;
	}

	/**
	 * @param companyName the companyName to set
	 */
	public void setCompanyName(String companyName) {
		this.CompanyName = companyName;
	}
	
	
	

}
