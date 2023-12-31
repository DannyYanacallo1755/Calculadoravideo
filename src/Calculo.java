import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Calculo {
    private JPanel Calculadora;
    private JTextField textDisplay;
    private JButton button1;
    private JButton button2;
    private JButton xButton;
    private JButton button4;
    private JButton ACButton;
    private JButton button6;
    private JButton a7Button;
    private JButton a4Button;
    private JButton a1Button;
    private JButton a00Button;
    private JButton button11;
    private JButton a9Button;
    private JButton a6Button;
    private JButton a3Button;
    private JButton button15;
    private JButton button16;
    private JButton a8Button;
    private JButton a5Button;
    private JButton a2Button;
    private JButton a0Button;
    private JButton SENButton;
    private JButton COSButton;
    private JButton TANButton;
    private JButton button8;
    private JButton POWButton;

    double a,b,resultado;
    String op;

    public Calculo() {
        ACButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(" ");
            }
        });
        a7Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a7Button.getText());
            }
        });
        a8Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a8Button.getText());
            }
        });
        a9Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a9Button.getText());
            }
        });
        a4Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a4Button.getText());
            }
        });
        a5Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a5Button.getText());
            }
        });
        a6Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a6Button.getText());
            }
        });
        a1Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a1Button.getText());
            }
        });
        a2Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a2Button.getText());
            }
        });
        a3Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a3Button.getText());
            }
        });
        a00Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a00Button.getText());
            }
        });
        a0Button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textDisplay.setText(textDisplay.getText() + a0Button.getText());
            }
        });
        button16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().contains(".")){
                    double pm = Double.parseDouble(textDisplay.getText());
                    pm=pm*-1;
                    textDisplay.setText(String.valueOf(pm));
                }else
                {
                    long PM= Long.parseLong(textDisplay.getText());
                    PM=PM*-1;
                    textDisplay.setText(String.valueOf(PM));
                }
            }
        });
        button15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if(textDisplay.getText().contains(".")){
                    textDisplay.setText(textDisplay.getText()+button15.getText());
                }
            }
        });
        button6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textDisplay.getText());
                op="+";
                textDisplay.setText("");
            }
        });
        button4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textDisplay.getText());
                op="-";
                textDisplay.setText("");
            }
        });
        xButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textDisplay.getText());
                op="x";
                textDisplay.setText("");
            }
        });
        button2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a=Double.parseDouble(textDisplay.getText());
                op="/";
                textDisplay.setText("");
            }
        });
        button11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String backspace=null;

                if(textDisplay.getText().length()>0){
                    StringBuilder strB=new StringBuilder(textDisplay.getText());
                    strB.deleteCharAt(textDisplay.getText().length()-1);
                    backspace=String.valueOf(strB);
                    textDisplay.setText(backspace);
                }
            }
        });
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                b=Double.parseDouble(textDisplay.getText());

                if(op=="+"){
                    resultado=a+b;
                    textDisplay.setText(String.valueOf(resultado));
                } else if (op=="-") {
                    resultado=a-b;
                    textDisplay.setText(String.valueOf(resultado));
                } else if (op=="x") {
                    resultado = a * b;
                    textDisplay.setText(String.valueOf(resultado));
                }else if (op=="/") {
                    resultado = a / b;
                    textDisplay.setText(String.valueOf(resultado));
                }else if (op=="^") {
                    resultado = Math.pow(a, b);
                    textDisplay.setText(String.valueOf(resultado));
                }
            }
        });
        SENButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(textDisplay.getText());
                double result = Math.sin(value);
                textDisplay.setText(String.valueOf(result));
            }
        });
        COSButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(textDisplay.getText());
                double result = Math.cos(value);
                textDisplay.setText(String.valueOf(result));
            }
        });
        TANButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(textDisplay.getText());
                double result = Math.tan(value);
                textDisplay.setText(String.valueOf(result));
            }
        });
        button8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double value = Double.parseDouble(textDisplay.getText());
                double result = Math.sqrt(value);
                textDisplay.setText(String.valueOf(result));
            }
        });
        POWButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a = Double.parseDouble(textDisplay.getText());
                op = "^";
                textDisplay.setText("");
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("Calculo");
        frame.setContentPane(new Calculo().Calculadora);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
