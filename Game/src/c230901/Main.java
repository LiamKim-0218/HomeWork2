package c230901;

public class Main {
	  public static void main(String[]args) throws Exception {
		//   Week week = Week.FRIDAY;
		//   week = Week.SUNDAY;
		//   switch(week) {
		//   case SUNDAY:
//		      System.out.println("일요일이다");
//		      break;
		//   }
		  
		  int num = 1;
		  int studentNum = 1; // 카멜형 student number
		  int StudentNum = 1; // 파스칼형 카멜형 + 첫 문자 대문자
		  int student_num = 1; // 스네이크형
		  // int student-num = 1; // 케밥형
		  // int IntStudentNum = 1; // 헝가리안 표기법 << 이렇게 쓰는 사람이 있으면 뒤통수를 때리면 된다.
		  System.out.println(num);
		  
		  StringTest stringTest = new StringTest();
		  stringTest.stringTest();
		  
		  StrBuilderTest.strBuilderTest();
		  MathTest.Test();
		  Wrapper.test();
		  DateTest.test();
		  
		  
		  
	  }
}
