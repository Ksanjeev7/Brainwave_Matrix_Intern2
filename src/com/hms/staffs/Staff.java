package com.hms.staffs;

public class Staff {

	private int staffId;
    private String name;
    private String role;
    private String contact;
    private String department;
    
    
      public  Staff(int staffId, String name, String role, String contact, String department) {
        this.staffId = staffId;
        this.name = name;
        this.role = role;
        this.contact = contact;
        this.department = department;
    }


	public int getStaffId() {
		return this.staffId;
	}


	public String getName() {
		return this.name;
	}


	public String getRole() {
		return this.role;
	}


	public String getContact() {
		return this.contact;
	}


	public String getDepartment() {
		return this.department;
	}
      
}

