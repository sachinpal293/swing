// SWING BASICS
import javax.swing.*;

// this class for Swing work methods
class Example extends JFrame {

    // default constructor
    // it is when called then user does not pass argument in object that is maked in main method
    public Example() {
    }

    // parameterized constructor
    // it is when called when user pass argument in object that is maked in main method
    public Example(String s) {
        super(s);
    }

}

//another class is created for object calling and method arguments passing
public class swing1 {
    public static void main(String[] args) {
        Example j = new Example("Swing Example");
        //j.setLayout();

        j.setVisible(true);
        j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        j.setSize(300, 300);


    }
}
