class AddDigits{
    public int addDigits(int num) {
       /*
       while(num>9){
            String numStr = String.valueOf(num);
            int result = 0;
            for(int i=0;i<numStr.length();i++){
                result += Character.getNumericValue(numStr.charAt(i));
            }
            num = result;
        }
        return num;
        */
        if(num > 9 && num % 9 == 0)
            return 9;
        else if(num > 9)
            return num % 9;
        else
            return num;
    }
}