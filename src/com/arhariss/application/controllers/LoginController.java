package com.arhariss.application.controllers;

import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;

public class LoginController {

	@FXML
	private JFXTextField username;

	@FXML
	private JFXPasswordField password;

	@FXML
	private JFXTextField passwordText;

	@FXML 
	private ImageView appIcon; 

	@FXML
	private ImageView loginIcon; 

	@FXML
    private ImageView usernameIcon;

    @FXML
    private ImageView passwordIcon;

	
	@FXML
	private void initialize() {
		appIcon.setImage(new Image("/com/arhariss/application/resources/images/app_logo_lg.png", false));
		loginIcon.setImage(new Image("/com/arhariss/application/resources/images/user_logo.png", false));
		usernameIcon.setImage(new Image("/com/arhariss/application/resources/images/username_icon.png", false));
		passwordIcon.setImage(new Image("/com/arhariss/application/resources/images/eye.png", false));
	}

	@FXML
	void reset(ActionEvent event) {

	}

	@FXML
	void selectUsername(MouseEvent event) {

	}

	@FXML
	void show(ActionEvent event) {

	}

	@FXML
	void showPassword(MouseEvent event) {

	}

	@FXML
	void signIn(ActionEvent event) {

	}
}
