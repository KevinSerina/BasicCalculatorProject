import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CalcController {
	
	double num = 0;
	int operation = -1;

    @FXML
    private Button button0;

    @FXML
    private Button button1;

    @FXML
    private Button button2;

    @FXML
    private Button button3;

    @FXML
    private Button button4;

    @FXML
    private Button button5;

    @FXML
    private Button button6;

    @FXML
    private Button button7;

    @FXML
    private Button button8;

    @FXML
    private Button button9;

    @FXML
    private Button addition;

    @FXML
    private Button division;


    @FXML
    private Button clear;

    @FXML
    private TextField txtField;
    
    @FXML
    private Button equals;
    
    @FXML
    //This event is called whenever a user clicks on a button
    void handleButtonAction(ActionEvent event)  
    {
    	if (event.getSource() == button0)
    	{
    		txtField.setText(txtField.getText() + "0"); //Displays 0 on text field
    	}
    	else if (event.getSource() == button1)
    	{
    		txtField.setText(txtField.getText() + "1"); //Displays 1 on text field
    	}
    	else if (event.getSource() == button2)
    	{
    		txtField.setText(txtField.getText() + "2"); //Displays 2 on text field
    	}
    	else if (event.getSource() == button3)
    	{
    		txtField.setText(txtField.getText() + "3"); //Displays 3 on text field
    	}
    	else if (event.getSource() == button4)
    	{
    		txtField.setText(txtField.getText() + "4"); //Displays 4 on text field
    	}
    	else if (event.getSource() == button5)
    	{
    		txtField.setText(txtField.getText() + "5"); //Displays 5 on text field
    		
    	}
    	else if (event.getSource() == button6)
    	{
    		txtField.setText(txtField.getText() + "6"); //Displays 6 on text field
    	}
    	else if (event.getSource() == button7)
    	{
    		txtField.setText(txtField.getText() + "7"); //Displays 7 on text field
    	}
    	else if (event.getSource() == button8)
    	{
    		txtField.setText(txtField.getText() + "8"); //Displays 8 on text field
    	}
    	else if (event.getSource() == button9)
    	{
    		txtField.setText(txtField.getText() + "9"); //Displays 9 on text field
    	}
    	else if (event.getSource() == clear)
    	{
    		txtField.clear(); //Clears text field
    	}
    	else if (event.getSource() == addition)
    	{
    		num = Integer.parseInt(txtField.getText());
    		operation = 1;
    		txtField.setText("");
    	}
    	else if (event.getSource() == division)
    	{
    		num = Integer.parseInt(txtField.getText());
    		operation = 2;
    		txtField.setText("");
    	}
    	else if (event.getSource() == equals)
    	{
    		int secondOperand = Integer.parseInt(txtField.getText());
    		switch(operation)
    		{
    		case 1: //Addition
    			double answer = num + secondOperand;
    			txtField.setText(String.valueOf(answer));break;
    		case 2: //Division
    			answer = num / secondOperand;
    			txtField.setText(String.valueOf(answer));break;
    		}
    		
    	}
    }

}
