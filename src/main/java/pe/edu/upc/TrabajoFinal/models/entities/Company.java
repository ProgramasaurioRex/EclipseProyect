package pe.edu.upc.TrabajoFinal.models.entities;


import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Index;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.MapsId;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "companies", 
		indexes = { @Index(columnList = "username", name = "user_index_username")})

public class Company {
	// EmbeddedId primary key
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "company_id", columnDefinition = "NUMERIC(6)")
	private Integer id;
		
		@Column(name = "username", length = 30, nullable = false)
		private String username;
		
		@Column(name = "password", length = 60, nullable = false)
		private String password;
		
		@Column(name = "company_name", length = 30, nullable = false)
		private String companyName;
		
		@Column(name = "tipo_empresa")
		private Boolean tipoEmpresa; // T si es productora, F si es mayorista
		
		@ManyToOne
		@JoinColumn(name = "product_id", nullable = false)
		private Product product;
		
		@OneToMany(mappedBy = "company", fetch = FetchType.LAZY)
		private List<Locations> locations;
		
		//constructor, setters y getters
		
		public Company( ) {
	
		}

		public Integer getId() {
			return id;
		}

		public void setId(Integer id) {
			this.id = id;
		}

		public String getUsername() {
			return username;
		}

		public void setUsername(String username) {
			this.username = username;
		}

		public String getPassword() {
			return password;
		}

		public void setPassword(String password) {
			this.password = password;
		}

		public boolean isMayoristaProductora() {
			return tipoEmpresa;
		}

		public void setMayoristaProductora(boolean tipo_empresa) {
			this.tipoEmpresa = tipo_empresa;
		}
	
}
