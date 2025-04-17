public class Ch03_Variable {

  public static void main(String[] args) {
    // 변수
    int a; // 변수 선언
    a = 1; // 변수 할당

    System.out.println("a + 1 = " + (a + 1));

    // 숫자 변수 선언

    System.out.println("==========정수 변수 선언==========");
    // 1. 정수(... -2, -1, 0, 1, 2...) 변수 선언
    // 키워드: int
    int num2;
    num2 = 4;
    System.out.println("int = " + (num2));

    System.out.println("==========실수 변수 선언==========");
    // 2. 실수(...-0.2, -0.1, 0, 0.1, 0.2...) 변수 선언
    // 키워드: double
    double num3;
    num3 = 1.1;
    System.out.println("double = " + (num3));
    
    // 만약 실수에 정수 변수 선언문인 int를 사용하면 에러가 난다.
    // int num4 = 1.2; error;
    
    // 해결방법 1. 변수 선언문 수정
    // double num4 = 1.2;
    
    // 해결방법 2. 강제 할당
    // int num4 = (int) 1.2;
    
    
    System.out.println("==========문자열 변수 선언==========");
    // 문자열 변수 선언
    // 키워드: String
    
    String str1;
    str1 = "hello world";
    System.out.println("String str1 = " + str1);
    
    // 문자열 결합
    String str2 = "hello";
    String str3 = " Lion";
    System.out.println(str2 + str3);
    
    
    System.out.println("==========변수의 효용==========");
    // 변수의 효용

    

  }
}