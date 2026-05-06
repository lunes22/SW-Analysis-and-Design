package practice.ch12;

// 중심 컴포넌트(문자열을 표시함)
public class StringDisplay extends Display {
    private String string; // 표시 문자열  : "Hello, world."

    public StringDisplay(String string) {
        this.string = string;
    } // 표시문자열을 받아 보관

    @Override
    public int getColumns() {
        return string.length(); // = 문자열의 길이 = 12
    }

    @Override
    public int getRows() {
        return 1; // 행수는 1
    }

    @Override
    public String getRowText(int row) {
        if (row != 0) {
            throw new IndexOutOfBoundsException(); // 배열의 범위를 벗어난 예외
        }
        return string;
    }
}
