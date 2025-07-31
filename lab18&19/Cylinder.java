public class Cylinder extends Shape3D{
    private int radius, height;

    public Cylinder() {
        this(1,1);
    }

public Cylinder(int radius, int height) {
    super();
    this.setRadius(radius);
    this.setHeight(height);
}

public int getRadius() {
    return radius;
}

public int getHeight() {
    return height;
}

public Cylinder setRadius(int radius) {
    if (radius <= 0) {
        throw new IllegalArgumentException( "Invalid radius " + radius);
    }
    this.radius = radius;
    return this;
}

public Cylinder setHeight(int height) {
    if (height <= 0) {
        throw new IllegalArgumentException(" Invalid height " + height);
    }
    this.height = height;
    return this;
}

public Cylinder setColor(Color color) {
    super.setColor(color);
    return this;
}

public double area() {
    return (2 * Math.PI * radius * (radius + height));
}

public void draw(char ch) {
        drawCircle(ch);
        drawRectangle(ch);
        drawRevCircle(ch);
}

public void drawCircle(char ch) {
    for (int i = radius; i >= 0; i--) {
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



public void drawRectangle(char ch) {
    for (int i = 0; i < 2 * height; i++) {
        for (int j = 0; j < 2 * radius + 1; j++) {
            System.out.print(ch);
        }
        System.out.println();
    }
}

public void drawRevCircle(char ch) {
    for (int i = 0; i <= radius; i++) {
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



public double volume() {
    return (Math.PI * (radius * radius) * height);
}

@Override
public boolean equals(Object o) {
    if (o != null) { 
        if (o instanceof Cylinder) {
            Cylinder other = (Cylinder) o;
            if (this.radius == other.radius && this.height == other.height) {
                return true;
            }
        }
    }
    return false; 
}
     

@Override
public int hashCode() {
    int result = 1;
    result = 21 * result + radius;
    result = 31 * result + height;
    return result;
}

@Override
public String toString() {
     return "Cylinder :{Color:" + super.getColor() + ", radius: " + radius + " ,height: " + height + "}";
}

}



