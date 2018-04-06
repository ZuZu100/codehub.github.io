
        
package pharmacyproject;
//This is edited on github
import java.awt.HeadlessException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Date;
import javafx.application.Application;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Accordion;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.ScrollPane;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.TitledPane;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.stage.Stage;
import javax.swing.JOptionPane;


public class PharmacyProject extends Application {
      
     Scene scene2,scene3,scene4,scene5,scene6,scene7,scene8,scene9,scene10;
     TitledPane tp1,tp2,tp3,tp4,tp5;
     Image image1,image2,image3,image4,image5,image6;
     ImageView view1,view2,view3,view4,view5,view6;
     Button btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn71,btn8;Accordion ac;
     Button back1,back2,back3,back4,back5,back6,back7,back8,back9,back10;
     VBox m1,m2,m3,m4,m5,m6,M7;
            private Button B1,B2,B3,B4,B5,B6,B7,B8,B9,B0,bclr,bexit;
   private Button plus,equals,subtract,devide,multiply;
   private  TextField CALTXT,CALTXT2;
           private Label CALL1,CALL2;
           String store;
           double pre;
           double post,answer;
           String operations; 
     @Override
    public void start(Stage stage){
        back7= new Button("Back");back7.setFont(Font.font(20));
        back8= new Button("Back");back8.setFont(Font.font(20));
        back9= new Button("logout");
        back10= new Button("Back");back10.setFont(Font.font(20));
           TableView<DatabaseView> table1= new TableView();
          final ObservableList<DatabaseView> info1 = FXCollections.observableArrayList();
        
        back1= new Button("Back");back2= new Button("Back");back3= new Button("Back");
        back4= new Button("Back");back5= new Button("Back");back6= new Button("Back");
       image1= new Image("file:C:\\Users\\BRUCE\\Desktop\\cluster\\download.jpg");
       image2= new Image("file:C:\\Users\\BRUCE\\Desktop\\cluster\\download (3).jpg");
       image3= new Image("file:C:\\Users\\BRUCE\\Desktop\\cluster\\images.jpg");
       image4= new Image("file:C:\\Users\\BRUCE\\Desktop\\cluster\\download (1).jpg");
       image5= new Image("file:C:\\Users\\BRUCE\\Desktop\\cluster\\download (3).jpg");
        image6= new Image("file:C:\\Users\\BRUCE\\Desktop\\cluster\\images (2).jpg");
       view1= new ImageView(image1);view2= new ImageView(image2);
       view3= new ImageView(image3);view4= new ImageView(image4);
       view5= new ImageView(image5);view6=new ImageView(image6);
       btn1= new Button("Add New Record",view1);btn2= new Button("Delete A Record",view2);
       btn3= new Button("Update/Save",view3);btn4= new Button("Search  Record",view4);
       btn5= new Button("Delete Table",view5);btn6=new Button("View Database",view6);
       btn7= new Button("Load Data");btn7.setFont(Font.font(25));
       btn71= new Button("Load Data");btn71.setFont(Font.font(25));
       btn8= new Button("Load Data");btn8.setFont(Font.font(20));
       tp1= new TitledPane("\t\t\t\t\tAdd New Record",btn1);
        tp2= new TitledPane("\t\t\t\t\tDelete A Record",btn2);
        tp3= new TitledPane("\t\t\t\t\tUpdate/Save",btn3);
        tp4= new TitledPane("\t\t\t\t\tSearch  Record",btn4);
         tp5= new TitledPane("\t\t\t\t\tDelete Table",btn5);
         ac= new Accordion();ac.getPanes().addAll(tp1,tp2,tp3,tp4,tp5);
         Label administrativeuse= new Label("For Administrative Use Only");
         btn6.setFont(Font.font("Tahoma", 20));administrativeuse.setFont(Font.font("Tahoma", 20));
        
         HBox getall= new HBox();getall.getChildren().addAll(administrativeuse,btn6);getall.setSpacing(30);
           VBox v3= new VBox();v3.getChildren().addAll(ac,getall);
               v3.setSpacing(30); scene2= new Scene(v3,800,380);
        Label l1= new Label("Username");
            Label l2= new Label("Password");
            TextField T1= new TextField();
           PasswordField T2= new  PasswordField();
            T1.setPromptText("Username");
            T2.setPromptText("Password");
            Button login1= new Button("Login");
            login1.setFont(Font.font("Tahoma",20));
            login1.setDefaultButton(true);
            
            /*
            
            */
              CALL1= new Label("\t");CALL2= new Label("\t");
        CALTXT2= new TextField();CALTXT2.setPrefColumnCount(8);
        CALTXT= new TextField();CALTXT.setPrefColumnCount(8);CALTXT2.setEditable(false);
        VBox CALH1= new VBox();CALH1.getChildren().addAll(CALTXT,CALTXT2);
       B1= new Button("1"); B2= new Button("2"); B3= new Button("3"); B4= new Button("4");
        B5= new Button("5"); B6= new Button("6"); B7= new Button("7"); B8= new Button("8");
        B9= new Button("9"); B0= new Button("0");bclr=new Button("Clr");bexit= new Button(".");
        plus = new Button("+");equals= new Button("=");subtract= new Button("-");
        devide= new Button("/");multiply= new Button("*");
        GridPane calgo= new GridPane();calgo.setHgap(5);calgo.setVgap(5);
        calgo.addRow(0,CALL1, plus);calgo.addRow(1,devide,equals,multiply);
        calgo.addRow(2,CALL2,subtract);calgo.setAlignment(Pos.CENTER);
        GridPane calg1= new GridPane(); calg1.setHgap(10);calg1.setVgap(10);
        calg1.addRow(0, B9,B8,B7);calg1.addRow(1, B6,B5,B4);
        calg1.addRow(2, B3,B2,B1);calg1.addRow(3, bclr,B0,bexit);
        VBox CALV1 = new VBox();CALV1.getChildren().addAll(CALH1,calgo,calg1);
        CALV1.setSpacing(10);CALV1.setPadding(new Insets(8));
        B9.setOnAction(value->{ store=CALTXT.getText() +B9.getText();CALTXT.setText(store);});
        B8.setOnAction(value->{store=CALTXT.getText()+ B8.getText();CALTXT.setText(store);});
        B7.setOnAction(value->{store=CALTXT.getText()+B7.getText();CALTXT.setText(store);});
        B6.setOnAction(value->{ store=CALTXT.getText() +B6.getText();CALTXT.setText(store);});
        B5.setOnAction(value->{store=CALTXT.getText()+ B5.getText();CALTXT.setText(store);});
        B4.setOnAction(value->{store=CALTXT.getText()+B4.getText();CALTXT.setText(store);});
        B3.setOnAction(value->{ store=CALTXT.getText() +B3.getText();CALTXT.setText(store);});
        B2.setOnAction(value->{store=CALTXT.getText()+ B2.getText();CALTXT.setText(store);});
        B1.setOnAction(value->{store=CALTXT.getText()+B1.getText();CALTXT.setText(store);});
         B0.setOnAction(value->{store=CALTXT.getText()+B0.getText();CALTXT.setText(store);});
        bclr.setOnAction(value->{CALTXT.clear();CALTXT2.clear();});
        plus.setOnAction(value->{pre=Double.parseDouble(CALTXT.getText());
        CALTXT.clear();operations="+";CALTXT2.setText(""+pre); });
        devide.setOnAction(value->{pre=Double.parseDouble(CALTXT.getText());
        CALTXT.clear();operations="/";CALTXT2.setText(""+pre);});
       multiply.setOnAction(value->{pre=Double.parseDouble(CALTXT.getText());
        CALTXT.clear();operations="*";CALTXT2.setText(""+pre);});
        subtract.setOnAction(value->{pre=Double.parseDouble(CALTXT.getText());
        CALTXT.clear();operations="-";CALTXT2.setText(""+pre);});
        equals.setOnAction((ActionEvent value)->{
            post=Double.parseDouble(CALTXT.getText());
         if("+".equals(operations)){ answer=pre+post; CALTXT2.setText(""+answer);}
         if("/".equals(operations)){ answer=pre/post; CALTXT2.setText(""+answer);}
         if("-".equals(operations)){ answer=pre-post; CALTXT2.setText(""+answer);}
         if("*".equals(operations)){ answer=pre*post; CALTXT2.setText(""+answer);}
        });
        bexit.setOnAction(value->{store=CALTXT.getText()+bexit.getText();CALTXT.setText(store);});
            
            /*
            
      
            
            /*
            
            */
            Label adminusername1= new Label("Administrative Use Only");adminusername1.setUnderline(true);
            Label adminusername= new Label("Username");
            Label adminpassword= new Label("Password");
            TextField adminusernametxt= new TextField();
            PasswordField adminpasswordtxt= new PasswordField();
            adminusernametxt.setPromptText("Enter Username");
            adminpasswordtxt.setPromptText("Enter Password");
            Button adminlogin= new Button("Login");adminlogin.setFont(Font.font(15));
            GridPane adminstuff= new GridPane();
            adminstuff.addRow(0, adminusername1);
            adminstuff.addRow(1, adminusername,adminusernametxt);
            adminstuff.addRow(2, adminpassword,adminpasswordtxt,adminlogin);
            adminstuff.setAlignment(Pos.CENTER);adminstuff.setHgap(10);adminstuff.setVgap(20);
            VBox adminlayout= new VBox();adminlayout.getChildren().add(adminstuff);adminlayout.setPadding(new Insets(20));
            /*
            
            */
             Label sadminusername1= new Label("Sells Point Use Only");sadminusername1.setUnderline(true);
            Label sadminusername= new Label("Username");
            Label sadminpassword= new Label("Password");
            TextField sadminusernametxt= new TextField();
            PasswordField sadminpasswordtxt= new PasswordField();
            sadminusernametxt.setPromptText("Enter Username");
            sadminpasswordtxt.setPromptText("Enter Password");
            Button sadminlogin= new Button("Login");sadminlogin.setFont(Font.font(15));
            GridPane sadminstuff= new GridPane();
            sadminstuff.addRow(0, sadminusername1);
            sadminstuff.addRow(1, sadminusername,sadminusernametxt);
            sadminstuff.addRow(2, sadminpassword,sadminpasswordtxt,sadminlogin);
            sadminstuff.setAlignment(Pos.CENTER);sadminstuff.setHgap(10);sadminstuff.setVgap(20);
            VBox sadminlayout= new VBox();sadminlayout.getChildren().add(sadminstuff);
            sadminlayout.setPadding(new Insets(20));
            /*
            
            */
               
        Date sellsdate= new Date();
        sellsdate.toLocaleString();
        Button lookupprice= new Button("Get Product Price");
        Button sellssave= new Button("Save Sells Record");
        Button sellbalance= new Button("Calculate Balance");
        Label soldtitle= new Label("Ewave  Sells  Point");
        Label getproductprice= new Label("");
        soldtitle.setFont(Font.font(20));soldtitle.setAlignment(Pos.CENTER);
        Label pcode1= new Label("Product Code");
        Label pquantity1= new Label("product Qantity");
        Label pamount= new Label("Amount Paid");
        Label pbalance= new Label("Balance/Change");
        Label ptime= new Label("Current Date & Time");
        Label pteller= new Label("Tellers Name");
        TextField pcode1txt= new TextField();
        TextField pquantitytxt= new TextField();
        TextField pamounttxt= new TextField();
        TextField pbalancetxt= new TextField();pbalancetxt.setText("0.00");
        TextField ptimetxt= new TextField();ptimetxt.setText(""+sellsdate);
        TextField ptellertxt= new TextField();
        ptellertxt.setEditable(false);
        ptimetxt.setEditable(false);
        pbalancetxt.setEditable(false);
        HBox soldh= new HBox();soldh.getChildren().add(soldtitle);
        GridPane soldlayout= new GridPane();
        soldlayout.addRow(0, pcode1,pcode1txt,lookupprice);
        soldlayout.addRow(1, pquantity1,pquantitytxt,getproductprice);
        soldlayout.addRow(2, pamount,pamounttxt);
        soldlayout.addRow(3, pbalance,pbalancetxt,sellbalance);
        soldlayout.addRow(4,ptime,ptimetxt);
        soldlayout.addRow(5, pteller,ptellertxt,sellssave);
        soldlayout.setHgap(20);soldlayout.setVgap(20);
            /*
        
        */
           
            VBox vv1= new VBox();vv1.getChildren().addAll(soldh,soldlayout,back9);vv1.setSpacing(20);
            VBox vv2= new VBox();vv2.getChildren().add(CALV1 );
            HBox sellslayout= new HBox();sellslayout.getChildren().addAll(vv1,vv2);
            Scene sellsscene= new Scene(sellslayout,690,400);sellslayout.setSpacing(50);
            sellsscene.getStylesheets().add("wow.css");sellslayout.setPadding(new Insets(30));
            
             /*
            
            */
            lookupprice.setOnAction(value->{
            pcode1txt.getText();
            String request1=""+pcode1txt.getText();
              try
         { Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q6="select * from productrecords where pcode like ('"+request1+"%')";
              PreparedStatement ps6=con.prepareStatement(q6);
              ResultSet rs5=ps6.executeQuery();
              while(rs5.next())
              {
               
                  rs5.getString("pname");
                   rs5.getInt("pduantity");
                   rs5.getDouble("pprice");
                   rs5.getString("pcode");
                   rs5.getInt("pbadgenumber");
                   rs5.getString("pexpiringdate");
                   rs5.getDouble("pstockprice");
                   rs5.getDouble("pretailprice");  
                   rs5.getString("pdatepurchased");
                   rs5.getString("pstockcompany");
             if( rs5.getString("pcode") == null ? pcode1txt.getText() == null : rs5.getString("pcode").equals(pcode1txt.getText()))
              { 
               info1.addAll(new DatabaseView(
               
                   rs5.getString("pname"),
                   rs5.getInt("pduantity"),
                   rs5.getDouble("pprice"),
                   rs5.getString("pcode"),
                   rs5.getInt("pbadgenumber"),
                   rs5.getString("pexpiringdate"),
                   rs5.getDouble("pstockprice"),
                   rs5.getDouble("pretailprice"),  
                   rs5.getString("pdatepurchased"),
                   rs5.getString("pstockcompany")
               
                             
               ));
              getproductprice.setText(""+ rs5.getDouble("pprice"));
              
             table1.setItems(info1);
             }
              }
         
         }catch
                 (ClassNotFoundException | SQLException  | HeadlessException ex)
         {
         }
         
         
             
            
            });
            /*
            
            */
            sellbalance.setOnAction(value->{
            double amounttopay;
            double getquantity=Double.parseDouble(pquantitytxt.getText());
              double getprice=Double.parseDouble(getproductprice.getText());
              amounttopay=getquantity*getprice;
            double amountpaid=Double.parseDouble(pamounttxt.getText());
            double Balance=amountpaid-amounttopay;
            pbalancetxt.setText(""+Balance);
            if(Balance<0){
            JOptionPane.showMessageDialog(null, "Please Check input");
             pbalancetxt.clear();
             
            }
            else
            {
            
            sellssave.setVisible(true);
            }
            });
            
            /*
            
            */
            sellssave.setOnAction(value->{
                
              try
              {
                Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q7= 
                      "insert into soldrecords"
                      + "(productcode,productquantity,amount,balance,timesold,teller)"
                      + "values(?,?,?,?,?,?)";
              PreparedStatement ps7= con.prepareStatement(q7);
              ps7.setString(1, pcode1txt.getText());
              ps7.setString(2, pquantitytxt.getText());
              ps7.setString(3, pamounttxt.getText());
              ps7.setString(4, pbalancetxt.getText());
              ps7.setString(5, ptimetxt.getText());
              ps7.setString(6, ptellertxt.getText());
             ps7.executeUpdate();
              JOptionPane.showMessageDialog(null, "Record Saved Successfully");
             pcode1txt.clear();
             pquantitytxt.clear();
             pamounttxt.clear();
             pbalancetxt.clear();
            
             getproductprice.setText("");
              }catch
                      (ClassNotFoundException | SQLException  | HeadlessException ex){
              
              
              }
              
            
            
            
            
            }); 
            /*
            
            */
          HBox main= new HBox();main.setSpacing(10);main.getChildren().addAll(sadminlayout,adminlayout);
           Scene adminscene= new Scene(main,820,150);
            adminscene.getStylesheets().add("wow.css");
             adminlogin.setOnAction(value->{
            
          if("Admin".equals(adminusernametxt.getText()) && "Admin1".equals(adminpasswordtxt.getText()))
          {
          scene2.getStylesheets().add("wow.css");
          stage.setScene(scene2);
          }
          else
              JOptionPane.showMessageDialog(null, "invalid entry..try again");
            adminusernametxt.clear();adminpasswordtxt.clear();
          });
              /*
          
          */
          
        TableView <solddatabaseview> Table= new TableView();
        final ObservableList<solddatabaseview> info2= FXCollections.observableArrayList();
        TableColumn tac1= new TableColumn("Username");
        TableColumn tac2= new TableColumn("Password");
        tac1.setMinWidth(20);tac2.setMinWidth(20);
        tac1.setCellValueFactory(new PropertyValueFactory<>("sname"));
        tac2.setCellValueFactory(new PropertyValueFactory<>("spassword"));  
        Table.getColumns().addAll(tac1,tac2);
        Table.setEditable(true);
        Button viewsellsrecords= new Button("View Tellers  Registration Information");
        viewsellsrecords.setFont(Font.font(20));
        ScrollPane sp2= new ScrollPane();
        sp2.setContent(Table);
        VBox vsmain= new VBox();
        Button back= new Button("Back");back.setFont(Font.font(20));
        vsmain.getChildren().addAll(sp2,viewsellsrecords,back);
        Scene vsmain1= new Scene(vsmain,400,400);
        viewsellsrecords.setOnAction(value->{stage.setScene(vsmain1);});
        
          /*
          
          */
             sadminlogin.setOnAction(value->{
                 
             String request3=""+sadminusernametxt;
               try{
             Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
            String q2= "select * from login";
            PreparedStatement ps1=con.prepareStatement(q2);
            ResultSet rs= ps1.executeQuery();
            while(rs.next()){
                
                 rs.getString("username");
            rs.getString("password");
           
                
         
             if((rs.getString("username") == null ? sadminusernametxt.getText() == null : rs.getString("username").equals(sadminusernametxt.getText()))
            && (rs.getString("password") == null ? sadminpasswordtxt.getText() == null : rs.getString("password").equals(sadminpasswordtxt.getText())))
             {
              JOptionPane.showMessageDialog(null, "Login Successful");
            stage.setScene(sellsscene);
            ptellertxt.setText(""+rs.getString("username") );
            sellssave.setVisible(false);
            sadminusernametxt.clear();
            sadminpasswordtxt.clear(); 
            return;
            }
            
            else
            
            JOptionPane.showMessageDialog(null, "Invalid Username or Password");
            return;
           }
            
             ps1.close();
             rs.close();
               }
            catch(ClassNotFoundException | SQLException | HeadlessException ex){
            ex.printStackTrace();
            }
             });
              
          
            /*
            
            */
            Button login2= new Button("Save Record");
            Label pname= new Label("Product name"); Label pquantity= new Label("product Quantity");
            Label pprice= new Label("product price");
             Label pcode= new Label("product Code"); Label pbadgenumber= new Label("product Badge Number");
             Label pentrydate= new Label("Record Entry Date");
              Label pstockprice= new Label("Product Stock Price"); Label pretailprice= new Label("Product Retail Price"); 
              Label purchaseddate= new Label(" Product Purchased Date");Label pstockcompany= new Label(" Product Stock Company");
              TextField txt1= new TextField();txt1.setPromptText("Product name");
              TextField txt2= new TextField();txt2.setPromptText("product Quantity");
              TextField txt3= new TextField();txt3.setPromptText("Product Price");
              TextField txt4= new TextField();txt4.setPromptText("product Code");
              TextField txt5= new TextField();txt5.setPromptText("Product Badge Number");
              TextField txt6= new TextField();txt6.setPromptText("product Record Entry Date");
              TextField txt7= new TextField();txt7.setPromptText("Product Stock Price");
              TextField txt8= new TextField();txt8.setPromptText("product Retail Price");
              TextField txt9= new TextField();txt9.setPromptText("Product Purchased Date");
              TextField txt10= new TextField();txt10.setPromptText("product Stock Company");
              Label rd= new Label("  Product  Record  Entry  Unit");rd.setFont(Font.font("Tahoma",20));
              rd.setUnderline(true);txt6.setEditable(false);
                Date date= new Date();
              String getdate= ""+date.toGMTString();
             txt6.setText(getdate);txt9.setText(getdate);
              txt6.setText(txt6.getText(0, 11));txt9.setText(txt9.getText(0, 11));
              HBox recorddetails= new HBox();recorddetails.getChildren().addAll(back1,rd,login2);
              recorddetails.setSpacing(120);
              GridPane dlayout= new GridPane();dlayout.setHgap(25);dlayout.setVgap(45);
              dlayout.addRow(0, pname,txt1,pquantity,txt2);dlayout.addRow(1,pprice,txt3, pcode,txt4 );
              dlayout.addRow(2,pbadgenumber,txt5,pentrydate,txt6 );dlayout.addRow(3,pstockprice,txt7,pretailprice,txt8);
              dlayout.addRow(4, purchaseddate,txt9,pstockcompany,txt10 );
              login2.setOnAction(value->{
              
              try
              {
                Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q3= 
                      "insert into productrecords"
                      + "(pname,pduantity,pprice,pcode,pbadgenumber,pexpiringdate,pstockprice,pretailprice,pdatepurchased,pstockcompany)"
                      + "values(?,?,?,?,?,?,?,?,?,?)";
              PreparedStatement ps3= con.prepareStatement(q3);
              ps3.setString(1, txt1.getText());
              ps3.setString(2, txt2.getText());
              ps3.setString(3, txt3.getText());
              ps3.setString(4, txt4.getText());
              ps3.setString(5, txt5.getText());
              ps3.setString(6, txt6.getText());
              ps3.setString(7, txt7.getText());
              ps3.setString(8, txt8.getText());
              ps3.setString(9, txt9.getText());
              ps3.setString(10, txt10.getText());
              ps3.executeUpdate();
              JOptionPane.showMessageDialog(null, "Record Saved Successfully");
              txt1.clear();txt2.clear();
              txt3.clear();txt4.clear();
              txt5.clear();txt7.clear();
              txt8.clear();txt10.clear();
              
              }catch
                      (ClassNotFoundException | SQLException  | HeadlessException ex){
              
              ex.printStackTrace();
              }
              
              
              
              });
              
            /*
            
            */
             
            m1= new VBox();m2= new VBox();m1.getChildren().addAll(recorddetails,dlayout);
            m1.setSpacing(30);m1.setPadding(new Insets(30));
            m2= new VBox();
            m3= new VBox();m4= new VBox();
            m5= new VBox();m6= new VBox();
          
            
           
            scene3= new Scene(m1,700,500);scene4= new Scene(m2,700,500);
            scene5= new Scene(m3,700,500);scene6= new Scene(m4,700,500);
      
            
           
            GridPane g11= new GridPane();
            g11.addRow(0, l1,T1);
            g11.addRow(1, l2,T2);
           g11.addRow(2, login1);g11.setHgap(20);g11.setVgap(20);
       VBox v11= new VBox();v11.getChildren().add(g11);
       v11.setAlignment(Pos.CENTER);v11.setPadding(new Insets(20));
       Scene scene1= new Scene(v11,290,200);
       scene1.getStylesheets().add("wow.css");
        /*
        
        */
         Label have= new Label("Already having an Account? login");
           Button  login= new Button("Login");login.setFont(Font.font("Tahoma",20));
           login.setOnAction(value->{stage.setScene(adminscene);});
       Label heading = new Label(" EWAVE \tPHARMACEUTICALS");
       heading.setFont(Font.font("Tahoma",20));
       HBox hhead= new HBox();hhead.getChildren().addAll(have,login);
       hhead.setAlignment(Pos.TOP_RIGHT);hhead.setSpacing(20);
        HBox h1= new HBox();h1.getChildren().add(heading);
        heading.setUnderline(true);
         Label Username= new Label("Username");
         Label password= new Label("Password");
         Label password1= new Label("Re-Enter Password");
         TextField t1= new TextField();
         TextField t2= new TextField();
         TextField t3= new TextField();
         t1.setPromptText("Enter Username");
         t2.setPromptText("Enter Password");
         t3.setPromptText("Re-Enter Password");
         Button b1= new Button("Create Account");b1.setFont(Font.font("tahoma",20));
         b1.setOnAction((ActionEvent values)->{
               if(t2.getText() == null ? t3.getText() == null : t2.getText().equals(t3.getText())){
                 
                   try{
               
              Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q1= "insert into login (username,password,password1)values(?,?,?)";
              PreparedStatement ps1= con.prepareStatement(q1);
              
              ps1.setString(1, t1.getText());
              ps1.setString(2, t2.getText());
              ps1.setString(3, t3.getText());
              ps1.executeUpdate();
              
              JOptionPane.showMessageDialog(null,"Account Created Successfuly");
              t1.clear();t2.clear();t3.clear();
             }
             
             catch(ClassNotFoundException| SQLException | HeadlessException ex)
             {
                 ex.printStackTrace();
             }
        
                 }
             else
                   JOptionPane.showMessageDialog(null, "Password do not match..Re-enter");
         
         });
         
         Label register= new Label("Have an Account?  Register");
         GridPane g1= new GridPane();
         g1.addRow(0,Username,t1);
         g1.addRow(1,password,t2);
        g1.addRow(2,password1,t3);
         g1.addRow(3,register,b1);
         g1.setHgap(20);g1.setVgap(20);
         VBox v1= new VBox();
         v1.getChildren().addAll(hhead,h1,g1);
         v1.setSpacing(20);v1.setAlignment(Pos.CENTER);
         Scene scene= new Scene(v1,400,300);
         v1.setPadding(new Insets(20));scene.getStylesheets().add("wow.css");
         /*
         
         */
          TableView<DatabaseView> table= new TableView();
          final ObservableList<DatabaseView> info = FXCollections.observableArrayList();
          TableColumn tc1= new TableColumn(" Product Name");tc1.setMinWidth(150);
          tc1.setCellValueFactory(new PropertyValueFactory<>("name"));
          TableColumn tc2= new TableColumn("Product Quantity");tc2.setMinWidth(150);
          tc2.setCellValueFactory(new PropertyValueFactory<>("quantity"));
          TableColumn tc3= new TableColumn("Product Price");tc3.setMinWidth(150);
          tc3.setCellValueFactory(new PropertyValueFactory<>("price"));
          TableColumn tc4= new TableColumn("Product Code");tc4.setMinWidth(200);
          tc4.setCellValueFactory(new PropertyValueFactory<>("code"));
          TableColumn tc5= new TableColumn("Product Badge  Number");tc5.setMinWidth(200);
          tc5.setCellValueFactory(new PropertyValueFactory<>("badgenumber"));
          TableColumn tc6= new TableColumn("Product Entry Date");tc6.setMinWidth(200);
          tc6.setCellValueFactory(new PropertyValueFactory<>("exdate"));
          TableColumn tc7= new TableColumn(" Product Stoc Price");tc7.setMinWidth(200);
          tc7.setCellValueFactory(new PropertyValueFactory<>("stockprice"));
          TableColumn tc8= new TableColumn(" product Retail Price");tc8.setMinWidth(200);
          tc8.setCellValueFactory(new PropertyValueFactory<>("retailprice"));
          TableColumn tc9= new TableColumn("Product Purchased Date");tc9.setMinWidth(200);
          tc9.setCellValueFactory(new PropertyValueFactory<>("datepurchased"));
          TableColumn tc10= new TableColumn(" Product Stock Company");tc10.setMinWidth(200);
          tc10.setCellValueFactory(new PropertyValueFactory<>("stockcompany"));
          back8.setOnAction(value->{stage.setScene(scene2);});
          table.getColumns().addAll(tc1,tc2,tc3,tc4,tc5,tc6,tc7,tc8,tc9,tc10);
          table.setEditable(true);
          ScrollPane sp= new ScrollPane();
          sp.setContent(table);sp.setPannable(true);
          m6.getChildren().addAll(sp,btn7,back8,viewsellsrecords);m6.setSpacing(25);
     scene8= new Scene(m6,1000,500);
         btn6.setOnAction(value->{stage.setScene(scene8);});
         back.setOnAction(value->{stage.setScene(scene8);});
         btn7.setOnAction(value->{
         
         try
         { Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q4="select * from productrecords";
              PreparedStatement ps4=con.prepareStatement(q4);
              ResultSet rs2=ps4.executeQuery();
              while(rs2.next())
              {
              
               info.addAll(new DatabaseView(
               
                   rs2.getString("pname"),
                   rs2.getInt("pduantity"),
                   rs2.getDouble("pprice"),
                   rs2.getString("pcode"),
                   rs2.getInt("pbadgenumber"),
                   rs2.getString("pexpiringdate"),
                   rs2.getDouble("pstockprice"),
                   rs2.getDouble("pretailprice"),  
                   rs2.getString("pdatepurchased"),
                   rs2.getString("pstockcompany")
               
               
               
               ));
             table.setItems(info);
              }
         
         }catch
                 (ClassNotFoundException | SQLException  | HeadlessException ex)
         {
             ex.printStackTrace();
         }
         
         
         
         } );
         /*
         
         */
          btn71.setOnAction(value->{
         
         try
         { Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q4="select * from productrecords";
              PreparedStatement ps4=con.prepareStatement(q4);
              ResultSet rs2=ps4.executeQuery();
              while(rs2.next())
              {
              
               info.addAll(new DatabaseView(
               
                   rs2.getString("pname"),
                   rs2.getInt("pduantity"),
                   rs2.getDouble("pprice"),
                   rs2.getString("pcode"),
                   rs2.getInt("pbadgenumber"),
                   rs2.getString("pexpiringdate"),
                   rs2.getDouble("pstockprice"),
                   rs2.getDouble("pretailprice"),  
                   rs2.getString("pdatepurchased"),
                   rs2.getString("pstockcompany")
               
               
               
               ));
             table.setItems(info);
              }
         
         }catch
                 (ClassNotFoundException | SQLException  | HeadlessException ex)
         {
             ex.printStackTrace();
         }
         
         
         
         } );
         /*
         
         */
         Label deletelabel= new Label("Delete a record: Use Product Code");
         Label delnote= new Label("Delete can not be Undo");
        TextField deleteproduct= new TextField();
        Button del= new Button("Delete Record");
        HBox dele= new HBox();dele.setSpacing(15);dele.setAlignment(Pos.CENTER);
        dele.getChildren().addAll(deletelabel,deleteproduct,del,delnote);
        ScrollPane sp3= new ScrollPane();sp3.setContent(table);
        m2.getChildren().addAll(back2,dele,sp3,btn71);m2.setSpacing(30);
        m2.setPadding( new Insets(20));
        del.setOnAction(value->{
            String request5=""+deleteproduct.getText();
        try{
            
            Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q5="delete from productrecords where pcode like '"+request5+"'";
              PreparedStatement ps5=con.prepareStatement(q5);
              ps5.executeUpdate();
              JOptionPane.showMessageDialog(null, "Deletion Complete");
              deleteproduct.clear();
        }catch(ClassNotFoundException | SQLException | HeadlessException ex){
        ex.printStackTrace();
        
        }
        
        });
       /*
        
        */
         TextField deletetable= new TextField();
         Button deltable= new Button("Delete Whole Record");
         Label dellabel= new Label("Delete Using Record Table Name");
         HBox delinfo= new HBox();
         delinfo.getChildren().addAll(back5,dellabel,deletetable,deltable);
              delinfo.setSpacing(40);
          m5.getChildren().add(delinfo);
           scene7= new Scene(m5,700,50);m5.setPadding(new Insets(20));
         deltable.setOnAction(value->{ 
             String delqueary=deletetable.getText();
         try{
         Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String qqq="drop table"+delqueary+"";
              PreparedStatement spdel= con.prepareStatement(qqq);
              spdel.executeUpdate();
              JOptionPane.showMessageDialog(null, "Deletion Complete");
         }
         catch(ClassNotFoundException | SQLException | HeadlessException ex)
         {
             ex.printStackTrace();
         
         }
         stage.setScene(scene7);
         
         });
        /*
        
        */
        btn8.setOnAction(value->{
         
         try
         { Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q4="select * from productrecords";
              PreparedStatement ps4=con.prepareStatement(q4);
              ResultSet rs2=ps4.executeQuery();
              while(rs2.next())
              {
              
               info.addAll(new DatabaseView(
               
                   rs2.getString("pname"),
                   rs2.getInt("pduantity"),
                   rs2.getDouble("pprice"),
                   rs2.getString("pcode"),
                   rs2.getInt("pbadgenumber"),
                   rs2.getString("pexpiringdate"),
                   rs2.getDouble("pstockprice"),
                   rs2.getDouble("pretailprice"),  
                   rs2.getString("pdatepurchased"),
                   rs2.getString("pstockcompany")
               
               
               
               ));
             table.setItems(info);
              }
         
         }catch
                 (ClassNotFoundException | SQLException  | HeadlessException ex)
         {
             ex.printStackTrace();
         }
         
         
         
         } );
        /*
        
        */
        
        ScrollPane sp4= new ScrollPane();sp4.setContent(table);
      m3.getChildren().addAll(back3,sp4,btn8);
          /*
         
         */
         back7.setOnAction(value->{stage.setScene(scene2);});
         Label searchwith= new Label("Search With Product Code");
         TextField search = new TextField();search.setPromptText("search for product");
         String request=""+search.getText();Button Search= new Button("Search");Search.setFont(Font.font(15));
         HBox collect= new HBox();collect.getChildren().addAll(back7,searchwith,search,Search);
         collect.setSpacing(50);
         
         
          TableColumn Tc1= new TableColumn(" Product Name");Tc1.setMinWidth(150);
          Tc1.setCellValueFactory(new PropertyValueFactory<>("name"));
          TableColumn Tc2= new TableColumn("Product Quantity");Tc2.setMinWidth(150);
          Tc2.setCellValueFactory(new PropertyValueFactory<>("quantity"));
          TableColumn Tc3= new TableColumn("Product Price");Tc3.setMinWidth(150);
          Tc3.setCellValueFactory(new PropertyValueFactory<>("price"));
          TableColumn Tc4= new TableColumn("Product Code");Tc4.setMinWidth(200);
          Tc4.setCellValueFactory(new PropertyValueFactory<>("code"));
          TableColumn Tc5= new TableColumn("Product Badge  Number");Tc5.setMinWidth(200);
          Tc5.setCellValueFactory(new PropertyValueFactory<>("badgenumber"));
          TableColumn Tc6= new TableColumn("Product Entry Date");Tc6.setMinWidth(200);
          Tc6.setCellValueFactory(new PropertyValueFactory<>("exdate"));
          TableColumn Tc7= new TableColumn(" Product Stoc Price");Tc7.setMinWidth(200);
          Tc7.setCellValueFactory(new PropertyValueFactory<>("stockprice"));
          TableColumn Tc8= new TableColumn(" product Retail Price");Tc8.setMinWidth(200);
          Tc8.setCellValueFactory(new PropertyValueFactory<>("retailprice"));
          TableColumn Tc9= new TableColumn("Product Purchased Date");Tc9.setMinWidth(200);
          Tc9.setCellValueFactory(new PropertyValueFactory<>("datepurchased"));
          TableColumn Tc10= new TableColumn(" Product Stock Company");Tc10.setMinWidth(200);
          Tc10.setCellValueFactory(new PropertyValueFactory<>("stockcompany"));
          
          table1.getColumns().addAll(Tc1,Tc2,Tc3,Tc4,Tc5,Tc6,Tc7,Tc8,Tc9,Tc10);
          table1.setEditable(true);
          ScrollPane sp1= new ScrollPane();
          sp1.setContent(table1);sp1.setPannable(true);
          M7= new VBox();M7.setSpacing(30);
          M7.getChildren().addAll(collect,sp1);M7.setSpacing(25);
         scene6= new Scene(M7,1000,500);M7.setPadding(Insets.EMPTY);
         btn4.setOnAction(value->{stage.setScene(scene6);scene6.getStylesheets().add("wow.css");});
         Search.setOnAction(value->{
             
              try
         { Class.forName("oracle.jdbc.driver.OracleDriver");
              Connection con=DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","system","bruce");
              String q5="select * from productrecords where pcode like '%"+request+"%'";
              PreparedStatement ps5=con.prepareStatement(q5);
              ResultSet rs3=ps5.executeQuery();
              while(rs3.next())
              {
               
                  rs3.getString("pname");
                   rs3.getInt("pduantity");
                   rs3.getDouble("pprice");
                   rs3.getString("pcode");
                   rs3.getInt("pbadgenumber");
                   rs3.getString("pexpiringdate");
                   rs3.getDouble("pstockprice");
                   rs3.getDouble("pretailprice");  
                   rs3.getString("pdatepurchased");
                   rs3.getString("pstockcompany");
             if( rs3.getString("pcode") == null ? search.getText() == null : rs3.getString("pcode").equals(search.getText()))
              {
               info1.addAll(new DatabaseView(
               
                   rs3.getString("pname"),
                   rs3.getInt("pduantity"),
                   rs3.getDouble("pprice"),
                   rs3.getString("pcode"),
                   rs3.getInt("pbadgenumber"),
                   rs3.getString("pexpiringdate"),
                   rs3.getDouble("pstockprice"),
                   rs3.getDouble("pretailprice"),  
                   rs3.getString("pdatepurchased"),
                   rs3.getString("pstockcompany")
               
               
               
               ));
             table1.setItems(info1);
             }
              }
         
         }catch
                 (ClassNotFoundException | SQLException  | HeadlessException ex)
         {
             ex.printStackTrace();
         }
         
         
             
             
             
         
         
         });
         /*
         
         */
         
       
          back9.setOnAction(value->{stage.setScene(adminscene);});
         back1.setOnAction(value->{stage.setScene(scene2);});
         back2.setOnAction(value->{stage.setScene(scene2);});
         back3.setOnAction(value->{stage.setScene(scene2);});
         back4.setOnAction(value->{stage.setScene(scene2);});
         back5.setOnAction(value->{stage.setScene(scene2);});
         
         btn1.setOnAction(value->{stage.setScene(scene3);scene3.getStylesheets().add("wow.css");});
         btn2.setOnAction(value->{stage.setScene(scene4);scene4.getStylesheets().add("wow.css");});
         btn3.setOnAction(value->{stage.setScene(scene5);scene5.getStylesheets().add("wow.css");});
         btn4.setOnAction(value->{stage.setScene(scene6);scene6.getStylesheets().add("wow.css");});
         btn5.setOnAction(value->{stage.setScene(scene7);scene7.getStylesheets().add("wow.css");});
         
          stage.setScene(scene);
           h1.setAlignment(Pos.CENTER);
       stage.show();stage.setResizable(false);
      /*
        
        */
         
      
        
        /*
        
        */
        
        
        /*
        
        */
    }
    
