package practice.ch02.delegation;


public class Main {
    public static void main(String[] args) {
        Print print = new PrintBannerAdapter02("Hello World");
        print.printWeak(); // print클래스는 Banner 클래스에 일을 시키게 됨
        print.printStrong();
    }
}
