import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
public class JavaStudy07_2 {
    public static void main(String[] args) {
        try {
            File file =  new File("out.txt"); //이클립스랑 좀 다르다.
            Scanner sc = new Scanner(file); //file의 입력값을 가져오라는 뜻
            while(sc.hasNextInt()) {
                System.out.println(sc.nextInt()*1000);
            }
            sc.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
            //try와 catch: 괄호안의 내용은 파일을 찾을수 없다면 그 에러의 내용을 화면에 출력하라는 것
        }
    }
}
