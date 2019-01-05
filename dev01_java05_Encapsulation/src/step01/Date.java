package step01;

/*
 * Encapsulation - 캡슐화.
 * 변수는 외부에서 접근하지 못하게 하고
 * 메서드를 통한 주입만 가능하게 한다.
 * 메서드에서 값을 체크 하기 때문.
 */
public class Date {
   private int year;
   private int month;
   private int day;
   
   private String errMsg;
   
   public Date(){
	   errMsg = "유효한 날짜가 아닙니다.";
   }
   
   public int getYear() {
      return year;
   } 
   public void setYear(int year) {
      this.year = year;
   }
   
   public int getMonth() {
      return month;
   }
   
   public void setMonth(int month) {
	  if(month >= 1 && month <= 12){
		  this.month = month;
	  }else{
		  System.out.println(errMsg);
	  }
   }
   
   public int getDay() {
	   return day;
   }
   
   public void setDay(int day) {
	   if(month >= 1 && month <=12){
		   switch (month) {
		   	case 2:
		   		if(day >=1 && day <=28){
		   			this.day = day;
		   		}else{
		   			System.out.println(errMsg);
		   		}
		   		break;
		   	case 4: case 6: case 9: case 11:
		   		if(day >=1 && day <=30){
		   			this.day = day;
		   		}else{
		   			System.out.println(errMsg);
		   		}
		   		break;
		   	case 1: case 3: case 5: case 7: case 8: case 10: case 12:
		   		if(day >=1 && day <=31){
		   			this.day = day;
		   		}else{
		   			System.out.println(errMsg);
		   		}
		   		break;
		   }
	   }else{
		   System.out.println(errMsg);
	   }
   }
   
   public String toDay(){
	   return year + "-" + month + "-" + day;
   }
   
//   public String toDay() {
//	  String result = "";	// 최종 결과 반환
//	  String date = year + "-" + month + "-" + day;
//	  
//	  String errMsg = "유효한 날짜가 아닙니다.";  
//	  
//	  // 월 체크
//	  if(month >= 1 && month <=12){
//		  
//		  switch (month) {
//			case 2:
//				if(day >=1 && day <=28){
//					result = date;
//				}else{
//					result = errMsg;
//				}
//				break;
//				
//			case 4: case 6: case 9: case 11:
//				if(day >=1 && day <=30){
//					result = date;
//				}else{
//					result = errMsg;
//				}
//				break;
//				
//			case 1: case 3: case 5: case 7: case 8: case 10: case 12:
//				if(day >= 1 && day <= 31){
//					result = date;
//				}else{
//					result = errMsg;
//				}
//				break;
//				
//			default:
//				result = errMsg;
//				break;
//			}
//		  
//	  }else{
//		  result = errMsg;
//	  }
//	  
//	  
//	  return result;
//	  
//
//   }
}