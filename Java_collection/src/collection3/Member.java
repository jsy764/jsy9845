package collection3;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class Member implements Comparable<Member>{
	
	private Long id; // 회원번호
	private String MemberId; // 회원아이디
	private String email; // 회원 이메일
	private String password; // 회원 비밀번호
	private String birth; // 생년월일(8자리)
	private int age; // 나이
	
	@Override
	public boolean equals(Object obj) {
		Member temp = (Member)obj;
		boolean isSame = this.birth.equals(temp.birth);
		isSame = isSame && this.email.equals(temp.email);
		isSame = isSame && this.MemberId.equals(temp.MemberId);
		
		return isSame;
	}
	
	@Override
	public int compareTo(Member o) {
		// 정렬을 위한 compareTo메서드 구현
		// 정렬 기준을 정해야 한다.
		return this.birth.compareTo(o.birth)*-1;
		// return o.birth.compareTo(this.birth);
	}
	
	
	
//	public Member() {}
//	public Member(Long id, String MemberId, String password,
//				String email, String birth) {
//		this.id = id;
//		this.MemberId=MemberId;
//		this.password=password;
//		this.email=email;
//		this.birth=birth;
//	}
}
// 클래스 정의
// 인스턴스변수와 접근제어자는 private
// 인스턴스변수에 대해 get, set 메서드
// toString 메서드 만들기