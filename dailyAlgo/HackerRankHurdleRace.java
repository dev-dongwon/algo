package dailyAlgo;

//https://www.hackerrank.com/challenges/the-hurdle-race/problem

public class HackerRankHurdleRace {
	static int hurdleRace(int k, int[] height) {

		int max = height[0];
		int answer = 0;

		for (int i = 1; i < height.length-1; i++) {
			if (height[i] > max)
				max = height[i];
		}

		if (max >= k) {
			answer = max - k;
		} 

		return answer;
	}

}
