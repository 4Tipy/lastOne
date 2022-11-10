package lastOne.entidades;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
public class courseMaterial {
	

	@OneToOne
	@JsonIgnore
	private courseEntidad course;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	private String url;
	
	
	public courseMaterial(courseEntidad course, String url) {
		super();
		this.course = course;
		this.url = url;
	}
	public courseEntidad getCourse() {
		return course;
	}
	public void setCourse(courseEntidad course) {
		this.course = course;
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
		return "courseMaterial [course=" + course + ", id=" + id + ", url=" + url + "]";
	}
	
	
	
	

}
