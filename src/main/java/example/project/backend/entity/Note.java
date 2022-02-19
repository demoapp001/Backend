package example.project.backend.entity;

import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIncludeProperties;

import lombok.Data;


@Data
@Entity
@Table(name = "NOTES")
public class Note {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(name="CREATE_DATE")
	private Date date;
	
	private String text;
	
	@JsonIncludeProperties({"uname"})
	@ManyToMany(fetch = FetchType.LAZY)
	@JoinTable(name = "SHARED_NOTES", 
		joinColumns = {@JoinColumn(name = "SHARED_NOTE")}, 
		inverseJoinColumns = {@JoinColumn(name = "SHARED_WITH")})
	private List<Person> sharedWith;
}
