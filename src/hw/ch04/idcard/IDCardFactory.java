package hw.ch04.idcard;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class IDCardFactory extends Factory {
    private String baseDate; // #step1
    private int serial = 100;
    
    public IDCardFactory(String baseDate) { // #step1
        this.baseDate = baseDate; 
    }

    @Override
    protected Product createProduct(String owner) {
        return new IDCard(owner, serial++, baseDate); // #
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}
