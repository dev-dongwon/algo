package dailyAlgo;

public class HackerRankCountingValleys {

//	https://www.hackerrank.com/challenges/counting-valleys/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup&h_r=next-challenge&h_v=zen
	
    static int countingValleys(int n, String s) {
    	
    	String[] str = s.split("");
    	int[] result = new int[str.length];
    	
    	int height = 0;
    	
    	for (int i=0; i<str.length; i++) {
    		if (str[i].equals("U")) {
    			height++;
    		} else {
    			height--;
    		}
    		result[i] = height;
    	}
    	
    	int answer = 0;
    	
    	for (int i=1; i<result.length; i++) {
    		if (result[i-1] < 0 && result[i] == 0) {
    			answer++;
    		}
    	}
    	
    	return answer;

    }
	
}
