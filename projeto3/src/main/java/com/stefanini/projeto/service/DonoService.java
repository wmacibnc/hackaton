package com.stefanini.projeto.service;

import java.util.List;

import javax.inject.Inject;

import com.stefanini.projeto.dao.DonoDAO;
import com.stefanini.projeto.model.Dono;

public class DonoService {
	
	@Inject
	private DonoDAO donoDao;

	public List<Dono> findAll() {
		return donoDao.findAll();
	}
	
}
