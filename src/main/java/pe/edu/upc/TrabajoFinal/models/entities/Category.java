package pe.edu.upc.TrabajoFinal.models.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name = "categorias")
public class Category {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "categoria_id")
	private Integer id;
	
	@Column(name = "nombre_categoria", length = 25)
	private String productName;
	
	@Column(name = "descripcion_categoria", length = 50)
	private String description;
	
	@OneToMany(mappedBy = "category", fetch = FetchType.LAZY)
	private List<Product> product;
}
