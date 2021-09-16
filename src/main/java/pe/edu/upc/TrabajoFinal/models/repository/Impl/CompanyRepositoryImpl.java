package pe.edu.upc.TrabajoFinal.models.repository.Impl;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Named;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;

import pe.edu.upc.TrabajoFinal.models.entities.Company;
import pe.edu.upc.TrabajoFinal.models.repository.CompanyRepository;

@Named
@ApplicationScoped
public class CompanyRepositoryImpl implements CompanyRepository {

	@PersistenceContext(unitName = "TrabajoFinal")
	private EntityManager entityManager;
	
	@Override
	public EntityManager getEntityManager() {
		return entityManager;
	}

	
	@Override
	public Optional<Company> findByUserName(String name) throws Exception {
		return findByUserName(name, Company.class);
	}
	
	@Override
	public List<Company> findByUserName(Company company) throws Exception {
	
		return null;
	}


	@Override
	public Optional<Company> findById(String id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}


	@Override
	public List<Company> findAll() throws Exception {
		// TODO Auto-generated method stub
		return null;
	}
