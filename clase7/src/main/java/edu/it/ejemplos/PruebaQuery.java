package edu.it.ejemplos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import edu.it.repository.PeliculaRepository;

@Component
public class PruebaQuery {
	@Autowired 
	PeliculaRepository pelisRepo;
	
	public void run() {
		for (var peli : pelisRepo.findTop20ByGeneroOrderByNombreDesc("suspenso")) {
			System.out.println(peli);
		}
	}
}
