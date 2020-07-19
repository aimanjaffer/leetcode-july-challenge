class Pow{
    public double myPow(double x, int n) {
         if (x == -1) {
            if (n % 2 == 0)
                return 1;
            else
                return -1;
        }
        if(n<0){
            x = (double)(1.0d/x);
            if(n != Integer.MIN_VALUE)
                n=Math.abs(n);
            else if(n==Integer.MIN_VALUE && x!=1)
                return 0;
            else if(n==Integer.MIN_VALUE && x==1)
                return 1;
        }
        if(n==0)
            return 1;
        if(x==1)
            return 1;
        double dp = x;
        
        for(int i=1;i<n;i++){
            dp = dp * x;
        }
        return dp;
    }   
}