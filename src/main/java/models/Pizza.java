package models;

public class Pizza {

        private String crust;
        private String size;
        private String sauce;
        private String[] toppings;

        private String address;

    public String getCrust() {
        return crust;
    }

    public void setCrust(String crust) {
        this.crust = crust;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getSauce() {
        return sauce;
    }

    public void setSauce(String sauce) {
        this.sauce = sauce;
    }

    public String[] getToppings() {
        return toppings;
    }

    public void setToppings(String[] toppings) {
        this.toppings = toppings;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Pizza() {
    }

    public Pizza(String crust, String size, String sauce, String[] toppings, String address) {
        this.crust = crust;
        this.size = size;
        this.sauce = sauce;
        this.toppings = toppings;
        this.address = address;
    }
}
