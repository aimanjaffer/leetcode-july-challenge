import java.util.*;
class  PrisonCellsAfterNdays{
    public int[] prisonAfterNDays(int[] cells, int N) {
        if(cells==null || cells.length==0 || N<=0)
            return cells;
        boolean hasCycles = false;
        int cycles = 0;
        HashSet<String> set = new HashSet<>();
        int[] next = new int[cells.length];
        for(int i = 0; i<N;i++){
            next = nextDay(cells);
            String key = Arrays.toString(next);
            if(!(set.contains(key))){
                set.add(key);
                cycles++;
            }
            else{
                hasCycles = true;
                break;
            }
            cells = next;
        }
        if(hasCycles){
            N = N % cycles;
            for(int i=0;i<N;i++){
                cells = nextDay(cells);    
            }    
        }
        return cells;
        
        
    }
    
    
    public int[] nextDay(int[] cells){
        int[] temp = new int[cells.length];
        for(int i=1;i<cells.length-1;i++){
            if(cells[i-1]==cells[i+1])
                temp[i]=1;
            else
                temp[i]=0;
        }
        return temp;
    }
}