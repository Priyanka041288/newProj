package session21;

public class _4_AppoloHospital extends GlobalpatientData implements _1_USMedical, _2_UKMedical, _3_indianMedical{
	//we can use 1 or multi interface
	//USmedical
	@Override
	public void physioServices() {
		System.out.println("Appolo..Physio");
	}
	@Override
	public void oncologyServices() {
		System.out.println("Apollo ...oncology");
	}
	@Override
	public void orthopedicServices() {
		System.out.println("apoloo....orthopedic");
	}
	@Override
	public void RadiologyServices() {
		System.out.println("apolo..radiology");
	}
	@Override
	public void  ENTServices() {
		System.out.println("apolo ..ent");
	}
	@Override
	public void ambulanceServices() {
		System.out.println("apolo...ambulance");
	}
	@Override
	public void emergencyServices() {
		System.out.println("apolo...emergency");
	}
	@Override
	public void neuroServices() {
		System.out.println("apolo...neuro");
	}
	@Override
	public void peditricServices() {
		System.out.println("apolo...pedritric");
	}




	//from who interface
	@Override
	public void polioServices() {
		System.out.println("apolo....polioservice");
	}
	//non overiden methods(pecialside methods of apolo hospital
	public void OPservices() {
		System.out.println("apolo..opsevices");
	}
	public void MedicalInsurance() {
		System.out.println("apoloo...medicalinsurance");
	}
	public void pathologyServices() {
		System.out.println("aopolo....pathology");
	}
//	@Override
//	public void intership() {//overide or not...its ok..if overide will print this
//		//or wil print from US by creating object
//		System.out.println("apolo ...intership");
//		}

	} 

