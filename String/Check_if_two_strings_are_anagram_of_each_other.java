package String;

import java.util.Arrays;

class Solution {
    public boolean isAnagram(String s, String t) {
        if(s.length()!=t.length()){
            return false;
        }
        char arrS[]= s.toCharArray();
        char arrT[]= t.toCharArray();
        Arrays.sort(arrS);
        Arrays.sort(arrT);
        int idxS=0;
        int idxT=0;
        while(idxS<arrS.length && idxT<arrT.length){
            if(arrS[idxS]!=arrT[idxT]){
                return false;
            }
            idxS++;
            idxT++;
            
        }
        return true;       
    }
}
