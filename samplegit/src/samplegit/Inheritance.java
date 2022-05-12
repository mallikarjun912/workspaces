package samplegit;

class Furniture {
void addCushion() {
System.out.println("Made of wood");
}
}
class Sofa extends Furniture {
void addCushion() {
System.out.println("Cushion Added");
}
}
public class Inheritance {
public static void main(String args[]) {
Furniture fur = new Sofa();
fur.addCushion();
String str1 = "Interview".replace('e','s');
System.out.println(str1); 
}
}
