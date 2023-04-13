package application;

import java.io.IOException;

import application.Main;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.*;

public class ManageTimeSlotPageController {
	@FXML
    private Button EditTimeSlotbutton;

    @FXML
    private TextField TimeSLotDateText;

    @FXML
    private TextField TimeSLotDayText;

    @FXML
    private TextField TimeSLotStartTimeText;

    @FXML
    private TableColumn<?, ?> TimeSlotDate;

    @FXML
    private TableColumn<?, ?> TimeSlotDay;

    @FXML
    private TableColumn<?, ?> TimeSlotEndTime;

    @FXML
    private TextField TimeSlotEndTimeText;

    @FXML
    private TableColumn<?, ?> TimeSlotID;

    @FXML
    private TextField TimeSlotIDText;

    @FXML
    private TableColumn<?, ?> TimeSlotStartTime;

    @FXML
    private TableView<?> TimeSlotsTable;

    @FXML
    private Button addTimeSlot;

    @FXML
    private Button returnToPortal;
    
    @FXML
    private Button removeTimeslot;

    @FXML
    void AddTimeSLot(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.INFORMATION);
    	alertObj.setHeaderText("SUCCESSFULL");
   		alertObj.setTitle("Successfull");
    	alertObj.setContentText("You have added a Timeslot!");
    	alertObj.showAndWait();
    		
   		Main m = new Main();
   		m.changeScene("ManageTimeSlotPage.fxml");
    }

    @FXML
    void EditTimeSLot(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.INFORMATION);
    	alertObj.setHeaderText("SUCCESSFULL");
   		alertObj.setTitle("Successfull");
    	alertObj.setContentText("You have edited a Timeslot!");
    	alertObj.showAndWait();
    		
   		Main m = new Main();
   		m.changeScene("ManageTimeSlotPage.fxml");
    }
    
    @FXML
    void RemoveTimeSLot(ActionEvent event) throws IOException {
    	Alert alertObj = new Alert(Alert.AlertType.INFORMATION);
    	alertObj.setHeaderText("SUCCESSFULL");
   		alertObj.setTitle("Successfull");
    	alertObj.setContentText("You have Removed a Timeslot!");
    	alertObj.showAndWait();
    		
   		Main m = new Main();
   		m.changeScene("ManageTimeSlotPage.fxml");
    }

    @FXML
    void toStaffPage(ActionEvent event) throws IOException {
    	Main m = new Main();
    	m.changeScene("StaffPage.fxml");
    }
}
