abstract class Car
{
    abstract void applybrakes();
    abstract void accelerate();
}
class audi extends Car
{

    @Override
    void applybrakes() {
        System.out.println("Applying brakes to Audi");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerate to Audi");
    }
}
class hundai extends Car
{

    @Override
    void applybrakes() {
        System.out.println("break to Hundai");
    }

    @Override
    void accelerate() {
        System.out.println("Accelerate to Hundai");
    }
}
public class Abstraction
{
 public static void main(String[] args)
 {
   Car a=new audi();
   a.applybrakes();
   a.accelerate();

   a=new hundai();
     a.applybrakes();
     a.accelerate();
 }
}
