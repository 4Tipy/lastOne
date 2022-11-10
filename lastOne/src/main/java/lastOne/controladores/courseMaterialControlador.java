package lastOne.controladores;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lastOne.entidades.courseMaterial;
import lastOne.repositorio.courseMaterialRepo;


@RestController
@RequestMapping("api")
public class courseMaterialControlador {
	
	@Autowired
	courseMaterialRepo cursoMatRep;
	
	@GetMapping("cursoMat/{id}")
	public courseMaterial getCourseMaterial (@PathVariable long id) {
		
		return cursoMatRep.findById(id).get();
	}
	
	@GetMapping("cursoMat")
	public Iterable<courseMaterial> getCurso() {
		
		return cursoMatRep.findAll();
	}
		
}
