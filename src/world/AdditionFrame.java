package world;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class AdditionFrame extends JFrame{
    private JPanel pannel;
    private JLabel l1;
    private JLabel l2;
    private JLabel l3;
    private JTextField t1;
    private JTextField t2;
    private JButton b1;

    public void initComponets(){
        pannel.setLayout(null);
        l1.setBounds(50,50,100,20);
        t1.setBounds(170,50,100,20);
        l2.setBounds(50,150,100,20);
        t2.setBounds(170,150,100,20);
        b1.setBounds(100,200,100,40);
        l3.setBounds(50,250,200,29);
        pannel.add(l1);
        pannel.add(t1);
        pannel.add(l2);
        pannel.add(t2);
        pannel.add(b1);
        pannel.add(l3);
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int a=Integer.parseInt(t1.getText());
                int b=Integer.parseInt(t2.getText());
                int c=a+b;
                l3.setText("Sum of a and b is"+c);
            }
        });

    }

    public  AdditionFrame(){



        initComponets();
        setContentPane(pannel);
        setSize(400,400);
        

        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }


}
