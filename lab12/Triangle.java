public class Triangle {

    private int width;
    private boolean isRotated;

    public Triangle() {
        width = 1;
        isRotated = false;
    }

    public Triangle(int width) {
    this(width, false); // Triangle2 wont work unless i dont do boolean in the parameters
}

    public Triangle(int width, boolean isRotated) {
        this.setWidth(width);
        this.isRotated = isRotated;
    }


    public Triangle(Triangle t) {
       this(t.width, t.isRotated);
    }
    

    public int getWidth() {
        return width;
    }
    public boolean isRotated () {
        return isRotated;
    }

    public void setWidth(int width) {
        if (width < 1) {
            throw new IllegalArgumentException(width + " is not a valid width");
        }
            this.width = width;
    }

    public void rotate() {
        //toggle? true or false flip
            this.isRotated = !isRotated;
    }

    public double area() {
        return ((width*width) / 2.0);
    }

    public double perimeter() { 
      double hypotenuse = Math.sqrt(2 * (width * width));
      return hypotenuse + (2 * width);
    } 

public void draw(char ch) {
    if (isRotated) {
        for (int i = width; i >= 1; i--) {
            for (int j = 1; j <= width; j++) {
                if(j < i) {
                        System.out.print(" ");
                    } else {
                System.out.print(ch);
            }
            }
             System.out.println();
            }
        } else {
        for (int i = 1; i <= width; i++) {
            for (int j = 1; j <= i; j++){
                System.out.print(ch);
        }
            System.out.println();
        }
    }
}

}



