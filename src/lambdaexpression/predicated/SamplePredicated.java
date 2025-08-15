package lambdaexpression.predicated;

import java.util.function.Predicate;

public class SamplePredicated {
    public static void main(String[] args) {

        Predicate<String> predicate = (t)->(t.equalsIgnoreCase("Ashin"));
        System.out.println(predicate.test("Ashin"));
    }
}
