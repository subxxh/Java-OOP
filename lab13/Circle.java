public class Circle {
    private static final double PI = 3.14159;
    private static int count = 0;
    private int radius;

    public Circle(int radius) {
        if (radius < 1) {
            throw new IllegalArgumentException( "Radius needs to be greater than one.");
        }
        this.radius = radius;
        count++;
    }

    public Circle() {
        this(1); //constructor chaing
    }

    public Circle(Circle c) {
        this(c.radius);
    }

    public static int getCount() {
        return count;
    }
    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        if (radius < 1) {
            throw new IllegalArgumentException( "Radius needs to be greater than one.");
        }
        this.radius = radius;
    }

    public double area() {
        return PI * radius * radius;
    }

    public double perimeter () {
        return 2 * PI * radius;
    }

    public void draw(char ch) {
        for (int i = radius; i >= -radius; i--) {
            for (int j = -radius; j <= radius; j++) {
                if (j * j + i * i <= radius * radius) {
                    System.out.print(ch); 
                } else {
                    System.out.print(" "); 
                    }
                }
            System.out.println(); 
            }
        }

    }
