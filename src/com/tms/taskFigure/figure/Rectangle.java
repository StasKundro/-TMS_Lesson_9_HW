package com.tms.taskFigure.figure;

import com.tms.taskFigure.Figure;

public class Rectangle extends Figure {
    public double a;
    public double b;

    public Rectangle(double a, double b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public double s() {
        return a * b;
    }

    @Override
    public double p() {
        return 2 * (a + b);
    }
}
