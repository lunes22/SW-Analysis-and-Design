package practice.ch15.pagemaker;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

// 퍼사드 역할을 하는 클래스
public class PageMaker {
    private PageMaker() {
    }


    // 하이 레벨 API
    public static void makeWelcomePage(String mailaddr, String filename) {
        try {
            Properties mailprop = Database.getProperties("maildata"); // 프로퍼티를 읽어옴
            String username = mailprop.getProperty(mailaddr); // 메일 주소(key)를 통해 이름(value)를 얻음
            HtmlWriter writer = new HtmlWriter(new FileWriter(filename));
            
            writer.title(username + "'s web page");
            writer.paragraph("Welcome to " + username + "'s web page!");
            writer.paragraph("Nice to meet you!");
            writer.mailto(mailaddr, username);
            writer.close();
            
            System.out.println(filename + " is created for " + mailaddr + " (" + username + ")");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
