package algo;

public class Sum {
	
//�� ���� ������ ��
//		���� ����
//		�� ���� a, b�� �־����� �� a�� b ���̿� ���� ��� ������ ���� �����ϴ� �Լ�, solution�� �ϼ��ϼ���. 
//		���� ��� a = 3, b = 5�� ���, 3 + 4 + 5 = 12�̹Ƿ� 12�� �����մϴ�.
	//
//		���� ����
//		a�� b�� ���� ���� �� �� �ƹ� ���� �����ϼ���.
//		a�� b�� -10,000,000 �̻� 10,000,000 ������ �����Դϴ�.
//		a�� b�� ��Ұ���� ���������� �ʽ��ϴ�.
	
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
