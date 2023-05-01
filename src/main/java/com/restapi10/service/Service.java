package com.restapi10.service;

import java.util.List;

import com.restapi10.entity.ElectricSubDivisionOffice;

public interface Service {

	public Integer resisterInformation(ElectricSubDivisionOffice electricSubDivisionOffice);
	public List<ElectricSubDivisionOffice>getall();
	public ElectricSubDivisionOffice getById(int id);
	public void updateInformaiton(ElectricSubDivisionOffice electricSubDivisionOffice, int id);
	public void deleteById(int id);
}
