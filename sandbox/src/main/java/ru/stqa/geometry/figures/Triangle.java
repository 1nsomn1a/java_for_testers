package ru.stqa.geometry.figures;

import java.util.Objects;

public class Triangle {

    private double a;
    private double b;
    private double c;

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        Triangle triangle = (Triangle) o;
        return (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.a, triangle.a) == 0 && Double.compare(this.c, triangle.b) == 0 && Double.compare(this.b, triangle.c) == 0)
                || (Double.compare(this.b, triangle.a) == 0 && Double.compare(this.a, triangle.b) == 0 && Double.compare(this.c, triangle.c) == 0)
                || (Double.compare(this.b, triangle.a) == 0 && Double.compare(this.c, triangle.b) == 0 && Double.compare(this.a, triangle.c) == 0)
                || (Double.compare(this.c, triangle.a) == 0 && Double.compare(this.a, triangle.b) == 0 && Double.compare(this.b, triangle.c) == 0)
                || (Double.compare(this.c, triangle.a) == 0 && Double.compare(this.b, triangle.b) == 0 && Double.compare(this.a, triangle.c) == 0);

    }

    @Override
    public int hashCode() {
        return 1;
    }

    public Triangle(double a, double b, double c){
        this.a = a;
        this.b = b;
        this.c = c;

        if(a < 0 || b < 0 || c < 0) {
            throw new IllegalArgumentException("Triangle side should be non-negative");
        }

        if((!(a+b>c) || !(b+c>a) || !(c+a>b))) {
            throw new IllegalArgumentException("Cannot create Triangle");
        }
    }

    public double area(){
        var p = (this.a + this.b + this.c) / 2;
        return Math.sqrt(p * (p - this.a) * (p - this.b) * (p - this.c));
    }

    public double perimeter(){
        return this.a + this.b + this.c;
    }
}
