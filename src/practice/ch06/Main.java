package practice.ch06;

import practice.ch06.framework.Product;
import practice.ch06.framework.Manager;

public class Main {
    public static void main(String[] args) {
        // //원본(prototype)이 일을 함
        // MessageBox mbox1 = new MessageBox('*');
        // mbox1.use("Hello World");

        // // 복제된 객체가 일을 함
        // mbox1.createCopy().use("Hello, world");
        // //mbox1.clone() // 이 경우는 복제된 객체이지 cloneable을 상속받은 것은 아니므로(자신이 아니므로) clone()으로 복사된 객체 생성 불가능
        // // 따라서 createCopy()메소드를 활용하여 clone을 호출하도록 처리를 한다
        
        // //원본(prototype)이 일을 함
        // UnderlinePen upen1 = new UnderlinePen('~'); // 매개변수가 char이므로 ''를 사용해야함
        // upen1.use("Hello World");

        // // 복제된 객체가 일을 함
        // upen1.createCopy().use("Hello, world");

        //Manager을 이용하는 코드

        //Manager에 원본(Prototype)을 등록

        //준비 : 모든 클래스와 밀접한 관계가 있음(main), manager은 다른 클래스들과 관계가 없기 때문에(?) 코드가 수정되어도 영향이 없거나 적다
        Manager manager = new Manager();
        MessageBox mbox1 = new MessageBox('*');
        MessageBox mbox2 = new MessageBox('/');
        UnderlinePen upen1 = new UnderlinePen('+');

        //등록
        manager.register("star box", mbox1); 
        // MessageBox mbox1 = new MessageBox('*'); 대신에 starbox라는 이름으로, 
        // 클래스 이름이 아닌 다른 이름으로 객체를 얻어올 수 있게 됨 : 15p (3) 예시 설명
        manager.register("plus line", upen1);
        manager.register("slash box", mbox2);

        // 등록된 이름으로 복제품을 얻어서 사용**
        Product p1 = manager.create("star box");
        p1.use("Hello world");

        Product p2 = manager.create("plus line");
        p2.use("Hello world");

        Product p3 = manager.create("slash box");
        p3.use("Hello world");
        
    }
} // 원본을 사용하는 것이 아닌 매니저를 통하여 복제품을 생산하여 사용하는 것이 포인트!
