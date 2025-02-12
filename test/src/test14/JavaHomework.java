package test14;

public class JavaHomework {

	public static void main(String[] args) {
		// 오늘의 과제는 랜덤 범위 1~50의 랜덤 숫자 중에서 짝수 15개를 배열에 저장하고 15개 전부 저장되면 배열을 출력해하. 슛자 중복은 상관없음
		int[] arr = new int[50];
		int num=0, i=0;
		while(true) {
			num=(int)(Math.random()*50+1);
			if(num%2==0) {
				arr[i]=num;
				i++;
			}
			if(arr[14]!=0)
				break;
		}
		for(int j=0; j<15; j++) {
			System.out.print(arr[j]+" ");
		}
		
		
		
		
		
		
	}

}
