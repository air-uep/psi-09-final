package pl.air.hr.model;

import java.math.BigDecimal;
import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "employees")
@NoArgsConstructor @Getter @Setter
public class Employee {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "emp_id")
	private Long id;

	@Column(name = "first_name", length = 50, nullable = false)
	private String firstName;

	@Column(name = "last_name", length = 100, nullable = false)
	private String lastName;

	@Column(name = "hire_date", nullable = false)
	private LocalDate hireDate;

	@Column(precision = 7, scale = 2, nullable = false)
	private BigDecimal salary;

	@ManyToOne
	@JoinColumn(name = "dep_id")
	private Department department;

	@ManyToOne
	@JoinColumn(name = "pos_id")
	private Position position;

}
