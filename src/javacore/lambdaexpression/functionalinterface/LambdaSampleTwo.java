package javacore.lambdaexpression.functionalinterface;

interface CarTwo{
    String bookCab(String source,String destination);

    }
class OlaTwo implements CarTwo{

    @Override
    public String bookCab(String source, String destination) {
        System.out.println("Cab booked success");
        return "Cab booked from "+source+" to "+destination;
    }
}
public class LambdaSampleTwo {
    public static void main(String[] args) {
        CarTwo carTwo = new OlaTwo();
        System.out.println(carTwo.bookCab("Bengalore","Mysore"));
        CarTwo sampleTwo = (source,destination)->{
            System.out.println("Cab booked..yeah");
            return "Car two booked from "+source+" to "+destination;};
        System.out.println(sampleTwo.bookCab("Mysore","Otty"));
    }
}
