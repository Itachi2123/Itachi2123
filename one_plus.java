class Solution {
    public int[] plusOne(int[] d) {
        for(int i = d.length-1; i>=0; i--){
            if(d[i]+1!=10){
                d[i]+=1;
                return d;
            }
            d[i]=0;
        }
        int[] newD= new int[d.length+1];
        newD[0]=1;
        return newD;
    }
}