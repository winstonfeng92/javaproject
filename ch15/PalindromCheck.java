package ch15;

public class PalindromCheck {
    
    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("\\s","");
        s = s.replaceAll("\\W","");
        int[] charHistogram = new int[26];
        for (int i = 0; i < s.length(); i ++) {
            if(s.charAt(i)-'a' >= 0 || s.charAt(i)-'a' < 26){
            charHistogram[s.charAt(i)-'a']++;
            }
        }
        int oddCounter = 0;
        int charCounter = s.length();
        for (int i = 0; i < charHistogram.length; i++) {
            //if (charHistogram[i] != 0) charCounter++;
            charHistogram[i] = charHistogram[i]%2;
            if (charHistogram[i] != 0) oddCounter++;
        }
        System.out.println(oddCounter + " "+ charCounter);
        if(oddCounter ==0 || charCounter%2 ==1 && oddCounter <= 1) {
            return true;
        }
        return false;

    }

    public static void main(String[] args) {
        System.out.println(isPalindrome("A man, a plan, a canal: Panama"));
    }
}
