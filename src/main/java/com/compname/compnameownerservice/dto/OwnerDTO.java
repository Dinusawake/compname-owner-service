package com.compname.compnameownerservice.dto;

public class OwnerDTO {
		
	String firstName;
	String lastName;
	String bloodGroup;
	String emailId;
	String currentAddress;
	String permanantAddress;
	double mobileNumber;
	double addharNumber;
	double bankAccountNumber;
	
	public OwnerDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public OwnerDTO(String firstName, String lastName, String bloodGroup, String emailId, String currentAddress,
			String permanantAddress, double mobileNumber, double addharNumber, double bankAccountNumber) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.bloodGroup = bloodGroup;
		this.emailId = emailId;
		this.currentAddress = currentAddress;
		this.permanantAddress = permanantAddress;
		this.mobileNumber = mobileNumber;
		this.addharNumber = addharNumber;
		this.bankAccountNumber = bankAccountNumber;
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

	public String getBloodGroup() {
		return bloodGroup;
	}

	public void setBloodGroup(String bloodGroup) {
		this.bloodGroup = bloodGroup;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getCurrentAddress() {
		return currentAddress;
	}

	public void setCurrentAddress(String currentAddress) {
		this.currentAddress = currentAddress;
	}

	public String getPermanantAddress() {
		return permanantAddress;
	}

	public void setPermanantAddress(String permanantAddress) {
		this.permanantAddress = permanantAddress;
	}

	public double getMobileNumber() {
		return mobileNumber;
	}

	public void setMobileNumber(double mobileNumber) {
		this.mobileNumber = mobileNumber;
	}

	public double getAddharNumber() {
		return addharNumber;
	}

	public void setAddharNumber(double addharNumber) {
		this.addharNumber = addharNumber;
	}

	public double getBankAccountNumber() {
		return bankAccountNumber;
	}

	public void setBankAccountNumber(double bankAccountNumber) {
		this.bankAccountNumber = bankAccountNumber;
	}

	@Override
	public String toString() {
		return "OwnerDTO [firstName=" + firstName + ", lastName=" + lastName + ", bloodGroup=" + bloodGroup
				+ ", emailId=" + emailId + ", currentAddress=" + currentAddress + ", permanantAddress="
				+ permanantAddress + ", mobileNumber=" + mobileNumber + ", addharNumber=" + addharNumber
				+ ", bankAccountNumber=" + bankAccountNumber + "]";
	}
	
	
	
}