    public static void main(String[] args) {
       Application.launch(args);
    }
    public class DatabaseView {
      private final SimpleStringProperty name;
         private final SimpleIntegerProperty quantity;
        private  final SimpleDoubleProperty price;
        private  final SimpleStringProperty code;
        private final SimpleIntegerProperty badgenumber;
        private  final SimpleStringProperty exdate;
        private final SimpleDoubleProperty stockprice;
        private final SimpleDoubleProperty retailprice;
        private final SimpleStringProperty datepurchased;
        private final SimpleStringProperty stockcompany;
        
        
        public DatabaseView(String name1,int quantity1,double price1,String code1,int badgenumber1,
                String exdate1,double stockprice1,double retailprice1,String datepurchased1, String stockcompany1){
            this.name= new SimpleStringProperty(name1);
            this.quantity= new SimpleIntegerProperty(quantity1);
            this.price=new SimpleDoubleProperty(price1);
            this.code= new SimpleStringProperty(code1);
            this.badgenumber=new SimpleIntegerProperty(badgenumber1);
            this.exdate= new SimpleStringProperty(exdate1);
            this.stockprice=new SimpleDoubleProperty(stockprice1);
            this.retailprice=new SimpleDoubleProperty(retailprice1);
            this.datepurchased=new SimpleStringProperty(datepurchased1);
            this.stockcompany=new SimpleStringProperty(stockcompany1);
         }

