import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import static org.junit.Assert.*;

public class RomanNumbersTest {

    private RomanNumbers romanNumbers = new RomanNumbers();

    @Test
    public void pass1ToRoman(){
        String roman = romanNumbers.convertToRoman(1);

        assertEquals(roman, "I");
    }

    @Test
    public void pass2ToRoman(){
        String roman = romanNumbers.convertToRoman(2);

        assertEquals(roman, "II");
    }

    @Test
    public void pass3ToRoman(){
        String roman = romanNumbers.convertToRoman(3);

        assertEquals(roman, "III");
    }

    @Test
    public void pass4ToRoman(){
        String roman = romanNumbers.convertToRoman(4);

        assertEquals(roman, "IV");
    }

    @Test
    public void pass5ToRoman(){
        String roman = romanNumbers.convertToRoman(5);

        assertEquals(roman, "V");
    }

    @Test
    public void pass6ToRoman(){
        String roman = romanNumbers.convertToRoman(6);

        assertEquals(roman, "VI");
    }

    @Test
    public void pass7ToRoman(){
        String roman = romanNumbers.convertToRoman(7);

        assertEquals(roman, "VII");
    }

    @Test
    public void pass8ToRoman(){
        String roman = romanNumbers.convertToRoman(8);

        assertEquals(roman, "VIII");
    }

    @Test
    public void pass9ToRoman(){
        String roman = romanNumbers.convertToRoman(9);

        assertEquals(roman, "IX");
    }

    @Test
    public void pass10ToRoman(){
        String roman = romanNumbers.convertToRoman(10);

        assertEquals(roman, "X");
    }

    @Test
    public void pass11ToRoman(){
        String roman = romanNumbers.convertToRoman(11);

        assertEquals(roman, "XI");
    }

    @Test
    public void pass12ToRoman(){
        String roman = romanNumbers.convertToRoman(12);

        assertEquals(roman, "XII");
    }

    @Test
    public void pass13ToRoman(){
        String roman = romanNumbers.convertToRoman(13);

        assertEquals(roman, "XIII");
    }

    @Test
    public void pass14ToRoman(){
        String roman = romanNumbers.convertToRoman(14);

        assertEquals(roman, "XIV");
    }

    @Test
    public void pass15ToRoman(){
        String roman = romanNumbers.convertToRoman(15);

        assertEquals(roman, "XV");
    }

    @Test
    public void pass16ToRoman(){
        String roman = romanNumbers.convertToRoman(16);

        assertEquals(roman, "XVI");
    }

    @Test
    public void pass17ToRoman(){
        String roman = romanNumbers.convertToRoman(17);

        assertEquals(roman, "XVII");
    }

    @Test
    public void pass18ToRoman(){
        String roman = romanNumbers.convertToRoman(18);

        assertEquals(roman, "XVIII");
    }

    @Test
    public void pass19ToRoman(){
        String roman = romanNumbers.convertToRoman(19);

        assertEquals(roman, "XIX");
    }

    @Test
    public void pass20ToRoman(){
        String roman = romanNumbers.convertToRoman(20);

        assertEquals(roman, "XX");
    }

    @Test
    public void checkTwentyRomanNumerals(){
        List<Integer> arabicNatualNumbers = Arrays.asList(20, 21, 22, 23, 24, 25, 26,27, 28, 29);

        List<String> romans = arabicNatualNumbers.stream()
                .map(number -> romanNumbers.convertToRoman(number))
                .collect(Collectors.toList());

        assertEquals(romans.get(0), "XX");
        assertEquals(romans.get(1), "XXI");
        assertEquals(romans.get(2), "XXII");
        assertEquals(romans.get(3), "XXIII");
        assertEquals(romans.get(4), "XXIV");
        assertEquals(romans.get(5), "XXV");
        assertEquals(romans.get(6), "XXVI");
        assertEquals(romans.get(7), "XXVII");
        assertEquals(romans.get(8), "XXVIII");
        assertEquals(romans.get(9), "XXIX");

    }

    @Test
    public void checkThirtyRomanNumerals(){
        List<Integer> arabicNatualNumbers = Arrays.asList(30, 31, 32, 33, 34, 35, 36, 37, 38, 39);

        List<String> romans = arabicNatualNumbers.stream()
                .map(number -> romanNumbers.convertToRoman(number))
                .collect(Collectors.toList());

        assertEquals(romans.get(0), "XXX");
        assertEquals(romans.get(1), "XXXI");
        assertEquals(romans.get(2), "XXXII");
        assertEquals(romans.get(3), "XXXIII");
        assertEquals(romans.get(4), "XXXIV");
        assertEquals(romans.get(5), "XXXV");
        assertEquals(romans.get(6), "XXXVI");
        assertEquals(romans.get(7), "XXXVII");
        assertEquals(romans.get(8), "XXXVIII");
        assertEquals(romans.get(9), "XXXIX");

    }

    @Test
    public void checkAllTensRomanNumerals() {
        List<Integer> arabicNatualNumbers = Arrays.asList(10, 20, 30, 40, 50, 60, 70, 80, 90);

        List<String> romans = arabicNatualNumbers.stream()
                .map(number -> romanNumbers.convertToRoman(number))
                .collect(Collectors.toList());

        assertEquals(romans.get(0), "X");
        assertEquals(romans.get(1), "XX");
        assertEquals(romans.get(2), "XXX");
        assertEquals(romans.get(3), "XL");
        assertEquals(romans.get(4), "L");
        assertEquals(romans.get(5), "LX");
        assertEquals(romans.get(6), "LXX");
        assertEquals(romans.get(7), "LXXX");
        assertEquals(romans.get(8), "XC");

    }

    @Test
    public void checkHundredRomanNumerals() {
        List<Integer> arabicNatualNumbers = Arrays.asList(100, 200, 300, 400, 500, 600, 700, 800, 900, 1000);

        List<String> romans = arabicNatualNumbers.stream()
                .map(number -> romanNumbers.convertToRoman(number))
                .collect(Collectors.toList());

        assertEquals(romans.get(0), "C");
        assertEquals(romans.get(1), "CC");
        assertEquals(romans.get(2), "CCC");
        assertEquals(romans.get(3), "CD");
        assertEquals(romans.get(4), "D");
        assertEquals(romans.get(5), "DC");
        assertEquals(romans.get(6), "DCC");
        assertEquals(romans.get(7), "DCCC");
        assertEquals(romans.get(8), "CM");
        assertEquals(romans.get(9), "M");

    }

    @Test
    public void pass3234ToRoman() {
        String roman = romanNumbers.convertToRoman(3234);

        assertEquals(roman, "MMMCCXXXIV");
    }
}