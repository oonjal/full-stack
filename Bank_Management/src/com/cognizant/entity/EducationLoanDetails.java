package com.cognizant.entity;
// Generated Jun 29, 2017 11:26:56 AM by Hibernate Tools 5.2.3.Final

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import javax.validation.constraints.*;


/**
 * EducationLoanDetails generated by hbm2java
 */
@Entity
@Table(name = "education_loan_details", catalog = "Bank_Management")
public class EducationLoanDetails implements java.io.Serializable {

	/**
	 * 
	 */

	private String educationLoanId;
	//private long accountNumber;
	private long eduLoanAccountNumber;

	//@NotNull(message="Education Loan amount cannot be null")
	//@Size(max=16)
	private long eduLoanAmount;

	//@NotNull(message="Loan Date cannot be null")
	private Date eduLoanApplyDate;

	//@NotNull(message="Loan Duration cannot be null")
	private long eduLoanDuration;

	//@NotNull(message="Annual Income cannot be null")
	//@Size(max=16)
	private long fatherAnnualIncome;

	//@NotNull(message="Father Name cannot be null")
	private String fatherName;

	//@NotNull(message="CourseFee cannot be null")
	//@Size(max=16)
	private long courseFee;

	//@NotNull(message="Course Name cannot be null")
	private String courseName;

	//@NotNull(message="Id Number cannot be null")
	private long idCardNumber;


	private UserDetails userDetails;

	public EducationLoanDetails() {
	}

	public EducationLoanDetails(String educationLoanId, long accountNumber, long eduLoanAccountNumber,
			long eduLoanAmount, long eduLoanDuration, long fatherAnnualIncome, String fatherName, long courseFee,
			String courseName, long idCardNumber) {
		this.educationLoanId = educationLoanId;
		//this.accountNumber = accountNumber;
		this.eduLoanAccountNumber = eduLoanAccountNumber;
		this.eduLoanAmount = eduLoanAmount;
		this.eduLoanDuration = eduLoanDuration;
		this.fatherAnnualIncome = fatherAnnualIncome;
		this.fatherName = fatherName;
		this.courseFee = courseFee;
		this.courseName = courseName;
		this.idCardNumber = idCardNumber;
	}

	public EducationLoanDetails(String educationLoanId, long accountNumber, long eduLoanAccountNumber,
			long eduLoanAmount, Date eduLoanApplyDate, long eduLoanDuration, long fatherAnnualIncome, String fatherName,
			long courseFee, String courseName, long idCardNumber) {
		this.educationLoanId = educationLoanId;
		//this.accountNumber = accountNumber;
		this.eduLoanAccountNumber = eduLoanAccountNumber;
		this.eduLoanAmount = eduLoanAmount;
		this.eduLoanApplyDate = eduLoanApplyDate;
		this.eduLoanDuration = eduLoanDuration;
		this.fatherAnnualIncome = fatherAnnualIncome;
		this.fatherName = fatherName;
		this.courseFee = courseFee;
		this.courseName = courseName;
		this.idCardNumber = idCardNumber;
	}


	@Column(name = "EDUCATION_LOAN_ID", unique = true, nullable = false, length = 16)
	public String getEducationLoanId() {
		/*String educationLoanId = UUID.randomUUID().toString();
		educationLoanId = educationLoanId.substring(0, 3);*/
		return this.educationLoanId;
	}

	public void setEducationLoanId(String educationLoanId) {
		this.educationLoanId = educationLoanId;
	}

	/*@Column(name = "ACCOUNT_NUMBER", nullable = false)
	public long getAccountNumber() {
		return this.accountNumber;
	}*/

	/*public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}*/

	/*	@SequenceGenerator(name="seq", initialValue=1, allocationSize=100)*/
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Id
	@Column(name = "EDU_LOAN_ACCOUNT_NUMBER", nullable = false, length = 16)
	public long getEduLoanAccountNumber() {
		return this.eduLoanAccountNumber;
	}

	public void setEduLoanAccountNumber(long eduLoanAccountNumber) {
		this.eduLoanAccountNumber = eduLoanAccountNumber;
	}

	@Column(name = "EDU_LOAN_AMOUNT", nullable = false)
	public long getEduLoanAmount() {
		return this.eduLoanAmount;
	}

	public void setEduLoanAmount(long eduLoanAmount) {
		this.eduLoanAmount = eduLoanAmount;
	}

	@Temporal(TemporalType.DATE)
	@Column(name = "EDU_LOAN_APPLY_DATE", length = 10)
	public Date getEduLoanApplyDate() {
		return this.eduLoanApplyDate;
	}

	public void setEduLoanApplyDate(Date eduLoanApplyDate) {
		this.eduLoanApplyDate = eduLoanApplyDate;
	}

	@Column(name = "EDU_LOAN_DURATION", nullable = false)
	public long getEduLoanDuration() {
		return this.eduLoanDuration;
	}

	public void setEduLoanDuration(long eduLoanDuration) {
		this.eduLoanDuration = eduLoanDuration;
	}

	@Column(name = "FATHER_ANNUAL_INCOME", nullable = false)
	public long getFatherAnnualIncome() {
		return this.fatherAnnualIncome;
	}

	public void setFatherAnnualIncome(long fatherAnnualIncome) {
		this.fatherAnnualIncome = fatherAnnualIncome;
	}

	@Column(name = "FATHER_NAME", nullable = false, length = 20)
	public String getFatherName() {
		return this.fatherName;
	}

	public void setFatherName(String fatherName) {
		this.fatherName = fatherName;
	}

	@Column(name = "COURSE_FEE", nullable = false)
	public long getCourseFee() {
		return this.courseFee;
	}

	public void setCourseFee(long courseFee) {
		this.courseFee = courseFee;
	}

	@Column(name = "COURSE_NAME", nullable = false, length = 20)
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}

	@Column(name = "ID_CARD_NUMBER", nullable = false)
	public long getIdCardNumber() {
		return this.idCardNumber;
	}

	public void setIdCardNumber(long idCardNumber) {
		this.idCardNumber = idCardNumber;
	}

	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name="ACCOUNT_NUMBER")
	public UserDetails getUserDetails() {
		return userDetails;
	}

	public void setUserDetails(UserDetails userDetails) {
		this.userDetails = userDetails;
	}

}