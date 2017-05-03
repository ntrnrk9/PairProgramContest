package com.ppc.rest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ppc.rest.model.Animals;
import com.ppc.rest.model.Country;
import com.ppc.rest.model.Pets;
import com.ppc.rest.service.AnimalService;
import com.ppc.rest.service.CountryService;
import com.ppc.rest.service.PetsService;

@RestController
public class RController {
	
	@Autowired
	CountryService countryService;
	@Autowired
	PetsService petService;
	@Autowired
	AnimalService animalService;
	
	
	@RequestMapping(value = "/getAllPets", method = RequestMethod.GET, headers = "Accept=application/json")
	public List<Pets> getAllPets() {
		
		List<Pets> listOfPets = petService.getAllPets();
		return listOfPets;
	}

	
	@RequestMapping(value = "/getPet/{id}", method = RequestMethod.GET, headers = "Accept=application/json")
	public Pets getPetById(@PathVariable int id) {
		return petService.getPets(id);
	}

	@RequestMapping(value = "/addPet", method = RequestMethod.POST, headers = "Accept=application/json")
	public void addCountry(@RequestBody Pets pet) {	
		petService.addPets(pet);
		
	}

	@RequestMapping(value = "/updatePet", method = RequestMethod.PUT, headers = "Accept=application/json")
	public void updatePet(@RequestBody Pets pet) {
		petService.updatePets(pet);
	}

	@RequestMapping(value = "/deletePet/{id}", method = RequestMethod.DELETE, headers = "Accept=application/json")
	public void deleteCountry(@PathVariable("id") int id) {
		petService.deletePets(id);		
	}	
}
