import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the repeatedString function below.
    static long repeatedString(String s, long n) {
    	long size = s.length();
    	long acount = s.codePoints().filter(c -> c == 'a').count();
    	long numberofrepitions = n / size ;
    	long totalrepitition = numberofrepitions * acount;
    	int left = (int)(n % size);
    	s = s.substring(0, left);
    	totalrepitition += s.codePoints().filter(c -> c == 'a').count();
    	return totalrepitition;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        
        String s = "abcac";

        long n = Long.parseLong("10");
       
        long result = repeatedString(s, n);
        System.out.println(result);
        scanner.close();
    }
}
