import java.util.*;
import java.text.*;
public class ShapeTester {
public static void main(String[] args) {
  Scanner bull = new Scanner(System.in);

  System.out.println("What shape do you want to calculate the area and volume of? \n Shapes: Box(1), Sphere(2), and Pyramid(3)");
  int pick = bull.nextInt();
  if(pick == 1){
    Box vin = new Box();
    System.out.println("You selected a box \n What is the width of the box?");
    int vaw = bull.nextInt();
    vin.setwidth(vaw);
    System.out.println("What is the length of the box?");
    int bear = bull.nextInt();
    vin.setlength(bear);
    System.out.println("What is the height of the box?");
    int vis = bull.nextInt();
    vin.setheight(vis);
    System.out.println("The surface area is: " +  vin.getSurfaceArea());
    System.out.println("The volume is: " + vin.getVolume());
  } else if(pick == 2){
     Sphere snake = new Sphere();
     System.out.println("You have selected a Sphere \n what is the radius of the sphere?");
     int war = bull.nextInt();
     snake.setradius(war);
     System.out.println("The surface area is: " +  snake.getSurfaceArea());
     System.out.println("The volume is: " + snake.getVolume());
  }
  else if(pick == 3){
    Pyramid vvin = new Pyramid();
    System.out.println("You selected a Pyramid \n What is the width of the pyramid?");
    int vvaw = bull.nextInt();
    vvin.setwidth(vvaw);
    System.out.println("What is the length of the pyramid?");
    int vbear = bull.nextInt();
    vvin.setlength(vbear);
    System.out.println("What is the height of the pyramid?");
    int vvis = bull.nextInt();
    vvin.setheight(vvis);
    System.out.println("The surface area is: " +  vvin.getSurfaceArea());
    System.out.println("The volume is: " + vvin.getVolume());
  }
}












}
