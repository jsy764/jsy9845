package study0220;

public class Member {
	String userId;
	String password;
	long id;
	
	Member(){}
	Member(String userId, String password, long id){
		this.userId=userId;
		this.password=password;
		this.id=id;
	}
	
	public String toString() {
		return "아이디 : "+this.userId+
				" 비밀번호 : "+this.password+
				" 회원번호 : "+this.id;
	}
	
	void output() {
		System.out.println("아이디 : "+this.userId+
				" 비밀번호 : "+ this.password+
				" 회원번호 : "+ this.id);
	}
	
	
}
