package hw.ch02;

// Client
public class Main {
    public static void main(String[] args) {
        Charger koreanadapter = new KoreanOutletAdapter();
        Smartphone smartphone = new Smartphone(koreanadapter);
        smartphone.charge();
    }
}
