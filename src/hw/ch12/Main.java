package hw.ch12;

public class Main {
    public static void main(String[] args) {
        MultiStringDisplay md = new MultiStringDisplay();
        md.add("Hello, Java!");
        md.add("Decorator Pattern");
        md.add("is powerful.");

        System.out.println("===== [2-1] 원본 출력 =====\n");
        md.show();

        Display d1 = new NumberedBorder(md);
        System.out.println("\n===== [2-2] NumberedBorder 단독 적용 =====\n");
        d1.show();

        Display d2 = new FullBorder(new NumberedBorder(md));
        System.out.println("\n===== [2-3] FullBorder + NumberedBorder 조합 =====\n");
        d2.show();


        Display d3 = new SideBorder(new NumberedBorder(new FullBorder(md)), '*');
        System.out.println("\n===== [2-4] SideBorder + NumberedBorder + FullBorder 3 단 중첩 =====\n");
        d3.show();
    }
}
