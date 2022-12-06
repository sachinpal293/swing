// SWING BASIC CALCULATOR APPLICATION
import javax.swing.*;
import java.awt.event.*;
import java.util.*;

// this class for Swing work methods
class Example2 extends JFrame {
   JLabel j1,j2,j3,j4;
   JTextField t1,t2;
   JButton b1;

    // default constructor
    // it is when called then user does not pass argument in object that is maked in main method
    public Example2() {
    }

    // parameterized constructor
    // it is when called when user pass argument in object that is maked in main method
    public Example2(String s) {
        super(s);
    }
    // this method is used to make gui setup and arrange all components here
    public void setComponents(){
        j1=new JLabel("Addition of two Numbers");
        j2=new JLabel("First Number");
        j3=new JLabel("Second Number"); // this is not showing in swing panel
        j4=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("Add");
        setLayout(null);
        j1.setBounds(50,50,200,20);
        j2.setBounds(50,80,100,20);
        t1.setBounds(150,80,100,20);
        j3.setBounds(50,130,100,20); // second number - pending problem is here
        t2.setBounds(150,130,100,20);
        b1.setBounds(80,180,100,20);
        j4.setBounds(50,240,200,20);
        b1.addActionListener(new Handler());
        add(j1);
        add(j2);
        add(t1);
        add(t2);
        add(b1);


    }
    // cant access example objects here like jbutton, jtextfeild etc.
 abstract class Handler implements ActionListener{
        public void actionperformed(ActionEvent e){
            int a=Integer.parseInt(t1.getText());
            int b=Integer.parseInt(t1.getText());
            int s=a+b;
            j3.setText("Result Set "+s);
        }
    }

}
//another class is created for object calling and method arguments passing
public class swing3 {

    public static void main(String[] args) {
        Example2 j = new Example2("Swing Example");
        //j.setLayout();
        j.setComponents();
        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300, 300);


    }
}
