/**
 * Contains some Geometry formulas
 * 
 * @author Neal Dhankhode 
 * @version 8/28/18
 */
public class Geometry 
{
    /**
     * Calculates the area of a trapezoid
     *
     * @param base1  The first base of a trapezoid
     * @param base2  The second base of a trapezoid
     * @param height height of a trapezoid
     */
    public static double trapezoidArea(double base1, double base2, double height) 
    {
        double area = (base1 + base2 / 2.0)*height;
        return area;
    }
    
    /**
     * Calculates the volume of a rectangular prism
     *
     * @param width  width of a rectangular prism
     * @param height height of a rectangular prism
     * @param length length of a rectangular prism
     */
    public static double rectangularprismVolume(double width, double height, double length) 
    {
        double volume = (width) * (height) * (length);
        return volume;
    }
    
    /**
     * Calculates the volume of a cone
     * 
     * @param radius radius of the base of the cone
     * @param height height of the cone
     */
    public static double coneVolume(double radius, double height) 
    {
        double volume = Math.PI * Math.pow(radius, 2) * (height / 3.0);
        return volume;
    }
    
    /**
     * Calculates the surface area of a rectangular prism
     * 
     * @param width the width of the rectangular prism
     * @param length the length of the rectangular prism 
     * @param height the height of the rectangular prism
     */
    public static double rectangularprismSurfaceArea(double width, double length, double height)
    {
        double surfaceArea = 2.0 * (width * length) + (height * length) + (height * width);
        return surfaceArea;
    }
    
    /**
     * Calculates the surface area of a sphere
     * 
     * @param radius the radius of a sphere
     */
    public static double sphereSurfaceArea(double radius)
    {
        double surfaceArea = 4.0 * Math.PI * Math.pow(radius, 2);
        return surfaceArea;
    }
    
    /**
     * Calculates the hypotenuse of a right triangle when given two legs
     * 
     * @param a One of the legs of a right triangle
     * @param b One of the legs of a right triangle
     */
    public static double PythagoreanTheorem(double a, double b)
    {
        double c = Math.sqrt(Math.pow(a, 2) + Math.pow(b, 2));
        return c;
    }
    
    /**
     * Calculates the distance between two points
     * 
     * @param x One of the x values
     * @param x2 The second x value
     * @param y One of the y values
     * @param y2 The second y values
     */
    public static double DistaneFormula(double x1, double x2, double y1, double y2)
    {
        double Distance = Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        return Distance;
    }
    
    /**
     * Calculates the slope
     * 
     * @param x One of the x values
     * @param x1 The second value of x
     * @param y One of the y values
     * @param y1 The second value of y
     */
    public static double SlopeFormula(double x, double x1, double y, double y1)
    {
        double Slope = (y - y1) / (x - x1);
        return Slope;
    }
    
    /**
     * Calculates the area of a triangle
     * 
     * @param base The base of a triangle
     * @param height The height of a triangle
     */
    public static double triangleArea(double base, double height)
    {
        double area = (1 / 2) * (base) * (height);
        return area;
    }
    
    public static void main(String[] args) 
    {
        double ta1 = triangleArea(4.2, 8.1);
        double ta2 = triangleArea(3.0, 123.157);
        
        System.out.println(ta1);
        System.out.println(ta2);
        
        
    }
}
