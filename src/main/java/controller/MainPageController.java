package controller;

import DAO.UserDAO;
import view.LoginView;
import view.MainPage;
import view.SignUpDonor;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MainPageController {

    private final MainPage mainPage;
    private final UserDAO userDAO;

    public MainPageController(MainPage mainPage, UserDAO userDAO){
        this.mainPage = mainPage;
        this.userDAO = userDAO;

        mainPage.setVisible(true);
        mainPage.addLoginListener(new LoginListener());
        mainPage.addSignUpListener(new RegisterListener());
    }

    private class LoginListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            LoginController loginController = new LoginController(
                    new LoginView(),
                    userDAO);
            mainPage.setVisible(false);
        }
    }

    private class RegisterListener implements ActionListener {
        @Override
        public void actionPerformed(ActionEvent e) {
            SignUpController registerController = new SignUpController(
                    new SignUpDonor(),
                    userDAO
            );
            mainPage.setVisible(false);
        }
    }
}
