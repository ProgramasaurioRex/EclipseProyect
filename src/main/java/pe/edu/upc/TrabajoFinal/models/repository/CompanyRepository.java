package pe.edu.upc.TrabajoFinal.models.repository;

import java.util.List;
import java.util.Optional;

import pe.edu.upc.TrabajoFinal.models.entities.Company;


public interface CompanyRepository extends JpaRepository<Company, String> {
	List<Company> findByUserName(Company company) throws Exception;

	Optional<Company> findByUserName(String name) throws Exception;
	
}
