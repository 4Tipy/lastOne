package lastOne.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class courseEntidad {
	
	
	@OneToOne(mappedBy = "course")
	@JsonIgnore
	private courseMaterial courseMaterial;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	
	private String curso;

	public courseEntidad(courseMaterial courseMaterial, String curso) {
		super();
		this.curso = curso;
		this.courseMaterial = courseMaterial;
	
	} 
	

	public courseEntidad() {
	
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getCurso() {
		return curso;
	}

	public void setCurso(String curso) {
		this.curso = curso;
	}
	

	public courseMaterial getCourseMaterial() {
		return courseMaterial;
	}


	public void setCourseMaterial(courseMaterial courseMaterial) {
		this.courseMaterial = courseMaterial;
	}


	@Override
	public String toString() {
		return "courseEntidad [id=" + id + ", courseMaterial=" + courseMaterial + ", curso=" + curso + "]";
	}


	
	
	


}
