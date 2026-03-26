package practice.ch04.idcard;

import practice.ch04.framework.Factory;
import practice.ch04.framework.Product;

public class IDCardFactory extends Factory {
    @Override
    // 부모타입은 자식 타입을 참조할 수 있다. -> 부모타입의 메소드에서 자식타입의 객체를 생성하여 반환할 수 있다.
    // 부모타입의 메소드에서 자식타입의 객체를 생성하여 반환할 수 있다. -> 다형성
    protected Product createProduct(String owner) { // 실제 제품 생성
        return new IDCard(owner);
    }

    @Override
    protected void registerProduct(Product product) { // 공장 생성 후 등록하는 과정
        System.out.println(product + "을 등록했습니다.");
    }
}
