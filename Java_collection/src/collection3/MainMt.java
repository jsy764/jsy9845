package collection3;

import java.util.ArrayList;
import java.util.Collections;

public class MainMt {

	public static void main(String[] args) {
//		ArrayList<Member> list = new ArrayList<>();
//		
//		list.add(new Member(1l, "jsy", "aa_nen@naver.com", "1234", "20001214"));
//		
//		list.add(new Member(2l, "dw", "dw@gmail.com", "1234", "19800728"));
//		
//		System.out.println(list);
		
		MemberDao dao = new MemberDao();
		
		ArrayList<Member> memberList = dao.select();
		
		for(Member m : memberList) {
			System.out.println(m);
		}
		// 이메일로 아이디와 비밀번호를 조회하기!
		String email = "brown@gmail.com";
		for(Member mem : memberList) {
			if(mem.getEmail().equals(email)) {
				System.out.println(mem.getMemberId());
				System.out.println(mem.getPassword());
				break;
			}
		}
		
		// 타입에 대해서도 비교하기 때문에 동일한 타입으로 비교할 수 있게
//		Member 대상 = new Member();
//		대상.setEmail(email);
//		
//		for(int i = 0; i < memberList.size(); i++) {
//			Member cmp = memberList.get(i);
//			if(cmp.equals(대상)) {
//				System.out.println("찾음");
//			}
//		}
		
		Member 장은호 = new Member();
		장은호.setBirth("19970818");
		장은호.setEmail("babo@daum.net");
		장은호.setMemberId("kkk1");
		
		System.out.println(memberList.contains(장은호));
		System.out.println(memberList.indexOf(장은호));
		
		System.out.println("apple".compareTo("apple"));
		Collections.sort(memberList);
		for(Member m: memberList) {
			System.out.println(m.getId()+" "+m.getMemberId()+" "+
									m.getAge());
		}
		
		
	}

	

}
