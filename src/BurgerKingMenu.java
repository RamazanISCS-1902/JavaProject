import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.GregorianCalendar;

public class BurgerKingMenu extends Container {

    private JLabel BurgerCheese;
    private JLabel Burger;
    private JLabel WhopperMeal;
    private JLabel Whopper;
    private JLabel BKFishMeal;
    private String[] Drinks = {"Coca Cola", "Pepsi", "Compote"};
    private JComboBox DrinksBox;

    private JButton BurgerCheeseAdd;
    private JButton BurgerAdd;
    private JButton WhopperMealAdd;
    private JButton WhopperAdd;
    private JButton BKFishMealAdd;
    private JButton DrinksAdd;

    private JButton BurgerCheeseRemove;
    private JButton BurgerRemove;
    private JButton WhopperMealRemove;
    private JButton WhopperRemove;
    private JButton BKFishMealRemove;
    private JButton DrinksRemove;

    private JLabel BurgerCheesePriceLabel;
    private JLabel BurgerPriceLabel;
    private JLabel WhopperMealPriceLabel;
    private JLabel WhopperPriceLabel;
    private JLabel BKFishMealPriceLabel;
    private JLabel DrinksPriceLabel;

    private JLabel BurgerCheeseCount;
    private JLabel BurgerCount;
    private JLabel WhopperMealCount;
    private JLabel WhopperCount;
    private JLabel BKFishMealCount;
    private JLabel DrinksCount;

    private JButton BuyButton;
    private JButton BackButton;
    private JButton ClearButton;

    JLabel date;

