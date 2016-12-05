package data;

/**
 * Created by allen on 05/12/2016.
 */
public class Player {

    private String ID;
    private String name;
    private double balance;

    public Player(String ID, String name, double balance) {
        this.ID = ID;
        this.name = name;
        this.balance = balance;
    }

    public Player() {
    }

    public String getID() {
        return ID;
    }

    public void setID(String ID) {
        this.ID = ID;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }
}
