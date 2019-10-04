import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class ArabicNumbersTest {

    private ArabicNumbers arabicNumbers = new ArabicNumbers();

    @Test
    public void test_for_1_symbol() {
        List<String> romanNumbers = Arrays.asList("I", "V", "X", "L", "C", "D", "M");

        List<Integer> arabics = romanNumbers.stream()
                .map(roman -> arabicNumbers.convertToArabic(roman))
                .collect(Collectors.toList());

        assertEquals(arabics.get(0), new Integer(1));
        assertEquals(arabics.get(1), new Integer(5));
        assertEquals(arabics.get(2), new Integer(10));
        assertEquals(arabics.get(3), new Integer(50));
        assertEquals(arabics.get(4), new Integer(100));
        assertEquals(arabics.get(5), new Integer(500));
        assertEquals(arabics.get(6), new Integer(1000));

    }
}