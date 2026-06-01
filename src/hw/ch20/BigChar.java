package hw.ch20;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class BigChar {
    private char charname;
    private String fontdata;
    private static final String RESET = "\u001B[0m";

    public BigChar(char charname) {
        this.charname = charname;
        try {
            String filename = "src/big" + charname + ".txt";
            StringBuilder sb = new StringBuilder();
            for (String line: Files.readAllLines(Path.of(filename))) {
                sb.append(line);
                sb.append("\n");
            }
            this.fontdata = sb.toString();
        } catch (IOException e) {
            this.fontdata = charname + "?";
        }
    }

    // 기존 메소드 — 수정하지 않음
    public void print() {
        System.out.print(fontdata);
    }

    // 추가된 오버로드 메소드
    public void print(String colorCode) {
        System.out.print(colorCode + fontdata + RESET);
    }
}