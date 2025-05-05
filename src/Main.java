public class Main {
    public static void main(String[] args) {
        // 使用無參數建構子
        Book book1 = new Book();
        book1.setTitle("Java 入門");
        book1.setAuthor("王小明");
        book1.setPrice(350);

        // 使用有參數建構子
        Book book2 = new Book("資料結構", "陳大華", 450);

        // 輸出書籍資料
        System.out.println("書名: " + book1.getTitle());
        System.out.println("作者: " + book1.getAuthor());
        System.out.println("價格: " + book1.getPrice());
        System.out.println();
        System.out.println("書名: " + book2.getTitle());
        System.out.println("作者: " + book2.getAuthor());
        System.out.println("價格: " + book2.getPrice());
    }
}