package pe.edu.upc.TrabajoFinal.models.entities;


import javax.persistence.Column;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Table(name = "detail_posts")
public class DetailPost {

	@ManyToOne
	private Product product;
	
	@ManyToOne
	private Post post;
	
	@Column(name = "descripcion_post", length = 50)
	private String desciption;
	
	@Column(name = "precio_producto")
	private Float price;
	
	
}
