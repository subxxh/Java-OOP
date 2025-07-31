public class Triangle extends Shape2D {
    private int width;

    public Triangle() {
        this(1);
    }

    public Triangle(int width) {
        super(); //sets color to red by calling 2d which calls og shape
        this.setWidth(width);
}

    public int getWidth() {
        return width;
    }

    public Triangle setWidth(int width) {
        if (width <= 0) {
            throw new IllegalArgumentException("Invalid width" + width);
        } 
        this.width = width;
        return this;
    }


    public Triangle setColor(Color color) {
        super.setColor(color); //super gets setcolor from shape
        return this;
    }

    @Override
    public String toString() {
        return "Triangle: {color:" + super.getColor() + ", width:" + width + "} ";
    }

    @Override
    public boolean equals(Object o) {
        if (o != null) {
            if (o instanceof Triangle) { //this makes sure not null and belongs to triangle
                Triangle other = (Triangle) o; //passes o to triangle
                if (this.width == other.width) 
                return true;
            }
        }
            return false;
    }

    @Override
    public int hashCode() {
        int result = 1; //should be greater than 0  
        result = 31 * result + width;
        return result;
    }

    public double perimeter() { 
        double hypotenuse = Math.sqrt(2 * (width * width));
        return hypotenuse + (2 * width);
      } 

    public double area() {
        return ((width * width) / 2.0);
    }

    public void draw(char ch) {
            for (int i = 1; i <= width; i++) {
                for (int j = 1; j <= i; j++){
                    System.out.print(ch);
            }
                System.out.println();
            }
        }
    


}