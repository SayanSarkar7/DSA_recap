package String;
// qs
//https://leetcode.com/problems/reverse-words-in-a-string/

class Solution {
    public String reverseWords(String s) {
        String[] words=s.trim().split(" ");
        StringBuilder sb=new StringBuilder();

        for(int i=words.length-1;i>=0;i--){
            if(words[i]!=""){
                sb.append(words[i]);
                sb.append(" ");
            }
        }
        return sb.substring(0,sb.length()-1).toString();// substring to remove last space

    }
}

// Time Complexity, O(n), cause sb.append() takes O(n), if I have done adding in a string by += then the T.C becomes O(n)2