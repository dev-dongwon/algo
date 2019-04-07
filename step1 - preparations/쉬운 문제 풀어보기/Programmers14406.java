package step1;

public class Programmers14406 {

	//	2부터 N까지의 모든 소수의 합을 구하세요.
	//	N이 7이라면 {2,3,5,7} = 17을 출력 하시면 됩니다.
	//	N의 범위는 2이상 10,000,000이하 입니다.
	//	효율성 테스트의 모든 시간 제한은 1초입니다.
	
	public static long solution(int N) {
		
		boolean[] erastos = new boolean[N + 1];
		long answer = 0;
		
		for (int i=2; i<=N; i++) {
			if (!erastos[i]) {
				answer += 1;
			}
			
			for (int j=i; j<=N; j+=i) {
				erastos[j] = true;
			}
		}
		
		return answer;
	}
	
	// case 통과에서 시간 초과로 계속 통과 못해서 찾아보니 '에라스토스테네스의 체' 라는 것이 있다
	// 방법은
	// 1. 2부터 시작해 자신의 배수는 모두 지우고
	// 2. 3부터 시작해 자신의 배수는 모두 지우고
	// 3. 4는 1의 과정에서 지워졌으므로 5부터 시작해 배수를 모두 지우고...
	// 4. 이상을 계속 반복하면 배열 구간에서 false 인 것만 소수가 된다
	// 5. false 인 것만 계속 더해주면 소수의 합은 구해진다
	
	// 출처 : https://wilybear.tistory.com/64 (여기선 c++);
}


