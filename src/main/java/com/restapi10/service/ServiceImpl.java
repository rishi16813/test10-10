package com.restapi10.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;

import com.restapi10.entity.ElectricSubDivisionOffice;
import com.restapi10.repository.SubRepo;
@org.springframework.stereotype.Service
public class ServiceImpl implements Service {
@Autowired
	private SubRepo subRepo;
	@Override
	public Integer resisterInformation(ElectricSubDivisionOffice electricSubDivisionOffice) {
		ElectricSubDivisionOffice save = subRepo.save(electricSubDivisionOffice);
		if (save!=null) {
			return 1;
		}else {
			return 0;
		}
	
	}

	@Override
	public List<ElectricSubDivisionOffice> getall() {
		List<ElectricSubDivisionOffice> findAll = subRepo.findAll();
		return findAll;
	}

	@Override
	public ElectricSubDivisionOffice getById(int id) {
		Optional<ElectricSubDivisionOffice> findById = subRepo.findById(id);
		return findById.get();
	}

	@Override
	public void updateInformaiton(ElectricSubDivisionOffice electricSubDivisionOffice, int id) {
		electricSubDivisionOffice.getOfficeStaffId();
		ElectricSubDivisionOffice save = subRepo.save(electricSubDivisionOffice);
		
	}

	@Override
	public void deleteById(int id) {
		subRepo.deleteById(id);
		
	}

}
