package untils;

import java.util.ArrayList;
import java.util.List;

public class FactorsGenerator {
    public List<Integer> factorsGenerator(int num) {
        List<Integer> result = new ArrayList<>();
        for (int i = 2; i <= Math.sqrt(num); i++) {
            if (num % i == 0) result.add(i);
        }
        return result;
    }
}
