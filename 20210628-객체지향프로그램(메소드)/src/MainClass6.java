// 반복 제거

public class MainClass6 {
	void connection() {
		System.out.println("오라클 드라이버 종료");
		System.out.println("오라클 연결");
	}
	void disconnection() {
		System.out.println("오라클 드라이버 해제");
		System.out.println("오라클 연결 종료");
	}
	void select() {
		connection();
		System.out.println("SELECT 문장 수행");
		System.out.println("오라클 결과값 읽기");
		disconnection();
	}
	
	void insert() {
		connection();
		System.out.println("insert 문장 수행");
		System.out.println("오라클 데이터 삽입");
		disconnection();
	}
	
	void update() {
		connection();
		System.out.println("Update 문장 수행");
		System.out.println("오라클 데이터 수정");
		disconnection();
	}
	void delete() {
		connection();
		System.out.println("delete 문장 수행");
		System.out.println("오라클 데이터 삭제");
		disconnection();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		MainClass6 m=new MainClass6(); // m => select(), insert(), update(), delete()
		m.select();
		m.insert();
		m.update();
		m.delete();
		m.connection();
		m.disconnection();
	}

}
