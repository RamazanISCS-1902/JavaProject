import javafx.scene.shape.Circle;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.awt.image.*;
import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class MainMenu extends Container {

    private JButton BahandiButton;
    private JButton BurgerKingButton;
    private JButton PizzaHutButton;

    private JButton BackButton;

    JLabel date;

    public MainMenu () {
        setSize(400,500);
        setLayout(null);



        //// BAHANDI BUTTON
        BahandiButton = new JButton("BAHANDI");
        BahandiButton.setBounds(20,200,175,30);
        BahandiButton.setBackground(Color.WHITE);
        BahandiButton.setForeground(Color.decode("#9FC66B"));
        BahandiButton.setFocusable(false);

        BahandiButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ///OPEN BAHANDI && CLOSE MAIN MENU
                Main.mainFrame.mainMenu.setVisible(false);
                Main.mainFrame.bahandiMenu.setVisible(true);
            }
        });

        add(BahandiButton);


        ///// BURGER KING BUTTON
        BurgerKingButton = new JButton("BURGER KING");
        BurgerKingButton.setBounds(200,200,175,30);
        BurgerKingButton.setFocusable(false);
        BurgerKingButton.setBackground(Color.WHITE);
        BurgerKingButton.setForeground(Color.decode("#9FC66B"));

        BurgerKingButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                //// OPEN BURGER KING MENU
                Main.mainFrame.mainMenu.setVisible(false);
                Main.mainFrame.burgerKingMenu.setVisible(true);
            }
        });

        add(BurgerKingButton);


        //// PIZZA HUT BUTTON
        PizzaHutButton = new JButton("PIZZA HUT");
        PizzaHutButton.setBounds(112,245,177,30);
        PizzaHutButton.setBackground(Color.WHITE);
        PizzaHutButton.setFocusable(false);
        PizzaHutButton.setForeground(Color.decode("#9FC66B"));


        PizzaHutButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                ///// OPEN PIZZA HUT WINDOW
                Main.mainFrame.pizzaHutMenu.setVisible(true);
                Main.mainFrame.mainMenu.setVisible(false);
            }
        });

        add(PizzaHutButton);


        //// BACK BUTTON

        BackButton = new JButton("BACK");
        BackButton.setBounds(112,350,177,30);
        BackButton.setFocusPainted(false);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.decode("#9FC66B"));

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.mainFrame.mainMenu.setVisible(false);
                Main.mainFrame.joinMenu.setVisible(true);
                Main.mainFrame.setSize(300,300);
            }
        });

        add(BackButton);


        //// DATE

        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yy");
        String dateToday = formattedDate.format(calendar.getTime());

        date = new JLabel(dateToday);
        date.setBounds(10,0,50,20);
        add(date);


    }

    public void sout(User user){
        System.out.println(user.getName());
        System.out.println(user.getEmail());
    }


}
