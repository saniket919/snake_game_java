import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.Math;
import java.util.Random;
public class Sn2 implements ActionListener {
    
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[100];
    JButton[] functionButtons = new JButton[3];
    JButton roll,numb,res;
    JPanel panel;
    int a=3;

    Font myFont = new Font("Tw Cen MT",Font.BOLD,30);

    Sn2(){
        frame = new JFrame("SN2");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setBackground(Color.black);

        roll=new JButton("Roll");
        numb=new JButton(" ");
        res=new JButton("");

        functionButtons[0] = roll;
         functionButtons[1] = numb;
         functionButtons[2] = res;
         for(int i =0;i<3;i++) {

            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(true);
            functionButtons[i].setBackground(Color.black);
            functionButtons[i].setForeground(Color.green);

        }


        for(int i =0;i<100;i++) {

            numberButtons[i] = new JButton(String.valueOf(i));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setForeground(Color.black);
            numberButtons[i].setBackground(Color.yellow);

        }
        



        panel = new JPanel();
        panel.setBounds(10, 10, 750, 750);
        panel.setLayout(new GridLayout(10,10,0,0));
        //panel.add(numberButtons[2]);

        roll.setBounds(800,250,100,50);
        //res.setBounds(750,780,100,50);
        numb.setBounds(800,200,100,50);


        for(int i=0;i<50;i++)
        {
            panel.add(numberButtons[i]);
        }

        panel.setBackground(Color.blue);

        //THIS SHOULD BE IN THE LAST
        frame.add(panel);

        frame.add(roll);
        frame.add(numb);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);
    }
    public static void main(String[] args) {
        Sn2 obj=new Sn2();
    }


    public void actionPerformed(ActionEvent e){

        if(e.getSource() == roll){
           int min=1;
           int max=6;
           Random rn=new Random();
           a=rn.nextInt((max-min)+1)+min;
           int b=0;
            for(int i=b;i<a;i++){
                numberButtons[i].setBackground(Color.CYAN);
                 b=+i;
            }
            numb.setText(String.valueOf(a));
            numberButtons[0].setBackground(Color.CYAN);
           

            

        }

    }
}
