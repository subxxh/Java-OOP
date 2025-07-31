public class Triangle {

    public int width;

    //default no args n then parameterized n then copy n then method area peri draw
    public Triangle() {
        width = 1;
    }

    public Triangle(int width) {
        this.width = width;
    }

    public Triangle(Triangle t) {
       this(t.width);
    }
    
    public double area() {
        return ((width*width) / 2.0);
    }

    public double perimeter() { 
      double hypotenuse = Math.sqrt(2 * (width * width));
      return hypotenuse + (2 * width);
    } 

    public void draw(char c) { 
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= width; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) {
                System.out.print(c);
            }
            System.out.println();
        }
    } 
}
