package pl.air.hr.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "departments")
@NoArgsConstructor @AllArgsConstructor @Getter @Setter
public class Department {

	@Id	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "dep_id")
	private Long id;

	@Column(length = 100, nullable = false)
	private String name;

	@Column(length = 500)
	private String location;

}
