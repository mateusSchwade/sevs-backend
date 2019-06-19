package br.com.sevs.repository;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class SevsRepository {

	private final EntityManagerFactory entityManagerFactory;
	 
	private final EntityManager entityManager;
 
	public SevsRepository(){
		this.entityManagerFactory = Persistence.createEntityManagerFactory("persistence_unit_sevs");
		this.entityManager = this.entityManagerFactory.createEntityManager();
	}
 
	public void save(Object object){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.persist(object);
		this.entityManager.getTransaction().commit();
	}
 
	public void update(Object object){
 
		this.entityManager.getTransaction().begin();
		this.entityManager.merge(object);
		this.entityManager.getTransaction().commit();
	}

	public void delete(Object object){
		this.entityManager.getTransaction().begin();
		this.entityManager.remove(object);
		this.entityManager.getTransaction().commit();
 
	}
	
	public EntityManager getSevsRepository() {
		return this.entityManager;
	}
	
}
