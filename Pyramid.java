public class Pyramid{
private float length;
private float height;
private float width;


public Pyramid(){
  this.setheight(0);
  this.setlength(0);
  this.setwidth(0);
}

public float getlength(){
  return length;
}

public void setlength(float length){
  this.length = length;
}

public float getheight(){
  return height;
}

public void setheight(float height){
  this.height = height;
}

public float getwidth(){
  return width;
}

public void setwidth(float width){
  this.width = width;
}


public float getSurfaceArea(){
return (2*length*width+2*length*height+2*width*height);
}

public float getVolume() {
 return ((height*length*width)/3);
}
}
