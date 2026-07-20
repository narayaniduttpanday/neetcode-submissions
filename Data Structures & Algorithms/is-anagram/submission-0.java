class Solution {
    public boolean isAnagram(String s, String t) {
        int len1 = s.length();
        int len2 = t.length();

        if(len1 != len2){
            return false;
        }

        int[] scoreCard = new int[26];
        for(int i=0;i<len1;i++){
            scoreCard[s.charAt(i)-'a']++; //increment the value from 0 to number of times a character is encountered
            scoreCard[t.charAt(i)-'a']--; //decrement the value from whatever it is based on the occunrence of character in String(t).
        }

        for(int count : scoreCard){
            if(count!=0){
                return false;
            }
        }
        return true;
    }
}
