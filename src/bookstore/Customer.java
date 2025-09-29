package bookstore;

import java.util.ArrayList;

public class Customer {

   
    private String username;
    private String password;
    private int points;
    private String status;
    private double totalCosts;
    private ArrayList<Book> purchasedBooks = new ArrayList<>();

    public Customer(String username, String password) {

        this.username = username;
        this.password = password;

        this.points = 0;
        this.totalCosts = 0;

        if (this.points == 0) {
            this.status = "Silver";
        }

    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public int getPoints() {
        return this.points;
    }

    public void setPoints(int points) {
        this.points = this.points + points;
        setMembership(this.points);
    }

    public String getMembership() {
        return this.status;
    }

    public void setMembership(int points) {
        if (points > 1000) {
            this.status = "GOLD";
        } else {
            this.status = "SILVER";
        }
    }
}