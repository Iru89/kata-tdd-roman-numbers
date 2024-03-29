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

    @Test
    public void test_for_2_symbols() {
        List<String> romanNumbers = Arrays.asList("II", "IV", "VI", "IX", "XI", "XX", "XL", "LX", "XC", "CD", "CM", "MC");

        List<Integer> arabics = romanNumbers.stream()
                .map(roman -> arabicNumbers.convertToArabic(roman))
                .collect(Collectors.toList());

        assertEquals(arabics.get(0), new Integer(2));
        assertEquals(arabics.get(1), new Integer(4));
        assertEquals(arabics.get(2), new Integer(6));
        assertEquals(arabics.get(3), new Integer(9));
        assertEquals(arabics.get(4), new Integer(11));
        assertEquals(arabics.get(5), new Integer(20));
        assertEquals(arabics.get(6), new Integer(40));
        assertEquals(arabics.get(7), new Integer(60));
        assertEquals(arabics.get(8), new Integer(90));
        assertEquals(arabics.get(9), new Integer(400));
        assertEquals(arabics.get(10), new Integer(900));
        assertEquals(arabics.get(11), new Integer(1100));

    }

    @Test
    public void test_for_3_symbols() {
        List<String> romanNumbers = Arrays.asList("III", "VII", "XII", "XXX", "XLI", "LXV", "XCI", "CDL", "CMV", "MCL", "MCM");

        List<Integer> arabics = romanNumbers.stream()
                .map(roman -> arabicNumbers.convertToArabic(roman))
                .collect(Collectors.toList());

        assertEquals(arabics.get(0), new Integer(3));
        assertEquals(arabics.get(1), new Integer(7));
        assertEquals(arabics.get(2), new Integer(12));
        assertEquals(arabics.get(3), new Integer(30));
        assertEquals(arabics.get(4), new Integer(41));
        assertEquals(arabics.get(5), new Integer(65));
        assertEquals(arabics.get(6), new Integer(91));
        assertEquals(arabics.get(7), new Integer(450));
        assertEquals(arabics.get(8), new Integer(905));
        assertEquals(arabics.get(9), new Integer(1150));
        assertEquals(arabics.get(10), new Integer(1900));

    }

    @Test
    public void test_for_4_symbols() {
        List<String> romanNumbers = Arrays.asList("VIII", "XIII", "XXXI", "XLII", "LXVI", "LXXX", "DCCC", "MXXI");

        List<Integer> arabics = romanNumbers.stream()
                .map(roman -> arabicNumbers.convertToArabic(roman))
                .collect(Collectors.toList());

        assertEquals(arabics.get(0), new Integer(8));
        assertEquals(arabics.get(1), new Integer(13));
        assertEquals(arabics.get(2), new Integer(31));
        assertEquals(arabics.get(3), new Integer(42));
        assertEquals(arabics.get(4), new Integer(66));
        assertEquals(arabics.get(5), new Integer(80));
        assertEquals(arabics.get(6), new Integer(800));
        assertEquals(arabics.get(7), new Integer(1021));

    }

    @Test
    public void test_of_more_than_4_symbols() {
        List<String> romanNumbers = Arrays.asList("CCCXL", "MXXIX", "MCMXLIX", "MCMLXXXVII", "MMDCCCLXXIV", "MMMCMXCIX");

        List<Integer> arabics = romanNumbers.stream()
                .map(roman -> arabicNumbers.convertToArabic(roman))
                .collect(Collectors.toList());

        assertEquals(arabics.get(0), new Integer(340));
        assertEquals(arabics.get(1), new Integer(1029));
        assertEquals(arabics.get(2), new Integer(1949));
        assertEquals(arabics.get(3), new Integer(1987));
        assertEquals(arabics.get(4), new Integer(2874));
        assertEquals(arabics.get(5), new Integer(3999));


    }

}