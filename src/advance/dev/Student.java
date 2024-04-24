package advance.dev;
class Student extends Person {
    protected double toan;
    protected double ly;
    protected double hoa;
    
    public Student(String name, int age, double toan, double ly, double hoa) {
 	   super(name, age);
 	   this.toan = toan;
 	   this.ly = ly;
 	   this.hoa = hoa;
    }
    public void getToan(double toan) {
 	   this.toan = toan;
    }
    public double setToan(double toan) {
 	   return this.toan = toan;
    }
    public void getLy(double ly) {
 	   this.ly = ly;
    }
    public double setLy(double ly) {
 	   return this.ly = ly;
    }
    public void getHoa(double hoa) {
 	   this.hoa = hoa;
    }
    public double setHoa(double hoa) {
 	   return this.hoa = hoa;
    }
    public double diemtrungbinh() {
 	   return (toan + ly + hoa) / 3;
    }
}