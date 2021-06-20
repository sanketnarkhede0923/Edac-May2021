interface Mammal {
    String name
    public void fn1() {
        System.out.println("I am Mammal");
}
interface MarineAnimal  {
String name;
public void fn2() {
    System.out.println("I am a marine animal");
}
class BlueWhale implements Mammal MarineAnimal {
String name;
public void fn3() {
    System.out.println("I belong to both categories: Mammal and Marine animal");

}

class Inheritance1{
public static void main(String[] args) {
  Mammal m=new Mammal();
  MarineAnimal ma=new MarineAnimal();
  BlueWhale bw=new BlueWhale();

  System.out.println("func of Mammals by obj of Mammals");
  m.fn1();

  System.out.println("func of MarineAnimal by obj MarineAnimal");
  ma.fn2();

  System.out.println("func of BlueWhale by obj of BlueWhale");
  bw.fn3();

  



//Dog pug = new Dog();

}
}