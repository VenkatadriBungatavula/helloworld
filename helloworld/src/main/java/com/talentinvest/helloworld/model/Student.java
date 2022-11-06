package com.talentinvest.helloworld.model;

public class Student {
	private int sId;
	private String sName;
	private int sAge;
	private String sClass;
	private String sDOB;
	private long sPhone;
	
	public Student() {
		
	}

	public Student(int sId, String sName, int sAge, String sClass, String sDOB, long sPhone) {
		super();
		this.sId = sId;
		this.sName = sName;
		this.sAge = sAge;
		this.sClass = sClass;
		this.sDOB = sDOB;
		this.sPhone = sPhone;
	}

	
	public int getsId() {
		return sId;
	}

	public void setsId(int sId) {
		this.sId = sId;
	}

	public String getsName() {
		return sName;
	}

	public void setsName(String sName) {
		this.sName = sName;
	}

	public int getsAge() {
		return sAge;
	}

	public void setsAge(int sAge) {
		this.sAge = sAge;
	}

	public String getsClass() {
		return sClass;
	}

	public void setsClass(String sClass) {
		this.sClass = sClass;
	}

	public String getsDOB() {
		return sDOB;
	}

	public void setsDOB(String sDOB) {
		this.sDOB = sDOB;
	}

	public long getsPhone() {
		return sPhone;
	}

	public void setsPhone(long sPhone) {
		this.sPhone = sPhone;
	}

	@Override
	public String toString() {
		return "Student [sName=" + sName + ", sAge=" + sAge + ", sClass=" + sClass + ", sDOB=" + sDOB + ", sPhone="
				+ sPhone + "]";
	}
	
	

}
