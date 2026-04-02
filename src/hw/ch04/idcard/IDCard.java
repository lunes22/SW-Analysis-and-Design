package hw.ch04.idcard;

import ch04.Sample.framework.Product;

public class IDCard extends Product {
    private String owner;
    private int serial;
    private String issuedDate;

    IDCard(String owner) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = 0; // 조건 검토 필요
        this.issuedDate = "2025-01-01"; // 조건 검토 필요
    }

    IDCard(String owner, int serial, String issuedDate) {
        System.out.println(owner + "의 카드를 만듭니다.");
        this.owner = owner;
        this.serial = serial;
        this.issuedDate = issuedDate;
    }


    @Override
    public void use() {
        System.out.println(this + "을 사용합니다.");
    }

    @Override
    public String toString() {
        return "[IDCard:" + owner + "|" + "Issued Date: " + issuedDate + "]";
    }

    public String getOwner() {
        return owner;
    }

    public String getIssuedDate() {
        return issuedDate;
    }

    public int getSerial() { // 요구 조건에는 없어서 검토필요
        return serial;
    }

}
