// qs
// https://leetcode.com/problems/longest-common-prefix/

package String;

import java.util.Arrays;

class Solution {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb=new StringBuilder();
        Arrays.sort(strs); //O(nlogn)
        String first=strs[0];
        String last=strs[strs.length-1];
        for(int i=0;i<Math.min(first.length(),last.length());i++){
            if(first.charAt(i)!=last.charAt(i)){
                break;
            }else{
                sb.append(first.charAt(i));
            }
        }
        return sb.toString();
        
    }
}

// Time complexity of this code is O(nlogn)+O(n)

