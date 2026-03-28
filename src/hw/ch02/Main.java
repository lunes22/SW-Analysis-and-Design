package hw.ch02;

// Client
public class Main {
    public static void main(String[] args) {
        KoreanOutletAdapter koreanadapter = new KoreanOutletAdapter();
        Smartphone smartphone = new Smartphone(koreanadapter);
        smartphone.charge();
    }
}
