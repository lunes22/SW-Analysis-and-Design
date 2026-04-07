package practice.ch06.framework;

// jdk에서 제공함
import java.util.HashMap;
import java.util.Map;

// product를 등록하고, 필요할 때 마다 복제해서 제공하는 클래스 : 매니저 역할!
public class Manager {
    private Map<String,Product> showcase = new HashMap<>(); // 객체가 해쉬맵 -> (Key, Value) 쌍으로 관리하는 Map
    // 실제 생성되는 것(in complie): private Map<String,Product> showcase = new HashMap<String,Product>();

    public void register(String name, Product prototype) {
        showcase.put(name, prototype); //(Key, Value) 쌍으로 관리하는 Map
    }

    public Product create(String prototypeName) {
        Product p = showcase.get(prototypeName); //(Key)에 해당하는 value 반환
        return p.createCopy(); // 복제하여 반환함(원본이 아님!)
    } 
}
