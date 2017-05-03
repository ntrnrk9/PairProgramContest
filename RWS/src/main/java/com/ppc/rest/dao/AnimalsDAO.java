package com.ppc.rest.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ppc.rest.model.Animals;
import com.ppc.rest.model.Animals;

@Repository
public class AnimalsDAO {

	@Autowired
	private SessionFactory sessionFactory;

	public void setSessionFactory(SessionFactory sf) {
		this.sessionFactory = sf;
	}

	public List<Animals> getAllAnimals() {
		Session session = this.sessionFactory.getCurrentSession();
		List<Animals> AnimalsList = session.createQuery("from Animals").list();
		return AnimalsList;
	}

	public Animals getAnimals(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Animals animal = (Animals) session.load(Animals.class, new Integer(id));
		return animal;
	}

	public Animals addAnimal(Animals animal) {
		Session session = this.sessionFactory.getCurrentSession();
		session.persist(animal);
		return animal;
	}

	public void updateAnimals(Animals animal) {
		Session session = this.sessionFactory.getCurrentSession();
		session.update(animal);
	}

	public void deleteAnimals(int id) {
		Session session = this.sessionFactory.getCurrentSession();
		Animals p = (Animals) session.load(Animals.class, new Integer(id));
		if (null != p) {
			session.delete(p);
		}
	}	
}
