package lastOne.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class courseMaterial {
	

	
	@JsonIgnore
	@OneToOne(mappedBy = "courseEntidad")
	private courseMaterial courseMaterial;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String url;
	
	public courseMaterial(courseMaterial courseMaterial, String url) {
		super();
		this.courseMaterial = courseMaterial;
		this.url = url;
	}

	public courseMaterial getCourseMaterial() {
		return courseMaterial;
	}

	public void setCourseMaterial(courseMaterial courseMaterial) {
		this.courseMaterial = courseMaterial;
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

	@Override
	public String toString() {
		return "courseMaterial [courseMaterial=" + courseMaterial + ", id=" + id + ", url=" + url + "]";
	}
	
	
	
	
		

}
