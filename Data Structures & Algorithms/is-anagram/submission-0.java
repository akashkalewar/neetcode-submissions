class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()){
            return false;
        }
        char chars[] = s.toCharArray();
        char chart[] = t.toCharArray();

        Arrays.sort(chars);
        Arrays.sort(chart);

        String sortedStrings = new String(chars);
        String sortedStringt = new String(chart);

        for(int i = 0; i < sortedStrings.length(); i++){
            if (sortedStrings.charAt(i) != sortedStringt.charAt(i))     {
                return false;
            }
        }
        return true;
    }
}
