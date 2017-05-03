package com.ppc.rest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ppc.rest.model.Pets;

@Repository
public class PetsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Pets> getAllPets() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Pets> PetsList = session.createQuery("from Pets").list();
		return PetsList;
	}

	public Pets getPets(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Pets Pets = (Pets) session.load(Pets.class, new Integer(id));
		return Pets;
	}

	public Pets addPets(Pets pet) {
		Session session = this.sessionFactory.getCurrentSession();
		System.out.println(pet.toString());
		session.merge(pet);
		return pet;
	}

	public void updatePets(Pets Pets) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(Pets);
	}

	public void deletePets(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Pets p = (Pets) session.load(Pets.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}	
}
