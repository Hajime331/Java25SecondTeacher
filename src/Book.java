public class Book {
    private String title;
    private String author;
    private int price;

    // 無參數建構子
    public Book() {
        this.title = "未命名";
        this.author = "未知";
        this.price = 0;
    }

    // 有參數建構子
    public Book(String title, String author, int price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }

    // getter
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPrice() {
        return price;
    }

    // setter
    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
