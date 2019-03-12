package com.stefanini.projeto.service;

import java.util.List;

import javax.inject.Inject;

import com.stefanini.projeto.dao.DonoDAO;
import com.stefanini.projeto.model.Dono;

public class DonoService {

	@Inject
	DonoDAO donoDao;

	public List<Dono> findAll() {
		return donoDao.findAll();
	}
	
	public long teste(Long numero1, Long numero2) {
		return numero1 == null || numero2 == null 
				? 0L : numero1 % 2l == 0 && numero2 % 2l == 0 
				? numero1 + numero2 
						: numero1 % 2l != 0 && numero2 % 2l != 0 
						? numero1-numero2 
								: 0l;
	}

	public void setDonoDao(DonoDAO donoDao) {
		this.donoDao = donoDao;
	}

}