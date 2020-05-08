import java.io.*;
import java.net.Socket;

public class Main {
    public static MainFrame mainFrame;

    public static int BurgerCheeseCount = 0;
    public static int BurgerCount = 0;
    public static int BurgerCheeseX2Count = 0;
    public static int BurgerX2Count = 0;
    public static int FrenchFriesCount = 0;
    public static int BahandiDrinksCount = 0;

    public static int MargheritaPizzaCount = 0;
    public static int PepperoniPizzaCount = 0;
    public static int BBQPizzaCount = 0;
    public static int HawaiianPizzaCount = 0;
    public static int FourSeasonsPizzaCount = 0;
    public static int PizzaHutDrinksCount = 0;

    public static int BKBurgerCheeseCount = 0;
    public static int BKBurgerCount = 0;
    public static int WhopperMealCount = 0;
    public static int WhopperCount = 0;
    public static int BKFishMealCount = 0;
    public static int BKDrinksCount = 0;

    public static String[] s = new String[100];
    public static int k = 0;


    public static void connect(Data pd){
        try{
            Socket socket = new Socket("127.0.0.1", 8888);
            ObjectOutputStream outputStream = new ObjectOutputStream(socket.getOutputStream());
            ObjectInputStream inputStream = new ObjectInputStream(socket.getInputStream());

            if(pd.getOperationType().equals("registration")){
                outputStream.writeObject(pd);
            }

            inputStream.close();
            outputStream.close();
            socket.close();


        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public static int Calculate(){
        int sum = 0;
        int sumB = (BurgerCheeseCount*850) + (BurgerCount*750) + (BurgerCheeseX2Count*1200) + (BurgerX2Count*1100) + (FrenchFriesCount*300) + (BahandiDrinksCount*350);
        int sumP = (MargheritaPizzaCount*1250) + (PepperoniPizzaCount*1600) + (BBQPizzaCount*1600) + (HawaiianPizzaCount*1500) + (FourSeasonsPizzaCount*2400) + (PizzaHutDrinksCount*350);
        int sumBK = (BKBurgerCheeseCount*111) + (BKBurgerCount*112) + (WhopperMealCount*113) + (WhopperCount*114) + (BKFishMealCount*115) + (BKDrinksCount*116);
        sum = sumB + sumP + sumBK;
        return sum;
    }


    public static void main(String[] args) throws IOException, ClassNotFoundException {
        mainFrame = new MainFrame();
        mainFrame.setVisible(true);
    }



}
