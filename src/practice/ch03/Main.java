package practice.ch03;

public class Main {
    public static void main(String[] args) {
        // 'H'를 가진 CharDisplay 인스턴스를 하나 만든다 
        // CharDisplay d1 = new CharDisplay('H');
        AbstractDisplay d1 = new CharDisplay('H'); // 부모타입으로 선언해도 자식을 가리킬 수 있기 때문에 가능한 코드(LSP 원칙을 따름)
        d1.display();
        d1.open();

        // "Hello, world."를 가진 StringDisplay 인스턴스를 하나 만든다 
        // StringDisplay d2 = new StringDisplay("Hello, world.");
        AbstractDisplay d2 = new StringDisplay("Hello, world."); // = Liscov Substitution Principle : 부모타입으로 선언해도 자식을 가리킬 수 있다

        // d1,d2 모두 같은 AbstractDisplay의 하위 클래스의 인스턴스이므로
        // 상속한 display 메소드를 호출할 수 있다
        // 실제 동작은 CharDisplay나 StringDisplay 클래스에서 정해진다
        d2.display();

        // AbstractDisplay d3 = new AbstractDiaplay("안녕하세요."); // 추상클래스이므로 인스턴스로 선언할 수 없다.
    }
}
