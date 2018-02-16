import java.util.*;
import java.text.*;

public class Sphere{
private float radius;
private double pi = 3.14;


public Sphere(){
this.setradius(0);
}

public double getradius(){
  return radius;
}

public void setradius(float radius){
  this.radius = radius;
}

public double getSurfaceArea(){
return (4*pi*radius*radius);
}

public double getVolume() {
 return (4/3*pi*radius*radius*radius);
}
}
