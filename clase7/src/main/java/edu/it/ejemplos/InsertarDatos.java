package edu.it.ejemplos;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import edu.it.entities.Actor;
import edu.it.entities.Director;
import edu.it.entities.Pelicula;
import edu.it.repository.ActorRepository;
import edu.it.repository.DirectorRepository;
import edu.it.repository.PeliculaRepository;

@Component
public class InsertarDatos implements Runnable {
	
	@Autowired 
	DirectorRepository directorRepo;
	
	@Autowired
	ActorRepository actorRepo;
	
	@Autowired
	PeliculaRepository pelisRepo;
	
	
	@Transactional
	public void run() {
		Actor javierBardem = new Actor("300000001", "Javier Bardem");
        Actor pabloEcharri = new Actor("300000002", "Pablo Echarri");
        Actor eduardoNoriega = new Actor("300000003", "Eduardo Noriega");
        Actor sbaraglia = new Actor("300000004", "Nombre Leonardo Sbaraglia");
        Actor pepaPig = new Actor("300000005", "Pepa pig");
        
        Director kubrick = new Director("200000001", "Stanley Kubrick");
        Director almodovar = new Director("200000002", "Pedro Almodovar");
        Director pineiro = new Director("200000003", "Marcelo Pyneiro");
        Director rodrigoGrande = new Director("200000004", "Rodrigo Grande");
        Director ethanCohen = new Director("200000005", "Hermanos Cohen");
        
        Pelicula volver = new Pelicula("100000001", "Volver", "drama", almodovar);
        Pelicula doloryGloria = new Pelicula("100000002", "Dolor y Gloria", "drama", almodovar);

        Pelicula elResplandor = new Pelicula("100000003", "El resplandor", "suspenso", kubrick);

        Pelicula barryLindon = new Pelicula("100000004", "Barry Lyndon", "drama", kubrick);
        Pelicula plataQuemada = new Pelicula("100000005", "Plata quemada","Drama", pineiro);
        Pelicula alFinalDelTunnel = new Pelicula("100000006", "Al final del tunnel","Suspenso", rodrigoGrande);
        Pelicula elMetodo = new Pelicula("100000007", "El metodo", "Suspenso", pineiro);
        Pelicula noCountryForOldMen = new Pelicula("100000008", "No Country for Old Men", "Suspenso", ethanCohen);

        javierBardem.peliculas.add(noCountryForOldMen);
        pabloEcharri.peliculas.add(plataQuemada);
        pabloEcharri.peliculas.add(elMetodo);
        pabloEcharri.peliculas.add(alFinalDelTunnel);
        
        
        directorRepo.save(kubrick);
        directorRepo.save(almodovar);
        directorRepo.save(pineiro);
        directorRepo.save(rodrigoGrande);
        directorRepo.save(ethanCohen);
        
        actorRepo.save(javierBardem);
        actorRepo.save(pabloEcharri);
        actorRepo.save(eduardoNoriega);
        actorRepo.save(sbaraglia);
        actorRepo.save(pepaPig);
        
        pelisRepo.save(volver);
        pelisRepo.save(doloryGloria);
        pelisRepo.save(elResplandor);
        pelisRepo.save(barryLindon);
        pelisRepo.save(plataQuemada);
        pelisRepo.save(alFinalDelTunnel);
        pelisRepo.save(elMetodo);
        pelisRepo.save(noCountryForOldMen);        
	}
}
