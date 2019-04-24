package dailyAlgo;

import java.util.Arrays;

public class HackerRankSockMerchant {
	
//	https://www.hackerrank.com/challenges/sock-merchant/problem?h_l=interview&playlist_slugs%5B%5D=interview-preparation-kit&playlist_slugs%5B%5D=warmup
	
//	Function Description
//
//	Complete the sockMerchant function in the editor below. It must return an integer representing the number of matching pairs of socks that are available.
//
//	sockMerchant has the following parameter(s):
//
//	n: the number of socks in the pile
//	ar: the colors of each sock
	
    static int sockMerchant(int n, int[] ar) {

        Arrays.sort(ar);
        int answer = 0;
        
        for (int i=1; i<n; i++) {
            if (ar[i] == ar[i-1]) {
                answer++;
                ar[i] = -1;
            }
        }
        
        return answer;
    }
}
