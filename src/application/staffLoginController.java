package application;

import java.io.IOException;

import application.Main;
import javafx.event.*;
import javafx.fxml.*;
import javafx.scene.control.*;

public class staffLoginController {
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
    	if(usernameStaff.getText().isEmpty() || passwordStaffLogin.getText().isEmpty())
    	{
    		invalidDetails.setText("Invalid Details");
    	}
    	else {
    		Main m = new Main();
    		m.changeScene("StaffPage.fxml");
    	}
    }
}
