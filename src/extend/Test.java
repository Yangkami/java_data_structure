package extend;

//明白 entends执行的过程
public class Test {
    public static void main(String[] args)  {
        new Circle();
    }
}
 
class Draw {
     
    public Draw(String type) {
        System.out.println(type+" draw constructor");
    }
}
 
class Shape {
    private Draw draw = new Draw("shape1");
     
    public Shape(){
        System.out.println("shape constructor");
    }
}
 
class Circle extends Shape {
    private Draw draw = new Draw("circle");
    public Circle() {
        System.out.println("circle constructor");
    }
}