public class Car {
    private String brand;
    private String color;
    private int price;

    public Car() {
        this.brand = "未設定";
        this.color = "未設定";
        this.price = 0;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

}
