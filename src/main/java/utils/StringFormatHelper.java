package utils;

import org.openqa.selenium.WebElement;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringFormatHelper {
    public static boolean doesStringMatchRegex(String checkedString, String regex) {
        Pattern regexPattern = Pattern.compile(regex);
        Matcher matcher = regexPattern.matcher(checkedString);
        return matcher.matches();
    }

    public static String trimCloseAlertCross(String stringToTrim) {
        // we substring error message, because first 2 characters are "×\n" from close alert cross
        return stringToTrim.substring(2);
    }
}
