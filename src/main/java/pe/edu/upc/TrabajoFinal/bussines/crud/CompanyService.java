package pe.edu.upc.TrabajoFinal.bussines.crud;

import java.util.List;

import pe.edu.upc.TrabajoFinal.models.entities.Company;

public interface CompanyService extends CrudService<Company, Integer> {
	List<Company> findUserName(String name) throws Exception;
}
