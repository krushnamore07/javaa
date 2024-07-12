import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextField;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
class MyFrame implements ActionListener
{
public static void main(String[] args)
   {
      JFrame myframe=new JFrame("Login Page");
      myframe.setVisible(true);
      myframe.setSize(500,200);
    //   myframe.setTitle("Login Frame");
    //   myframe.setBackground(Color.black);
      myframe.getContentPane().setBackground(Color.pink);
      myframe.setLocation(250, 250);
      myframe.setLayout(null);

    //user name label
      JLabel lbl_username=new JLabel("username");
      myframe.add(lbl_username);
      lbl_username.setBounds(40, 10, 80, 50);
      
      //username text box
      JTextField username=new JTextField();
      myframe.add(username);
      username.setBounds(100, 25, 70, 20);
      lbl_username.setFont(new Font("Arial", Font.PLAIN, 14)); // Set Arial font


     //password label
      JLabel lbl_password=new JLabel("Password");
      myframe.add(lbl_password);
      lbl_password.setBounds(40, 50, 70, 50);
      lbl_username.setFont(new Font("Arial", Font.PLAIN, 14)); // Set Arial font

     ///password text box
      JTextField pass=new JTextField();
      myframe.add(pass);
      pass.setBounds(100, 67, 80, 20);


      //login button
      JButton lbl_login=new JButton("Login");
      myframe.add(lbl_login);
      lbl_login.setBounds(40, 100, 80, 20);
      lbl_login.addActionListener(new myframe());


       //cancel button
      JButton lbl_cancel=new JButton("Cancel");
      myframe.add(lbl_cancel);
      lbl_cancel.setBounds(200, 100, 80, 20);

      myframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   }
   public void actionFormed(ActionEvent AE)
   {
    System.out.println("login button");
   }
}