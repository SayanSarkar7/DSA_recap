package String;

class Solution {
    public String largestOddNumber(String num) {
        int idx=-1;
        for(int i=num.length()-1;i>=0;i--){
            if((num.charAt(i)-'0') % 2 != 0){
                idx=i;
                break;
            }
        }
        if(idx==-1){
            return "";
        }
        int j=0;
        while(j<=idx){
            if((num.charAt(j)-'0')==0){
                j++;
            }else{
                // j=j;
                break;
            }
        }
        return num.substring(j,idx+1);

    }
}