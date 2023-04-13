package application;
import java.io.IOException;
import java.util.ArrayList;
import Models.Timeslots;
import Models.clinic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class StaffController {
	static clinic clinic;
	
	//Login page Staff
	
	@FXML
    private Label invalidDetails;

    @FXML
    private PasswordField passwordStaffLogin;

    @FXML
    private Button staffLoginSubmit;

    @FXML
    private TextField usernameStaff;

    @FXML
    void staffPage(ActionEvent event) throws IOException {
    	clinic.read();
    	if(usernameStaff.getText().isEmpty() || passwordStaffLogin.getText().isEmpty())
    	{
    		invalidDetails.setText("Invalid Details");
    	}
    	else {
    		//boolean x=clinic.login_staff(usernameStaff.getText(), passwordStaffLogin.getText());
//    		System.out.println(usernamePatient.getText() +" "+ passwordPatientLogin.getText());
    		if(usernameStaff.getText().equals("admin") && passwordStaffLogin.getText().equals("admin"))
    		{
    			Main m = new Main();
        		m.changeScene("StaffPage.fxml");
    		}
    		else {
    			invalidDetails.setText("Incorrect Details");
    		}
    	}
    }
    
    //Patient Record Page Staff
    @FXML
    private TextArea PatientRecordTextArea;

    @FXML
    private TextField patientRecordsText;

    @FXML
    private Button returnToPortal;

    @FXML
    void toStaffPage(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("StaffPage.fxml");
    }
    
    //Manage appointment page 

    @FXML
    private TextField AppointmentIDText;

    @FXML
    private TextArea appointmentsTextArea_staff;

    @FXML
    private Button approveAppointment;

    @FXML
    private Button declineAppointment;

    @FXML
    void ApproveAppointment(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.WARNING);
    	alertObj.setHeaderText("SUCESSFUL");
		alertObj.setTitle("Successful");
		alertObj.setContentText("The appointment has been approved.");
		alertObj.showAndWait();
//    	clinic.cs.confirm_appointment(clinic.appointments, Integer.parseInt(AppointmentIDText.getText()));
    	Main m = new Main();
		m.changeScene("StaffPage.fxml");
    }

    @FXML
    void DeclineAppointment(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.WARNING);
    	alertObj.setHeaderText("SUCESSFUL");
		alertObj.setTitle("Successful");
		alertObj.setContentText("The appointment has been Declined.");
		alertObj.showAndWait();
//    	clinic.cs.decline_appointment(clinic.appointments, Integer.parseInt(AppointmentIDText.getText()));
    	Main m = new Main();
		m.changeScene("StaffPage.fxml");
    }
    
    //Manage Time slot page
    
    @FXML
    private TextField TimeSLotDateText;

    @FXML
    private TextField TimeSLotDayText;

    @FXML
    private TextField TimeSLotStartTimeText;

    @FXML
    private TextField TimeSlotEndTimeText;

    @FXML
    private TextField TimeSlotIDText;

    @FXML
    private Button addTimeSlot;

    @FXML
    private Button removeTimeslot;

    @FXML
    private TextArea timetableTextarea;

    @FXML
    void AddTimeSLot(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.WARNING);
    	alertObj.setHeaderText("SUCESSFUL");
		alertObj.setTitle("Successful");
		alertObj.setContentText("The Time Slot has been added .");
		alertObj.showAndWait();
//    	clinic.cs.add_timeslot(clinic.time,TimeSLotStartTimeText.getText() , TimeSlotEndTimeText.getText(), TimeSLotDayText.getText(), TimeSLotDateText.getText());
    	
    	Main m = new Main();
		m.changeScene("StaffPage.fxml");
    }

    @FXML
    void RemoveTimeSLot(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.WARNING);
		alertObj.setHeaderText("SUCESSFUL");
		alertObj.setTitle("Successful");
		alertObj.setContentText("The Time slot has been removed.");
		alertObj.showAndWait();
//    	clinic.cs.remove_timeslot(clinic.time,Integer.parseInt(TimeSlotIDText.getText()));
    	
    	Main m = new Main();
		m.changeScene("StaffPage.fxml");
    }
    
    //Track appointments
    
    @FXML
    private TextArea AppointmentTextArea;

    @FXML
    private TextField appointmentDate;
    
    //Staff Portal
    
    @FXML
    private Button RecordsButton;

    @FXML
    private Button TrackAppointmentButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button manageAppointmentButton;

    @FXML
    private Button modifyTimeslotButton;

    @FXML
    void AppointmentPage(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("ManageAppointmentPage.fxml");
    }

    @FXML
    void TrackAppointmentsPage(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("TrackAppointmentRecord.fxml");
    }

    @FXML
    void PatientRecordPage(ActionEvent event) throws IOException {
    	Main m = new Main();
		m.changeScene("TrackPatientRecordPage.fxml");
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
