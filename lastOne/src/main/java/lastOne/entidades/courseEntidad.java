package lastOne.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class courseEntidad {
	
	@JsonIgnore
	@OneToOne
	private courseEntidad courseEntidad;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String curso;
	
	public courseEntidad(courseEntidad courseEntidad, String curso) {
		super();
		this.courseEntidad = courseEntidad;
		this.curso = curso;
	}

	public courseEntidad getCourseEntidad() {
		return courseEntidad;
	}

	public void setCourseEntidad(courseEntidad courseEntidad) {
		this.courseEntidad = courseEntidad;
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

	@Override
	public String toString() {
		return "courseEntidad [courseEntidad=" + courseEntidad + ", id=" + id + ", curso=" + curso + "]";
	}

	

}
