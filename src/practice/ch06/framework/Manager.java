package practice.ch06.framework;

// jdk에서 제공함
import java.util.HashMap;
import java.util.Map;

// product를 등록하고, 필요할 때 마다 복제해서 제공하는 클래스 : 매니저 역할!
public class Manager {
    // Product: 부모타입 - Product타입으로 선언시, Product로 구현한 모든 하위객체를 관리할 수 있다.
    private Map<String,Product> showcase = new HashMap<>(); // 객체가 해쉬맵 -> (Key, Value) 쌍으로 관리하는 Map
    // 실제 생성되는 객체의 타입: <String,Product>
    // 실제 생성되는 것(in complie): private Map<String,Product> showcase = new HashMap<String,Product>();

    public void register(String name, Product prototype) { //Hashmap으로 넣는 기능
        showcase.put(name, prototype); //(Key, Value) 쌍으로 관리하는 Map
    }

    public Product create(String prototypeName) { //HashMap에서 얻어오는 기능
        Product p = showcase.get(prototypeName); //(Key)에 해당하는 value 반환
        return p.createCopy(); // ***꺼내온 뒤 복제하여 반환함(원본이 아님!)
    } 
}
