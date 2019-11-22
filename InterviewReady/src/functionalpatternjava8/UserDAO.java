package functionalpatternjava8;

import java.util.ArrayList;
import java.util.List;

public class UserDAO {
	
	public List<User> FindAll() {
		List<User> users =new ArrayList<>();
		for(int i=0;i<3;i++) {
			User user =new User();
			user.setId(i);
			user.setName("amila"+i);
			user.setAge(i+10);
			users.add(user);
		}
		
		return users;
	}
	

}
