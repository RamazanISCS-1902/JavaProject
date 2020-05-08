import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class BuyMenu extends Container {

    private JLabel Bill;

    private JLabel CardInfoLabel;
    private JLabel CardNumberLabel;
    private JLabel CVVLabel;
    private JLabel CardDateLabel;

    private JTextField CardNumberText;
    private JTextField CVVText;
    private JTextField CardMonthText;
    private JTextField CardYearText;

    private JButton BuyButton;
    private JButton BackButton;

    private Font CardInfoFont;
    private Font CardFont;
    private Font BillFont;

    private JLabel date;

    public static String status;

    public BuyMenu(){
        setSize(400,500);
        setLayout(null);


        CardInfoFont = new Font("TimesRoman", Font.BOLD,40);
        CardFont = new Font("TimesRoman", Font.BOLD, 12);
        BillFont = new Font("TimesRoman", Font.BOLD, 30);





        CardInfoLabel = new JLabel("CARD INFO");
        CardInfoLabel.setBounds(90,80,300,50);
        CardInfoLabel.setFont(CardInfoFont);
        CardInfoLabel.setForeground(Color.WHITE);
        add(CardInfoLabel);


        //// CARD NUMBER

        CardNumberLabel = new JLabel("CARD NUMBER:");
        CardNumberLabel.setBounds(50,200,100,30);
        CardNumberLabel.setFont(CardFont);
        add(CardNumberLabel);

        CardNumberText = new JTextField();
        CardNumberText.setBounds(200,200,130,30);
        add(CardNumberText);


        //// CARD DATE

        CardDateLabel = new JLabel("CARD DATE:");
        CardDateLabel.setBounds(50,250,100,30);
        CardDateLabel.setFont(CardFont);
        add(CardDateLabel);

        CardMonthText = new JTextField();
        CardMonthText.setBounds(200,250,20,30);
        add(CardMonthText);

        CardYearText = new JTextField();
        CardYearText.setBounds(230,250,20,30);
        add(CardYearText);

        //// CVV

        CVVLabel = new JLabel("CVV:");
        CVVLabel.setBounds(50,300,100,30);
        CVVLabel.setFont(CardFont);
        add(CVVLabel);

        CVVText = new JTextField();
        CVVText.setBounds(200,300,30,30);
        add(CVVText);


        /// BUY BUTTON

        BuyButton = new JButton("BUY");
        BuyButton.setBounds(200,370,130,30);
        BuyButton.setBackground(Color.WHITE);
        BuyButton.setForeground(Color.decode("#9FC66B"));
        BuyButton.setFocusable(false);

        BuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(CardNumberText.getText().length() == 16 && CardMonthText.getText().length() == 2 && CardYearText.getText().length() == 2 && CVVText.getText().length() == 3){
                    Main.mainFrame.purchaseMenu.setVisible(true);
                    Main.mainFrame.buyMenu.setVisible(false);
                    Main.mainFrame.setSize(350,150);

                    String cardNumber = CardNumberText.getText();
                    String cardMonth = CardMonthText.getText();
                    String cardYear = CardYearText.getText();
                    String cardCVV = CVVText.getText();


                    CardYearText.setText("");
                    CardMonthText.setText("");
                    CardNumberText.setText("");
                    CVVText.setText("");

                }
            }
        });

        add(BuyButton);


        //// BACK BUTTON
        BackButton = new JButton("BACK");
        BackButton.setBounds(50,370,130,30);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.decode("#9FC66B"));
        BackButton.setFocusable(false);

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.mainFrame.buyMenu.setVisible(false);
                if(status == "PizzaHut"){
                    Main.mainFrame.pizzaHutMenu.setVisible(true);
                }
                else if(status == "Bahandi"){
                    Main.mainFrame.bahandiMenu.setVisible(true);
                }
                else if(status == "BK"){
                    Main.mainFrame.burgerKingMenu.setVisible(true);
                }

            }
        });

        add(BackButton);


        ///// DATE

        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yy");
        String dateToday = formattedDate.format(calendar.getTime());

        date = new JLabel(dateToday);
        date.setBounds(10,0,50,20);
        add(date);

        Bill = new JLabel("Bill");
        Bill.setBounds(150,140,120,50);
        Bill.setForeground(Color.WHITE);
        Bill.setFont(BillFont);



    }

    public void calc(){
        String str = String.valueOf(Main.Calculate());
        Bill.setText(str + " тг");
        add(Bill);
        System.out.println(str);
    }
}
