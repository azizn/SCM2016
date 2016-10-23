/*
*@Author Aziz
*/
package courses;

public class Sphere implements Shape{
     private double radius;
     final double PI = 3.14159;
    /**
    * Constructor of the class;*
    * @param l this is the length of the cube */
    public Sphere (double r)
    {
        radius = r; 

    }
    /**
    * volume method; computes the volume of the sphere *
    * @return the double representing the volume of the sphere */
    public double volume( )
    {
        
    return ((4.0 / 3.0) * PI * radius * radius * radius); }
    /**
    * area: computes the area of the side of the sphere *
    * @return returns the area of the side of the sphere */
    public double area ( )
    {
        return (4 * PI * radius * radius); 
    }

}