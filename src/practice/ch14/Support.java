package practice.ch14;

public abstract class Support {
    private String name;    // 이 트러블 해결자 이름
    private Support next;   // 떠넘길 곳

    public Support(String name) {
        this.name = name;
        this.next = null;
    }

    // 떠넘길 곳을 설정한다
    public Support setNext(Support next) {
        this.next = next;
        return next; // 인자로 들어온 뒷사람을 반환함
    }

    // 트러블 해결 절차를 결정한다
    public void support(Trouble trouble) {
        if (resolve(trouble)) { // 내가 해결을 시도
            done(trouble); // 해결했다고 선언
        } else if (next != null) { // 내가 해결 못함 + 뒷사람 있음
            next.support(trouble);// 뒷사람에게 떠넘김
        } else { // 내가 해결 못함 + 뒷사람 없음
            fail(trouble); // 해결 못했다고 선언
        }
    }

    // 트러블 해결자의 문자열 표현
    @Override
    public String toString() {
        return "[" + name + "]";
    }

    // 해결하려고 한다
    protected abstract boolean resolve(Trouble trouble);

    // 해결했다 
    protected void done(Trouble trouble) {
        System.out.println(trouble + " is resolved by " + this + ".");
    }

    // 해결되지 않았다 
    protected void fail(Trouble trouble) {
        System.out.println(trouble + " cannot be resolved.");
    }
}
