import java.io.FileNotFoundException;
import java.io.PrintWriter; //pakage를 가져오는 과정

public class InstanceApp{
    public static void main(String[] args) throws FileNotFoundException{
      PrintWriter p1  = new PrintWriter("result1.txt"); //result1.txt 생성 
      //new 뒤에있는것 constructor, p1는 instance, instance에 올수있는 값을 규제하기 위해 앞에 class 이름 붙이기
      p1.write("Hello 1"); //result1.txt에 글씨쓰기
      p1.close(); //닫기

      PrintWriter p2 = new PrintWriter("result2.txt");
      p2.write("Hello 2");
      p2.close();
    }
}