import java.io.Serializable;
import java.util.ArrayList;

public class Data implements Serializable {
    private String operationType;// ADD, LIST
    private User user;
    private ArrayList<User> users;

    public Data(String operationType, User user) {////Send to server info about one student
        this.operationType = operationType;
        this.user = user;
    }

    public Data(String operationType) {/// List all info from server
        this.operationType = operationType;
    }

    public Data(ArrayList<User> users) {/// Send back to client
        this.users = users;
    }

    public String getOperationType() {
        return operationType;
    }

    public void setOperationType(String operationType) {
        this.operationType = operationType;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User student) {
        this.user = user;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }
}
