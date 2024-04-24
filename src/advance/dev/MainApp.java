package advance.dev;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {
    	Person[] persons = new Person[5];
    	input(persons);
    	print(persons);
    }
    public static void input(Person[] persons) {
    	Scanner sc = new Scanner(System.in);
    	for(int i = 0; i < persons.length; i++) {
    		if(i < 2) {
    			System.out.println("Giáo viên thứ "+(i + 1)+":"+persons[i]);
    			System.out.print("Nhập name: ");
    			String name = sc.nextLine();
    			System.out.print("Nhập age: ");
    			int age = sc.nextInt();
    			System.out.print("Nhập hệ số lương: ");
    			int hesoluong = sc.nextInt();
    			persons[i] = new Teacher(name, age, hesoluong);
    		}else if(i < 3) {
    			System.out.println("Sinh viên thứ "+(i + 1)+":");
    			System.out.print("Nhập name: ");
    			String name = sc.nextLine();
    			System.out.print("Nhập age: ");
    			int age = sc.nextInt();
    			System.out.print("Nhập điểm toán: ");
    			double toan = sc.nextDouble();
    			System.out.print("Nhập điểm lý: ");
    			double ly = sc.nextDouble();
    			System.out.print("Nhập điểm hoá: ");
    			double hoa = sc.nextDouble();
    			persons[i] = new Student(name, age, toan, ly, hoa);
    		}
    	}
    }
    public static void print(Person[] persons) {
    	for(Person person : persons) {
    		System.out.println("Thông Tin của Persons: ");
    		if(person instanceof Teacher) {
    			Teacher teacher = (Teacher) person;
    			System.out.println("Nhập name: "+teacher.name+"\nNhập age: "+teacher.age+"\nNhập Hệ số lương: "+teacher.hesoluong);
    			System.out.println("Tính Lương: "+teacher.tinhluong());
    		}else if(person instanceof Student) {
    			Student student = (Student) person;
    			System.out.println("Nhập name: "+student.name+"\nNhập age: "+student.age+"\nNhập điểm toán: "+student.toan+"\nNhập điểm lý: "+student.ly+"\nNhập điểm hoá: "+student.hoa);
    		    System.out.println("tính điểm trung bình: "+student.diemtrungbinh());	
    		}
    	}
    }
}