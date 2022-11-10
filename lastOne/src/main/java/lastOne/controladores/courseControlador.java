package lastOne.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lastOne.entidades.courseEntidad;
import lastOne.repositorio.courseRepositorio;



@RestController
@RequestMapping("api")
public class courseControlador {
	
	@Autowired
	courseRepositorio cursoRep;
	
	@GetMapping("curso/{id}")
	public courseEntidad getEntidades (@PathVariable long id) {
		
		return cursoRep.findById(id).get();
	}
	
	
	@GetMapping("curso")
	public Iterable<courseEntidad> getCurso() {
		
		return cursoRep.findAll();
	}

}
