    	package Marks_Card;

    	import java.net.URL;
    	import java.util.ResourceBundle;
    	import javafx.event.ActionEvent;
    	import javafx.fxml.FXML;
    	import javafx.scene.control.Button;
    	import javafx.scene.control.TextField;

    	public class MarksCardFormController {

    	    @FXML
    	    private ResourceBundle resources;

    	    @FXML
    	    private URL location;

    	    @FXML
    	    private TextField txtc;

    	    @FXML
    	    private TextField txtjava;

    	    @FXML
    	    private TextField txtweb;

    	    @FXML
    	    private Button btntotal;

    	    @FXML
    	    private Button btnresult;

    	    @FXML
    	    private Button btnper;

    	    @FXML
    	    private Button btnclear;

    	    @FXML
    	    private TextField txttotal;

    	    @FXML
    	    private TextField txtper;

    	    @FXML
    	    private TextField txtresult;

    	    @FXML
    	    void doclear(ActionEvent event) {
    	    	txtc.setText("");
        		txtjava.setText("");
        		txtweb.setText("");
        		txttotal.setText("");
        		txtresult.setText("");
        		txtper.setText("");
    	    }

    	    float total;
    	    float per;
    	    String strc,strweb,strjava;
    	    @FXML
    	    void doper(ActionEvent event) {
    	    	if(total>300)
    	    	{
    	    		System.out.println("Invalid");
    	    	}
    	    	else
    	    	{
    	    		total=Float.parseFloat(strc)+Float.parseFloat(strweb)+Float.parseFloat(strjava);
    	    		per=total/3;
    	    		txtper.setText(String.valueOf(per));
    	    	}

    	    }

    	    @FXML
    	    void doresult(ActionEvent event) {
    	    	if(per>=50 && per<=60 )
    	    	{
    	    		txtresult.setText("E");
    	    	}
    	    	else
    	    		if(per>=60 && per<=70)
    	    		{
    	    			txtresult.setText("D");
    	    		}
    	    		else
        	    		if(per>=70 && per<=80)
        	    		{
        	    			txtresult.setText("C");
        	    		}
        	    		else
            	    		if(per>=80 && per<=90)
            	    		{
            	    			txtresult.setText("B");
            	    		}
            	    		else
                	    		if(per>=90 && per<=100)
                	    		{
                	    			txtresult.setText("A");
                	    		}
    	    	
    	    }
    	
    	    @FXML
    	    void dototal(ActionEvent event) {
    	    	strc=txtc.getText();
    	    	strjava=txtjava.getText();
    	    	strweb=txtweb.getText();
    	    	if(strc==txtc.getText())
    	    	{
    	    		total=Float.parseFloat(strc);
    	    		txttotal.setText(String.valueOf(total));
    	    	}
    	    	else
    	    		if(strweb==txtweb.getText())
    	    		{
    	    		total=Float.parseFloat(strweb);
    	    		txttotal.setText(String.valueOf(total));
    	    		}
    	    		else
    	    			if (strjava==txtjava.getText())
    	    			{
    	    				total=Float.parseFloat(strjava);
    	    				txttotal.setText(String.valueOf(total));
    	    			}
    	    			else {
    	    	total=Float.parseFloat(strc)+Float.parseFloat(strweb)+Float.parseFloat(strjava);
    	    	txttotal.setText(String.valueOf(total));
    	    }
    	    }

    	    @FXML
    	    void initialize() {
    	        assert txtc != null : "fx:id=\"txtc\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert txtjava != null : "fx:id=\"txtjava\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert txtweb != null : "fx:id=\"txtweb\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert btntotal != null : "fx:id=\"btntotal\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert btnresult != null : "fx:id=\"btnresult\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert btnper != null : "fx:id=\"btnper\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert btnclear != null : "fx:id=\"btnclear\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert txttotal != null : "fx:id=\"txttotal\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert txtper != null : "fx:id=\"txtper\" was not injected: check your FXML file 'MarksCardForm.fxml'.";
    	        assert txtresult != null : "fx:id=\"txtresult\" was not injected: check your FXML file 'MarksCardForm.fxml'.";

    	    }
    	}
