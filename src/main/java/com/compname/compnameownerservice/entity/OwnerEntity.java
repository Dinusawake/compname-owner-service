package com.compname.compnameownerservice.entity;
import javax.persistence.Column;
import javax.persistence.Entity;


import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Owners")
public class OwnerEntity {

	@Id
	private int  id;

	@Column(name="firstName")
	String firstName;

	@Column(name="lastName")
	String lastName;

	@Column(name="currentAddress")
	String currentAddress;

	@Column(name="permanantAddress")
	String permanantAddress;

	@Column(name="bloodgroup")
	String bloodgroup;

	@Column(name="emailId")
	String emailId;

	@Column(name="plotNo")
	int plotNo;

	@Column(name="addharNumber")
	double addharNumber;

	@Column(name="bankAccoutNumber")
	double bankAccoutNumber;

	@Column(name="mobileNumber")
	double mobileNumber;

	

	

	public OwnerEntity(int id, String firstName, String lastName, String currentAddress, String permanantAddress,
			String bloodgroup, String emailId, int plotNo, double addharNumber, double bankAccoutNumber,
			double mobileNumber) {
		super();
		this.id = id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.currentAddress = currentAddress;
		this.permanantAddress = permanantAddress;
		this.bloodgroup = bloodgroup;
		this.emailId = emailId;
		this.plotNo = plotNo;
		this.addharNumber = addharNumber;
		this.bankAccoutNumber = bankAccoutNumber;
		this.mobileNumber = mobileNumber;
	}


	public OwnerEntity() {
		// TODO Auto-generated constructor stub
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

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getpermanantAddress() {
		return permanantAddress;
	}

	public void setpermanantAddress(String permanantAddress) {
		this.permanantAddress = permanantAddress;
	}

	public String getBloodgroup() {
		return bloodgroup;
	}

	public void setBloodgroup(String bloodgroup) {
		this.bloodgroup = bloodgroup;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public int getPlotNo() {
		return plotNo;
	}

	public void setPlotNo(int plotNo) {
		this.plotNo = plotNo;
	}

	public double getAddharNumber() {
		return addharNumber;
	}

	public void setAddharNumber(double addharNumber) {
		this.addharNumber = addharNumber;
	}

	public double getBankAccoutNumber() {
		return bankAccoutNumber;
	}

	public void setBankAccoutNumber(double bankAccoutNumber) {
		this.bankAccoutNumber = bankAccoutNumber;
	}

	public double getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	@Override
	public String toString() {
		return "OwnerEntity [id=" + id + ", firstName=" + firstName + ", lastName=" + lastName + ", currentAddress="
				+ currentAddress + ", permanantAddress=" + permanantAddress + ", bloodgroup=" + bloodgroup
				+ ", emailId=" + emailId + ", plotNo=" + plotNo + ", addharNumber=" + addharNumber
				+ ", bankAccoutNumber=" + bankAccoutNumber + ", mobileNumber=" + mobileNumber + "]";
	}



}
