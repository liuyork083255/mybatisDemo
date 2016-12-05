package mybatisdemo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;

import dao.mapper.UserMapper;
import pojo.User;

@org.springframework.stereotype.Controller
@RequestMapping("/user")
public class Controller {
	
	@Autowired
	private UserMapper userMapper;
	
	@RequestMapping("/finduser")
	public void findUser(String username){
		User user = userMapper.selectUserByName(username);
		System.out.println(user);
	}
	
	@RequestMapping("/insertUser")
	public void  insertUser(String username,String password){
		User user  = new User();
		user.setUsername(username);
		user.setPassword(password);
		userMapper.saveUser(user);
		
	}
	
	@RequestMapping("/deleteUser")
	public void  deleteUser(String username,String password){
		User user  = new User();
		user.setUsername(username);
		user.setPassword(password);
		userMapper.deleteUser(user);
		
	}
	
	
	@RequestMapping("/updateUser")
	public void  updateUser(String username,String password){
		User user  = new User();
		user.setUsername(username);
		user.setPassword(password);
		userMapper.updateUser(user);
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
}
