public class Main {
   public static void main(String[] args) {
	  String str = "원본";
	  str.concat(",One="); 
      StringBuilder sb = new StringBuilder("원본");      // 기본 생성자도 있고 미리 입력하는 생성자도 있다.
      
//      sb.append(",One=");
//      sb.append(225.0);                   // 그렇기때문에 문자열들을 합칠때 StringBuilder를 쓰면 된다.
//      sb.append(",One=").append(1).append(",DoubleValue=").append(225.0); // 이처럼 더 편하게 쓸 수 있다.
      
//      	StringBuffer sbuffer;
      
//      sb.reverse();  // 값을 거꾸로 출력 가능하다.
      
//      sb.setCharAt(0, '장');   // 인덱스 위치의 문자를 바꾸고 싶다   // 수정하는 개념
//      sb.replace(start, end, str);
//      sb.insert(0, "시작");   // 인덱스 위치에 문자를 추가한다. // 추가하는 개념
      
      String result = sb.toString();
      System.out.println(result);
      
//      String str = "원본 문자열";
//      
//      String other = "다른 문자열";
//      String origin = "원본 문자열";
//      
//      String concat = str + other;
//      
//      System.out.println("원본 문자열 다른 문자열" == concat);      // 가지는 값은 같으나 참조하는 인스턴스가 다르다.
//      
//      System.out.println(str == origin);
   }
}