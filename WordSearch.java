class WordSearch{
    public boolean exist(char[][] board, String word) {
        boolean wordFound = false;
        int m= board.length;
        int n= board[0].length;
        int[][] encountered = new int[m][n];
        char startChar = word.charAt(0);
        for(int i=0;i<board.length;i++){
            for(int j=0;j<board[i].length;j++){
                if(board[i][j]==startChar){
                    encountered[i][j]=1;
                     if(wordExistsRecursive(board, word, i, j,0))
                         wordFound=true;
                }
            }
        }
    return wordFound;
    }
    
    
    public boolean wordExistsRecursive(char[][] board, String word, int i, int j, int index){       
        
        if(index==word.length()){
            return true;
        }
        
        if(i<0 || j<0 || i>board.length-1 || j>board[i].length-1 || board[i][j]!=word.charAt(index)){
            return false;
        }
        
        char temp = board[i][j];
        board[i][j]=' ';
        
        boolean wordFound = wordExistsRecursive(board,word, i+1,j,index+1) || wordExistsRecursive(board,word, i-1,j,index+1) || wordExistsRecursive(board,word, i,j+1,index+1) || wordExistsRecursive(board,word, i,j-1,index+1);
        
        board[i][j]=temp;
        
        return wordFound;
    }
    
}