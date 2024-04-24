package advance.dev;

class Person {
	 protected String name;
	 protected int age;
   
	 public Person(String name, int age) {
		 this.name = name;
		 this.age = age;
	 }
	 public void getName(String name) {
		 this.name = name;
	 }
	 public String setName(String name) {
		 return this.name = name;
	 }
	 public void getAge(int age) {
		 this.age = age;
	 }
	 public int setAge(int age) {
		 return this.age = age;
	 }
}