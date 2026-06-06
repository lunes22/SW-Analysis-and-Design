package practice.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

// 파일에서 큰 문자 데이터를 읽어들임
public class BigChar {
    // 문자의 이름 
    private char charname;
    // 큰 문자를 표현하는 문자열('#' '.' '\n'으로 이루어진 열)
    private String fontdata;

    // 생성자 
    public BigChar(char charname) {
        this.charname = charname;
        try {
            String filename = "big" + charname + ".txt"; // 읽어드리는 파일의 구조

            StringBuilder sb = new StringBuilder(); // StringBuilder: String을 만들어갈 때 사용하는 클래스
            // Files : 파일로부터 내용을 읽어드리는 클래스
            // readAllLines() : 파일에 있는 모든 라인을 읽어라
            // Path : 파일 시스템에서 파일의 경로를 관리하는 클래스
            for (String line: Files.readAllLines(Path.of(filename))) { // 파일의 각 줄을 읽어서 리스트가 만들어짐
                sb.append(line); // String을 한 줄 추가
                sb.append("\n"); // 한줄 쓰고 줄바꿈
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 큰 문자를 표시한다
    public void print() {
        System.out.print(fontdata);
    }
}
