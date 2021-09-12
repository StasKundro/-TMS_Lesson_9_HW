package com.tms.taskFigure.figure;

import com.tms.taskFigure.Figure;

public class Triangle extends Figure {
    public double a;
    public double b;
    public double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double s() {
        double p = (a + b + c) / 2;
        double s = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        return s;
    }

    @Override
    public double p() {
        return a + b + c;
    }
}
