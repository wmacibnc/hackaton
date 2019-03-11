package com.stefanini.projeto.rest;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.stefanini.projeto.model.Dono;
import com.stefanini.projeto.service.DonoService;

@Path("dono")
public class DonoResource {

	@Inject
	private DonoService donoService;

	@GET
	@Produces(MediaType.APPLICATION_JSON)
	public Response findAll() {
		List<Dono> donos = donoService.findAll();

		if (donos.isEmpty()) {
			return Response.ok().build();
		}

		return Response.ok(donos).build();
	}

}
