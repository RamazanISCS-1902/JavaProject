import javax.swing.*;


public class MainFrame extends JFrame {
    public static MainMenu mainMenu;
    public static BahandiMenu bahandiMenu;
    public static PizzaHutMenu pizzaHutMenu;
    public static BurgerKingMenu burgerKingMenu;
    public static JoinMenu joinMenu;
    public static BuyMenu buyMenu;
    public static PurchaseMenu purchaseMenu;
    public static RegistrationMenu registrationMenu;
    public int sum = 0;


    public MainFrame(){
        setSize(300,300);
        setTitle("Untitled");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);



        joinMenu = new JoinMenu();
        joinMenu.setLocation(0,0);
        add(joinMenu);

        mainMenu = new MainMenu();
        mainMenu.setLocation(0,0);
        mainMenu.setVisible(false);
        add(mainMenu);


        bahandiMenu = new BahandiMenu();
        bahandiMenu.setLocation(0,0);
        bahandiMenu.setVisible(false);
        add(bahandiMenu);

        pizzaHutMenu = new PizzaHutMenu();
        pizzaHutMenu.setLocation(0,0);
        pizzaHutMenu.setVisible(false);
        add(pizzaHutMenu);

        burgerKingMenu = new BurgerKingMenu();
        burgerKingMenu.setLocation(0,0);
        burgerKingMenu.setVisible(false);
        add(burgerKingMenu);

        buyMenu = new BuyMenu();
        buyMenu.setLocation(0,0);
        buyMenu.setVisible(false);
        add(buyMenu);

        purchaseMenu = new PurchaseMenu();
        purchaseMenu.setLocation(0,0);
        purchaseMenu.setVisible(false);
        add(purchaseMenu);


        registrationMenu = new RegistrationMenu();
        registrationMenu.setLocation(0,0);
        registrationMenu.setVisible(false);
        add(registrationMenu);



        ImageIcon img = new ImageIcon("res\\img\\back1.png");
        JLabel background = new JLabel("",img,JLabel.CENTER);
        background.setOpaque(false);
        add(background);






    }









}
