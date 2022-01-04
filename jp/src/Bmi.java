/*import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Bmi extends JFrame {
    static public void main(String[] args){
    JPanel b1=new JPanel();
    b1.setLayout(new GridLayout(2,2,1,1));
    b1.add(new JLabel("weight"));
    JTextField w=new JTextField(3);
    b1.add(w);
        b1.add(new JLabel("Height"));
        JTextField h=new JTextField(3);
        b1.add(h);
        JPanel b2 =new JPanel();
        b2.setLayout(new FlowLayout(FlowLayout.CENTER));
        JButton com=new JButton("comput bmi");
        b2.add(com);
        JPanel b3=new JPanel();
        b3.setLayout(new FlowLayout(FlowLayout.LEFT));
        com.addActionListener(new ActionListener() {
                                  @Override
                                  public void actionPerformed(ActionEvent e) {
                                     int bm=10;
                                b3.add(System.out.println(bm));
                                  }
                              }
        );

    Bmi f1=new Bmi();
    f1.add(b1);
    f1.add(b2);
    f1.add(b3);

    f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    f1.setVisible(true);
    f1.setLocationRelativeTo(null);
    f1.setSize(400,300);
}}*/
