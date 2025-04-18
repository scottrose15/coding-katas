import java.util.stream.*;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * Return the number (count) of vowels in the given string.
 *
 *We will consider a, e, i, o, u as vowels for this Kata (but not y).
 *
 *The input string will only consist of lower case letters and/or spaces.
 */
public class VowelCount {

  public static int getCount(String str) {
    AtomicInteger vowelCount = new AtomicInteger();
    str.chars().filter(c -> getVowelValue((char) c)).forEach(c -> vowelCount.getAndIncrement());
    return vowelCount.get();
  }
  
  private static Boolean getVowelValue(char c){
    boolean vowelValue = false;
    char character = Character.toLowerCase(c);
    switch(character) {
      case 'a': 
      case 'e': 
      case 'i': 
      case 'o': 
      case 'u': 
        vowelValue = true;
        break;
    }
    return vowelValue;
  }

}