import DAO.UserDAO;
import controller.MainPageController;
import db.DataBaseConfig;
import org.hibernate.SessionFactory;
import controller.LoginController;
import view.LoginView;
import view.MainPage;


public class Main {
    public static void main(String[] args) {
        SessionFactory sessionFactory = DataBaseConfig.getSessionFactory();
        UserDAO userDAO = new UserDAO(sessionFactory);
        MainPage mainPage = new MainPage();
        MainPageController controller = new MainPageController(mainPage, userDAO);

//        User admin = new User("admin","admin",Role.ADMIN);
//        userDAO.create(admin);
//
//        User user = new User("ciobanica.tade@yahoo.com","Amfostlalaburiazi",Role.DONOR, "Ciobanica Tadeus", "Alba");
//        userDAO.create(user);
//
//        User newUser = new User("medic@yahoo.com", "doctor",Role.DOCTOR, "Doctor ION", "CLUJ");
//        userDAO.create(newUser);

//        User user = userDAO.findByEmail("medic@yahoo.com");
//        System.out.println(user.toString());

    }
}
