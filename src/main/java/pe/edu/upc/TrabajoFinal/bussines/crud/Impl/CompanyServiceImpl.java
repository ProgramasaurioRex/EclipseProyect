package pe.edu.upc.TrabajoFinal.bussines.crud.Impl;


import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.TrabajoFinal.bussines.crud.CompanyService;
import pe.edu.upc.TrabajoFinal.bussines.crud.CrudService;
import pe.edu.upc.TrabajoFinal.models.entities.Company;
import pe.edu.upc.TrabajoFinal.models.repository.JpaRepository;
import pe.edu.upc.TrabajoFinal.models.repository.CompanyRepository;

@Named
@ApplicationScoped
public class CompanyServiceImpl implements CrudService {

	@Inject
	private CompanyRepository companyRepository; 
	
	@Override
	public JpaRepository<Company, String> getJpaRepository() {
		return companyRepository;
	}

	@Override
	public Optional<Company> findByUserName(String name) throws Exception {
		return companyRepository.findByUserName(name);
	}

	
}
