package practice.ch20;

public class Main {
    public static void main(String[] args) {
        BigChar char1 = new BigChar('1');
        char1.print();

        BigChar char2 = new BigChar('2');
        char2.print();

        BigCharFactory factory = BigCharFactory.getInstance();

        BigChar char3 = factory.getBigChar('1');
        char3.print();

        BigChar char4 = factory.getBigChar('1');
        char4.print();
    }
}
