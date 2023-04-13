package application;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class staffPageController {
	 @FXML
	    private Button RecordsButton;

	    @FXML
	    private Button TrackAppointmentButton;

	    @FXML
	    private Button manageAppointmentButton;

	    @FXML
	    private Button logoutButton;

	    @FXML
	    private Button modifyTimeslotButton;

	    @FXML
	    void AppointmentsPage(ActionEvent event) throws IOException {
	    	Main m = new Main();
	    	m.changeScene("TrackAppointmentRecord.fxml");
	    }

	    @FXML
	    void PatientRecordPage(ActionEvent event) throws IOException {
	    	Main m = new Main();
	    	m.changeScene("TrackPatientRecordPage.fxml");
	    }

	    @FXML
	    void AppointmentPage(ActionEvent event) throws IOException {
	    	Main m = new Main();
	    	m.changeScene("ManageAppointmentPage.fxml");
	    }

	    @FXML
	    void goBacktoHome(ActionEvent event) throws IOException {
	    	Main m = new Main();
	    	m.changeScene("Home.fxml");
	    }

	    @FXML
	    void modifyTimeslotPage(ActionEvent event) throws IOException {
	    	Main m = new Main();
	    	m.changeScene("ManageTimeSlotPage.fxml");
	    }
}
