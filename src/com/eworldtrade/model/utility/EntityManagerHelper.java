package com.eworldtrade.model.utility;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class EntityManagerHelper {
	
	static EntityManagerFactory entityManagerFactory = null;
	static EntityManager entityManager = null;
	
	public EntityManagerHelper() {
		
	}
	
	public static void startTransaction() {
		if (entityManagerFactory == null && entityManager == null) {
			System.out.print("Creating Entity Manager object");
		 entityManagerFactory = Persistence.createEntityManagerFactory("EWTModel");
		 entityManager = entityManagerFactory.createEntityManager();
		}
		System.out.print("Starting Transaction");
		entityManager.getTransaction().begin();
	}
	
	public static void persistCommit(Object object) {
		if (entityManager != null && entityManager.getTransaction().isActive()){
			System.out.println("Persisting object");
		entityManager.persist(object);
		entityManager.getTransaction().commit();
		}
	}
	
	public static void closeTransaction() {
		if (entityManager != null && entityManagerFactory != null && entityManager.getTransaction().isActive()) {
			System.out.println("Closing Entit Manger transaction");
			entityManager.close();
			entityManagerFactory.close();
		}
	}
	
	
	
	

}
