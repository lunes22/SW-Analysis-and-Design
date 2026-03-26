package practice.ch04;

import practice.ch04.framework.Product;
import practice.ch04.idcard.IDCardFactory;

public class Main {
    public static void main(String[] args) {
        // (1) IDCard를 직접 생성
        // IDCard c1 = new IDCard("Subin Park"); 
        // // Exception 발생 - 다른 파일에 있는데 임포트하지 않았기 때문에 -> 해당 패키지 임포트
        // // Exception 발생 - 다른 패키지에서 접근할 수 없도록 생성자에 접근제한자 설정 -> public으로 설정
        // c1.use();

        // (2) 공장을 통하여 IDCard를 생성
        IDCardFactory factory = new IDCardFactory();
        Product c2 = factory.create("박수빈");
        c2.use();
    }
}
