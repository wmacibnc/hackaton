package com.stefanini.projeto.util;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class HibernateUtil {

	private static EntityManagerFactory emf;

	private static EntityManagerFactory getEntityManagerFacatory() {
		if (emf == null) {
			synchronized (HibernateUtil.class) {
				if (emf == null)
					try {
						emf = Persistence.createEntityManagerFactory("TREINA_PU");
					} catch (RuntimeException ex) {
						throw ex;
					}
			}
		}
		return emf;
	}

	public static EntityManager getEntityManager() {
		try {
			return getEntityManagerFacatory().createEntityManager();
		} catch (RuntimeException ex) {
			throw ex;
		}
	}
}