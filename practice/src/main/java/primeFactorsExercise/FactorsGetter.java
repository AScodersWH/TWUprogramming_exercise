package primeFactorsExercise;

import untils.FactorsGenerator;

import java.util.ArrayList;
import java.util.List;

public class FactorsGetter {
    public static void main(String args[]) {
        FactorsGenerator factorsGenerator = new FactorsGenerator();
        List<Integer> result = factorsGenerator.factorsGenerator(30);
        for (Integer num : result) {
            System.out.print(num + " ");
        }

    }
}
