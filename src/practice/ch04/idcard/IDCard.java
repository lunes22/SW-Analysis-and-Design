package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) { // 생성자 - 다른 패키지에서 접근할 수 없도록...
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
    }

    @Override
    public void use(){
        System.out.println(this.toString() + "을 사용합니다."); 
    }

    @Override
    // toString() 메소드 오버라이딩 - where? -> object 클래스의 메소드
    public String toString() {
        return "[IDCard:" + owner + "]"; // 위에서 사용한 함수가 없어서 만들어준 것
    }

    public String getOwner() {
        return owner;
    }
}
