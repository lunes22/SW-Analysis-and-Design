package hw.ch06.framework;

// jdk에서 제공함
import java.util.HashMap;
import java.util.Map;

public class Manager {
    private Map<String,Product> showcase = new HashMap<>(); // (Key, Value) 쌍으로 관리하는 Map

    public void register(String name, Product prototype) {
        showcase.put(name, prototype); // 저장
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); // value 반환
        return p.createCopy(); // 복제하여 반환
    } 
}
