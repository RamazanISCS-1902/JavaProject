import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.text.*;
import java.util.*;

public class PizzaHutMenu extends Container {

    private JLabel MargheritaPizza;
    private JLabel PepperoniPizza;
    private JLabel BBQPizza;
    private JLabel HawaiianPizza;
    private JLabel FourSeasonsPizza;
    private String[] Drinks = {"Coca Cola", "Pepsi", "Fanta", "FuseTea"};
    private JComboBox DrinksBox;

    private JButton MargheritaPizzaAdd;
    private JButton PepperoniPizzaAdd;
    private JButton BBQPizzaAdd;
    private JButton HawaiianPizzaAdd;
    private JButton FourSeasonsPizzaAdd;
    private JButton DrinksAdd;

    private JButton MargheritaPizzaRemove;
    private JButton PepperoniPizzaRemove;
    private JButton BBQPizzaRemove;
    private JButton HawaiianPizzaRemove;
    private JButton FourSeasonsPizzaRemove;
    private JButton DrinksRemove;

    private JLabel MargheritaPizzaPriceLabel;
    private JLabel PepperoniPizzaPriceLabel;
    private JLabel BBQPizzaPriceLabel;
    private JLabel HawaiianPizzaPriceLabel;
    private JLabel FourSeasonsPizzaPriceLabel;
    private JLabel DrinksPriceLabel;

    private JLabel MargheritaPizzaCount;
    private JLabel PepperoniPizzaCount;
    private JLabel BBQPizzaCount;
    private JLabel HawaiianPizzaCount;
    private JLabel FourSeasonsPizzaCount;
    private JLabel DrinksCount;

    private JButton BuyButton;
    private JButton BackButton;
    private JButton ClearButton;

    JLabel date;

