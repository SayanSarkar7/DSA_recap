// qs
// https://leetcode.com/problems/rotate-string/

package String;

// BruteForce
// class Solution {
//     public boolean rotateString(String s, String goal) {
//         if(s.length()!=goal.length()){
//             return false;
//         }
//         String s1="";
//         for(int i=0;i<s.length();i++){
//             String left=s.substring(0,i+1);
//             s1=s.substring(i+1);
//             s1=s1+left;
//             if(s1.equals(goal)){
//                 return true;
//             }
//         }
//         return false;
//     }
// }

// --------------------------------------------------------

class Solution {
    public boolean rotateString(String s, String goal) {
        if(s.length()!=goal.length()){
            return false;
        }
        String doubledS=s+s;
        if(doubledS.contains(goal)){
            return true;
        }
        return false;
    }
}

 
