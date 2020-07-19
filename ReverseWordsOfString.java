class ReverseWordsOfString{
    public String reverseWords(String s) {
        if(s==null || s.isEmpty())
            return "";
        s = removeSpaces(s);
        s = reverse(s);
        StringBuilder wordsReversed = new StringBuilder();
        int wordStart = 0;
        for(int i=0;i<=s.length();i++){
            if(i==s.length()){
                wordsReversed.append(reverse(s.substring(wordStart,i)));    
            }
            else if(s.charAt(i)==' '){
                wordsReversed.append(reverse(s.substring(wordStart,i))).append(" ");
                wordStart = i+1;
            }
        }
        return wordsReversed.toString();
    }
    
    public String reverse(String s){
        if(s==null || s.isEmpty())
            return "";
        StringBuilder reverse = new StringBuilder();
        for(int i=s.length()-1;i>=0;i--){
            reverse.append(s.charAt(i));
        }
        return reverse.toString();
    }
    public String removeSpaces(String s){
        StringBuilder spacesRemoved = new StringBuilder();
        s = s.trim();
        if(s==null || s.isEmpty())
            return "";
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i)==' ' && s.charAt(i+1)==' ')
                continue;
            spacesRemoved.append(s.charAt(i));
        }
        spacesRemoved.append(s.charAt(s.length()-1));
        return spacesRemoved.toString();
    }
}