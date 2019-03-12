package com.stefanini.projeto.dao;

import java.util.List;

import javax.persistence.EntityManager;

import com.stefanini.projeto.model.Dono;
import com.stefanini.projeto.util.HibernateUtil;

public class DonoDAO {

	EntityManager entityManager = HibernateUtil.getEntityManager();
	
	public List<Dono> findAll() {
		return entityManager.createQuery("select distinct d from Dono d left join d.cachorros", Dono.class).getResultList();
	}

}
