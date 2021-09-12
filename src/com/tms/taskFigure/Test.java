package com.tms.taskFigure;

import com.tms.taskFigure.figure.Circle;
import com.tms.taskFigure.figure.Rectangle;
import com.tms.taskFigure.figure.Triangle;

/**
 * Написать иерархию классов «Фигуры».
 * Фигура -> Треугольник -> Прямоугольник -> Круг.
 * Реализовать ф-ю подсчета площади для каждого типа фигуры и подсчет периметра.
 * Создать массив из 5 фигур. Вывести на экран сумму периметра всех фигур в массиве.
 */

public class Test {
    public static void main(String[] args) {
        Figure[] figure = {
                new Triangle(7, 9, 5),
                new Rectangle(10, 5),
                new Circle(3)};

        int i = 0;
        String name;
        for (Figure fig : figure) {
            i++;
            if (i == 1) {
                name = "треугольника";
            } else if (i == 2) {
                name = "прямоугольника";
            } else {
                name = "круга";
            }
            double scale = Math.pow(10, 2);
            double resultS = Math.ceil(fig.s() * scale) / scale;
            double resultP = Math.ceil(fig.p() * scale) / scale;
            System.out.println("Площадь " + name + " = " + resultS + "\nПериметр " + name + " = " + resultP);
        }
    }
}
