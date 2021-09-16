package pe.edu.upc.TrabajoFinal.models.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "productos")
public class Product {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "producto_id")
	private Integer id;
	
	@Column(name = "nombre_producto")
	private String name;
	
	@Column(name = "precio_unitario")
	private Float unitPrice;
	
	@Column(name = "stock")
	private Integer stock;
	
	@ManyToOne
	@JoinColumn(name = "categoria_id", nullable = false)
	private Category category;
	
	
}
