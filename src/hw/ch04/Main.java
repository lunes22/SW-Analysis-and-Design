package hw.ch04;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;
import hw.ch04.idcard.IDCardFactory;
import hw.ch04.license.LicenseCardFactory;

public class Main {
    public static void main(String[] args) {
        // step3-1
        System.out.println("=== Step1 : IDCard Test ===");
        Factory factory1 = new IDCardFactory("2026-01-15");
        Product card1 = factory1.create("Kim Youngjin");
        Product card2 = factory1.create("Son Heungmin");
        card1.use();
        card2.use();

        System.out.println();

        // step3-2
        System.out.println("=== Step2 : LicenseCard Test ===");
        Factory factory2 = new LicenseCardFactory("2026-03-20");
        Product license1 = factory2.create("Park Jisung");
        Product license2 = factory2.create("Lee Min-jae");
        license1.use();
        license2.use();
    }
}
