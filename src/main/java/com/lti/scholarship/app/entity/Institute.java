package com.lti.scholarship.app.entity;

import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

import org.hibernate.id.Assigned;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "TBL_INSTITUTE")
public class Institute {
	
	@Id
	private String instituteCode;
	
	private String instituteCategory;
	private String instituteName;
	private String stateOfInstitute;
	private String districtOfInstitute;
	private String diseCode;
	
	private String location;
	private String instituteType;
	private String affiUniversityState;
	private String affiUniversityName;
	private String admissionStartYear;
	
	private String password;
	private String instituteEstCertificate;
	private String universityAffiCertificate;
	private String instituteAddress;
	private String instituteCity;
	
	private String instituteState;
	private String institutePinCode;
	private String mobileNo;

	// one institute many students
	@OneToMany(mappedBy = "institute")
	private Set<Student> students;

	public Institute() {
		super();
	}

	public String getInstituteCode() {
		return instituteCode;
	}

	public void setInstituteCode(String instituteCode) {
		this.instituteCode = instituteCode;
	}

	public String getInstituteCategory() {
		return instituteCategory;
	}

	public void setInstituteCategory(String instituteCategory) {
		this.instituteCategory = instituteCategory;
	}

	public String getInstituteName() {
		return instituteName;
	}

	public void setInstituteName(String instituteName) {
		this.instituteName = instituteName;
	}

	public String getStateOfInstitute() {
		return stateOfInstitute;
	}

	public void setStateOfInstitute(String stateOfInstitute) {
		this.stateOfInstitute = stateOfInstitute;
	}

	public String getDistrictOfInstitute() {
		return districtOfInstitute;
	}

	public void setDistrictOfInstitute(String districtOfInstitute) {
		this.districtOfInstitute = districtOfInstitute;
	}

	public String getDiseCode() {
		return diseCode;
	}

	public void setDiseCode(String diseCode) {
		this.diseCode = diseCode;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public String getInstituteType() {
		return instituteType;
	}

	public void setInstituteType(String instituteType) {
		this.instituteType = instituteType;
	}

	public String getAffiUniversityState() {
		return affiUniversityState;
	}

	public void setAffiUniversityState(String affiUniversityState) {
		this.affiUniversityState = affiUniversityState;
	}

	public String getAffiUniversityName() {
		return affiUniversityName;
	}

	public void setAffiUniversityName(String affiUniversityName) {
		this.affiUniversityName = affiUniversityName;
	}

	public String getAdmissionStartYear() {
		return admissionStartYear;
	}

	public void setAdmissionStartYear(String admissionStartYear) {
		this.admissionStartYear = admissionStartYear;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getInstituteEstCertificate() {
		return instituteEstCertificate;
	}

	public void setInstituteEstCertificate(String instituteEstCertificate) {
		this.instituteEstCertificate = instituteEstCertificate;
	}

	public String getUniversityAffiCertificate() {
		return universityAffiCertificate;
	}

	public void setUniversityAffiCertificate(String universityAffiCertificate) {
		this.universityAffiCertificate = universityAffiCertificate;
	}

	public String getInstituteAddress() {
		return instituteAddress;
	}

	public void setInstituteAddress(String instituteAddress) {
		this.instituteAddress = instituteAddress;
	}

	public String getInstituteCity() {
		return instituteCity;
	}

	public void setInstituteCity(String instituteCity) {
		this.instituteCity = instituteCity;
	}

	public String getInstituteState() {
		return instituteState;
	}

	public void setInstituteState(String instituteState) {
		this.instituteState = instituteState;
	}

	public String getInstitutePinCode() {
		return institutePinCode;
	}

	public void setInstitutePinCode(String institutePinCode) {
		this.institutePinCode = institutePinCode;
	}



	public String getMobileNo() {
		return mobileNo;
	}

	public void setMobileNo(String mobileNo) {
		this.mobileNo = mobileNo;
	}


	public Set<Student> getStudents() {
		return students;
	}

	public void setStudents(Set<Student> students) {
		this.students = students;
	}

}
