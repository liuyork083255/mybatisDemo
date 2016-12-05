package dao.mapper;

import pojo.User;

public interface UserMapper {
	
	public User selectUserByName(String name);
	
	public void saveUser(User user);
	
	public void updateUser(User user);
	
	public void deleteUser(User user);

}
