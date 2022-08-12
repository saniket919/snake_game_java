import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class  Snake implements ActionListener{
    JFrame frame;
    JTextField textfield;
    JButton[] numberButtons = new JButton[100];
    JButton[] functionButtons = new JButton[9];
    JButton addBtn, subBtn, mulBtn, divBtn;
    JButton decBtn, equBtn, delBtn, clrBtn, minus;
    JPanel panel;


    Font myFont = new Font("Tw Cen MT",Font.BOLD,30);
    double num1=0,num2=0, res =0;
    char operator;
    Snake(){

        frame = new JFrame("Durgansh CalC");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       frame.setSize(1000, 1000);
        frame.setLayout(null);
        frame.setBackground(Color.black);





        textfield = new JTextField();
        textfield.setBounds(50, 25, 300, 50);
        textfield.setFont(myFont);
        textfield.setEditable(false);
        textfield.setBackground(Color.black);
        textfield.setForeground(Color.GREEN);


        addBtn = new JButton("+");
        subBtn = new JButton("-");
        mulBtn = new JButton("x");
        divBtn = new JButton("/");
        decBtn = new JButton(".");
        equBtn = new JButton("=");
        delBtn = new JButton("C");
        clrBtn = new JButton("AC");
        minus = new JButton("[-]");

        functionButtons[0] = addBtn;
        functionButtons[1] = subBtn;
        functionButtons[2] = mulBtn;
        functionButtons[3] = divBtn;
        functionButtons[4] = decBtn;
        functionButtons[5] = equBtn;
        functionButtons[6] = delBtn;
        functionButtons[7] = clrBtn;
        functionButtons[8] = minus;



        for(int i =0;i<9;i++) {

            functionButtons[i].addActionListener(this);
            functionButtons[i].setFont(myFont);
            functionButtons[i].setFocusable(true);
            functionButtons[i].setBackground(Color.black);
            functionButtons[i].setForeground(Color.green);

        }



        for(int i =0;i<100;i++) {

            numberButtons[i] = new JButton(String.valueOf(i+1));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setForeground(Color.black);
            numberButtons[i].setBackground(Color.yellow);

        }



        minus.setBounds(750,730,100,50);
        delBtn.setBounds(150,430,100,50);
        clrBtn.setBounds(50,430,100,50);

        panel = new JPanel();
        panel.setBounds(10, 10, 750, 750);
        panel.setLayout(new GridLayout(10,10,0,0));
        for(int i=0;i<100;i++)
        {
            panel.add(numberButtons[i]);
        }
        // panel.add(numberButtons[1]);
        // panel.add(numberButtons[2]);
        // panel.add(numberButtons[3]);
        // panel.add(addBtn);
        // panel.add(numberButtons[4]);
        // panel.add(numberButtons[5]);
        // panel.add(numberButtons[6]);
        // panel.add(subBtn);
        // panel.add(numberButtons[7]);
        // panel.add(numberButtons[8]);
        // panel.add(numberButtons[9]);
        // panel.add(mulBtn);
        // panel.add(equBtn);
        // panel.add(numberButtons[0]);
        // panel.add(decBtn);
        panel.add(divBtn);
        // panel.add(numberButtons[11]);
        panel.setBackground(Color.black);


        frame.add(panel);
        frame.add(minus);
        frame.add(delBtn);
        frame.add(clrBtn);
        frame.add(textfield);
        frame.setVisible(true);
        frame.getContentPane().setBackground(Color.black);

    }
public static void main(String[] args) {
        System.out.println("Here  "+"we   "+" go......");
        Snake calc = new Snake();
}





    public void actionPerformed(ActionEvent e) {
        for(int i=0;i<10;i++) {


            if(e.getSource() == numberButtons[i]) {
                String regex="^0+(?!$)";
                textfield.setText(textfield.getText().concat(String.valueOf(i)).replaceAll(regex,""));

            }

        }

        if(e.getSource()== decBtn) {
            textfield.setText(textfield.getText().concat("."));

        }

        if(e.getSource()== addBtn) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='+';
            textfield.setText("");

        }

        if(e.getSource()== subBtn) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='-';
            textfield.setText("");

        }

        if(e.getSource()== mulBtn) {
            num1 = Double.parseDouble(textfield.getText());
            operator ='*';
            textfield.setText("");

        }

        if(e.getSource()== divBtn) {
            num1 = Double.parseDouble(textfield.getText());

            operator ='/';
            textfield.setText("");

        }

        if(e.getSource()== equBtn) {
            num2=Double.parseDouble(textfield.getText());



            switch(operator) {

                case'+':
                    res =num1+num2;
                    break;

                case'-':
                    res =num1-num2;
                    break;

                case'*':
                    res =num1*num2;
                    break;

                case'/':
                    res =num1/num2;
                    break;
            }

            textfield.setText(String.valueOf(res));
            num1= res;

        }

        if(e.getSource()== clrBtn) {
            textfield.setText("");

        }

        if(e.getSource()== delBtn) {
            String string = textfield.getText();
            textfield.setText("");
            for(int i=0;i<string.length()-1;i++) {
                textfield.setText(textfield.getText()+string.charAt(i));

            }

        }

        if(e.getSource()== minus) {
            // double temp = Double.parseDouble(textfield.getText());
            // temp*=-1;
            // textfield.setText(String.valueOf(temp));
            
        for(int i =0;i<100;i++) {

            numberButtons[i] = new JButton(String.valueOf(i+1));
            numberButtons[i].addActionListener(this);
            numberButtons[i].setFont(myFont);
            numberButtons[i].setFocusable(false);
            numberButtons[i].setForeground(Color.black);
            numberButtons[i].setBackground(Color.red);

        }

        }

    }

} 