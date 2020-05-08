import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.ResultSet;
import java.util.ArrayList;

public class JoinMenu extends Container {

    private JLabel EmailLabel;
    private JLabel NameLabel;
    private JLabel PasswordLabel;

    private JTextField EmailText;
    public JTextField NameText;
    private JPasswordField Password;

    private JButton JoinButton;
    private JButton RegisterButton;


    public JoinMenu(){
        setSize(300,300);
        setLayout(null);



        ////EMAIL

        /*
        EmailLabel = new JLabel("EMAIL:");
        EmailLabel.setBounds(50,50,50,30);
        add(EmailLabel);

        EmailText = new JTextField("@.");
        EmailText.setBounds(130,50,100,30);
                add(EmailText);
         */

        //// NAME

        NameLabel = new JLabel("NAME:");
        NameLabel.setBounds(50,50,50,30);
        add(NameLabel);

        NameText = new JTextField();
        NameText.setBounds(130,50,100,30);
        add(NameText);

        /// PASSWORD

        PasswordLabel = new JLabel("PASSWORD:");
        PasswordLabel.setBounds(50,90,80,30);
        add(PasswordLabel);


        Password = new JPasswordField();
        Password.setBounds(130,90,100,30);
        add(Password);



        /// EXIT BUTTON

        RegisterButton = new JButton("REGISTER");
        RegisterButton.setBounds(90,200,100,30);
        RegisterButton.setFocusPainted(false);
        RegisterButton.setBackground(Color.WHITE);
        RegisterButton.setForeground(Color.decode("#9FC66B"));

        RegisterButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.mainFrame.registrationMenu.setVisible(true);
                Main.mainFrame.joinMenu.setVisible(false);
            }
        });

        add(RegisterButton);


        //// JOIN BUTTON

        JoinButton = new JButton("JOIN");
        JoinButton.setBounds(90,150,100,30);
        JoinButton.setFocusPainted(false);
        JoinButton.setBackground(Color.WHITE);
        JoinButton.setForeground(Color.decode("#9FC66B"));

        JoinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(NameText.getText().length()!=0 && Password.getText().length()>=8) {
                    init(NameText.getText(),Password.getText());
                }
            }
        });

        add(JoinButton);

    }

    public void init(String name, String password){
        DBManager dbManager = new DBManager();
        dbManager.connect();
        ArrayList <User> users = dbManager.getAllUser();


        for (int i = 0; i < users.size(); i++) {
            String Checkname = users.get(i).getName();
            String CheckPassword = users.get(i).getPassword();

            if((name.equals(Checkname)) && (password.equals(CheckPassword))){
                Main.mainFrame.setSize(400,500);
                Main.mainFrame.mainMenu.setVisible(true);
                Main.mainFrame.joinMenu.setVisible(false);
            }
        }
    }




}
