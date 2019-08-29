package sandy.spring.medicalproject.medicalProject.Dao;

import java.util.List;

import sandy.spring.medicalproject.medicalProject.entity.MedicalRepresentative;



public interface MedicalRepresentativeDao {
	public List<MedicalRepresentative> getMR();
	public void saveMR(MedicalRepresentative mr);
	public MedicalRepresentative getMRById(int mrId);
}
