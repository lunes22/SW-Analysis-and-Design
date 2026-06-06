package practice.ch14;

public class OddSupport extends Support {
    public OddSupport(String name) {
        super(name);
    }

    @Override
    protected boolean resolve(Trouble trouble) {
        if (trouble.getNumber() % 2 == 1) { // 트러블 번호가 홀수인경우에만 해결
            return true;
        } else { // 짝수인 경우는 false
            return false;
        }
    }
}
