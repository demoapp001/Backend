package example.project.backend.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;


@Data
@Entity
@Table(name = "NOTES")
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Column(name="CREATE_DATE")
	private Date date;
	
	private String text;
	
//	@ManyToMany
//	@JoinTable(name = "SHARED_NOTES", 
//		joinColumns = {@JoinColumn(name = "SHARED_NOTE")}, 
//		inverseJoinColumns = {@JoinColumn(name = "SHARED_WITH")})
//	private List<Person> sharedWith;
}
