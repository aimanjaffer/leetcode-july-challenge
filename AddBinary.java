class AddBinary{
    public String addBinary(String a, String b) {
        int carry = 0;
        int aLength = a.length();
        int bLength = b.length();
        String result = "";
        if(aLength > bLength){
            for(int i=0;i<aLength-bLength;i++){
                b = "0"+b;
            }
        }else if(bLength > aLength){
            for(int i=0;i<bLength-aLength;i++){
                a = "0"+a;
            }    
        }
        //System.out.println("a: "+a);
        //System.out.println("b: "+b);
        int length = a.length();
        for(int i=length-1;i>=0;i--){
            if(a.charAt(i)=='1' && b.charAt(i)=='1'){
                if(carry==1){
                    result ="1"+result;
                    carry = 1;
                }else if(carry==0){
                    result ="0"+result;
                    carry = 1;
                }
            }else if(a.charAt(i)=='1' || b.charAt(i)=='1'){
                if(carry==1){
                    result = "0"+result;
                    carry = 1;
                }else if(carry == 0){
                    result ="1"+result;
                    carry = 0;
                }   
            }else if(a.charAt(i)=='0' && b.charAt(i)=='0'){
                result = ""+carry+result;
                carry = 0;
            }
        }
        if(carry==1)
            return ""+carry+result;
        else
            return result;
    }
}