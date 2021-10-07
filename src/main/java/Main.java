import model.User;
import org.hibernate.HibernateException;
import org.hibernate.Metamodel;
import org.hibernate.query.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import services.UserService;

import javax.persistence.metamodel.EntityType;

import java.util.Map;

public class Main {
    public static void main(final String[] args) throws Exception{

        UserService userService = new UserService();
        User user = new User();
        user.setId(1);
        user.setLogin("test");
        user.setPassword("1111");
        userService.addUser(user);
    }


}