package com.example.demo.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Education;
import com.example.demo.repository.EducationRepository;
import com.example.demo.service.IServiceEducation;

@Service
public class EducationService implements IServiceEducation{

	@Autowired
	private EducationRepository repo;
	
	@Override
	public int addEdu(Education education) {
		
		return repo.save(education).getId();
	}

	@Override
	public List<Education> getAll() {
		
		return repo.findAll();
	}

	@Override
	public void deleteById(Integer id) {
		
		repo.deleteById(id);
		
	}

	@Override
	public Education getById(Integer id) {
		
		return repo.findById(id).get();
	}

	@Override
	public int updateBy(Education education) {
		
		return repo.save(education).getId();
	}

	

	

}
