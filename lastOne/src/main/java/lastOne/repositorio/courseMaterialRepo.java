package lastOne.repositorio;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

import lastOne.entidades.courseMaterial;

public interface courseMaterialRepo extends CrudRepository<courseMaterial, Long> {
	
	public List<courseMaterial> findAll();
}