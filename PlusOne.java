class PlusOne{
    public int[] plusOne(int[] digits) {
        int length = digits.length;
        if(digits[length-1] == 9){
            int i = length-1;
            while(i>=0 && digits[i]==9){
                digits[i]=0;  
                i--;
            }
            if(i!=-1)
                digits[i] += 1;
            else{
                int[] result = new int[length+1];
                result[0]=1;
                System.arraycopy(digits,0,result,1,digits.length);
                return result;
            }
                
        }else{
            digits[length-1] += 1;
        }
        return digits;    
    }
}