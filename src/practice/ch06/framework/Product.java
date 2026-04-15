package practice.ch06.framework;

// public interface Product { // Cloneable을 상속받지 않았으므로 CloneNotSupportedException 발생
public interface Product extends Cloneable { // 인터페이스끼리는 상속이 가능하다./ 클론메서드 자동 생성? 
// Clonable 인터페이스를 구현한 클래스만 java.lang.Object.clone()메소드를 사용가능하다 
// public interface Product { // 클론메서드 자동 생성?
    public abstract void use(String s);
    public abstract Product createCopy(); // 복제 메서드
}