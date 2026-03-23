package hw.ch01;  
// 새로 작성한 코드의 앞과 뒤에는 주석으로 L#1s1/L#1s2/L#1s3/L#1s4로 표시하였습니다.

public class Book {
    private String name;
    private String genre;
    private int year;
    private double price;

    public Book(String name) {
        this.name = name;
        this.genre = "Unknown";
        this.year = 0;
        this.price = 0.0;
    }

    // L#1s1 새 필드를 받는 생성자
    public Book(String name, String genre, int year, double price) {
        this.name = name;
        this.genre = genre;
        this.year = year;
        this.price = price;
    }
    // L#1s1

    public String getName() {
        return name;
    }

    // L#1s1 getter 추가
    public String getGenre() {
        return genre;
    }

    public int getYear() {
        return year;
    }

    public double getPrice() {
        return price;
    }
    // L#1s1
}
