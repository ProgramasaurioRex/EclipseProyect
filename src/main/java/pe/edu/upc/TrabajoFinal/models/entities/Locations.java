package pe.edu.upc.TrabajoFinal.models.entities;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "Locations")
public class Locations {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "location_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@Column(name = "ciudad", length = 30, nullable = false)
	private String ciudad;
	
	@ManyToOne
	@JoinColumn(name = "company_id", nullable = false)
	private Company company;
	
	@OneToMany(mappedBy = "location")
	private List<Departamento> departamento;
	
	
	public Locations() {
		departamento = new ArrayList<Departamento>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getCiudad() {
		return ciudad;
	}

	public void setCity(String ciudad) {
		this.ciudad = ciudad;
	}

	public List<Departamento> getDepartamentos() {
		return departamento;
	}

	public void setDepartaments(List<Departamento> departamento) {
		this.departamento = departamento;
	}
}
