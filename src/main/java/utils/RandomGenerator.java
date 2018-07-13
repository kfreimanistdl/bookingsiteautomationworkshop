package utils;

import org.apache.commons.lang.RandomStringUtils;

public class RandomGenerator {

    public static String generateRandomString() {
        return RandomStringUtils.random(10, true, false);
    }

    public static String generatePhoneNumber() {
        return "+3712" + RandomStringUtils.random(7, false, true);
    }

    public static String generateEmail() {
        return RandomStringUtils.random(10, true, false) + "@" +
                RandomStringUtils.random(10, true, false) + ".com";
    }

}
