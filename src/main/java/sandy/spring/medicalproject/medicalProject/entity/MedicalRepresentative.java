package sandy.spring.medicalproject.medicalProject.entity;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="MedicalRepresentative")
public class MedicalRepresentative {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "medicalRepresentativeId", unique = true, nullable = false)
	private int medicalRepresentativeId;
	private String medicalRepresentativeName;
	private String medicalRepresentativeLocation;
	@OneToMany
	@JoinColumn(name="medicalRepresentativeId")
	private List<Drugs> drugsList;
	
	
	public MedicalRepresentative(int medicalRepresentativeId, String medicalRepresentativeName,
			String medicalRepresentativeLocation, List<Drugs> drugsList) {
		super();
		this.medicalRepresentativeId = medicalRepresentativeId;
		this.medicalRepresentativeName = medicalRepresentativeName;
		this.medicalRepresentativeLocation = medicalRepresentativeLocation;
		this.drugsList = drugsList;
	}
	
	
	public MedicalRepresentative() {
		super();
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "MedicalRepresentative [medicalRepresentativeId=" + medicalRepresentativeId
				+ ", medicalRepresentativeName=" + medicalRepresentativeName + ", medicalRepresentativeLocation="
				+ medicalRepresentativeLocation + ", drugsList=" + drugsList + "]";
	}
	public int getMedicalRepresentativeId() {
		return medicalRepresentativeId;
	}
	public void setMedicalRepresentativeId(int medicalRepresentativeId) {
		this.medicalRepresentativeId = medicalRepresentativeId;
	}
	public String getMedicalRepresentativeName() {
		return medicalRepresentativeName;
	}
	public void setMedicalRepresentativeName(String medicalRepresentativeName) {
		this.medicalRepresentativeName = medicalRepresentativeName;
	}
	public String getMedicalRepresentativeLocation() {
		return medicalRepresentativeLocation;
	}
	public void setMedicalRepresentativeLocation(String medicalRepresentativeLocation) {
		this.medicalRepresentativeLocation = medicalRepresentativeLocation;
	}
	public List<Drugs> getDrugsList() {
		return drugsList;
	}
	public void setDrugsList(List<Drugs> drugsList) {
		this.drugsList = drugsList;
	}
		
}
