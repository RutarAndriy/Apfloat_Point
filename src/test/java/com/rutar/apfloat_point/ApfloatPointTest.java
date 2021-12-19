package com.rutar.apfloat_point;

import org.apfloat.Apfloat;
import org.junit.*;

import static org.junit.Assert.*;
import static com.rutar.apfloat_point.ApfloatPoint.*;

// ............................................................................

public class ApfloatPointTest {

///////////////////////////////////////////////////////////////////////////////

@AfterClass
public static void start_Testing()
    { System.out.println(); }

@BeforeClass
public static void end_Testing()
    { System.out.println(); }

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Equals_ApfloatPoint() {

Apfloat x = new Apfloat(3.0);
Apfloat y = new Apfloat(9.0);

ApfloatPoint point_1 = new ApfloatPoint(3, 9);
ApfloatPoint point_2 = new ApfloatPoint("3", "9");
ApfloatPoint point_3 = new ApfloatPoint(x, y);

assertTrue(point_1.equals(point_2));
assertTrue(point_2.equals(point_3));

assertFalse(point_3.equals(POINT_ZERO));

System.out.println("test_Equals_ApfloatPoint: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Equals_ApfloatPoint_ApfloatPoint() {
    
Apfloat x = new Apfloat(25.4);
Apfloat y = new Apfloat(19.6);

ApfloatPoint point_1 = new ApfloatPoint("25.4", "19.6");
ApfloatPoint point_2 = new ApfloatPoint("25.400", "19.600");
ApfloatPoint point_3 = new ApfloatPoint(x, y);

assertTrue(ApfloatPoint.equals(point_1, point_2));

assertFalse(ApfloatPoint.equals(point_2, point_3));
assertFalse(ApfloatPoint.equals(point_1, POINT_ZERO));

System.out.println("test_Equals_ApfloatPoint_ApfloatPoint: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Add_double_double() {
    
ApfloatPoint point = new ApfloatPoint("10", "25");
ApfloatPoint add = point.add(4.6, 19.2);

assertEquals(14.6, add.x.doubleValue(), 0.000001d);
assertEquals(44.2, add.y.doubleValue(), 0.000001d);

System.out.println("test_Add_double_double: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Add_Apfloat_Apfloat() {

Apfloat x = new Apfloat("4.6");
Apfloat y = new Apfloat("19.2");

ApfloatPoint point = new ApfloatPoint("10", "25");
ApfloatPoint add = point.add(x, y);

assertTrue(ApfloatPoint.equals(add, new ApfloatPoint("14.6", "44.2")));

System.out.println("test_Add_Apfloat_Apfloat: done");
    
}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Add_ApfloatPoint() {

Apfloat x = new Apfloat("4.6");
Apfloat y = new Apfloat("19.2");

ApfloatPoint point_1 = new ApfloatPoint("10", "25");
ApfloatPoint point_2 = new ApfloatPoint(x, y);
ApfloatPoint add = point_1.add(point_2);

assertTrue(ApfloatPoint.equals(add, new ApfloatPoint("14.6", "44.2")));

System.out.println("test_Add_ApfloatPoint: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Subtract_double_double() {

ApfloatPoint point = new ApfloatPoint("11.3", "104.7");
ApfloatPoint subtract = point.subtract(16.8, 37.3);

assertEquals(-5.5, subtract.x.doubleValue(), 0.000001d);
assertEquals(67.4, subtract.y.doubleValue(), 0.000001d);

System.out.println("test_Subtract_double_double: done");
    
}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Subtract_Apfloat_Apfloat() {

Apfloat x = new Apfloat("16.8");
Apfloat y = new Apfloat("37.3");

ApfloatPoint point = new ApfloatPoint("11.3", "104.7");
ApfloatPoint subtract = point.subtract(x, y);

assertTrue(ApfloatPoint.equals(subtract, new ApfloatPoint("-5.5", "67.4")));

System.out.println("test_Subtract_Apfloat_Apfloat: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Subtract_ApfloatPoint() {

Apfloat x = new Apfloat("16.8");
Apfloat y = new Apfloat("37.3");

ApfloatPoint point_1 = new ApfloatPoint("11.3", "104.7");
ApfloatPoint point_2 = new ApfloatPoint(x, y);
ApfloatPoint subtract = point_1.subtract(point_2);

assertTrue(ApfloatPoint.equals(subtract, new ApfloatPoint("-5.5", "67.4")));

System.out.println("test_Subtract_ApfloatPoint: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Multiply_double() {

ApfloatPoint point = new ApfloatPoint("6.5", "11.3");
ApfloatPoint multiply = point.multiply(3.0);

assertEquals(19.5, multiply.x.doubleValue(), 0.000001d);
assertEquals(33.9, multiply.y.doubleValue(), 0.000001d);

System.out.println("test_Multiply_double: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Multiply_Apfloat() {

Apfloat numeric = new Apfloat("3.0");
ApfloatPoint point = new ApfloatPoint("6.5", "11.3");
ApfloatPoint multiply = point.multiply(numeric);

assertEquals(19.5, multiply.x.doubleValue(), 0.000001d);
assertEquals(33.9, multiply.y.doubleValue(), 0.000001d);

System.out.println("test_Multiply_Apfloat: done");
    
}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Multiply_double_double() {

ApfloatPoint point = new ApfloatPoint("6.5", "11.3");
ApfloatPoint multiply = point.multiply(2.9, 1.4);

assertEquals(18.85, multiply.x.doubleValue(), 0.000001d);
assertEquals(15.82, multiply.y.doubleValue(), 0.000001d);

System.out.println("test_Multiply_double_double: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Multiply_Apfloat_Apfloat() {

Apfloat x = new Apfloat("2.9");
Apfloat y = new Apfloat("1.4");

ApfloatPoint point = new ApfloatPoint("6.5", "11.3");
ApfloatPoint multiply = point.multiply(x, y);

assertTrue(ApfloatPoint.equals(multiply, new ApfloatPoint("18.85", "15.82")));

System.out.println("test_Multiply_Apfloat_Apfloat: done");
    
}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Multiply_ApfloatPoint() {

Apfloat x = new Apfloat("2.9");
Apfloat y = new Apfloat("1.4");

ApfloatPoint point_1 = new ApfloatPoint("6.5", "11.3");
ApfloatPoint point_2 = new ApfloatPoint(x, y);
ApfloatPoint multiply = point_1.multiply(point_2);

assertTrue(ApfloatPoint.equals(multiply, new ApfloatPoint("18.85", "15.82")));

System.out.println("test_Multiply_ApfloatPoint: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Divide_double() {

ApfloatPoint point = new ApfloatPoint("13.2", "8.3");
ApfloatPoint divide = point.divide(2.0);

assertEquals(6.60, divide.x.doubleValue(), 0.000001d);
assertEquals(4.15, divide.y.doubleValue(), 0.000001d);

System.out.println("test_Divide_double: done");
    
}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Divide_Apfloat() {

Apfloat numeric = new Apfloat("2.0");
ApfloatPoint point = new ApfloatPoint("13.2", "8.3");
ApfloatPoint divide = point.divide(numeric);

assertEquals(6.60, divide.x.doubleValue(), 0.000001d);
assertEquals(4.15, divide.y.doubleValue(), 0.000001d);

System.out.println("test_Divide_Apfloat: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Divide_double_double() {

ApfloatPoint point = new ApfloatPoint("13.2", "8.3");
ApfloatPoint divide = point.divide(1.6, 0.4);

assertEquals(8.25,  divide.x.doubleValue(), 0.000001d);
assertEquals(20.75, divide.y.doubleValue(), 0.000001d);

System.out.println("test_Divide_double_double: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Divide_Apfloat_Apfloat() {

Apfloat x = new Apfloat("1.6");
Apfloat y = new Apfloat("0.4");

ApfloatPoint point = new ApfloatPoint("13.2", "8.3");
ApfloatPoint divide = point.divide(x, y);

assertTrue(ApfloatPoint.equals(divide, new ApfloatPoint("8.25", "20.75")));

System.out.println("test_Divide_Apfloat_Apfloat: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_Divide_ApfloatPoint() {

Apfloat x = new Apfloat("1.6");
Apfloat y = new Apfloat("0.4");

ApfloatPoint point_1 = new ApfloatPoint("13.2", "8.3");
ApfloatPoint point_2 = new ApfloatPoint(x, y);
ApfloatPoint divide = point_1.divide(point_2);

assertTrue(ApfloatPoint.equals(divide, new ApfloatPoint("8.25", "20.75")));

System.out.println("test_Divide_ApfloatPoint: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_RotatePoint_double() {

ApfloatPoint point = new ApfloatPoint("13", "27");

ApfloatPoint rotatePoint_1 = point.rotatePoint(30);
ApfloatPoint rotatePoint_2 = point.rotatePoint(360 - 30);

assertEquals(24.7583, rotatePoint_1.x.doubleValue(), 0.0001d);
assertEquals(16.8827, rotatePoint_1.y.doubleValue(), 0.0001d);

assertEquals(-2.2417, rotatePoint_2.x.doubleValue(), 0.0001d);
assertEquals(29.8827, rotatePoint_2.y.doubleValue(), 0.0001d);

System.out.println("test_RotatePoint_double: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_RotatePoint_ApfloatPoint_double() {

ApfloatPoint point  = new ApfloatPoint("13", "27");
ApfloatPoint origin = new ApfloatPoint("9",  "23");

ApfloatPoint rotatePoint_1 = point.rotatePoint(origin, 85);
ApfloatPoint rotatePoint_2 = point.rotatePoint(origin, 360 - 85);

assertEquals(13.3334, rotatePoint_1.x.doubleValue(), 0.0001d);
assertEquals(19.3638, rotatePoint_1.y.doubleValue(), 0.0001d);

assertEquals(5.3638,  rotatePoint_2.x.doubleValue(), 0.0001d);
assertEquals(27.3334, rotatePoint_2.y.doubleValue(), 0.0001d);

System.out.println("test_RotatePoint_ApfloatPoint_double: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_GetDirectionalAngle() {

ApfloatPoint point_s = ApfloatPoint.POINT_ZERO;
ApfloatPoint point_e = ApfloatPoint.POINT_ZERO;

Apfloat angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

// ............................................................................

//      ZERO             0°            45°            90°            135°
//    ┏━━━━━━━┓      ┏━━━━━━━┓      ┏━━━━━━━┓      ┏━━━━━━━┓      ┏━━━━━━━┓
//    ┃       ┃      ┃   △   ┃      ┃     ◹ ┃      ┃       ┃      ┃       ┃
//    ┃   ◉   ┃      ┃   ◉   ┃      ┃   ◉   ┃      ┃   ◉ ▷ ┃      ┃   ◉   ┃
//    ┃       ┃      ┃       ┃      ┃       ┃      ┃       ┃      ┃     ◿ ┃
//    ┗━━━━━━━┛      ┗━━━━━━━┛      ┗━━━━━━━┛      ┗━━━━━━━┛      ┗━━━━━━━┛

//       180°           225°           270°           315°         CUSTOM
//    ┏━━━━━━━┓      ┏━━━━━━━┓      ┏━━━━━━━┓      ┏━━━━━━━┓      ┏━━━━━━━┓
//    ┃       ┃      ┃       ┃      ┃       ┃      ┃ ◸     ┃      ┃ ◤ ▲ ◥ ┃
//    ┃   ◉   ┃      ┃   ◉   ┃      ┃ ◁ ◉   ┃      ┃   ◉   ┃      ┃ ◀ ◉ ▶ ┃
//    ┃   ▽   ┃      ┃ ◺     ┃      ┃       ┃      ┃       ┃      ┃ ◣ ▼ ◢ ┃
//    ┗━━━━━━━┛      ┗━━━━━━━┛      ┗━━━━━━━┛      ┗━━━━━━━┛      ┗━━━━━━━┛

// ............................................................................

assertEquals(0.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_e = new ApfloatPoint("1", "0");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(0.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_e = new ApfloatPoint("1", "1");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(45.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_e = new ApfloatPoint("0", "1");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(90.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_e = new ApfloatPoint("-1", "1");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(135.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_e = new ApfloatPoint("-1", "0");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(180.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_e = new ApfloatPoint("-1", "-1");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(225.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_e = new ApfloatPoint("0", "-1");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(270.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_e = new ApfloatPoint("1", "-1");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(315.0, angle.doubleValue(), 0.0001d);

// ............................................................................

point_s = new ApfloatPoint("7.5",  "3.2");
point_e = new ApfloatPoint("11.8", "4.0");
angle = ApfloatPoint.getDirectionalAngle(point_s, point_e);

assertEquals(10.539, angle.doubleValue(), 0.001d);

// ............................................................................

System.out.println("test_GetDirectionalAngle: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_GetSegmentLenght() {

ApfloatPoint point_s = new ApfloatPoint("23.8", "18.6");
ApfloatPoint point_e = new ApfloatPoint("41.1", "10.4");

Apfloat lenght = ApfloatPoint.getSegmentLenght(point_s, point_e);

assertEquals(19.144973, lenght.doubleValue(), 0.000001d);

System.out.println("test_GetSegmentLenght: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_ToString() {

ApfloatPoint point = new ApfloatPoint("167.340", "514.100");

assertEquals("ApfloatPoint(167.34, 514.1)", point.toString());

System.out.println("test_ToString: done");

}

///////////////////////////////////////////////////////////////////////////////

@Test
public void test_ToString_boolean() {

ApfloatPoint point = new ApfloatPoint("0.000450", "13.04560");

assertEquals("ApfloatPoint(0.00045, 13.0456)",  point.toString(true));
assertEquals("ApfloatPoint(4.5e-4, 1.30456e1)", point.toString(false));

System.out.println("test_ToString_boolean: done");

}

///////////////////////////////////////////////////////////////////////////////

}
