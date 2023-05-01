package com.restapi10.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import org.springframework.stereotype.Service;

@Entity
public class ElectricSubDivisionOffice {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
    @Column
	private int officeStaffId;
	@Column
	private String officeStaffName;
	@Column
	private String officePost;
	@OneToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "productId")
	private StoreInfo storeInfo;
	public ElectricSubDivisionOffice() {
		super();
		// TODO Auto-generated constructor stub
	}
	public ElectricSubDivisionOffice(int officeStaffId, String officeStaffName, String officePost,
			StoreInfo storeInfo) {
		super();
		this.officeStaffId = officeStaffId;
		this.officeStaffName = officeStaffName;
		this.officePost = officePost;
		this.storeInfo = storeInfo;
	}
	public int getOfficeStaffId() {
		return officeStaffId;
	}
	public void setOfficeStaffId(int officeStaffId) {
		this.officeStaffId = officeStaffId;
	}
	public String getOfficeStaffName() {
		return officeStaffName;
	}
	public void setOfficeStaffName(String officeStaffName) {
		this.officeStaffName = officeStaffName;
	}
	public String getOfficePost() {
		return officePost;
	}
	public void setOfficePost(String officePost) {
		this.officePost = officePost;
	}
	public StoreInfo getStoreInfo() {
		return storeInfo;
	}
	public void setStoreInfo(StoreInfo storeInfo) {
		this.storeInfo = storeInfo;
	}
	
	

}
