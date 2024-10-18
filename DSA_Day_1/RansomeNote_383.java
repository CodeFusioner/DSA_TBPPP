package DSA_Day_1;

public class RansomeNote_383 {
    public static void main(String[] args) {
        // we want to make ransome note by using magazine
        String ransomNote = "aa";
        String magazine = "aab";
        System.out.println(findRansomNote(ransomNote, magazine));

    }
    public static boolean findRansomNote(String ransomNote, String magazine) {
        char [] chars1 = ransomNote.toCharArray();
        char [] chars2 = magazine.toCharArray();
        int [] letters = new int[26];
        for(char ch : chars2){
            letters[ch - 'a']++;
        }
        for(char ch : chars1){
            letters[ch - 'a']--;
            if(letters[ch - 'a'] == -1){
                return false;
            }
        }
        return true;
    }
}
