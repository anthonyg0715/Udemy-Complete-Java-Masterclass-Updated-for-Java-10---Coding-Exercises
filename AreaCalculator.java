/*
@Author: Anthony Garzon
@Date: 9/28/2018
@Program Name: Area Calculator
@Description: Return the area of a circle and rectangle using two overloaded methods called area. One for circle and
one for rectangle. The first method will be a double and have one parameter of type double named radius. The second
method will have two parameters both of type double named x and y.
Hints: pi = 3.14159 area of circle = pi*radius*radius and area of a rectangle = x * y
 */
public class AreaCalculator {

    public static void main(String[] args) {
        double check = area(5.0);//should return 78.53975 for area of a circle
        System.out.println(check);
        double check2 = area(-1);//should return -1 since it is invalid
        System.out.println(check2);
        double check3 = area(5.0,4.0);//should return 20.0 for the area of a rectangle
        System.out.println(check3);
        double check4 = area(-1.0,4.0);//should return -1 since the first parameter is invalid
        System.out.println(check4);
    }

    public static double area(double radius){
        if(radius < 0){
            return -1.0;
        }

        double area = (3.14159)*radius*radius;
        return area;
    }

    public static double area(double x, double y){
        if((x < 0) || (y < 0)){
            return -1.0;
        }
        double area = x * y;
        return area;
    }
}
