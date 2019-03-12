package com.stefanini.projeto.test.UT;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

import java.util.ArrayList;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import com.stefanini.projeto.dao.DonoDAO;
import com.stefanini.projeto.enums.SituacaoEnum;
import com.stefanini.projeto.model.Dono;
import com.stefanini.projeto.service.DonoService;

@RunWith(MockitoJUnitRunner.class)
public class DonoServiceUT {

	public DonoService service = new DonoService();

	@Mock
	DonoDAO donoDao;

	@Before
	public void setup() {
		MockitoAnnotations.initMocks(this);
		service.setDonoDao(donoDao);
		Mockito.when(donoDao.findAll()).thenReturn(criarListaDonoMock());
	}

	@Test
	public void findAll() {
		assertNotNull(service.findAll());
	}
	
	@Test
	public void teste() {
		// Dois números pares - somam-se
		assertEquals(service.teste(2L,2L), 4l);
		
		// Dois números ímpares - subtraem-se
		assertEquals(service.teste(1L,3L), -2l);
		
		// Número ímpar e outro par - Deve ser retornado zero
		assertEquals(service.teste(2L,3L), 0l);
		
		// Um parametro não informado - Deve ser retornado zero
		assertEquals(service.teste(null,3L), 0l);
		
		// Ambos os parametro não foram informados - Deve ser retornado zero
		assertEquals(service.teste(null,null), 0l);
	}

	private Dono criarDonoMock() {
		Dono dono = new Dono();
		dono.setId(1L);
		dono.setNome("Nome");
		dono.setSituacao(SituacaoEnum.A);
		return dono;
	}

	private List<Dono> criarListaDonoMock() {
		List<Dono> donos = new ArrayList<>();
		donos.add(criarDonoMock());
		return donos;
	}
}
