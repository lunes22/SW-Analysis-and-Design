package practice.ch21;

public class Main {
    public static void main(String[] args) {
        // // 본인 생성 => 시간이 오래 걸림
        // Printable p = new PrinterProxy("Alice");
        // p.print("Hello world");
        
        // 프록시를 생성하여 이용
        Printable p2 = new PrinterProxy();
        p2.setPrinterName("Bob"); // 본인 생성 전
        System.out.println(p2.getPrinterName());

        p2.print("Hello world"); // 본인이 생성 됨

    }
}
