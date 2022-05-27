package Session_13Abstraction;

public class TestHospital {

public static void main(String[] args) {
		
//		_1_USMedical usHp = new _1_USMedical(); // Not allowed as object of an interface cannot be created
//		_4_ApolloHospital ap = new _4_ApolloHospital();
//		ap.ambulanceServices(); // Apollo - ambulanceServices - from UKMedical Interface
//		ap.emegergencyServices(); // Apollo - emegergencyServices - from IndianMedical Interface
//		ap.ENTServices(); // Apollo - ENTServices - from UKMedical Interface
//		ap.medicalInsurance(); // Apollo - medicalInsurance - from ApolloHosptial Class
//		ap.neuroServices(); // Apollo - neuroServices - from IndianMedical Interface
//		ap.orthopedicServices(); // Apollo - ambulanceServices - from UKMedical Interface
//		
//		System.out.println("-------------------------------------------------------------");
//		
		//top Casting:
		_1_USMedical us = new _4_ApolloHospital();//child class object can be referred by parent interface reference variable
		us.physioServices();
		us.oncologyServices();
		us.orthopedicServices();
		us.intership();
//		
//		//down Casting:
//		// its not allowed
//		// As object of a interface cannot be created
//		//_4_ApolloHospital asd = new _1_USMedical();
//		
//		_2_UKMedical uk = new _4_ApolloHospital();
//		uk.ambulanceServices();
//		uk.ENTServices();

	}
}
