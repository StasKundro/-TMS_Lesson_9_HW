package com.tms.taskFigure.figure;

import com.tms.taskFigure.Figure;

public class Circle extends Figure {
    public double r;

    public Circle(double r) {
        this.r = r;
    }

    @Override
    public double s(){
        double s = Math.PI * r * r;
        return s;
    }

    @Override
    public double p() {
        return Math.PI * 2 * r;
    }
}
