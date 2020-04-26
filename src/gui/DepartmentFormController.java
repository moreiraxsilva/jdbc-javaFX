package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;

public class DepartmentFormController implements Initializable{

	private Department entity;
	
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
	
	public void setDepartment(Department entity) {
		this.entity = entity;
	}

	public void onButtonSaveAction() {
		System.out.println("onButtonSaveAction");
	}
	
	public void onButtonCancelAction() {
		System.out.println("onButtonCancelAction");
	}
	
	public void inicializeNodes() {
		Constraints.setTextFieldMaxLength(textName,30);
	}
	
	public void updateFormData() {
		if( entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		textId.setText(String.valueOf(entity.getId()));
		textName.setText(String.valueOf(entity.getName()));
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		inicializeNodes();
	}

}
