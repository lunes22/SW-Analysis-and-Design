package practice.ch04.framework;

public abstract class Factory {
    // 템플릿 메소드
    // 제품 생산하는 방식을 정의하는 메소드
    public final Product create(String owner) { 
        Product p = createProduct(owner);
        registerProduct(p);
        return p;
    }

    protected abstract Product createProduct(String owner); // 디폴트 구현 준비
    protected abstract void registerProduct(Product product);
}
