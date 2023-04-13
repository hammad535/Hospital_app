package application;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TrackAppointmentRecordController {
	@FXML
    private TableColumn<?, ?> AppointmentDate;

    @FXML
    private TableColumn<?, ?> AppointmentID;

    @FXML
    private TableColumn<?, ?> AppointmentStatus;

    @FXML
    private TableColumn<?, ?> PatientID;

    @FXML
    private TableView<?> PatientRecordTable;

    @FXML
    private TextField appointmentDate;

    @FXML
    private Button returnToPortal;

    @FXML
    void toStaffPage(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("StaffPage.fxml");
    }
}
