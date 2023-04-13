package application;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageAppointmentPageController {
	@FXML
    private TableColumn<?, ?> AppointmentDate;

    @FXML
    private TextField AppointmentDateText;

    @FXML
    private TableColumn<?, ?> AppointmentID;

    @FXML
    private TextField AppointmentIDText;

    @FXML
    private TableView<?> AppointmentsTable;

    @FXML
    private TableColumn<?, ?> Appointmentstatus;

    @FXML
    private TableColumn<?, ?> PatientID;

    @FXML
    private TextField PatientIDText;

    @FXML
    private Button addAppointment;

    @FXML
    private Button cancelAppointment;

    @FXML
    private Button returnToPortal;

    @FXML
    void AddAppointment(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.INFORMATION);
    	alertObj.setHeaderText("SUCCESSFULL");
   		alertObj.setTitle("Successfull");
    	alertObj.setContentText("You have added an appointment!");
    	alertObj.showAndWait();
    		
   		Main m = new Main();
   		m.changeScene("ManageAppointmentPage.fxml");
    }

    @FXML
    void cancelAppointment(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.INFORMATION);
    	alertObj.setHeaderText("SUCCESSFULL");
   		alertObj.setTitle("Successfull");
    	alertObj.setContentText("You have Cancelled an appointment!");
    	alertObj.showAndWait();
    		
   		Main m = new Main();
   		m.changeScene("ManageAppointmentPage.fxml");
    }

    @FXML
    void toStaffPage(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("StaffPage.fxml");
    }
}
