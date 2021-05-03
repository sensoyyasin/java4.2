package Entities;
import java.util.Date;

public class Customer {
	private int id;
	private String firstName;
	private String sirName;
	private int birthDate;
	private Long nationalityId;
	
	public Customer() {
		
	}
	 public Customer(int id, String firstName, String sirName, Long nationalityId, int birthDate) {
	        this.id = id;
	        this.firstName = firstName;
	        this.sirName = sirName;
	        this.nationalityId = nationalityId;
	        this.birthDate = birthDate;
	    }
	 
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getSirName() {
		return sirName;
	}
	public void setSirName(String sirName) {
		this.sirName = sirName;
	}
	public int getbirthDate() {
		return birthDate;
	}
	public void setBirthDate(int birthDate) {
		this.birthDate = birthDate;
	}
	public long getNationalityId() {
		return nationalityId;
	}
	public void setNationalityId(long nationalityId) {
		this.nationalityId = nationalityId;
	}
}
