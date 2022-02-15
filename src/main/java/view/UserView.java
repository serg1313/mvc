package view;

import controller.Controller;

import javax.swing.*;
import java.awt.*;

public class UserView extends JFrame {
    private JTextArea textArea;
    private JButton button;
    private JLabel label;
    private Controller controller;
    public UserView(Controller controller){
        this.controller=controller;
    }

public void init(){
    setSize(400,300);
    setVisible(true);
    textArea = new JTextArea();
    button = new JButton("кнопка lk");
    label =new JLabel("инфо");
    add(textArea, BorderLayout.CENTER);
    add(button,BorderLayout.SOUTH );
    add(label,BorderLayout.NORTH );
    button.addActionListener(e->{
        int pin;
        String textPin = this.textArea.getText();
        pin = Integer.parseInt(textPin);
        label.setText("новый pin "+pin);
        controller.checkPin(pin);
    });

}

}
