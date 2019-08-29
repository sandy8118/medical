package sandy.spring.medicalproject.medicalProject.Dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;


import sandy.spring.medicalproject.medicalProject.entity.MedicalRepresentative;


@Repository
public class medicalRepresentativeDaoImp implements MedicalRepresentativeDao{
	private EntityManager entityManager;
	
	@Autowired
	public medicalRepresentativeDaoImp(EntityManager TheEntityManager) {
		
		this.entityManager = TheEntityManager;
	}
	
	
	public List<MedicalRepresentative> getMR(){
		// get the current hibernate session
				Session currentSession=entityManager.unwrap(Session.class);
						
				// create a query  ... sort by last name
				Query<MedicalRepresentative> theQuery = 
						currentSession.createQuery("from MedicalRepresentative",
								MedicalRepresentative.class);
				
				// execute query and get result list
				List<MedicalRepresentative> medicalRepresentatives = theQuery.getResultList();
						System.out.println(medicalRepresentatives);
				// return the results		
				return medicalRepresentatives;
	}
	
	public MedicalRepresentative getMRById(int mrId) {
		
		Session currentSession=entityManager.unwrap(Session.class);
		MedicalRepresentative mr=currentSession.get(MedicalRepresentative.class,mrId);
		return mr;
	}
	
	public void saveMR(MedicalRepresentative mr) {
		Session currentSession=entityManager.unwrap(Session.class);
		currentSession.saveOrUpdate(mr);
		
	}


}
