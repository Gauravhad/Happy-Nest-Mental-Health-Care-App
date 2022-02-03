package application;

import java.io.File;
import java.io.IOException;
import java.net.URL;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;

public class UserProfile2Controller {

	private Parent root;
	private Scene scene;
	private Stage stage;

	public void switchToUserProfile3(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("UserProfile3.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}

	public void switchToUserProfile2(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("UserProfile2.fxml"));
		stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
	}
	
	public void switchToConfirmPopup(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("ConfirmPopup.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}
	
	public void Mental1stPage(ActionEvent event) throws IOException {
		Parent root = FXMLLoader.load(getClass().getResource("Mental1stPage.fxml"));
		stage = (Stage)((Node)event.getSource()).getScene().getWindow();
		scene = new Scene(root);
		stage.setScene(scene);
		stage.show();
		}

	@FXML
	private ComboBox<String> COM;
	private String[] psychiatrist = { "Dr. Harsha GT", "Dr. Krishna Patel", "Dr. Charan Tej" };
	private String[] psychologist = { "Dr. Jayapal Reddy", "Dr. Ankita Paul", "Dr. Aher Alam" };

	@FXML
	private Button CB;

	@FXML
	private DatePicker date;

	@FXML
	private Label rageLabel;

	@FXML
	private Label rcontactLabel;

	@FXML
	private Label remailLabel;

	@FXML
	private Label rgenderLabel;

	@FXML
	private Label rnameLabel;
	@FXML
	private RadioButton rpsychi;

	@FXML
	private RadioButton rpsycho;

	int i, j;

	@FXML
	public void check1(ActionEvent event) {
		if(rpsycho.isSelected()) {
			rpsychi.setSelected(false);
			i = 1;

			if (i == 1) {
				COM.getItems().clear();
				COM.getItems().addAll(psychologist);
				i=0;
	
			}	
		}
		

	}

	@FXML
	public void check2(ActionEvent event) {
		if(rpsychi.isSelected()) {
			rpsycho.setSelected(false);
			j = 2;

			if (j == 2) {
				COM.getItems().clear();
				COM.getItems().addAll(psychiatrist);
				j=0;
			}
		}
		

	}
//    
//    @FXML
//    void Drop(ActionEvent event) {

	/*
	 * if(rpsychi.isSelected()) { rpsycho.setSelected(false);
	 * COM.getItems().addAll(psychiatrist); } else { rpsychi.setSelected(false);
	 * COM.getItems().addAll(psychologist); }
	 */

	/*
	 * @FXML public void check2(ActionEvent event) { if(rpsycho.isSelected()) {
	 * rpsychi.setSelected(false); COM.getItems().addAll(psychologist); } }
	 */

//	@Override
//	public void initialize(URL arg0, ResourceBundle arg1) {
//		if(rpsychi.isSelected()) {
//			rpsycho.setSelected(false);
//	        COM.getItems().addAll(psychiatrist);
//		    } 
//		
//		else{
//		    	rpsychi.setSelected(false);
//		    	COM.getItems().addAll(psychologist);
//		   }
//	}

	public void displayName2(String uname) {
		// TODO Auto-generated method stub
		rnameLabel.setText(uname);
	}

	public void displayName5(String ucontact) {
		// TODO Auto-generated method stub
		rcontactLabel.setText(ucontact);
	}

	public void displayName3(String udob) {
		// TODO Auto-generated method stub
		rageLabel.setText(udob);
	}

	public void displayName4(String uemail) {
		// TODO Auto-generated method stub
		remailLabel.setText(uemail);
	}

	public void displayName1(String a) {
		// TODO Auto-generated method stub
		rgenderLabel.setText(a);
	}

	Connection con;
	PreparedStatement pst;

	@FXML
	void switchToMental1stPage(ActionEvent event) throws IOException {

		String udate = date.getEditor().getText();
		String uemail = remailLabel.getText();
		String udoc = COM.getValue();

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happynest", "root", "Anagha02@");
			pst = con.prepareStatement("insert into appointment(EmailID,Doctor,Date)values(?,?,?)");

			pst.setString(1, uemail);
			pst.setString(2, udoc);
			pst.setString(3, udate);

			int status = pst.executeUpdate();

			if (status == 1) {
				JOptionPane.showMessageDialog(null, "YOUR APPOINTMENT HAS BEEN BOOKED!");

				FXMLLoader loader = new FXMLLoader(getClass().getResource("ConfirmPopup.fxml"));
				root = loader.load();

				stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
				scene = new Scene(root);
				stage.setScene(scene);
				stage.show();

			} else {
				JOptionPane.showMessageDialog(null, "BOOKING FAILED!");

			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	 @FXML
	    private ImageView GIF;

	    public void initialize(URL url, ResourceBundle rb) {
	            Image i = new Image(new File("Downloads/BOW1.gif").toURI().toString());
	            GIF.setImage(i);
	    }

	
}
