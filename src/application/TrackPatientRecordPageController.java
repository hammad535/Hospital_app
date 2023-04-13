package application;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class TrackPatientRecordPageController {
	@FXML
    private TableColumn<?, ?> PatientAge;

    @FXML
    private TableColumn<?, ?> PatientGender;

    @FXML
    private TableColumn<?, ?> PatientID;

    @FXML
    private TableColumn<?, ?> PatientName;

    @FXML
    private Button PatientRecord;

    @FXML
    private TableView<?> PatientRecordTable;

    @FXML
    private Button returnToPortal;

    @FXML
    void toPatientAppointmentPage(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("ViewPatientRecord.fxml");
    }

    @FXML
    void toStaffPage(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("StaffPage.fxml");
    }
}
