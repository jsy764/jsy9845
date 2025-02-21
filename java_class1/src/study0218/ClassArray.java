package study0218;

public class ClassArray {

	public static void main(String[] args) {
//		Member mem = new Member();
//		mem.name="김유신";
//		mem.job="군인";
//		mem.age=38;
//		String name = new String();
//		String[] names = new String[3];
		
//		Member[] members = new Member[5];
//		// 5명의 정보를 저장만 하고 사용할 수 없음
//		for(int i=0; i<members.length; i++)
//			members[i]=new Member();
//		
//		members[0].job="경찰관";
//		members[0].name="박문수";
//		members[0].age=34;
//		members[1].name="이순신";
//		members[1].job="군인";
//		members[1].age=31;
//		members[2].name="문익점";
//		members[2].age=45;
//		members[2].job="산업스파이";
//		for(int i=0; i<members.length; i++) {
//			System.out.println(members[i].name);
//			System.out.println(members[i].job);
//			System.out.println(members[i].age);
//		}
		
//		Movie movie = new Movie();
//		movie.title = "국제시장";
//		movie.genre = "드라마";
//		movie.audience = 14260000;
//		movie.release = 2024;
//		
//		System.out.println("영화제목 : "+movie.title);
//		System.out.println("장르 : "+movie.genre);
//		System.out.println("관객수 : "+movie.audience);
//		System.out.println("개봉년도 : "+movie.release);
		
//		Member info = new Member();
//		System.out.println(info);
//		System.out.println(info.name);
//		
//		Member m1 = new Member();
//		System.out.println(m1.name);
		
		Member info = new Member(20, "군인", "김유신");
		System.out.println(info.job);
		
		
	}

}

/*
	영화제목, 장르, 관객수, 개봉년도

	위 항목의 데이터를 저장할 수 있는 클래스를 정의
	영화 한편에 대한 데이터 입력하고 출력까지
*/