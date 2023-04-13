package application;

import java.io.IOException;
import java.util.ArrayList;

import Models.Timeslots;
import Models.appointment;
import Models.clinic;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
public class PatientController {
	
	static clinic cl;
	Main m=new Main();
	
	//Login Patient
	
    @FXML
    private Label invalidDetails;

    @FXML
    private PasswordField passwordPatientLogin;

    @FXML
    private Button patientLoginSubmit;

    @FXML
    private TextField usernamePatient;

    @FXML
    void staffPage(ActionEvent event) throws IOException {
    	System.out.println(usernamePatient.getText() +" "+passwordPatientLogin.getText());
    	if(usernamePatient.getText().isEmpty() || passwordPatientLogin.getText().isEmpty())
    	{
    		invalidDetails.setText("Invalid Details");
    	}
    	else {
    		cl.read();
    		//boolean x=cl.login_patient(usernamePatient.getText(), passwordPatientLogin.getText());
//    		System.out.println(usernamePatient.getText() +" "+ passwordPatientLogin.getText());
    		if( usernamePatient.getText().equals("admin") && passwordPatientLogin.getText().equals("admin"))
    		{
        		m.changeScene("PatientPage.fxml");
    		}
    		else {
    			invalidDetails.setText("Incorrect Details");
    		}
    		
    	}
    }
    
    //Cancel Appointments
    
    @FXML
    private TextField AppointmentIDText;

    @FXML
    private TextArea cancelAppointmentTextarea=new TextArea();

    @FXML
    private Button cancelButton;

    @FXML
    private Button returnToPortal;

    @FXML
    void cancelAppointment(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.WARNING);
    	alertObj.setHeaderText("SUCESSFUL");
		alertObj.setTitle("Successful");
		alertObj.setContentText("The appointment has been cancelled.");
		alertObj.showAndWait();
    	if(cl.patient.myapp.size()>0) {
	    	cancelAppointmentTextarea.setText("");
	    //	cl.patient.cancelappointment(Integer.parseInt(AppointmentIDText.getText()), cl.appointments);
			m.changeScene("PatientPage.fxml");
    	}
    }

    @FXML
    void toPatientPage(ActionEvent event) throws IOException {
		m.changeScene("PatientPage.fxml");
    }
    
    //Make appointments page
    @FXML
    private TextField AppDay;

    @FXML
    private TextField appDate;

    @FXML
    private TextField appEndTIme;

    @FXML
    private TextField appStartTime;

    @FXML
    private Button makeAppointmentButton;

    @FXML
    void makeAppointment(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.WARNING);
    	alertObj.setHeaderText("SUCESSFUL");
		alertObj.setTitle("Successful");
		alertObj.setContentText("The appointment has been created.");
		alertObj.showAndWait();
    	cl.patient.makeappointment(cl.appointments, appDate.getText(), AppDay.getText(), appStartTime.getText(), appEndTIme.getText());
//    	cl.write();
    	System.out.println(cl.appointments.size());
    	cancelAppointmentTextarea.appendText("this");
		m.changeScene("PatientPage.fxml");
		
    }
    
    //Patient portal page
    
    @FXML
    private Button cancelAppointmentButton;

    @FXML
    private Button logoutButton;

    @FXML
    private Button newAppointmentButton;

    @FXML
    private Button trackRecordButton;public PatientController() {
		// TODO Auto-generated constructor stub
	}
    @FXML
    private Button viewTimeslotButton;

    @FXML
    void cancelAppointmentPage(ActionEvent event) throws IOException {
    	//if(cl.patient.myapp.size()>0) {
	    	
			
//			cancelAppointmentTextarea.appendText("this is ");
			m.changeScene("CancelAppointmentPage.fxml");
	    	System.out.println(cl.patient.myapp.get(0).ap_id);
		//}
		
//		for(int i=0;i<cl.patient.myapp.size();i++) {
//			cancelAppointmentTextarea.appendText("Appointment ID: "+cl.patient.myapp.get(i).ap_id + " Appointment Date: "+ cl.patient.myapp.get(i).time.date+"\n");   
//		}
    }

    @FXML
    void goBacktoHome(ActionEvent event) throws IOException {
    
		m.changeScene("Home.fxml");
    }

    @FXML
    void makeAppointmentsPage(ActionEvent event) throws IOException {
    	
		m.changeScene("MakeAppointmentPage.fxml");
    }

    @FXML
    void patientTrackRecordPage(ActionEvent event) throws IOException {
    	patientRecrodsText.setEditable(false);
    	patientRecrodsText.setText("hello");
    	System.out.println(patientRecrodsText.getText());
    	for(int i=0;i<cl.patient.myapp.size();i++) { 
    		System.out.println("Appointment ID: "+cl.patient.myapp.get(i).ap_id + " Appointment Date: "+ cl.patient.myapp.get(i).time.date+"\n");
    		patientRecrodsText.appendText("Appointment ID: "+cl.patient.myapp.get(i).ap_id + " Appointment Date: "+ cl.patient.myapp.get(i).time.date+"\n");
    	}
    	
		m.changeScene("ViewPatientRecord.fxml");
    }

    @FXML
    void viewTimeslotPage(ActionEvent event) throws IOException {
    	
		m.changeScene("ViewTimeSlotPage.fxml");
    }
    
    //View Patient Record
    @FXML
    private TextArea patientRecrodsText=new TextArea();
    
    //View time slots page
    @FXML
    private TextArea timeslotstext;
    
    
}
