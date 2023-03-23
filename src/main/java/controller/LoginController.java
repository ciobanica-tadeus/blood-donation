package controller;

import DAO.UserDAO;
import Model.Role;
import Model.User;
import view.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class LoginController {

    private final LoginView loginView;
    private final UserDAO userDAO;

    public LoginController(LoginView loginView, UserDAO userDAO) {
        this.loginView = loginView;
        this.userDAO = userDAO;

        loginView.addLogInListener(new LogInListener());
        loginView.addBackListener(new BackListener());
        loginView.setVisible(true);
    }


    private class LogInListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String email = loginView.getEmail();
            String password = loginView.getPassword();

            if (!email.equals("") && !password.equals("")) {

                User user = userDAO.findByEmail(email);
                if (user != null) {
                    if (user.getPassword().equals(password)) {
                        Role role = user.getRole();
                        loginView.setEmailField(null);
                        loginView.setPasswordField(null);

                        if (role == Role.ADMIN){
                            AdminView adminView = new AdminView();
                            adminView.setVisible(true);
                        }else if( role == Role.DOCTOR){
                            DoctorView doctorView = new DoctorView();
                            doctorView.setVisible(true);
                        }else if (role == Role.DONOR){
                            DonorView donorView = new DonorView();
                            donorView.setVisible(true);
                        }

                    } else {
                        loginView.showMessage("Pasword incorrect");
                    }
                }else{
                    loginView.showMessage("User non-existent");
                }

            } else {
                loginView.showMessage("Completati campurile pentru logare");
            }
        }
    }

    private class BackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            loginView.setVisible(false);
            MainPageController mainPageController = new MainPageController(
                    new MainPage(),
                    userDAO
            );
        }
    }
}
