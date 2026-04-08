package hw.ch06;

import hw.ch06.framework.Product;

public class UnderlinePen implements Product {
    private char ulchar;

    public UnderlinePen(char ulchar) {
        this.ulchar = ulchar;
    }

    @Override
    public void use(String s) {
        int ulen = s.length();
        
        System.out.println(s);

        for (int i = 0; i < ulen; i++) { // 밑줄 긋는 일을 한다.
            System.out.print(ulchar);
        }
        System.out.println();
    }

    @Override
    // 복제 메소드 : 클론을 호출하고 리턴한다.(자기자신 복제) 
    public Product createCopy() { //: 공통된 흐름이므로 부모쪽에서 작성하여 공유하는 형태가 좋다.
        // Product로 옮기는 경우 Product class가 interface에서 abstract class로 바뀐다.
        Product p = null;
        try {
            p = (Product)clone();
        } catch (CloneNotSupportedException e) { // 불가능한 경우 예외가 발생한다.
            e.printStackTrace();
        }
        return p;
    }
}
