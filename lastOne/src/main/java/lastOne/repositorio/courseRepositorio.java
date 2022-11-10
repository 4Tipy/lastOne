package lastOne.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lastOne.entidades.courseEntidad;


public interface courseRepositorio extends CrudRepository<courseEntidad, Long> {
	
	public List<courseEntidad> findAll();
}
