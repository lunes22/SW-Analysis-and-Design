package hw.ch06.framework;

public interface Product extends Cloneable { // clone() 사용 위함
    public abstract void use(String s);
    public abstract Product createCopy(); 
}