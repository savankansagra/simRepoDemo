package com.manageSIM.model;

import java.util.Date;

import javax.annotation.Generated;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.CollectionId;
import org.springframework.format.annotation.DateTimeFormat;

@Entity
@Table(name="sim")
public class Sim {
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	
	@Column(name="Sim_card_no")
	private Integer Sim_card_no;
	
	@Column(name="Mobile_no")
	private Long Mobile_no;
	
	@Column(name="Status")
	private Boolean Status;
	
	@Column(name="Expiry_date")
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date Expiry_date;
	
	@Column(name="Status_of_registration")
	private String Status_of_registration;
	
	@Column(name="KYC")
	private String KYC;
	
	@Column(name="Telecom_Provider")
	private String Telecom_Provider;
	
	@Column(name="Full_name")
	private String Full_name;

	
	public Sim() {
		super();
	}

	public Sim(long id, Integer sim_card_no, Long mobile_no, Boolean status, Date expiry_date,
			String status_of_registration, String kYC, String telecom_Provider, String full_name) {
		super();
		this.id = id;
		Sim_card_no = sim_card_no;
		Mobile_no = mobile_no;
		Status = status;
		Expiry_date = expiry_date;
		Status_of_registration = status_of_registration;
		KYC = kYC;
		Telecom_Provider = telecom_Provider;
		Full_name = full_name;
	}

	
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public Integer getSim_card_no() {
		return Sim_card_no;
	}

	public void setSim_card_no(Integer sim_card_no) {
		Sim_card_no = sim_card_no;
	}

	public Long getMobile_no() {
		return Mobile_no;
	}

	public void setMobile_no(Long mobile_no) {
		Mobile_no = mobile_no;
	}

	public Boolean getStatus() {
		return Status;
	}

	public void setStatus(Boolean status) {
		Status = status;
	}

	public Date getExpiry_date() {
		return Expiry_date;
	}

	public void setExpiry_date(Date expiry_date) {
		Expiry_date = expiry_date;
	}

	public String getStatus_of_registration() {
		return Status_of_registration;
	}

	public void setStatus_of_registration(String status_of_registration) {
		Status_of_registration = status_of_registration;
	}

	public String getKYC() {
		return KYC;
	}

	public void setKYC(String kYC) {
		KYC = kYC;
	}

	public String getTelecom_Provider() {
		return Telecom_Provider;
	}

	public void setTelecom_Provider(String telecom_Provider) {
		Telecom_Provider = telecom_Provider;
	}

	public String getFull_name() {
		return Full_name;
	}

	public void setFull_name(String full_name) {
		Full_name = full_name;
	}

	@Override
	public String toString() {
		return "Sim [id=" + id + ", Sim_card_no=" + Sim_card_no + ", Mobile_no=" + Mobile_no + ", Status=" + Status
				+ ", Expiry_date=" + Expiry_date + ", Status_of_registration=" + Status_of_registration + ", KYC=" + KYC
				+ ", Telecom_Provider=" + Telecom_Provider + ", Full_name=" + Full_name + "]";
	}
	
	
}
