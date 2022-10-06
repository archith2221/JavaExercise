package day05;

import java.util.Comparator;

public class StringSorter implements Comparator<String> {
	
	 private int islength(String s2) {
         return s2.length();
     }
  
 private int vowelCount(String s3) {
     String vowels = "AaEeIiOoUu";
     int count = 0;
     for (int i = 0; i < s3.length(); i++) {
         char s4 = s3.charAt(i);
         if (vowels.contains("" + s4)) {
             count++;
         }
     }
     return count;
 }
 public int compare(String o1, String o2) {
     int si1 = islength(o1);
     int si2 = islength(o2);





   if (si1 == si2) {
         return 0;
     }
     if (si1 < si2) {
         return -1;
     }
     return +1;
 }
  
}
