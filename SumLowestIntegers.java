/**
 * Create a function that returns the sum of the two lowest positive numbers given an array of minimum 4 positive integers. No floats 
 * or non-positive integers will be passed.
 * 
 * For Java, those integers will come as double precision (long).
 * 
 * For example, when an array is passed like [19, 5, 42, 2, 77], the output should be 7.
 * 
 * [10, 343445353, 3453445, 3453545353453] should return 3453455.
 */
import java.util.ArrayList;
import java.util.List;
import org.apache.commons.lang3.ArrayUtils;

class SumLowestIntegers {
  public static long sumTwoSmallestNumbers(long[] numbers) {
    Long[] longObjects = ArrayUtils.toObject(numbers);
    List<Long> longList = java.util.Arrays.asList(longObjects);
    longList.sort(null);
    return longList.get(0) + longList.get(1); 
  }             
}