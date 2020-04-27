package gui;

import java.net.URL;
import java.util.ResourceBundle;

import gui.util.Constraints;
import gui.util.Utils;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import model.entities.Department;
import model.services.DepartmentService;

public class DepartmentFormController implements Initializable{

	private Department entity;
	private DepartmentService  service;
	
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
	
	public void setDepartmentService(DepartmentService service) {
		this.service = service;
	}
	@FXML
	public void onButtonSaveAction() {
		entity = getFormData();
		service.saveOrUpdate(entity);
	}
	
	private Department getFormData() {
		Department obj = new Department();
		obj.setId(Utils.tryParseToInt(textId.getText()));
		obj.setName(textName.getText());
		
		return obj;
	}

	@FXML
	public void onButtonCancelAction() {
		System.out.println("onButtonCancelAction");
	}
	@FXML
	public void inicializeNodes() {
		Constraints.setTextFieldMaxLength(textName,30);
	}
	
	public void updateFormData() {
		if(entity == null) {
			throw new IllegalStateException("Entity was null");
		}
		textId.setText(String.valueOf(entity.getId()));
		textName.setText(entity.getName());
	}
	
	@Override
	public void initialize(URL url, ResourceBundle rb) {
		inicializeNodes();
	}

}
