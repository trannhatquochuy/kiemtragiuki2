package advance.dev;

class Teacher extends Person {
    protected int hesoluong;
    
    public Teacher(String name, int age, int hesoluong) {
   	 super(name, age);
   	 this.hesoluong = hesoluong;
    }
    public void getHsl(int hesoluong) {
   	 this.hesoluong = hesoluong;
    }
    public int setHsl(int hesoluong) {
   	 return this.hesoluong = hesoluong;
    }
    public double tinhluong() {
   	 double luongcoban = 1800000;
   	 return luongcoban * hesoluong;
    }
}