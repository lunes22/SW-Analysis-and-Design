package practice.ch02.delegation;

// 어댑터 클래스
// 자바에서는 다중 상속이 불가능함(부모가 둘 이상은 허용이 안됨)
// 하지만 Print(target interface)와 Banner(adaptee class)를 모두 사용해야 하는 상황이 발생할 수 있음
// 이럴 때, delegation(위임)을 이용하여 구현할 수 있음
public class PrintBannerAdapter02 extends Print {
    //print class가 abstract class이므로 implements로 구현할 수 없다
    //따라서, 상속을 통하여 구현한다. => delegation(위임)
    //Banner을 상속 받으려고 하면 오류가 발생
    private Banner banner; // Banner 클래스의 인스턴스를 참조하는 필드

    // 두 클래스를 모두 상속 받는 대신에 하나는 필드로 참조하여 사용한다(가지고 있다가 일을 시킴) -> delegation(위임)의 핵심
    public PrintBannerAdapter02(String text) { 
        this.banner = new Banner(text); // Banner 클래스의 인스턴스를 생성하여 필드에 할당
    }

    @Override
    public void printWeak() {
        banner.showWithParen(); // Banner 클래스의 메서드를 호출하여 기능을 수행(Banner에 '위임')
    }

    @Override
    public void printStrong() {
        banner.showWithAster(); // Banner 클래스의 메서드를 호출하여 기능을 수행
    }
}