    public PizzaHutMenu(){

        setSize(400,500);
        setLayout(null);


        Calendar calendar = new GregorianCalendar();
        SimpleDateFormat formattedDate = new SimpleDateFormat("dd.MM.yy");
        String dateToday = formattedDate.format(calendar.getTime());

        date = new JLabel(dateToday);
        date.setBounds(10,0,50,20);
        add(date);


        ////MARGHERITA PIZZA

        MargheritaPizza = new JLabel("MARGHERITA PIZZA");
        MargheritaPizza.setBounds(30,80,100,30);
        add(MargheritaPizza);


        MargheritaPizzaAdd = new JButton("+");
        MargheritaPizzaAdd.setBounds(220,80,50,30);
        MargheritaPizzaAdd.setBorderPainted(false);
        MargheritaPizzaAdd.setContentAreaFilled(false);
        MargheritaPizzaAdd.setFocusPainted(false);
        MargheritaPizzaAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.MargheritaPizzaCount++;
                MargheritaPizzaCountCalc();
            }
        });
        add(MargheritaPizzaAdd);


        MargheritaPizzaRemove = new JButton("-");
        MargheritaPizzaRemove.setBounds(180,80,50,30);
        MargheritaPizzaRemove.setBorderPainted(false);
        MargheritaPizzaRemove.setContentAreaFilled(false);
        MargheritaPizzaRemove.setFocusPainted(false);

        MargheritaPizzaRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.MargheritaPizzaCount>=1){
                    Main.MargheritaPizzaCount--;
                }
                MargheritaPizzaCountCalc();
            }
        });

        add(MargheritaPizzaRemove);


        MargheritaPizzaCount = new JLabel();
        MargheritaPizzaCount.setBounds(280,80,50,30);



        MargheritaPizzaPriceLabel = new JLabel("1250тг");
        MargheritaPizzaPriceLabel.setBounds(320,80,50,30);
        add(MargheritaPizzaPriceLabel);


        ///// PEPPIRONI PIZZA

        PepperoniPizza = new JLabel("PEPPERONI PIZZA");
        PepperoniPizza.setBounds(30,110,100,30);
        add(PepperoniPizza);

        PepperoniPizzaAdd = new JButton("+");
        PepperoniPizzaAdd.setBounds(220,110,50,30);
        PepperoniPizzaAdd.setBorderPainted(false);
        PepperoniPizzaAdd.setContentAreaFilled(false);
        PepperoniPizzaAdd.setFocusPainted(false);

        PepperoniPizzaAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.PepperoniPizzaCount++;
                PepperoniPizzaCalc();
            }
        });

        add(PepperoniPizzaAdd);

        PepperoniPizzaRemove = new JButton("-");
        PepperoniPizzaRemove.setBounds(180,110,50,30);
        PepperoniPizzaRemove.setBorderPainted(false);
        PepperoniPizzaRemove.setContentAreaFilled(false);
        PepperoniPizzaRemove.setFocusPainted(false);

        PepperoniPizzaRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.PepperoniPizzaCount>=1){
                    Main.PepperoniPizzaCount--;
                    PepperoniPizzaCalc();
                }
            }
        });

        add(PepperoniPizzaRemove);


        PepperoniPizzaCount = new JLabel();
        PepperoniPizzaCount.setBounds(280,110,50,30);


        PepperoniPizzaPriceLabel = new JLabel("1600тг");
        PepperoniPizzaPriceLabel.setBounds(320,110,50,30);
        add(PepperoniPizzaPriceLabel);


        ///// BBQ PIZZA

        BBQPizza = new JLabel("BBQ PIZZA");
        BBQPizza.setBounds(30,140,150,30);
        add(BBQPizza);


        BBQPizzaAdd = new JButton("+");
        BBQPizzaAdd.setBounds(220,140,50,30);
        BBQPizzaAdd.setBorderPainted(false);
        BBQPizzaAdd.setContentAreaFilled(false);
        BBQPizzaAdd.setFocusPainted(false);

        BBQPizzaAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.BBQPizzaCount++;
                BBQPizzaCalc();
            }
        });

        add(BBQPizzaAdd);


        BBQPizzaRemove = new JButton("-");
        BBQPizzaRemove.setBounds(180,140,50,30);
        BBQPizzaRemove.setBorderPainted(false);
        BBQPizzaRemove.setContentAreaFilled(false);
        BBQPizzaRemove.setFocusPainted(false);

        BBQPizzaRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.BBQPizzaCount>=1){
                    Main.BBQPizzaCount--;
                }
                BBQPizzaCalc();
            }
        });

        add(BBQPizzaRemove);


        BBQPizzaCount = new JLabel();
        BBQPizzaCount.setBounds(280,140,50,30);


        BBQPizzaPriceLabel = new JLabel("1600тг");
        BBQPizzaPriceLabel.setBounds(320,140,50,30);
        add(BBQPizzaPriceLabel);

        //// HAWAIIAN PIZZA


        HawaiianPizza = new JLabel("HAWAIIAN PIZZA");
        HawaiianPizza.setBounds(30,170,100,30);
        add(HawaiianPizza);


        HawaiianPizzaAdd = new JButton("+");
        HawaiianPizzaAdd.setBounds(220,170,50,30);
        HawaiianPizzaAdd.setBorderPainted(false);
        HawaiianPizzaAdd.setContentAreaFilled(false);
        HawaiianPizzaAdd.setFocusPainted(false);

        HawaiianPizzaAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.HawaiianPizzaCount++;
                HawaiianPizzaCalc();
            }
        });

        add(HawaiianPizzaAdd);


        HawaiianPizzaRemove = new JButton("-");
        HawaiianPizzaRemove.setBounds(180,170,50,30);
        HawaiianPizzaRemove.setBorderPainted(false);
        HawaiianPizzaRemove.setContentAreaFilled(false);
        HawaiianPizzaRemove.setFocusPainted(false);

        HawaiianPizzaRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.HawaiianPizzaCount>=1){
                    Main.HawaiianPizzaCount--;
                }
                HawaiianPizzaCalc();
            }
        });

        add(HawaiianPizzaRemove);


        HawaiianPizzaCount = new JLabel();
        HawaiianPizzaCount.setBounds(280,170,50,30);


        HawaiianPizzaPriceLabel = new JLabel("1500тг");
        HawaiianPizzaPriceLabel.setBounds(320,170,50,30);
        add(HawaiianPizzaPriceLabel);


        ///// 4 SEASONS PIZZA  FourSeasonsPizza

        FourSeasonsPizza = new JLabel("4 SEASON PIZZA");
        FourSeasonsPizza.setBounds(30,200,100,30);
        add(FourSeasonsPizza);

        FourSeasonsPizzaAdd = new JButton("+");
        FourSeasonsPizzaAdd.setBounds(220,200,50,30);
        FourSeasonsPizzaAdd.setBorderPainted(false);
        FourSeasonsPizzaAdd.setContentAreaFilled(false);
        FourSeasonsPizzaAdd.setFocusPainted(false);

        FourSeasonsPizzaAdd.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                Main.FourSeasonsPizzaCount++;
                FourSeasonsPizzaCalc();
            }
        });

        add(FourSeasonsPizzaAdd);


        FourSeasonsPizzaRemove = new JButton("-");
        FourSeasonsPizzaRemove.setBounds(180,200,50,30);
        FourSeasonsPizzaRemove.setBorderPainted(false);
        FourSeasonsPizzaRemove.setContentAreaFilled(false);
        FourSeasonsPizzaRemove.setFocusPainted(false);

        FourSeasonsPizzaRemove.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                if(Main.FourSeasonsPizzaCount>=1){
                    Main.FourSeasonsPizzaCount--;
                }
                FourSeasonsPizzaCalc();
            }
        });

        add(FourSeasonsPizzaRemove);


        FourSeasonsPizzaCount = new JLabel();
        FourSeasonsPizzaCount.setBounds(280,200,50,30);


        FourSeasonsPizzaPriceLabel = new JLabel("2400тг");
        FourSeasonsPizzaPriceLabel.setBounds(320,200,50,30);
        add(FourSeasonsPizzaPriceLabel);


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
                Main.PizzaHutDrinksCount++;
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
                if (Main.PizzaHutDrinksCount>=1){
                    Main.PizzaHutDrinksCount--;
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
                Main.mainFrame.pizzaHutMenu.setVisible(false);
                Main.mainFrame.buyMenu.setVisible(true);

                Main.mainFrame.buyMenu.calc();

                Main.mainFrame.buyMenu.status = "PizzaHut";

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
                Main.MargheritaPizzaCount = 0;
                Main.PepperoniPizzaCount = 0;
                Main.BBQPizzaCount = 0;
                Main.HawaiianPizzaCount = 0;
                Main.FourSeasonsPizzaCount = 0;
                Main.PizzaHutDrinksCount = 0;

                Main.BurgerCheeseCount = 0;
                Main.BurgerCount = 0;
                Main.BurgerCheeseX2Count = 0;
                Main.BurgerX2Count = 0;
                Main.FrenchFriesCount = 0;
                Main.BahandiDrinksCount = 0;

                MargheritaPizzaCountCalc();
                PepperoniPizzaCalc();
                BBQPizzaCalc();
                HawaiianPizzaCalc();
                FourSeasonsPizzaCalc();
                DrinksCalc();

                Main.mainFrame.bahandiMenu.CheeseBurgerCountCalc();
                Main.mainFrame.bahandiMenu.BurgerCountCalc();
                Main.mainFrame.bahandiMenu.CheeseBurgerX2Calc();
                Main.mainFrame.bahandiMenu.BurgerX2Calc();
                Main.mainFrame.bahandiMenu.FrenchFriesCalc();
                Main.mainFrame.bahandiMenu.DrinksCalc();

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
                Main.mainFrame.pizzaHutMenu.setVisible(false);
                Main.mainFrame.mainMenu.setVisible(true);
            }
        });

        add(BackButton);


    }

    public void MargheritaPizzaCountCalc(){
        String  a = String.valueOf(Main.MargheritaPizzaCount);
        MargheritaPizzaCount.setText(a);
        if(Main.MargheritaPizzaCount == 0){
            MargheritaPizzaCount.setText("");
        }
        add(MargheritaPizzaCount);
    }

    public void PepperoniPizzaCalc(){
        String  a = String.valueOf(Main.PepperoniPizzaCount);
        PepperoniPizzaCount.setText(a);
        if(Main.PepperoniPizzaCount == 0){
            PepperoniPizzaCount.setText("");
        }
        add(PepperoniPizzaCount);
    }

    public void BBQPizzaCalc(){
        String  a = String.valueOf(Main.BBQPizzaCount);
        BBQPizzaCount.setText(a);
        if(Main.BBQPizzaCount == 0){
            BBQPizzaCount.setText("");
        }
        add(BBQPizzaCount);
    }

    public void HawaiianPizzaCalc(){
        String  a = String.valueOf(Main.HawaiianPizzaCount);
        HawaiianPizzaCount.setText(a);
        if(Main.HawaiianPizzaCount == 0){
            HawaiianPizzaCount.setText("");
        }
        add(HawaiianPizzaCount);
    }

    public void FourSeasonsPizzaCalc(){
        String  a = String.valueOf(Main.FourSeasonsPizzaCount);
        FourSeasonsPizzaCount.setText(a);
        if(Main.FourSeasonsPizzaCount == 0){
            FourSeasonsPizzaCount.setText("");
        }
        add(FourSeasonsPizzaCount);
    }

    public void DrinksCalc(){
        String  a = String.valueOf(Main.PizzaHutDrinksCount);
        DrinksCount.setText(a);
        if(Main.PizzaHutDrinksCount == 0){
            DrinksCount.setText("");
        }
        add(DrinksCount);
    }
}
