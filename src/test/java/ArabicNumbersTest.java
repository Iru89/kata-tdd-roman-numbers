import org.junit.Test;

import static org.junit.Assert.*;

public class ArabicNumbersTest {

    private ArabicNumbers arabicNumbers = new ArabicNumbers();

    @Test
    public void passIToArabic() {
        int arabic = arabicNumbers.convertToArabic("I");

        assertEquals(arabic, 1);
    }

    @Test
    public void passIIToArabic() {
        int arabic = arabicNumbers.convertToArabic("II");

        assertEquals(arabic, 2);
    }

    @Test
    public void passIIIToArabic() {
        int arabic = arabicNumbers.convertToArabic("III");

        assertEquals(arabic, 3);
    }

    @Test
    public void passIVToArabic() {
        int arabic = arabicNumbers.convertToArabic("IV");

        assertEquals(arabic, 4);
    }

    @Test
    public void passVToArabic() {
        int arabic = arabicNumbers.convertToArabic("V");

        assertEquals(arabic, 5);
    }

    @Test
    public void passVIToArabic() {
        int arabic = arabicNumbers.convertToArabic("VI");

        assertEquals(arabic, 6);
    }

    @Test
    public void passVIIToArabic() {
        int arabic = arabicNumbers.convertToArabic("VII");

        assertEquals(arabic, 7);
    }

    @Test
    public void passVIIIToArabic() {
        int arabic = arabicNumbers.convertToArabic("VIII");

        assertEquals(arabic, 8);
    }

    @Test
    public void passIXToArabic() {
        int arabic = arabicNumbers.convertToArabic("IX");

        assertEquals(arabic, 9);
    }

    @Test
    public void passXToArabic() {
        int arabic = arabicNumbers.convertToArabic("X");

        assertEquals(arabic, 10);
    }

    @Test
    public void passRomanToArabic() {
        int arabic = arabicNumbers.convertToArabic("XXXIV");

        assertEquals(arabic, 34);
    }

    @Test
    public void passRomanToArabic2() {
        int arabic = arabicNumbers.convertToArabic("MMMCMXLIX");

        assertEquals(arabic, 3949);
    }

    @Test
    public void passRomanToArabic3() {
        int arabic = arabicNumbers.convertToArabic("MMDCCCLXXIV");

        assertEquals(arabic, 2874);
    }

    @Test
    public void passRomanToArabic4() {
        int arabic = arabicNumbers.convertToArabic("MCDXCIV");

        assertEquals(arabic, 1494);
    }

    @Test
    public void passRomanToArabic5() {
        int arabic = arabicNumbers.convertToArabic("MCMXLIX");

        assertEquals(arabic, 1949);
    }
}