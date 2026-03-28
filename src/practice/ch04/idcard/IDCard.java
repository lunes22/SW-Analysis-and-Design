package practice.ch04.idcard;

import practice.ch04.framework.Product;

public class IDCard extends Product {
    private String owner;

    IDCard(String owner) { // 생성자 - 다른 패키지에서 접근할 수 없도록...
        // 부모는 인자 없는 생성자를 호출
        // super(); 
        // 생략 가능 - 자식 클래스의 생성자에서 부모 클래스의 생성자를 호출하는 것은 기본적으로 이루어지는 일
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
