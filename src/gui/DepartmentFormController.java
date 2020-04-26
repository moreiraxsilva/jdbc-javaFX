package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;

public class DepartmentFormController implements Initializable{

	@FXML
	private TextField textId;
	@FXML
	private TextField textName;
	@FXML
	private Label labelErrorName;
	@FXML
	private Button buttonSave;
	@FXML
	private Button buttonCancel;
	
	public void onButtonSaveAction() {
		System.out.println("onButtonSaveAction");
	}
	
	public void onButtonCancelAction() {
		System.out.println("onButtonCancelAction");
	}
	
	public void inicializeNodes() {
		Constraints.setTextFieldMaxLength(textName,30);
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		inicializeNodes();
	}

}
