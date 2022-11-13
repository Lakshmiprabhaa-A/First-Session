import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class FirstSession implements ActionListener {
    JFrame frame;
    JTextArea area;
    JButton button;
    FirstSession(){
        //FRAME CREATION
        frame = new JFrame("First Session");
        frame.setBounds(250,250,300,300);
        frame.setBackground(Color.black);
        frame.getContentPane().setBackground(Color.black);
        //BUTTON CREATION
        button=new JButton("CLICK");
        button.setBounds(120,20,100,20);
        button.addActionListener(this);
        //TEXTAREA CREATION
        area=new JTextArea("WELCOME TO MY TEXTAREA");
        area.setBounds(50,50,300,300);
        area.setBackground(Color.red);
        //ADDING TO THE FRAME
        frame.add(button);
        frame.add(area);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
    }
    public static void main(String args[]){
        FirstSession object=new FirstSession();
    }
//FOR THE BUTTON
    @Override
    public void actionPerformed(ActionEvent e) {
        area.setText("YOU CLICKED THE BUTTON");
    }
}
