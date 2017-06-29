package service.impl;

import dao.UserDao;
import model.User;
import service.AppService;

/**
 * @version 1.0
 * 
 */
public class AppServiceImpl implements AppService {
	private UserDao userDao;

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	/**
	 * user
	 * 
	 */
	public String addUser(User user) {
		User u = userDao.getUserByEmail(user.getEmail());
		User u2 = userDao.getUserByUsername(user.getUsername());
		if (u == null && u2 == null) {
			userDao.save(user);
			return "success";
		}
		else
			return "failed";
	}

	public String login(User user) {
		User u = userDao.getUserByUsername(user.getUsername());
		if (u != null && u.getPassword().equals(user.getPassword())) {
			return "success";
		}
		else
			return "failed";
	}
}
