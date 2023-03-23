package controller;

import DAO.UserDAO;
import Model.Role;
import Model.User;
import view.MainPage;
import view.SignUpDonor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SignUpController {
    private final SignUpDonor signUpDonor;
    private final UserDAO userDAO;

    public SignUpController(SignUpDonor signUpDonor, UserDAO userDAO) {
        this.signUpDonor = signUpDonor;
        this.userDAO = userDAO;

        signUpDonor.addRegisterListener(new SignUpListener());
        signUpDonor.addBackListener(new BackListener());
        signUpDonor.setVisible(true);
    }


    private class SignUpListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            String email = signUpDonor.getEmailField();
            String password = signUpDonor.getPasswordField();
            String fullName = signUpDonor.getFullNameField();
            String location = signUpDonor.getLocationField();

            User user = new User(email, password, Role.DONOR, fullName, location);

            userDAO.create(user);
            signUpDonor.clearAllComponents();
            signUpDonor.showMessage("Registration succesfully");


        }
    }

    private class BackListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            signUpDonor.setVisible(false);
            MainPageController mainPageController = new MainPageController(
                    new MainPage(),
                    userDAO
            );
        }
    }
}
