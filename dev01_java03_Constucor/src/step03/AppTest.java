package step03;

public class AppTest {

   public static void main(String[] args) {
      
      /*
       name = "아무개"
       gender = "남자"
       job = "백수"
       tell = null
       */
	   
      Man m01 = new Man();
      System.out.println(m01);
      
      /*
       name = "김준성"
       gender = "남자"
       job = "백수"
       tell = null
       */
      Man m02 = new Man("김준성");
      System.out.println(m02);
      /*
       name = "김준성"
       gender = "여자"
       job = "백수"
       tell = null
       */
      Man m03 = new Man("김준성","여자");
      System.out.println(m03);
      /*
       name = "김준성"
       gender = "여자"
       job = "프로그래머"
       tell = null
       */
      Man m04 = new Man("김준성","여자","프로그래머");
      System.out.println(m04);
      /*
       name = "김준성"
       gender = "여자"
       job = "프로그래머"
       tell = "01040633145"
       */
      Man m05 = new Man("김준성","여자","프로그래머","01040633145");
      System.out.println(m05);
      
      
   }

}