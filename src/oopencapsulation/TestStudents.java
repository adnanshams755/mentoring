package oopencapsulation;

public class TestStudents {

	public static void main(String[] args) {
		
		
		Students student1 = new Students();
		student1.setStName("Rajib");
		student1.setStId(731);
		student1.setDob("12th June,1983");
		
		
		System.out.println(student1.getStName()+" "+student1.getStId()+" "+student1.getDob());
		
    }
}