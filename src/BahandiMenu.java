import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class BahandiMenu extends Container {
    private JLabel BurgerCheese;
    private JLabel Burger;
    private JLabel BurgerCheeseX2;
    private JLabel BurgerX2;
    private JLabel FrenchFries;
    private String[] Drinks = {"Coca Cola", "Pepsi", "Compote"};
    private JComboBox DrinksBox;

    private JButton BurgerCheeseAdd;
    private JButton BurgerAdd;
    private JButton BurgerCheeseX2Add;
    private JButton BurgerX2Add;
    private JButton FrenchFriesAdd;
    private JButton DrinksAdd;

    private JButton BurgerCheeseRemove;
    private JButton BurgerRemove;
    private JButton BurgerCheeseX2Remove;
    private JButton BurgerX2Remove;
    private JButton FrenchFriesRemove;
    private JButton DrinksRemove;

    private JLabel BurgerCheesePriceLabel;
    private JLabel BurgerPriceLabel;
    private JLabel BurgerCheeseX2PriceLabel;
    private JLabel BurgerX2PriceLabel;
    private JLabel FrenchFriesPriceLabel;
    private JLabel DrinksPriceLabel;

    private JLabel BurgerCheeseCount;
    private JLabel BurgerCount;
    private JLabel BurgerCheeseX2Count;
    private JLabel BurgerX2Count;
    private JLabel FrenchFriesCount;
    private JLabel DrinksCount;

    private JButton BuyButton;
    private JButton BackButton;
    private JButton ClearButton;

    JLabel date;


    public BahandiMenu(){
        setSize(400,500);
        setLayout(null);


        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yy");
        String dateToday = formattedDate.format(calendar.getTime());

        date = new JLabel(dateToday);
        date.setBounds(10,0,50,20);
        add(date);



        ///// CHEESE BURGER

        BurgerCheese = new JLabel("CHEESE BURGER");
        BurgerCheese.setBounds(30,80,100,30);
        add(BurgerCheese);


        BurgerCheeseAdd = new JButton("+");
        BurgerCheeseAdd.setBounds(220,80,50,30);
        BurgerCheeseAdd.setBorderPainted(false);
        BurgerCheeseAdd.setContentAreaFilled(false);
        BurgerCheeseAdd.setFocusPainted(false);
        BurgerCheeseAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.BurgerCheeseCount++;
                CheeseBurgerCountCalc();
            }
        });
        add(BurgerCheeseAdd);


        BurgerCheeseRemove = new JButton("-");
        BurgerCheeseRemove.setBounds(180,80,50,30);
        BurgerCheeseRemove.setBorderPainted(false);
        BurgerCheeseRemove.setContentAreaFilled(false);
        BurgerCheeseRemove.setFocusPainted(false);

        BurgerCheeseRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.BurgerCheeseCount>=1){
                    Main.BurgerCheeseCount--;
                }
                CheeseBurgerCountCalc();
            }
        });

        add(BurgerCheeseRemove);


        BurgerCheeseCount = new JLabel();
        BurgerCheeseCount.setBounds(280,80,50,30);



        BurgerCheesePriceLabel = new JLabel("850тг");
        BurgerCheesePriceLabel.setBounds(320,80,50,30);
        add(BurgerCheesePriceLabel);


        ////// BURGER

        Burger = new JLabel("BURGER");
        Burger.setBounds(30,110,100,30);
        add(Burger);

        BurgerAdd = new JButton("+");
        BurgerAdd.setBounds(220,110,50,30);
        BurgerAdd.setBorderPainted(false);
        BurgerAdd.setContentAreaFilled(false);
        BurgerAdd.setFocusPainted(false);

        BurgerAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.BurgerCount++;
                BurgerCountCalc();
            }
        });

        add(BurgerAdd);

        BurgerRemove = new JButton("-");
        BurgerRemove.setBounds(180,110,50,30);
        BurgerRemove.setBorderPainted(false);
        BurgerRemove.setContentAreaFilled(false);
        BurgerRemove.setFocusPainted(false);

        BurgerRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.BurgerCount>=1){
                    Main.BurgerCount--;
                    BurgerCountCalc();
                }
            }
        });

        add(BurgerRemove);


        BurgerCount = new JLabel();
        BurgerCount.setBounds(280,110,50,30);


        BurgerPriceLabel = new JLabel("750тг");
        BurgerPriceLabel.setBounds(320,110,50,30);
        add(BurgerPriceLabel);


        ////// CHEESE BURGER X2

        BurgerCheeseX2 = new JLabel("CHEESE BURGER X2");
        BurgerCheeseX2.setBounds(30,140,150,30);
        add(BurgerCheeseX2);


        BurgerCheeseX2Add = new JButton("+");
        BurgerCheeseX2Add.setBounds(220,140,50,30);
        BurgerCheeseX2Add.setBorderPainted(false);
        BurgerCheeseX2Add.setContentAreaFilled(false);
        BurgerCheeseX2Add.setFocusPainted(false);

        BurgerCheeseX2Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.BurgerCheeseX2Count++;
                CheeseBurgerX2Calc();
            }
        });

        add(BurgerCheeseX2Add);


        BurgerCheeseX2Remove = new JButton("-");
        BurgerCheeseX2Remove.setBounds(180,140,50,30);
        BurgerCheeseX2Remove.setBorderPainted(false);
        BurgerCheeseX2Remove.setContentAreaFilled(false);
        BurgerCheeseX2Remove.setFocusPainted(false);

        BurgerCheeseX2Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.BurgerCheeseX2Count>=1){
                    Main.BurgerCheeseX2Count--;
                }
                CheeseBurgerX2Calc();
            }
        });

        add(BurgerCheeseX2Remove);


        BurgerCheeseX2Count = new JLabel();
        BurgerCheeseX2Count.setBounds(280,140,50,30);


        BurgerCheeseX2PriceLabel = new JLabel("1200тг");
        BurgerCheeseX2PriceLabel.setBounds(320,140,50,30);
        add(BurgerCheeseX2PriceLabel);


        ////// BURGER

        BurgerX2 = new JLabel("BURGER X2");
        BurgerX2.setBounds(30,170,100,30);
        add(BurgerX2);


        BurgerX2Add = new JButton("+");
        BurgerX2Add.setBounds(220,170,50,30);
        BurgerX2Add.setBorderPainted(false);
        BurgerX2Add.setContentAreaFilled(false);
        BurgerX2Add.setFocusPainted(false);

        BurgerX2Add.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.BurgerX2Count++;
                BurgerX2Calc();
            }
        });

        add(BurgerX2Add);


        BurgerX2Remove = new JButton("-");
        BurgerX2Remove.setBounds(180,170,50,30);
        BurgerX2Remove.setBorderPainted(false);
        BurgerX2Remove.setContentAreaFilled(false);
        BurgerX2Remove.setFocusPainted(false);

        BurgerX2Remove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.BurgerX2Count>=1){
                    Main.BurgerX2Count--;
                }
                BurgerX2Calc();
            }
        });

        add(BurgerX2Remove);


        BurgerX2Count = new JLabel();
        BurgerX2Count.setBounds(280,170,50,30);


        BurgerX2PriceLabel = new JLabel("1100тг");
        BurgerX2PriceLabel.setBounds(320,170,50,30);
        add(BurgerX2PriceLabel);


        ////// PEPSI

        FrenchFries = new JLabel("FRENCH FRIES");
        FrenchFries.setBounds(30,200,100,30);
        add(FrenchFries);

        FrenchFriesAdd = new JButton("+");
        FrenchFriesAdd.setBounds(220,200,50,30);
        FrenchFriesAdd.setBorderPainted(false);
        FrenchFriesAdd.setContentAreaFilled(false);
        FrenchFriesAdd.setFocusPainted(false);

        FrenchFriesAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.FrenchFriesCount++;
                FrenchFriesCalc();
            }
        });

        add(FrenchFriesAdd);


        FrenchFriesRemove = new JButton("-");
        FrenchFriesRemove.setBounds(180,200,50,30);
        FrenchFriesRemove.setBorderPainted(false);
        FrenchFriesRemove.setContentAreaFilled(false);
        FrenchFriesRemove.setFocusPainted(false);

        FrenchFriesRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.FrenchFriesCount>=1){
                    Main.FrenchFriesCount--;
                }
                FrenchFriesCalc();
            }
        });

        add(FrenchFriesRemove);


        FrenchFriesCount = new JLabel();
        FrenchFriesCount.setBounds(280,200,50,30);


        FrenchFriesPriceLabel = new JLabel("300тг");
        FrenchFriesPriceLabel.setBounds(320,200,50,30);
        add(FrenchFriesPriceLabel);

        ///// DRINKS

        DrinksBox = new JComboBox(Drinks);
        DrinksBox.setBounds(30,230,100,30);
        add(DrinksBox);


        DrinksAdd = new JButton("+");
        DrinksAdd.setBounds(220,230,50,30);
        DrinksAdd.setBorderPainted(false);
        DrinksAdd.setFocusPainted(false);
        DrinksAdd.setContentAreaFilled(false);

        DrinksAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.BahandiDrinksCount++;
                DrinksCalc();
            }
        });

        add(DrinksAdd);

        DrinksRemove = new JButton("-");
        DrinksRemove.setBounds(180,230,50,30);
        DrinksRemove.setBorderPainted(false);
        DrinksRemove.setFocusPainted(false);
        DrinksRemove.setContentAreaFilled(false);

        DrinksRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if (Main.BahandiDrinksCount>=1){
                    Main.BahandiDrinksCount--;
                }
                DrinksCalc();
            }
        });

        add(DrinksRemove);


        DrinksCount = new JLabel();
        DrinksCount.setBounds(280,230,50,30);

        DrinksPriceLabel = new JLabel("350тг");
        DrinksPriceLabel.setBounds(320,230,50,30);
        add(DrinksPriceLabel);


        //// BUY BUTTON
        BuyButton = new JButton("BUY");
        BuyButton.setBounds(150,300,100,30);
        BuyButton.setBackground(Color.WHITE);
        BuyButton.setForeground(Color.decode("#9FC66B"));
        BuyButton.setFocusable(false);

        BuyButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.mainFrame.bahandiMenu.setVisible(false);
                Main.mainFrame.buyMenu.setVisible(true);

                Main.mainFrame.buyMenu.calc();

                Main.mainFrame.buyMenu.status = "Bahandi";
            }
        });

        add(BuyButton);


        ///CLEAR BUTTON

        ClearButton = new JButton("CLEAR");
        ClearButton.setBounds(150,350,100,30);
        ClearButton.setBackground(Color.WHITE);
        ClearButton.setForeground(Color.decode("#9FC66B"));
        ClearButton.setFocusable(false);

        ClearButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.BurgerCheeseCount = 0;
                Main.BurgerCount = 0;
                Main.BurgerCheeseX2Count = 0;
                Main.BurgerX2Count = 0;
                Main.FrenchFriesCount = 0;
                Main.BahandiDrinksCount = 0;

                Main.MargheritaPizzaCount = 0;
                Main.PepperoniPizzaCount = 0;
                Main.BBQPizzaCount = 0;
                Main.HawaiianPizzaCount = 0;
                Main.FourSeasonsPizzaCount = 0;
                Main.PizzaHutDrinksCount = 0;

                CheeseBurgerCountCalc();
                BurgerCountCalc();
                CheeseBurgerX2Calc();
                BurgerX2Calc();
                FrenchFriesCalc();
                DrinksCalc();

                Main.mainFrame.pizzaHutMenu.MargheritaPizzaCountCalc();
                Main.mainFrame.pizzaHutMenu.PepperoniPizzaCalc();
                Main.mainFrame.pizzaHutMenu.BBQPizzaCalc();
                Main.mainFrame.pizzaHutMenu.HawaiianPizzaCalc();
                Main.mainFrame.pizzaHutMenu.FourSeasonsPizzaCalc();
                Main.mainFrame.pizzaHutMenu.DrinksCalc();
            }
        });

        add(ClearButton);


        //// BACK BUTTON
        BackButton = new JButton("BACK");
        BackButton.setBounds(150,400,100,30);
        BackButton.setBackground(Color.WHITE);
        BackButton.setForeground(Color.decode("#9FC66B"));
        BackButton.setFocusable(false);

        BackButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.mainFrame.bahandiMenu.setVisible(false);
                Main.mainFrame.mainMenu.setVisible(true);
            }
        });

        add(BackButton);

    }

    public void CheeseBurgerCountCalc(){
        String  a = String.valueOf(Main.BurgerCheeseCount);
        BurgerCheeseCount.setText(a);
        if(Main.BurgerCheeseCount == 0){
            BurgerCheeseCount.setText("");
        }
        add(BurgerCheeseCount);
    }

    public void BurgerCountCalc(){
        String  a = String.valueOf(Main.BurgerCount);
        BurgerCount.setText(a);
        if(Main.BurgerCount == 0){
            BurgerCount.setText("");
        }
        add(BurgerCount);
    }

    public void CheeseBurgerX2Calc(){
        String  a = String.valueOf(Main.BurgerCheeseX2Count);
        BurgerCheeseX2Count.setText(a);
        if(Main.BurgerCheeseX2Count == 0){
            BurgerCheeseX2Count.setText("");
        }
        add(BurgerCheeseX2Count);
    }

    public void BurgerX2Calc(){
        String  a = String.valueOf(Main.BurgerX2Count);
        BurgerX2Count.setText(a);
        if(Main.BurgerX2Count == 0){
            BurgerX2Count.setText("");
        }
        add(BurgerX2Count);
    }

    public void FrenchFriesCalc(){
        String  a = String.valueOf(Main.FrenchFriesCount);
        FrenchFriesCount.setText(a);
        if(Main.FrenchFriesCount == 0){
            FrenchFriesCount.setText("");
        }
        add(FrenchFriesCount);
    }

    public void DrinksCalc(){
        String  a = String.valueOf(Main.BahandiDrinksCount);
        DrinksCount.setText(a);
        if(Main.BahandiDrinksCount == 0){
            DrinksCount.setText("");
        }
        add(DrinksCount);
    }

}
