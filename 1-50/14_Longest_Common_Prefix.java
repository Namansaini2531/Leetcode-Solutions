import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        Arrays.sort(strs);
        int i = 0;   //index

        String str1 = strs[i];
        String str2 = strs[strs.length-1];

        while(i<str1.length()){
            if(str1.charAt(i)==str2.charAt(i)){
                i++;
            }
            else{
                break;
            }
        }

        return i==0? "" : str1.substring(0, i);
    }
}
