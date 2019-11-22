package functionalpatternjava8;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class PopulateData {
	
	UserDAO userDAO = new UserDAO();
	
	public List<UserDTO> findAllUsers(){
		List<UserDTO> userDTOList = new ArrayList<>();
//		UserDAO userDAO = new UserDAO();
		List<User> users = userDAO.FindAll();
		for (User user : users) {
			UserDTO userDTO = new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setAge(user.getAge());
			
			userDTOList.add(userDTO);
		}
		return userDTOList;
	}
	
	public List<UserDTO> findAllWithLambda(){
		return userDAO.FindAll().stream().map(user->{
			UserDTO userDTO = new UserDTO();
			userDTO.setId(user.getId());
			userDTO.setName(user.getName());
			userDTO.setAge(user.getAge());
			return userDTO;
		}).collect(Collectors.toList());
		
	}
	
	public List<UserDTO> findAllWithMoreLambda(){
		return userDAO.FindAll().stream().map(this ::getDTO).collect(Collectors.toList());
		
	}
	
	
	private UserDTO getDTO(User user) {
		UserDTO userDTO = new UserDTO();
		userDTO.setId(user.getId());
		userDTO.setName(user.getName());
		userDTO.setAge(user.getAge());
		return userDTO;
	}

}
