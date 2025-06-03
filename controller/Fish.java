package controller;


public class Fish {
    public String fishName;
    public int price;
    public String feature;
    public String status;
    public int stock;

    public Fish(String fishName, int price, String feature, String status, int stock) {
        this.fishName = fishName;
        this.price = price;
        this.feature = feature;
        this.status = status;
        this.stock = stock;
    }

    public void setFishName(String fishName) {
        this.fishName = fishName;
    }
    public void setPrice(int price) {
        this.price = price;
    }
    public void setFeature(String feature) {
        this.feature = feature;
    }
    public void setStatus(String status) {
        this.status = status;
    }
    public void setStock(int stock) {
        this.stock = stock;
    }
}
