import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

public class DBManager{
    private Connection connection;
    public void connect() {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");///
            connection = DriverManager.getConnection(
                    "jdbc:mysql://localhost:3306/java?useUnicode=true&serverTimezone=UTC","root", ""
            );
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void addUsers(User user){
        try{

            PreparedStatement st = connection.prepareStatement("" +
                    "INSERT INTO java (id, name, email, password) " +
                    "VALUES (NULL,?,?,?)"
            );
            st.setString(1, user.getName());
            st.setString(2, user.getEmail());
            st.setString(3, user.getPassword());

            st.executeUpdate();// Insert, Delete, Update

            st.close();

        }catch (Exception e){
            e.printStackTrace();
        }
    }

    public ArrayList<User> getAllUser(){
        ArrayList<User> userList = new ArrayList<>();
        try{
            PreparedStatement statement = connection.prepareStatement("SELECT * FROM java");
            ResultSet resultSet = statement.executeQuery();/// Select

            while(resultSet.next()){
                Integer id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                String email = resultSet.getString("email");
                String password = resultSet.getString("password");

                userList.add(new User(id, name, email, password));
            }
            statement.close();
        }catch (Exception e){
            e.printStackTrace();
        }
        return userList;
    }

    //// CRUD: Create(Insert into), Read(Select), Update, Delete
}
