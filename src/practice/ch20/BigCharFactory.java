package practice.ch20;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    // 이미 만든 BigChar 인스턴스를 관리하기위해 HashMap 생성
    private Map<String,BigChar> pool = new HashMap<>();
    // 객체 생성에 Singleton 패턴이용(공장은 하나만 존재해야하기 때문)
    private static BigCharFactory singleton = new BigCharFactory();

    // 생성자 
    private BigCharFactory() {
    }

    // 유일한 인스턴스를 얻는다
    public static BigCharFactory getInstance() {
        return singleton;
    }

    // BigChar 인스턴스 생성(공유)
    public synchronized BigChar getBigChar(char charname) {

        //이미 만들어진 BigChar 인스턴스를 검색
        BigChar bc = pool.get(String.valueOf(charname));
        if (bc == null) {// 이미 만들어진 BigChar 인스턴스가 없다면
            // 여기서 BigChar 인스턴스를 생성 
            bc = new BigChar(charname);
            pool.put(String.valueOf(charname), bc);
        }
        return bc; // 요구한 BigChar 인스턴스를 리턴
    }
}
