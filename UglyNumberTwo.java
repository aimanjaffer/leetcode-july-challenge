public class UglyNumberTwo{
    public int nthUglyNumber(int n) {
       int[] ugly = new int[n];
        ugly[0] = 1;
        
        int index2 = 0;
        int index3 = 0;
        int index5 = 0;
        
        int factor2 = 2;
        int factor3 = 3;
        int factor5 = 5;
        
        for(int i=1;i<n;i++){
            int min= Math.min(Math.min(factor2,factor3),factor5);
            ugly[i] = min;
            if(ugly[i] == factor2){
                index2++;
                factor2 = 2* ugly[index2];
            }
            if(ugly[i] == factor3){
                index3++;
                factor3 = 3* ugly[index3];
            }
            if(ugly[i] == factor5){
                index5++;
                factor5 = 5* ugly[index5];
            }
        }
        return ugly[n-1];          
    }
}