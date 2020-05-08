import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RegistrationMenu extends Container {

    private JLabel EmailLabel;
    private JLabel NameLabel;
    private JLabel PasswordLabel;
    private JLabel RePasswordLabel;

    private JTextField EmailText;
    public JTextField NameText;
    private JPasswordField Password;
    private JPasswordField RePassword;

    private JButton JoinButton;
    private JButton BackButton;

    public RegistrationMenu(){
        setSize(300,300);
        setLayout(null);

        ////EMAIL


        EmailLabel = new JLabel("EMAIL:");
        EmailLabel.setBounds(50,30,50,30);
        add(EmailLabel);

        EmailText = new JTextField();
        EmailText.setBounds(130,30,100,30);
        add(EmailText);


        //// NAME

        NameLabel = new JLabel("NAME:");
        NameLabel.setBounds(50,70,50,30);
        add(NameLabel);

        NameText = new JTextField();
        NameText.setBounds(130,70,100,30);
        add(NameText);

        /// PASSWORD

        PasswordLabel = new JLabel("PASSWORD:");
        PasswordLabel.setBounds(50,110,80,30);
        add(PasswordLabel);


        Password = new JPasswordField();
        Password.setBounds(130,110,100,30);
        add(Password);


        /// 2PASSWORD

        RePasswordLabel = new JLabel("PASSWORD:");
        RePasswordLabel.setBounds(50,150,80,30);
        add(RePasswordLabel);


        RePassword = new JPasswordField();
        RePassword.setBounds(130,150,100,30);
        add(RePassword);



        /// EXIT BUTTON

        BackButton = new JButton("BACK");
        BackButton.setBounds(50,200,80,30);
        BackButton.setFocusPainted(false);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.decode("#9FC66B"));

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.mainFrame.registrationMenu.setVisible(false);
                Main.mainFrame.joinMenu.setVisible(true);
            }
        });

        add(BackButton);


        //// JOIN BUTTON

        JoinButton = new JButton("JOIN");
        JoinButton.setBounds(150,200,80,30);
        JoinButton.setFocusPainted(false);
        JoinButton.setBackground(Color.WHITE);
        JoinButton.setForeground(Color.decode("#9FC66B"));

        JoinButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(NameText.getText().length()!=0 && Password.getText().length()>=8 && EmailText.getText().length()>0) {
                    Main.mainFrame.setSize(400, 500);
                    Main.mainFrame.registrationMenu.setVisible(false);
                    Main.mainFrame.mainMenu.setVisible(true);

                    init();


                    NameText.setText("");
                    RePassword.setText("");
                    Password.setText("");
                    EmailText.setText("");


                }
            }
        });

        add(JoinButton);
    }

    public void init(){
        String name = NameText.getText();
        String email = EmailText.getText();
        String password = Password.getText();

        User user = new User(null, name, email, password);
        Data pd = new Data("registration", user);

        Main.connect(pd);
    }
}
