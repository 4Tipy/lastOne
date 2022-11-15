package lastOne.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class courseMaterial {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String url;
	

	@OneToOne
	@JsonIgnore
	private courseEntidad courseEntidad;


	public courseMaterial(String url, lastOne.entidades.courseEntidad courseEntidad) {
		super();
		this.url = url;
		this.courseEntidad = courseEntidad;
	}
	
	public courseMaterial() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUrl() {
		return url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public courseEntidad getCourseEntidad() {
		return courseEntidad;
	}



	public void setCourseEntidad(courseEntidad courseEntidad) {
		this.courseEntidad = courseEntidad;
	}


	@Override
	public String toString() {
		return "courseMaterial [id=" + id + ", url=" + url + ", courseEntidad=" + courseEntidad + "]";
	}
	
	
	
	
	
		

}
