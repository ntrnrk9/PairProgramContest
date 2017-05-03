package com.ppc.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ppc.rest.dao.PetsDAO;
import com.ppc.rest.model.Pets;

@Service("petService")
public class PetsService {

	@Autowired
	PetsDAO PetsDao;
	
	@Transactional
	public List<Pets> getAllPets() {
		return PetsDao.getAllPets();
	}

	@Transactional
	public Pets getPets(int id) {
		return PetsDao.getPets(id);
	}

	@Transactional
	public void addPets(Pets pet) {
		PetsDao.addPets(pet);
	}

	@Transactional
	public void updatePets(Pets pet) {
		PetsDao.updatePets(pet);

	}

	@Transactional
	public void deletePets(int id) {
		PetsDao.deletePets(id);
	}
}
