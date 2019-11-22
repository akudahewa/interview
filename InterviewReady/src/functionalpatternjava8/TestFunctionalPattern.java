package functionalpatternjava8;

import java.util.ArrayList;
import java.util.List;

public class TestFunctionalPattern {
	
	
	public static void main(String args[]) {
		
		PopulateData polData = new PopulateData();
		List<UserDTO> userDTO=polData.findAllUsers();
		System.out.println(userDTO.size()+" data :"+userDTO.get(0).getName());
		// how to do that in java 8
		List<UserDTO> userDTO1 = polData.findAllWithLambda();
		System.out.println(userDTO1.get(0).getName());
		
		List<UserDTO> userDTO2 = polData.findAllWithMoreLambda();
		System.out.println(userDTO2.get(0).getName());
		
		
		
	}

}
