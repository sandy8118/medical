package sandy.spring.medicalproject.medicalProject.medicalrepresentativeREST;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import sandy.spring.medicalproject.medicalProject.Dao.MedicalRepresentativeDao;
import sandy.spring.medicalproject.medicalProject.entity.MedicalRepresentative;

@RestController
@RequestMapping("/Data")
public class MedicalRepresentativeRest {
	@Autowired
	private MedicalRepresentativeDao medicalRepresentativeDao;
	
	@GetMapping("/GetAllMR")
	public List<MedicalRepresentative> getAllMR() {
		return medicalRepresentativeDao.getMR();
	}
	
	@PostMapping("/SaveMR")
	public void saveMR(@RequestBody MedicalRepresentative themr) {
		System.out.println("Inside web service");
		medicalRepresentativeDao.saveMR(themr);
		
	}
	
	@GetMapping("/GetMRById/{medicalRepresentativeId}")
	public MedicalRepresentative getMedicalRepresentative(@PathVariable int medicalRepresentativeId) {
		
		return medicalRepresentativeDao.getMRById(medicalRepresentativeId);
		
	}
	
	
}
