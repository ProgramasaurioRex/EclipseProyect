package pe.edu.upc.TrabajoFinal.models.entities;



import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "provincia" )

public class Provincia {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "provincia_id")
	private Integer id;
	
	@Column(name = "provincia_name", length = 25)
	private String nombre;
	
	@Column(name = "provincia_id")
	
	@OneToMany(mappedBy = "departamento_id", fetch = FetchType.LAZY)
	private Departamento departamento;
	
}
