package application;

import java.io.IOException;

import Models.clinic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;

public class HomeController {
	static final clinic CLINIC=new clinic();
	@FXML
    private Button patientButton;

    @FXML
    private Button staffButton;

    @FXML
    void patientLoginPage(ActionEvent event) throws IOException {
    	PatientController pController=new PatientController();
    	pController.cl=CLINIC;
    	Main m = new Main();
    	m.changeScene("PatientLogin.fxml");
    	
    }

    @FXML
    void staffLoginPage(ActionEvent event) throws IOException {
    	StaffController sController=new StaffController();
    	sController.clinic=CLINIC;
    	Main m = new Main();
    	m.changeScene("StaffLogin.fxml");
    }
}
