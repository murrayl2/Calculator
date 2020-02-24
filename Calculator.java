package solution;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculator implements ActionListener
{
    private JFrame frame;
    private JPanel bPanel;
    private JButton addButton;
    private JButton subButton;
    private JButton multButton;
    private JButton divButton;
    private JPanel rPanel;
    private JLabel resultLabel;
    private JPanel tPanel;
    private JTextField leftOperand;
    private JTextField rightOperand;
    
    public Calculator()
    {
        frame = new JFrame("My Simple Calculator");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        bPanel = new JPanel();
        bPanel.setLayout(new FlowLayout());
        addButton = new JButton("ADD");
        addButton.setName("addButton");
        subButton = new JButton("SUB");
        subButton.setName("subButton");
        multButton = new JButton("MULT");
        multButton.setName("multButton");
        divButton = new JButton("DIV");
        divButton.setName("divButton");
        bPanel.add(addButton);
        bPanel.add(subButton);
        bPanel.add(multButton);
        bPanel.add(divButton);
        frame.add(bPanel, BorderLayout.SOUTH);

        rPanel = new JPanel();
        rPanel.setLayout(new FlowLayout(FlowLayout.LEADING));
        resultLabel = new JLabel("Result = ");
        rPanel.add(resultLabel);
        frame.add(rPanel, BorderLayout.CENTER);
 
        tPanel = new JPanel();
        tPanel.setLayout(new FlowLayout());
        leftOperand = new JTextField(12);
        rightOperand = new JTextField(12);
        tPanel.add(leftOperand);
        tPanel.add(rightOperand);
        frame.add(tPanel, BorderLayout.NORTH);

        frame.setSize(280, 130);
        frame.setVisible(true);

        addButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent event)
            {
                try
                {
                    double num1, num2, ans;
                    num1 = Double.parseDouble(leftOperand.getText());
                    num2 = Double.parseDouble(rightOperand.getText());
                    ans = num1 + num2;
                    resultLabel.setText("Result = " + ans);
                }
                catch(Exception e)
                {
                    resultLabel.setText("Result = Error");
                }
            }
        });

        subButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent event)
            {
                try
                {
                    double num1, num2, ans;
                    num1 = Double.parseDouble(leftOperand.getText());
                    num2 = Double.parseDouble(rightOperand.getText());
                    ans = num1 - num2;
                    resultLabel.setText("Result = " + ans);
                }
                catch(Exception e)
                {
                    resultLabel.setText("Result = Error");
                }
            }
        });

        multButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent event)
            {
                try
                {
                    double num1, num2, ans;
                    num1 = Double.parseDouble(leftOperand.getText());
                    num2 = Double.parseDouble(rightOperand.getText());
                    ans = num1 * num2;
                    resultLabel.setText("Result = " + ans);
                }
                catch(Exception e)
                {
                    resultLabel.setText("Result = Error");
                }
            }
        });

        divButton.addActionListener(new ActionListener() 
        {
            public void actionPerformed(ActionEvent event)
            {
                try
                {
                    double num1, num2, ans;
                    num1 = Double.parseDouble(leftOperand.getText());
                    num2 = Double.parseDouble(rightOperand.getText());
                    ans = num1 / num2;
                    if (num2 == 0)
                    {
                        resultLabel.setText("Result = Error");
                    }
                    else
                    {
                        resultLabel.setText("Result = " + ans);
                    }
                }
                catch(Exception e)
                {
                    resultLabel.setText("Result = Error");
                }
            }
        });
    }

    public JFrame getFrame()
    {
        return frame;
    }

    public void setFrame(JFrame frame)
    {
        this.frame = frame;
    }

    public static void main(String[] args)
    {
        Calculator calc = new Calculator();
    }

    @Override
    public void actionPerformed(ActionEvent e)
    {
        // TODO Auto-generated method stub

    }
}
