package step2;

import java.util.Arrays;
import java.util.Comparator;

public class Programmers42746 {

	/*
	문제 설명
	0 또는 양의 정수가 주어졌을 때, 정수를 이어 붙여 만들 수 있는 가장 큰 수를 알아내 주세요.

	예를 들어, 주어진 정수가 [6, 10, 2]라면 [6102, 6210, 1062, 1026, 2610, 2106]를 만들 수 있고, 이중 가장 큰 수는 6210입니다.

	0 또는 양의 정수가 담긴 배열 numbers가 매개변수로 주어질 때, 순서를 재배치하여 만들 수 있는 가장 큰 수를 문자열로 바꾸어 return 하도록 solution 함수를 작성해주세요.

	제한 사항
	numbers의 길이는 1 이상 100,000 이하입니다.
	numbers의 원소는 0 이상 1,000 이하입니다.
	정답이 너무 클 수 있으니 문자열로 바꾸어 return 합니다.
	
			입출력 예

	numbers				return
	[6, 10, 2]			6210
	[3, 30, 34, 5, 9]	9534330
	*/
	
    public static String solution(int[] numbers) {
    	String answer = "";
    	
    	String[] strArr = new String[numbers.length];
    	
    	for (int i=0; i<numbers.length; i++) {
    		strArr[i] = Integer.toString(numbers[i]);
    	}
    	
    	
    	Arrays.sort(strArr, new Comparator<String>() {
    		@Override
    		public int compare(String o1, String o2) {

//    			if (Integer.parseInt(o1 + o2) > Integer.parseInt(o2 + o1)) {
//    				return -1;
//    			}
//    			return 1;

//				이렇게 구현하면 시간 초과 런타임 에러가 나 버린다
//				파스 인트에는 생각보다 많은 메모리 비용이 드는 모양  			
  
    			 return (o2+o1).compareTo(o1+o2);
    			
    		}
		});

    	
    	if (strArr[0].equals("0")) {
    		return "0";
    	}

    	for (String temp : strArr) {
    		answer += temp;
    	}

    	
//    	if (Integer.parseInt(answer) == 0) {
//    		return "0";
//    	}
//    	이렇게 구현해도 런타임 에러가 나 버린다
    	
    	
    	return answer;
    }
    
    // 빡빡한 시간 난이도... Integer.ParseInt를 사용할 경우, 여지없이 런타임 에러가 나 버린다.
    // Array 대신 List를 사용해 컬렉션 소트를 사용할 경우에도 런타임 에러가 나 버린다.
    // 비교를 위해 컴페레이터를 구현할 떄도 처음에는 Integer.ParseInt로 비교하니 여지없이 런타임 에러...
    // 최대한 간결하게 문제푸는 연습을 해야겠다. parseInt 사용을 즐겨해왔는데, 꼭 필요할 때만 써야겠다는 생각도 든다.
    // 비교를 위해 comparator 구현과 개념을 한 번 더 살펴봐야겠다.

}
