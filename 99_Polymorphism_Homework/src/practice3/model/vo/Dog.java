package practice3.model.vo;

// 동물 추상클래스 가져오기
public class Dog extends Animal{
// 필드
	public static final String PLACE = "애견카페";
	private int weight;
	
// 메서드
	// setter
	public void setWeight(int weight) {
		this.weight = weight;
	}
	// getter
	public int getWeight() {
		return weight;
	}
	
	// 생성자 : 기본
	public Dog() {
		
	}
	
	// 생성자 : 필수
	public Dog(String name, String kinds, int weight) {
		super(name, kinds); // Animal 밑에 이미 있는 name, kinds를 바라보게 하기 위해서
		this.weight = weight;
	}
	
	//@Override speak ctrl + space
	@Override
	public void speak() {
		System.out.println(super.toString() + "몸무게는 " + weight + "kg 입니다");
		
	}
}
