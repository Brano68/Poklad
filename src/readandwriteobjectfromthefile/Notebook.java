package readandwriteobjectfromthefile;

import java.io.Serializable;

public class Notebook implements Serializable {
    private String brand;
    private double price;
    private boolean isStock;

    public Notebook(String brand, double price, boolean isStock) {
        this.brand = brand;
        this.price = price;
        this.isStock = isStock;
    }

    @Override
    public String toString() {
        return "PC: " + brand + " " + price + " " + isStock;
    }

}
