package services;

import dao.UserDAO;
import dao.UserDAOImpl;
import model.User;

public class UserService {
    UserDAO userDAO = new UserDAOImpl();

    public UserService() {
    }
    public void addUser(User user) { userDAO.addUser(user);}
}
