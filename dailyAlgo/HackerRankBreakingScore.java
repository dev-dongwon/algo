package dailyAlgo;

public class HackerRankBreakingScore {

	// https://www.hackerrank.com/challenges/breaking-best-and-worst-records/problem
	
	 static int[] breakingRecords(int[] scores) {

	        int bestTemp = scores[0];
	        int worstTemp = scores[0];
	        int best = 0;
	        int worst = 0;
	        for (int i=1; i<scores.length; i++) {
	            if (bestTemp < scores[i]) {
	                best++;
	                bestTemp = scores[i];

	            } 
	            
	            if (worstTemp > scores[i]) {
	                worst++;
	                worstTemp = scores[i];
	            }
	        }

	        int[] answer = new int[2];
	        answer[0] = best;
	        answer[1] = worst;

	        return answer;

	    }
	
}