    public BurgerKingMenu(){
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
                Main.BKBurgerCheeseCount++;
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
                if(Main.BKBurgerCheeseCount>=1){
                    Main.BKBurgerCheeseCount--;
                }
                CheeseBurgerCountCalc();
            }
        });

        add(BurgerCheeseRemove);


        BurgerCheeseCount = new JLabel();
        BurgerCheeseCount.setBounds(280,80,50,30);



        BurgerCheesePriceLabel = new JLabel("111тг");
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
                Main.BKBurgerCount++;
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
                if(Main.BKBurgerCount>=1){
                    Main.BKBurgerCount--;
                    BurgerCountCalc();
                }
            }
        });

        add(BurgerRemove);


        BurgerCount = new JLabel();
        BurgerCount.setBounds(280,110,50,30);


        BurgerPriceLabel = new JLabel("112тг");
        BurgerPriceLabel.setBounds(320,110,50,30);
        add(BurgerPriceLabel);


        ////// CHEESE BURGER X2

        WhopperMeal = new JLabel("CHEESE BURGER X2");
        WhopperMeal.setBounds(30,140,150,30);
        add(WhopperMeal);


        WhopperMealAdd = new JButton("+");
        WhopperMealAdd.setBounds(220,140,50,30);
        WhopperMealAdd.setBorderPainted(false);
        WhopperMealAdd.setContentAreaFilled(false);
        WhopperMealAdd.setFocusPainted(false);

        WhopperMealAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.WhopperMealCount++;
                WhopperMealCalc();
            }
        });

        add(WhopperMealAdd);


        WhopperMealRemove = new JButton("-");
        WhopperMealRemove.setBounds(180,140,50,30);
        WhopperMealRemove.setBorderPainted(false);
        WhopperMealRemove.setContentAreaFilled(false);
        WhopperMealRemove.setFocusPainted(false);

        WhopperMealRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.WhopperMealCount>=1){
                    Main.WhopperMealCount--;
                }
                WhopperMealCalc();
            }
        });

        add(WhopperMealRemove);


        WhopperMealCount = new JLabel();
        WhopperMealCount.setBounds(280,140,50,30);


        WhopperMealPriceLabel = new JLabel("113тг");
        WhopperMealPriceLabel.setBounds(320,140,50,30);
        add(WhopperMealPriceLabel);


        ////// BURGER

        Whopper = new JLabel("BURGER X2");
        Whopper.setBounds(30,170,100,30);
        add(Whopper);


        WhopperAdd = new JButton("+");
        WhopperAdd.setBounds(220,170,50,30);
        WhopperAdd.setBorderPainted(false);
        WhopperAdd.setContentAreaFilled(false);
        WhopperAdd.setFocusPainted(false);

        WhopperAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.WhopperCount++;
                WhopperCalc();
            }
        });

        add(WhopperAdd);


        WhopperRemove = new JButton("-");
        WhopperRemove.setBounds(180,170,50,30);
        WhopperRemove.setBorderPainted(false);
        WhopperRemove.setContentAreaFilled(false);
        WhopperRemove.setFocusPainted(false);

        WhopperRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.WhopperCount>=1){
                    Main.WhopperCount--;
                }
                WhopperCalc();
            }
        });

        add(WhopperRemove);


        WhopperCount = new JLabel();
        WhopperCount.setBounds(280,170,50,30);


        WhopperPriceLabel = new JLabel("114тг");
        WhopperPriceLabel.setBounds(320,170,50,30);
        add(WhopperPriceLabel);


        ////// PEPSI

        BKFishMeal = new JLabel("FRENCH FRIES");
        BKFishMeal.setBounds(30,200,100,30);
        add(BKFishMeal);

        BKFishMealAdd = new JButton("+");
        BKFishMealAdd.setBounds(220,200,50,30);
        BKFishMealAdd.setBorderPainted(false);
        BKFishMealAdd.setContentAreaFilled(false);
        BKFishMealAdd.setFocusPainted(false);

        BKFishMealAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.BKFishMealCount++;
                BKFishMealCalc();
            }
        });

        add(BKFishMealAdd);


        BKFishMealRemove = new JButton("-");
        BKFishMealRemove.setBounds(180,200,50,30);
        BKFishMealRemove.setBorderPainted(false);
        BKFishMealRemove.setContentAreaFilled(false);
        BKFishMealRemove.setFocusPainted(false);

        BKFishMealRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.BKFishMealCount>=1){
                    Main.BKFishMealCount--;
                }
                BKFishMealCalc();
            }
        });

        add(BKFishMealRemove);


        BKFishMealCount = new JLabel();
        BKFishMealCount.setBounds(280,200,50,30);


        BKFishMealPriceLabel = new JLabel("115тг");
        BKFishMealPriceLabel.setBounds(320,200,50,30);
        add(BKFishMealPriceLabel);

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
                Main.BKDrinksCount++;
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
                if (Main.BKDrinksCount>=1){
                    Main.BKDrinksCount--;
                }
                DrinksCalc();
            }
        });

        add(DrinksRemove);


        DrinksCount = new JLabel();
        DrinksCount.setBounds(280,230,50,30);

        DrinksPriceLabel = new JLabel("116тг");
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
                Main.mainFrame.burgerKingMenu.setVisible(false);
                Main.mainFrame.buyMenu.setVisible(true);

                Main.mainFrame.buyMenu.calc();

                Main.mainFrame.buyMenu.status = "BK";
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
                Main.BKBurgerCheeseCount = 0;
                Main.BKBurgerCount = 0;
                Main.WhopperMealCount = 0;
                Main.WhopperCount = 0;
                Main.BKFishMealCount = 0;
                Main.BKDrinksCount = 0;

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
                WhopperMealCalc();
                WhopperCalc();
                BKFishMealCalc();
                DrinksCalc();

                Main.mainFrame.bahandiMenu.CheeseBurgerCountCalc();
                Main.mainFrame.bahandiMenu.BurgerCountCalc();
                Main.mainFrame.bahandiMenu.CheeseBurgerX2Calc();
                Main.mainFrame.bahandiMenu.BurgerX2Calc();
                Main.mainFrame.bahandiMenu.FrenchFriesCalc();
                Main.mainFrame.bahandiMenu.DrinksCalc();

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
                Main.mainFrame.burgerKingMenu.setVisible(false);
                Main.mainFrame.mainMenu.setVisible(true);
            }
        });

        add(BackButton);
    }

    public void CheeseBurgerCountCalc(){
        String  a = String.valueOf(Main.BKBurgerCheeseCount);
        BurgerCheeseCount.setText(a);
        if(Main.BKBurgerCheeseCount == 0){
            BurgerCheeseCount.setText("");
        }
        add(BurgerCheeseCount);
    }

    public void BurgerCountCalc(){
        String  a = String.valueOf(Main.BKBurgerCount);
        BurgerCount.setText(a);
        if(Main.BKBurgerCount == 0){
            BurgerCount.setText("");
        }
        add(BurgerCount);
    }

    public void WhopperMealCalc(){
        String  a = String.valueOf(Main.WhopperMealCount);
        WhopperMealCount.setText(a);
        if(Main.WhopperMealCount == 0){
            WhopperMealCount.setText("");
        }
        add(WhopperMealCount);
    }

    public void WhopperCalc(){
        String  a = String.valueOf(Main.WhopperCount);
        WhopperCount.setText(a);
        if(Main.WhopperCount == 0){
            WhopperCount.setText("");
        }
        add(WhopperCount);
    }

    public void BKFishMealCalc(){
        String  a = String.valueOf(Main.BKFishMealCount);
        BKFishMealCount.setText(a);
        if(Main.FrenchFriesCount == 0){
            BKFishMealCount.setText("");
        }
        add(BKFishMealCount);
    }

    public void DrinksCalc(){
        String  a = String.valueOf(Main.BKDrinksCount);
        DrinksCount.setText(a);
        if(Main.BKDrinksCount == 0){
            DrinksCount.setText("");
        }
        add(DrinksCount);
    }
}
