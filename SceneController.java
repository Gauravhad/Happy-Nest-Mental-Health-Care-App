package application;

import java.awt.Component;

import java.io.IOException;
import java.sql.*;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Logger;

import javax.swing.JOptionPane;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class SceneController {

 private Stage stage;
private Scene scene;
private Parent root;




public void switchToConsultPsychologists(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("ConsultPsychologists.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToConsultPsychiatrists(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("ConsultPsychiatrists.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToPsychologistPersonalInfo1(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("PsychologistPersonalInfo1.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToPsychologistPersonalInfo2(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("PsychologistPersonalInfo2.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToPsychologistPersonalInfo3(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("PsychologistPersonalInfo3.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToPsychiatristsPersonalInfo1(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("PsychiatristsPersonalInfo1.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToPsychiatristPersonalInfo2(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("PsychiatristPersonalInfo2.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToPsychiatristPersonalInfo3(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("PsychiatristPersonalInfo3.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToAPPOINTMENTS(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("APPOINTMENTS.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToLoginPage(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("LoginPage.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToMental1stPage(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Mental1stPage.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToClientExperience(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("ClientExperience.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToAboutUs(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("AboutUs.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToDoctorsLoginPage(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("DoctorsLoginPage.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToDrSignin(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("DrSignin.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToDrProfile1(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("DrProfile1.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToDrProfile2(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("DrProfile2.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToPopup(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("Popup.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToConsultPsychologist2(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("ConsultPsychologist2.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchToConsultPsychiatrist2(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("ConsultPsychiatrist2.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}

public void switchTofaq(ActionEvent event) throws IOException {
Parent root = FXMLLoader.load(getClass().getResource("faq.fxml"));
stage = (Stage)((Node)event.getSource()).getScene().getWindow();
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


@FXML
private Button btnuserL;

 @FXML
private Button btnuserS;



 @FXML
private TextField txtuserLemail;

 @FXML
private PasswordField txtuserLpass;

 @FXML
private TextField txtuserScontact;

 @FXML
private TextField txtuserSdob;

 @FXML
private TextField txtuserSemail;

 @FXML
private TextField txtuserSname;
 
 @FXML
 private RadioButton radfemale;

 @FXML
 private RadioButton radmale;

 @FXML
 private RadioButton radothers;


 @FXML
private PasswordField txtuserSpass;
Connection con;
PreparedStatement pst;


//private RadioButton radfemale,radmale,radothers;


@FXML
public void female(ActionEvent event) {
if(radfemale.isSelected()) {
radothers.setSelected(false);
radmale.setSelected(false);
}

 }

 @FXML
public void male(ActionEvent event) {
if(radmale.isSelected()) {
radfemale.setSelected(false);
radothers.setSelected(false);
}
}

 @FXML
public void others(ActionEvent event) {
if(radothers.isSelected()) {
radmale.setSelected(false);
radfemale.setSelected(false);
}
 }


//For New User.......
@FXML
void switchToUserProfile2(ActionEvent event) throws IOException {
	
	String a = null;

	if(radmale.isSelected()) {
	a = radmale.getText();;
	}
	else if(radfemale.isSelected()) {
	a = radfemale.getText();
	}
	else if(radothers.isSelected()) {
	a = radothers.getText();
	}

 String uname = txtuserSname.getText();
String ucontact = txtuserScontact.getText();
String udob = txtuserSdob.getText();
String uemail = txtuserSemail.getText();
String upass = txtuserSpass.getText();


if(uname.equals("") || ucontact.equals("") || udob.equals("") || uemail.equals("") || upass.equals("")  )
{
JOptionPane.showMessageDialog(null,"ALL DETAILS ARE REQUIRED!");
}
else if(uemail.indexOf("@")<0 || uemail.indexOf(".")<0)
{
JOptionPane.showMessageDialog(null,"INVALID EMAIL!");
}
else
{
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happynest","root","Anagha02@");
pst = con.prepareStatement("insert into usersignin(Name,Contact,DOB,EmailID,Password,Gender)values(?,?,?,?,?,?)");

pst.setString(1, uname);
pst.setString(2, ucontact);
pst.setString(3, udob);
pst.setString(4, uemail);
pst.setString(5, upass);
pst.setString(6, a);


int status = pst.executeUpdate();

if(status==1)
{
JOptionPane.showMessageDialog(null,"YOU'VE SUCCESSFULLY SIGNED UP!");



FXMLLoader loader = new FXMLLoader(getClass().getResource("UserProfile2.fxml"));
root = loader.load();
UserProfile2Controller pro = loader.getController();
pro.displayName2(uname);
pro.displayName5(ucontact);
pro.displayName3(udob);
pro.displayName4(uemail);
pro.displayName1(a);



stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();


}
else
{
JOptionPane.showMessageDialog(null,"SIGNIN FAILED!");
txtuserSname.setText("");
txtuserScontact.setText("");
txtuserSdob.setText("");
txtuserSemail.setText("");
txtuserSpass.setText("");
radmale.setSelected(false);
radfemale.setSelected(false);
radothers.setSelected(false);

txtuserSname.requestFocus();
}
}
catch (ClassNotFoundException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
catch (SQLException e)
{
// TODO Auto-generated catch block
e.printStackTrace();
}
}
}

//Already a User......
@FXML
void switchToUserProfile3(ActionEvent event) throws IOException {



String uemail = txtuserLemail.getText();
String upass = txtuserLpass.getText();

if(uemail.equals("") || upass.equals(""))
{
JOptionPane.showMessageDialog(null,"INCOMPLETE DETAILS");
}
else
{
try {
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3306/happynest","root","Anagha02@");
Statement stm = con.createStatement();
String sql = "select * from usersignin where EmailID='"+uemail+"' and Password='"+upass.toString()+"'";
 

ResultSet rs = stm.executeQuery(sql);

Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/happynest","root","Anagha02@");
String sql1 = "select * from usersignin where EmailID=?";
PreparedStatement psmt = conn.prepareStatement(sql1);
//psmt.setInt(1, Integer.parseInt(txtuserSemail.getText()));
psmt.setNString(1, txtuserLemail.getText());
ResultSet rs1 = psmt.executeQuery();


 if(rs.next() && rs1.next())
{
JOptionPane.showMessageDialog(null,"YOU'VE SUCCESSFULLY LOGGED IN!");
System.out.println(rs1.getString("Name"));
String uname = rs1.getString("Name");
String ucontact = rs1.getString("Contact");
String udob =  rs1.getString("DOB");
//String uemail1 =  rs1.getString("EmailID");
String a= rs1.getString("Gender");



FXMLLoader loader = new FXMLLoader(getClass().getResource("UserProfile3.fxml"));    
root = loader.load();    

UserProfile3Controller Profile = loader.getController();
Profile.displayName2(uname);
Profile.displayName5(ucontact);
Profile.displayName3(udob);
Profile.displayName4(uemail);
Profile.displayName1(a);

stage = (Stage)((Node)event.getSource()).getScene().getWindow();
scene = new Scene(root);
stage.setScene(scene);
stage.show();
}
else
{
JOptionPane.showMessageDialog(null,"LOGIN FAILED!");

}
}
catch (ClassNotFoundException e)
{

 // TODO Auto-generated catch block
e.printStackTrace();
}
catch (SQLException e)
{

 // TODO Auto-generated catch block
e.printStackTrace();
}
}
}



}