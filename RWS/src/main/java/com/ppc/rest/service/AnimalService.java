package com.ppc.rest.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ppc.rest.dao.AnimalsDAO;
import com.ppc.rest.model.Animals;
import com.ppc.rest.model.Country;

@Service("animalService")
public class AnimalService {

	@Autowired
	AnimalsDAO AnimalsDao;
	
	@Transactional
	public List<Animals> getAllAnimals() {
		return AnimalsDao.getAllAnimals();
	}

	@Transactional
	public Animals getAnimals(int id) {
		return AnimalsDao.getAnimals(id);
	}

	@Transactional
	public void addAnimals(Animals animal) {
		AnimalsDao.addAnimal(animal);
	}

	@Transactional
	public void updateAnimals(Animals animal) {
		AnimalsDao.updateAnimals(animal);

	}

	@Transactional
	public void deleteAnimals(int id) {
		AnimalsDao.deleteAnimals(id);
	}
}
