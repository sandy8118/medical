package sandy.spring.medicalproject.medicalProject.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name="Drugs")
public class Drugs {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "drugId", unique = true, nullable = false)
	private int drugId;
	private String drugName;
	private String drugDescription;
    
	
	
	@Override
	public String toString() {
		return "Drugs [drugId=" + drugId + ", drugName=" + drugName + ", drugDescription=" + drugDescription + "]";
	}
	public Drugs(int drugId, String drugName, String drugDescription) {
		super();
		this.drugId = drugId;
		this.drugName = drugName;
		this.drugDescription = drugDescription;
	}
	public int getDrugId() {
		return drugId;
	}
	public void setDrugId(int drugId) {
		this.drugId = drugId;
	}
	public String getDrugName() {
		return drugName;
	}
	public void setDrugName(String drugName) {
		this.drugName = drugName;
	}
	public String getDrugDescription() {
		return drugDescription;
	}
	public void setDrugDescription(String drugDescription) {
		this.drugDescription = drugDescription;
	}
	public Drugs() {
		super();
		// TODO Auto-generated constructor stub
	}
	
    
    
}
