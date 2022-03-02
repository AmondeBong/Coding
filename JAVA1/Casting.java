
public class Casting{
    public static void main(String[] args){
        double a = 1.1;
        System.out.println(a);

        double b = 1; // double b = (double) 1; 
        System.out.println(b); // 손실이 없어 자동으로 캐스팅

        // int c = 1.1; 강제로 변수 형태를 바꾸는 방법
        double c = 1.1;
        System.out.println(c);
        int d = (int) 1.1; 
        System.out.println(d);

        String Str1 = Integer.toString(1); // 숫자1을 String으로 캐스팅
        System.out.println(Str1 + Str1); // 11
        System.out.println(Str1.getClass()); // 변수의 데이터 타입을 알려줌


        
    }
}