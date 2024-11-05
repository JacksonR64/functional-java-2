import org.example.Challenge9;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;
import static org.junit.jupiter.api.Assertions.assertAll;

public class TestClass {

    @Test
    @DisplayName("Test simple input (letter a - M returns ciphered string")
    public void testIsValidEmail() {

        // Arrange
        List<String> input1 = new ArrayList<>();
        input1.add("simon.morgan@northcoders.com");
        input1.add("chris.ward@northcoders.com");
        input1.add("mario@plumbing.it");
        input1.add("link@hyrule.co.uk");
        input1.add("shrek@duloc.com");
        input1.add("ellie@northcoders.js");
        input1.add("java@oracle.jvm");
        input1.add("ziggy@spidersfrommars.co.uk");
        input1.add("lemmy@motorhead.co,uk");
        input1.add("me@myhouse.sleep");

        // Act
//        Challenge9.isValidEmail()
//        String result2 = Kata5.aCaesarCipher(input2);
//        String result3 = Kata5.aCaesarCipher(input3);

        // Assert
        assertAll(
                () -> assertTrue(Challenge9.isValidEmail.test("simon.morgan@northcoders.net")),
                () -> assertTrue(Challenge9.isUkDomain.test("simon.morgan@northcoders.co.uk")),
                () -> assertTrue(Challenge9.isDotCom.test("chris.ward@northcoders.com")),
                () -> assertFalse(Challenge9.isValidEmail.test("simon.morgan@northcoders.co.uk")),
                () -> assertFalse(Challenge9.isUkDomain.test("simon.morgan@northcoders.com")),
                () -> assertFalse(Challenge9.isDotCom.test("chris.ward@northcoders.net")),
                () -> assertEquals(List.of("link@hyrule.co.uk", "ziggy@spidersfrommars.co.uk"),Challenge9.emailSorter.apply(Challenge9.emailList, Challenge9.isUkDomain)),
                () -> assertEquals(List.of("simon.morgan@northcoders.com", "chris.ward@northcoders.com", "shrek@duloc.com"),Challenge9.emailSorter.apply(Challenge9.emailList, Challenge9.isDotCom)),
                () -> assertEquals(List.of("mario@plumbing.it", "ellie@northcoders.js", "java@oracle.jvm", "lemmy@motorhead.co,uk", "me@myhouse.sleep"),Challenge9.emailSorter.apply(Challenge9.emailList, Challenge9.isValidEmail))

        );

    }
}
