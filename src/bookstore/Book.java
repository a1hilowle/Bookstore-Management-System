package bookstore;

import javafx.scene.control.CheckBox;

public class Book {

    private String name;
    private double price;    
    public CheckBox select;

    public Book(String name, double price) {
        this.price = price;
        this.name = name;
        this.select = new CheckBox();
    }

    public double getPrice() {
        return this.price;
    }

    public String getTitle() {
        return this.name;
    }

    public CheckBox getSelect() {
        return this.select;
    }

    public void setSelect(CheckBox select) {
        this.select = select;
    }
}