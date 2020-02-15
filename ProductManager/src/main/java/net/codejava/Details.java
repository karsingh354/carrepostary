package net.codejava;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Details {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long customerid;
	
	private String customername;
	private int numberofinnova;
	private int numberofbolero;
	private int numberofotherscars;
	private String contactpersonname;
	private String ownername;
	
	private int totalammount;
	private String bookeddate;
	

	public Details()
	{
		
	}
	

	
	public Long getCustomerid() {
		return customerid;
	}
	public void setCustomerid(Long customerid) {
		this.customerid = customerid;
	}
	public String getCustomername() {
		return customername;
	}
	public void setCustomername(String customername) {
		this.customername = customername;
	}
	public int getNumberofinnova() {
		return numberofinnova;
	}
	public void setNumberofinnova(int numberofinnova) {
		this.numberofinnova = numberofinnova;
	}
	public int getNumberofbolero() {
		return numberofbolero;
	}
	public void setNumberofbolero(int numberofbolero) {
		this.numberofbolero = numberofbolero;
	}
	public int getNumberofotherscars() {
		return numberofotherscars;
	}
	public void setNumberofotherscars(int numberofotherscars) {
		this.numberofotherscars = numberofotherscars;
	}
	public String getContactpersonname() {
		return contactpersonname;
	}
	public void setContactpersonname(String contactpersonname) {
		this.contactpersonname = contactpersonname;
	}
	public String getOwnername() {
		return ownername;
	}
	
	public void setOwnername(String ownername) {
		this.ownername = ownername;
	}
	
    public int getTotalammount() {
		return totalammount;
	}

    public void setTotalammount(int totalammount) {
		this.totalammount = totalammount;
	}



	public String getBookeddate() {
		return bookeddate;
	}



	public void setBookeddate(String bookeddate) {
		this.bookeddate = bookeddate;
	}


	
}