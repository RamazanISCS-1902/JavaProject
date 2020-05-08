import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class PurchaseMenu extends Container {

    private JLabel ThanksLabel;
    private Font font;

    private JButton OkButton;
    private Font fontOk;

    public PurchaseMenu(){
        setSize(320,150);
        setLayout(null);

        font = new Font("TimesRoman",Font.BOLD,17);

        ThanksLabel = new JLabel("THANK YOU FOR YOUR PURCHASE");
        ThanksLabel.setBounds(20,0,300,50);
        ThanksLabel.setFont(font);
        ThanksLabel.setForeground(Color.WHITE);
        add(ThanksLabel);


        fontOk = new Font("TimesRoman", Font.BOLD,10);
        OkButton = new JButton("OK");
        OkButton.setBounds(150,70,50,30);
        OkButton.setBackground(Color.WHITE);
        OkButton.setForeground(Color.decode("#9FC66B"));
        OkButton.setFont(fontOk);

        OkButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.mainFrame.purchaseMenu.setVisible(false);
                Main.mainFrame.mainMenu.setVisible(true);
                Main.mainFrame.setSize(400,500);

                ArrayList <User> users= new ArrayList<>();
                System.out.println(users.toString());
            }
        });

        add(OkButton);


    }
}
