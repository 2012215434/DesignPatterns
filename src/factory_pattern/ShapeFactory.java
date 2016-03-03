package factory_pattern;

import factory_pattern.shapImplment.Circle;
import factory_pattern.shapImplment.Rectangle;
import factory_pattern.shapImplment.Square;

public class ShapeFactory {
 //use getShape method to get object of type shape
 public Shape getShape(String shapeType){
 if(shapeType == null){
 return null;
 }
 if(shapeType.equalsIgnoreCase("CIRCLE")){
 return new Circle();
 } else if(shapeType.equalsIgnoreCase("RECTANGLE")){
 return new Rectangle();
 } else if(shapeType.equalsIgnoreCase("SQUARE")){
 return new Square();
 }
 return null;
 }
}