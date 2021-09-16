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
import javax.persistence.Table;

import com.sun.jdi.Location;

@Entity
@Table(name = "Departamento" )

public class Departamento {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "departamento_id", columnDefinition = "NUMERIC(4)")
	private Integer id;
	
	@Column(name = "departamento_name", length = 30, nullable = false)
	private String name;
	
	@ManyToOne
	@JoinColumn(name = "departamento", nullable = false)
	private List<Provincia> provincia;
	
	@ManyToOne
	@JoinColumn(name = "location_id", nullable = false)
	private Location location;
	
	public Departamento() {
		provincia = new ArrayList<Provincia>();
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Provincia> getProvincia() {
		return provincia;
	}

	public void setProvincia(List<Provincia> provincia ) {
		this.provincia = provincia;
	}
}
