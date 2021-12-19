package com.rutar.apfloat_point;

import org.apfloat.*;

import static org.apfloat.Apfloat.ZERO;

// ............................................................................

public class ApfloatPoint {

/**
 * Значення координати X
 */
public Apfloat x = null;

/**
 * Значення координати Y
 */
public Apfloat y = null;

/**
 * Точність виконання розрахунків
 */
public static int PRECISION = 12;

/**
 * Точка з координатами (0, 0)
 */
public static final ApfloatPoint POINT_ZERO = new ApfloatPoint(0, 0);

/**
 * Точка з координатами (1, 1)
 */
public static final ApfloatPoint POINT_ONE = new ApfloatPoint(1, 1);

///////////////////////////////////////////////////////////////////////////////

    /**
     * Конструктор класу ApfloatPoint
     * @param x значення координати X
     * @param y значення координати Y
     */

public ApfloatPoint (double x, double y) {

    this.x = new Apfloat(x, PRECISION);
    this.y = new Apfloat(y, PRECISION);

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Конструктор класу ApfloatPoint
     * @param x значення координати X
     * @param y значення координати Y
     */

public ApfloatPoint (String x, String y) {

    this.x = new Apfloat(x, PRECISION);
    this.y = new Apfloat(y, PRECISION);

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Конструктор класу ApfloatPoint
     * @param x значення координати X
     * @param y значення координати Y
     */
    
public ApfloatPoint (Apfloat x, Apfloat y) {

    this.x = x.precision(PRECISION);
    this.y = y.precision(PRECISION);

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод порівнює екземпляр класу з іншим об'єктом класу ApfloatPoint
     * @param point об'єкт для порівняння
     * @return true, якщо об'єкти еквівалентні
     */

public boolean equals (ApfloatPoint point) {
    
    int compareX = this.x.compareTo(point.x);
    int compareY = this.y.compareTo(point.y);
    
    return (compareX == 0) && (compareY == 0);
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод порівнює між собою два об'єкти класу ApfloatPoint
     * @param first перший об'єкт для порівняння
     * @param second другий об'єкт для порівняння
     * @return true, якщо об'єкти еквівалентні
     */

public static boolean equals (ApfloatPoint first,
                              ApfloatPoint second) {
    
    int compareX = first.x.compareTo(second.x);
    int compareY = first.y.compareTo(second.y);
    
    return (compareX == 0) && (compareY == 0);
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод додає до координат екземпляру класу значення X та Y
     * @param x значення для додавання по X
     * @param y значення для додавання по Y
     * @return результат додавання
     */

public ApfloatPoint add (double x, double y) {

    Apfloat X = new Apfloat(x).precision(PRECISION);
    Apfloat Y = new Apfloat(y).precision(PRECISION);
    
    return new ApfloatPoint(this.x.add(X).precision(PRECISION),
                            this.y.add(Y).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод додає до координат екземпляру класу значення X та Y
     * @param x значення для додавання по X
     * @param y значення для додавання по Y
     * @return результат додавання
     */

public ApfloatPoint add (Apfloat x, Apfloat y) {

    x = x.precision(PRECISION);
    y = y.precision(PRECISION);
    
    return new ApfloatPoint(this.x.add(x).precision(PRECISION),
                            this.y.add(y).precision(PRECISION));

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод додає до координат екземпляру класу координати заданої точки
     * @param point точка для додавання
     * @return результат додавання
     */

public ApfloatPoint add (ApfloatPoint point) {

    return new ApfloatPoint(x.add(point.x).precision(PRECISION),
                            y.add(point.y).precision(PRECISION));

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод віднімає від координат екземпляру класу значення X та Y
     * @param x значення для віднімання по X
     * @param y значення для віднімання по Y
     * @return результат віднімання
     */

public ApfloatPoint subtract (double x, double y) {

    Apfloat X = new Apfloat(x).precision(PRECISION);
    Apfloat Y = new Apfloat(y).precision(PRECISION);
    
    return new ApfloatPoint(this.x.subtract(X).precision(PRECISION),
                            this.y.subtract(Y).precision(PRECISION));

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод віднімає від координат екземпляру класу значення X та Y
     * @param x значення для віднімання по X
     * @param y значення для віднімання по Y
     * @return результат віднімання
     */

public ApfloatPoint subtract (Apfloat x, Apfloat y) {

    x = x.precision(PRECISION);
    y = y.precision(PRECISION);
    
    return new ApfloatPoint(this.x.subtract(x).precision(PRECISION),
                            this.y.subtract(y).precision(PRECISION));

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод віднімає від координат екземпляру класу координати заданої точки
     * @param point точка для віднімання
     * @return результат віднімання
     */

public ApfloatPoint subtract (ApfloatPoint point) {

    return new ApfloatPoint(x.subtract(point.x).precision(PRECISION),
                            y.subtract(point.y).precision(PRECISION));

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод перемножує координати екземпляру класу на число
     * @param numeric число для множення
     * @return результат множення
     */

public ApfloatPoint multiply (double numeric) {

    Apfloat N = new Apfloat(numeric).precision(PRECISION);
    
    return new ApfloatPoint(this.x.multiply(N).precision(PRECISION),
                            this.y.multiply(N).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод перемножує координати екземпляру класу на число
     * @param numeric число для множення
     * @return результат множення
     */

public ApfloatPoint multiply (Apfloat numeric) {

    numeric = numeric.precision(PRECISION);
    
    return new ApfloatPoint(x.multiply(numeric).precision(PRECISION),
                            y.multiply(numeric).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод перемножує координати екземпляру класу на значення X та Y
     * @param x значення для множення по X
     * @param y значення для множення по Y
     * @return результат множення
     */

public ApfloatPoint multiply (double x, double y) {

    Apfloat X = new Apfloat(x).precision(PRECISION);
    Apfloat Y = new Apfloat(y).precision(PRECISION);
    
    return new ApfloatPoint(this.x.multiply(X).precision(PRECISION),
                            this.y.multiply(Y).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод перемножує координати екземпляру класу на значення X та Y
     * @param x значення для множення по X
     * @param y значення для множення по Y
     * @return результат множення
     */

public ApfloatPoint multiply (Apfloat x, Apfloat y) {

    x = x.precision(PRECISION);
    y = y.precision(PRECISION);
    
    return new ApfloatPoint(this.x.multiply(x).precision(PRECISION),
                            this.y.multiply(y).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод перемножує координати екземпляру класу на координати заданої точки
     * @param point точка для множення
     * @return результат множення
     */

public ApfloatPoint multiply (ApfloatPoint point) {

    return new ApfloatPoint(x.multiply(point.x).precision(PRECISION),
                            y.multiply(point.y).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод розділяє координати екземпляру класу на число
     * @param numeric число для ділення
     * @return результат ділення
     */

public ApfloatPoint divide (double numeric) {

    Apfloat N = new Apfloat(numeric).precision(PRECISION);
    
    return new ApfloatPoint(this.x.divide(N).precision(PRECISION),
                            this.y.divide(N).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод розділяє координати екземпляру класу на число
     * @param numeric число для ділення
     * @return результат ділення
     */

public ApfloatPoint divide (Apfloat numeric) {

    numeric = numeric.precision(PRECISION);
    
    return new ApfloatPoint(x.divide(numeric).precision(PRECISION),
                            y.divide(numeric).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод розділяє координати екземпляру класу на значення X та Y
     * @param x значення для ділення по X
     * @param y значення для ділення по Y
     * @return результат ділення
     */

public ApfloatPoint divide (double x, double y) {

    Apfloat X = new Apfloat(x).precision(PRECISION);
    Apfloat Y = new Apfloat(y).precision(PRECISION);
    
    return new ApfloatPoint(this.x.divide(X).precision(PRECISION),
                            this.y.divide(Y).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод розділяє координати екземпляру класу на значення X та Y
     * @param x значення для ділення по X
     * @param y значення для ділення по Y
     * @return результат ділення
     */

public ApfloatPoint divide (Apfloat x, Apfloat y) {

    x = x.precision(PRECISION);
    y = y.precision(PRECISION);
    
    return new ApfloatPoint(this.x.divide(x).precision(PRECISION),
                            this.y.divide(y).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод розділяє координати екземпляру класу на координати заданої точки
     * @param point точка для ділення
     * @return результат ділення
     */

public ApfloatPoint divide (ApfloatPoint point) {

    return new ApfloatPoint(x.divide(point.x).precision(PRECISION),
                            y.divide(point.y).precision(PRECISION));
    
}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод повертає точку за заданий кут відносно центру координат
     * @param rotateAngle кут повороту за годинниковою стрілкою
     * @return точка, повернена на заданий кут
     */
    
public ApfloatPoint rotatePoint (double rotateAngle) {

    return rotatePoint(POINT_ZERO, rotateAngle);

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод повертає точку за заданий кут відносно заданої точки повороту
     * @param origin точка, відносно якої здійснюється поворот
     * @param rotateAngle кут повороту за годинниковою стрілкою
     * @return точка, повернена на заданий кут
     */

public ApfloatPoint rotatePoint (ApfloatPoint origin,
                                 double rotateAngle) {

Apfloat angle = new Apfloat(rotateAngle, PRECISION);
angle = ApfloatMath.toRadians(angle);

Apfloat dx = x.subtract(origin.x);
Apfloat dy = y.subtract(origin.y);

Apfloat X = dy.multiply(ApfloatMath.sin(angle))
              .add(dx.multiply(ApfloatMath.cos(angle)));
Apfloat Y = dy.multiply(ApfloatMath.cos(angle))
              .subtract(dx.multiply(ApfloatMath.sin(angle)));

return new ApfloatPoint(X.add(origin.x).precision(PRECISION),
                        Y.add(origin.y).precision(PRECISION));

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод повертає дирекційний кут відрізка, який утворений двома точками
     * @param start початкова точка
     * @param end кінцева точка
     * @return значення дирекційного кута
     */
    
public static Apfloat getDirectionalAngle (ApfloatPoint start,
                                           ApfloatPoint end) {

// Точки співпадають
if (equals(start, end)) { return ZERO.precision(PRECISION); }

Apfloat dx = end.x.subtract(start.x);
Apfloat dy = end.y.subtract(start.y);

// ............................................................................
// Координати Y співпадають

if (start.y.compareTo(end.y) == 0) {

    if (dx.compareTo(ZERO) > 0) { return new Apfloat(0,   PRECISION); }
    else                        { return new Apfloat(180, PRECISION); }

}

// ............................................................................
// Координати X співпадають

if (start.x.compareTo(end.x) == 0) {

    if (dy.compareTo(ZERO) > 0) { return new Apfloat(90,  PRECISION); } 
    else                        { return new Apfloat(270, PRECISION); }

}

// ............................................................................
// Виконання обчислень

Apfloat rumb = dy.divide(dx);
Apfloat angle = ApfloatMath.atan(rumb);

angle = ApfloatMath.toDegrees(angle);
angle = ApfloatMath.abs(angle);

// I чверть
if (dx.compareTo(ZERO) > 0 && dy.compareTo(ZERO) > 0)
    { return angle.precision(PRECISION); }

// II чверть
if (dx.compareTo(ZERO) < 0 && dy.compareTo(ZERO) > 0)
    { return new Apfloat(180).subtract(angle).precision(PRECISION); }

// III чверть
if (dx.compareTo(ZERO) < 0 && dy.compareTo(ZERO) < 0)
    { return new Apfloat(180).add(angle).precision(PRECISION); }

// IV чверть
if (dx.compareTo(ZERO) > 0 && dy.compareTo(ZERO) < 0)
    { return new Apfloat(360).subtract(angle).precision(PRECISION); }

return ZERO.precision(PRECISION);

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод повертає довжину відрізка між 2 точками
     * @param start початкова точка
     * @param end кінцева точка
     * @return довжина відрізка між 2 точками
     */
    
public static Apfloat getSegmentLenght (ApfloatPoint start,
                                        ApfloatPoint end) {

Apfloat dx = end.x.subtract(start.x);
Apfloat dy = end.y.subtract(start.y);

Apfloat dx_pow = ApfloatMath.pow(dx, 2);
Apfloat dy_pow = ApfloatMath.pow(dy, 2);

return ApfloatMath.sqrt(dx_pow.add(dy_pow)).precision(PRECISION);

}

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод повертає строкове представлення об'єкту ApfloatPoint
     * у фіксованій нотації
     * @return строкове представлення об'єкту ApfloatPoint
     */

@Override
public String toString() { return toString(true); }

///////////////////////////////////////////////////////////////////////////////

    /**
     * Метод повертає строкове представлення об'єкту ApfloatPoint у
     * фіксованій або експоненційній нотації
     * @param pretty якщо true, то використовується фіксована нотація
     * @return строкове представлення об'єкту ApfloatPoint
     */

public String toString (boolean pretty)
    { return String.format("ApfloatPoint(%s, %s)",
                           x.toString(pretty), y.toString(pretty)); }

///////////////////////////////////////////////////////////////////////////////

}