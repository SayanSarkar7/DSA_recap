// qs
// https://leetcode.com/problems/valid-anagram/

package String;

import java.util.Arrays;

//Brute Force: O(nlogn)
// class Solution {
//     public boolean isAnagram(String s, String t) {
//         if(s.length()!=t.length()){
//             return false;
//         }
//         char arrS[]= s.toCharArray();
//         char arrT[]= t.toCharArray();
//         Arrays.sort(arrS);
//         Arrays.sort(arrT);
//         int idxS=0;
//         int idxT=0;
//         while(idxS<arrS.length && idxT<arrT.length){
//             if(arrS[idxS]!=arrT[idxT]){
//                 return false;
//             }
//             idxS++;
//             idxT++;
            
//         }
//         return true;       
//     }
// }
// -------------------------------------------------------------------

//
//Better: O(n)
class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        int freq[]=new int[26];
        int idxS=0;
        int idxT=0;
        while(idxS<s.length() && idxT<t.length()){
            char charS=s.charAt(idxS);
            int frequencyIdxS=charS-97;
            freq[frequencyIdxS]+=1;
            
            char charT=t.charAt(idxT);
            int frequencyIdxT=charT-97;
            freq[frequencyIdxT]-=1;
            
            idxS++;
            idxT++;
        }
        for(int i=0;i<freq.length;i++){
            if(freq[i]!=0){
                return false;
            }
        }
        return true;
    }
}




