package kr.ac.kopo.memberProject;

public class Member {
	String id;
	String password;
	String name;
	String addr;


	public Member() {
	}

	public Member(String id, String password, String name, String addr) {
		this.id = id;
		this.password = password;
		this.name = name;
		this.addr = addr;
	}



	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	
	public void setAddr(String addr) {
		this.addr = addr;
	}
	
	public String getAddr() {
		return addr;
	}
}
