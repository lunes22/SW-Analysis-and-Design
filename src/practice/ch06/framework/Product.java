package practice.ch06.framework;

public interface Product extends Cloneable { // 클론메서드 자동 생성?
// public interface Product { // 클론메서드 자동 생성?
    public abstract void use(String s);
    public abstract Product createCopy(); // 복제 메서드
}
