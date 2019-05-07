package dailyAlgo;
import java.util.*;

//https://app.codility.com/demo/results/trainingZW5RCJ-9G2/

public class CodilityMaxProduct {

	public int solution(int[] A) {
        // write your code in Java SE 8
        
        Arrays.sort(A);
        
        int answer = 0;
        
        if (A[0]*A[1] > A[A.length-2]*A[A.length-3]) {
            answer = A[0]*A[1]*A[A.length-1];
        } else {
            answer = A[A.length-1]*A[A.length-2]*A[A.length-3];
        }
        
        return answer;
    }

}
