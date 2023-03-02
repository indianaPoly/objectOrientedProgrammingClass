// public class의 이름을 사용하기 위해서는 클래스명과 파일명이 일치해야 됩니다.
public class Animal {
  private String name;
  private int age;

  public Animal(String name, int age) {
    this.name = name;
    this.age = age;
  }

  /*
   * 단축키 cmd + shift + p 이후 generate get and set method
   */
	public String getName() {
		return this.name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return this.age;
	}

	public void setAge(int age) {
		this.age = age;
	}
}