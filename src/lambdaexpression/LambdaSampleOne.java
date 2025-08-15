package lambdaexpression;

@FunctionalInterface
interface Car{
    void bookCab();
}

class Ola implements Car {

    @Override
    public void bookCab() {
        System.out.println("Ola cab booked");
    }
}


public class LambdaSampleOne {
    public static void main(String[] args) {
        Car cab = new Ola();
        cab.bookCab();

        Car primeCab = ()-> System.out.println("Ola prime booked");
        primeCab.bookCab();
    }
}