        public String getName() {
            return name.get();
        }

        public void setName(String name1) {
            this.name.set(name1);
        }

        public int getQuantity() {
            return quantity.get();
        }

        public void setQuantity(int quantity1) {
            this.quantity.set(quantity1);
        }

        public Double getPrice() {
            return price.get();
        }

        public void setPrice(double price1) {
            this.price.set(price1);
        }

        public String getCode() {
            return code.get();
        }

        public void setCode(String code1) {
            this.code.set(code1);
        }

        public int getBadgenumber() {
            return badgenumber.get();
        }

        public void setBadgenumber(int badgenumber1) {
            this.badgenumber.set(badgenumber1);
        }

        public String getExdate() {
            return exdate.get();
        }

        public void setExdate(String exdate1) {
            this.exdate.set(exdate1);
        }

        public double getStockprice() {
            return stockprice.get();
        }

        public void setStockprice(double stockprice1) {
            this.stockprice.set(stockprice1);
        }

        public double getRetailprice() {
            return retailprice.get();
        }

        public void setRetailprice(double retailprice1) {
            this.retailprice.set(retailprice1);
        }

        public String getDatepurchased() {
            return datepurchased.get();
        }

        public void setDatepurchased(String datepurchased1) {
            this.datepurchased.set(datepurchased1);
        }

        public String getStockcompany() {
            return stockcompany.get();
        }

        public void setStockcompany(String stockcompany1) {
            this.stockcompany.set(stockcompany1);
        }
       

}
  
    public class solddatabaseview{
    
        private SimpleStringProperty sname;
        private SimpleStringProperty spassword;
        
        public solddatabaseview(String Name, String Password){
        this.sname=new SimpleStringProperty(Name);
        this.spassword= new SimpleStringProperty(Password);
        
       
        }
         public  String getSname(){
        return sname.get();
       }
         public  void setSname(String Name ){
       this.sname.setValue(Name);
        }
    
       public  String getSpassword(){
        return spassword.get();
       }
         public  void setSPassword(String Password ){
       this.spassword.setValue(Password);
        }
    
    
    }
}
