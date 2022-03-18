package level3.reports.core.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.sun.istack.NotNull;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@Table(name="Z_LABEL_USER")
@AllArgsConstructor
@NoArgsConstructor
public class User {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="ID")
	private int id;
	
	@Column(name="USERNAME")
	@NotNull
	private String userName;
	
	@Column(name="PASSWORD")
	@NotNull
	private String password;
	
	@Column(name="DESCRIPTION")
	@NotNull
	private String description;
	
	@Column(name="NAME")
	private String name;
	

}
