public class Sphere extends Shape3D {
    private int radius;

    public Sphere() {
        this(1);

    }

    public Sphere(int radius) {
        super();
        setRadius(radius);
    }

    public int getRadius() {
        return radius;
    }

    public Sphere setRadius(int radius) {
        if (radius <= 0) {
            throw new IllegalArgumentException( " Radius must be greater than or equal to 0" );
        } else {
        this.radius = radius;
        return this;
        }
    }
    
    public Sphere setColor(Color color) {
        super.setColor(color);
        return this;
    }
    
    @Override 
    public double volume() {
        return (4.0/3.0 * Math.PI * (radius * radius * radius));
       // 4/3 * pi * r^3
    }

    @Override
    public double area() {
        return (4.0 * Math.PI * (radius * radius));
    }


    @Override
    public void draw(char ch) {
        for (int i = -radius; i <= radius; i++) {
            for (int j = -radius; j <= radius; j++) {
                double distance = Math.sqrt(i * i + j * j);
            if (distance <= radius) {
                System.out.print(ch);
            } else {
                System.out.print(" ");
            }
        }
        System.out.println();
    }
}

    public boolean equals(Object o) {
        if (o != null ) {
            if (o instanceof Sphere) {
                Sphere other = (Sphere) o;
                if (this.radius == other.radius) {
                    return true;
                }
            }
        }
        return false;
    }

    public int hashCode() {
        int result = 1; 
        result = 29 * result + radius;
        return result;
    }

    public String toString() {
        return "Sphere :{Color:" + super.getColor() + ", radius: " + radius + "}";
    }
}
