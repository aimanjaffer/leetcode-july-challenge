class ArrangingCoins{
    public int arrangeCoins(int n) {
        if(n==0)
            return 0;
        int i=0;
        while(n>=i){
        //System.out.println("n: "+n);
        //System.out.println("i: "+i);
            n=n-i;         
            if(n>i)
                i++;
        }
        return i;
    }
}