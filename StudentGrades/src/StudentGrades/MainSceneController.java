package StudentGrades;

import javafx.fxml.FXML;

import javafx.scene.control.TextField;

import javafx.event.ActionEvent;

import javafx.scene.control.TextArea;

public class MainSceneController {
	@FXML
	private TextField tfTest1;
	@FXML
	private TextField tfTest2;
	@FXML
	private TextField tfTest3;
	@FXML
	private TextField tfTest4;
	@FXML
	private TextField tfTest5;
	@FXML
	private TextArea displayArea;
	@FXML
	private TextField tfweight1;
	@FXML
	private TextField tfweight2;
	@FXML
	private TextField tfweight3;
	@FXML
	private TextField tfweight4;
	@FXML
	private TextField tfweight5;
	@FXML
	private TextField tfStudentName;
	private double mark1 = 0;
	private double mark2 = 0;
	private double mark3 = 0;
	private double mark4 = 0;
	private double mark5 = 0;

		public double mark1() {
			
			if(tfTest1.getText() != "" && tfweight1.getText() != "") {
				mark1 = Integer.valueOf(tfTest1.getText()) * Integer.valueOf(tfweight1.getText());		
			}
			return mark1;	 
		}

		public double mark2() {
			if(tfTest2.getText() != "" && tfweight2.getText() != "") {
				mark2 = Integer.valueOf(tfTest2.getText()) * Integer.valueOf(tfweight2.getText());		
			}
			return mark2;
		
		}
		public double mark3() {
			if(tfTest3.getText() != "" && tfweight3.getText() != "") {
				mark3 = Integer.valueOf(tfTest3.getText()) * Integer.valueOf(tfweight3.getText());		
			}
			return mark3;

		
		}
		public double mark4() {
			if(tfTest4.getText() != "" && tfweight4.getText() != "") {
				mark4 = Integer.valueOf(tfTest4.getText()) * Integer.valueOf(tfweight4.getText());
			}
			return mark4;
		

		}
		public double mark5() {
			if(tfTest5.getText() != "" && tfweight5.getText() != "") {
				mark5 = Integer.valueOf(tfTest5.getText()) * Integer.valueOf(tfweight5.getText());
			}
			return mark5;
		
		}

	public void btnSUBMITClicked(ActionEvent event) {
		
		int grade = (int) Math.round((this.mark1() + this.mark2() + this.mark3() + this.mark4() + this.mark5())/100);
		Student s = new Student(grade, tfStudentName.getText());
		// TODO add print function for student class and print into text area
		displayArea.setText(s.printStudent()); // STILL NEEDS TESTING/IMPLEMENTATION
		// TODO Clear the text fields
		TextField[] fields = {tfTest1, tfTest2, tfTest3, tfTest4, tfTest5, tfweight1, tfweight2, tfweight3, tfweight4, tfweight5,tfStudentName};
		for(int i=0;i<10;i++) {
			fields[i].clear();
		}
		tfStudentName.clear();
	}
}

