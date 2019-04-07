package step0;

public class Sum {
	  public long solution(int a, int b) {
	      long answer = 0;
	      int m, n = 0;
	      
	      if (a > b) {
	          m = a;
	          n = b;
	      } else {
	          n= a;
	          m=b;
	      }
	      
	      for (int i=n;i<=m;i++) {
	          answer+=i;
	      }
	      
	      return answer;
	  }

}
