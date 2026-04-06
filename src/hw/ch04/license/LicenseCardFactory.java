package hw.ch04.license;

import hw.ch04.framework.Factory;
import hw.ch04.framework.Product;

public class LicenseCardFactory extends Factory {
    private int licenseCounter = 100; // [cite: 69]
    private String baseDate;

    public LicenseCardFactory(String baseDate) {
        this.baseDate = baseDate;
    }

    @Override
    protected Product createProduct(String owner) {
        // 만료 날짜 계산 (간단하게 연도만 +5 처리 예시)
        String[] dateParts = baseDate.split("-"); // -을 기준으로 날짜 분할하여
        int expiryYear = Integer.parseInt(dateParts[0]) + 5; //0번 위치의 연도에 5년 추가하여 expiryYear 생성
        String expiryDate = expiryYear + "-" + dateParts[1] + "-" + dateParts[2]; //합쳐서 expiryDate로 생성
        
        return new LicenseCard(owner, licenseCounter++, baseDate, expiryDate);
    }

    @Override
    protected void registerProduct(Product product) {
        System.out.println(product + "을 등록했습니다.");
    }
}