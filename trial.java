Connection con;
PreparedStatement pst;
@FXML
public void Profile(ActionEvent event) throws IOException{​​​​​​
    
    String uaadhaar = atext.getText();
    String upass =  ptext.getText();
    String u =  user.getText();
    
    [16:51] Swara Patil
    for radio utto @FXML
    private RadioButton vfemale,vmale,vother; private Stage stage;
    private Scene scene;
    private Parent root;
    @FXML
    public void checkf(ActionEvent event) {
    if(vfemale.isSelected()) {
    vother.setSelected(false);
    vmale.setSelected(false);
    } } @FXML
    public void checkm(ActionEvent event) {
    if(vmale.isSelected()) {
    vfemale.setSelected(false);
    vother.setSelected(false);
    }
    } @FXML
    public void checko(ActionEvent event) {
    if(vother.isSelected()) {
    vmale.setSelected(false);
    vfemale.setSelected(false);
    } }

    [16:52] Swara Patil
    String a = null;
    if(vmale.isSelected()) {
    a = vmale.getText();;
    }
    else if(vfemale.isSelected()) {
    a = vfemale.getText();
    }
    else if(vother.isSelected()) {
    a = vother.getText();
    }



    if(uaadhaar.equals("") || upass.equals(""))
    {​​​​​​
    JOptionPane.showMessageDialog(null,"INCOMPLETE DETAILS");
    }​​​​​​
    else
    {​​​​​​
    try {​​​​​​
    Class.forName("com.mysql.cj.jdbc.Driver");
    con = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccinationsystem","root","Hero@MYSQL8027");
    Statement stm = con.createStatement();
    String sql = "select * from registerantprofile where Aadhaar='"+uaadhaar+"' and Contact='"+upass.toString()+"'";
    ResultSet rs = stm.executeQuery(sql);
    
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/vaccinationsystem","root","Hero@MYSQL8027");
        String sql1 = "select * from registerantprofile where Aadhaar=?";
        PreparedStatement psmt = conn.prepareStatement(sql1);
        psmt.setInt(1, Integer.parseInt(atext.getText()));
        ResultSet rs1 = psmt.executeQuery();
//        if(rs1.next()) {​​​​​​
//            
//        }​​​​​​
//        else {​​​​​​
//            JOptionPane.showMessageDialog(null,"Failed");
//        }​​​​​​
//        
    
    
    /*String pname = rs.getString();
    System.out.println(pname);
    //String useraadhaar = raadhaar.getText();
    
    System.out.println(page);
    //String usercontact = rcontact.getText();
    
    System.out.println(pdob);
    */
    
     if(rs.next() && rs1.next())
    {​​​​​​
    
         JOptionPane.showMessageDialog(null,"YOU'VE SUCCESSFULLY LOGGED IN!");
         System.out.println(rs1.getString("Name"));
            String pname = rs1.getString("Name");
            String pdob = rs1.getString("DOB");
            String page =  rs1.getString("Age");
            String pdate = rs1.getString("vaccinedate");
            String pvaccine = rs1.getString("vaccine");
            String ptime = rs1.getString("timeslot");
            String pgender = rs1.getString("Gender") ;
         FXMLLoader loader = new FXMLLoader(getClass().getResource("AfterLogin.fxml"));    
            root = loader.load();    
            
            AfterLoginProfile Profile = loader.getController();
            Profile.displayName2(u);
            Profile.displayName5(uaadhaar);
            Profile.displayName3(page);
            Profile.displayName4(upass);
            Profile.displayName1(pdob);
            Profile.displayName6(pdate);
            Profile.displayName7(pvaccine);
            Profile.displayName8(ptime);
            Profile.displayName9(pgender);
            stage = (Stage)((Node)event.getSource()).getScene().getWindow();
            scene = new Scene(root);
            stage.setScene(scene);
            stage.show();
}​​​​​​
    


    else
    {​​​​​​
    
        JOptionPane.showMessageDialog(null,"LOGIN FAILED!");


    }​​​​​​
     conn.close();
    }​​​​​​
    catch (ClassNotFoundException e)
    {​​​​​​
    e.printStackTrace();
    }​​​​​​
    catch (SQLException e)
    {​​​​​​
    e.printStackTrace();
    }​​​​​​
    catch (Exception e1)
    {​​​​​​
        JOptionPane.showMessageDialog(null,e1);
    }​​​​​​
    }​​​​​​
}​​​​​​


String a = null;

if(vmale.isSelected()) {
a = vmale.getText();;
}
else if(vfemale.isSelected()) {
a = vfemale.getText();
}
else if(vother.isSelected()) {
a = vother.getText();
}




