class Solution {
    public boolean isValidSudoku(char[][] board) {
        for(int row=0;row<9;row++){
            HashSet<Character> set=new HashSet<>();
            for(int col=0;col<9;col++){
                char ch=board[row][col];
                if(ch=='.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }
        for(int col=0;col<9;col++){
            HashSet<Character> set=new HashSet<>();
            for(int row=0;row<9;row++){
                char ch=board[row][col];
                if(ch=='.'){
                    continue;
                }
                if(set.contains(ch)){
                    return false;
                }
                set.add(ch);
            }
        }
        for(int boxrow=0;boxrow<9;boxrow+=3){
            for(int boxcol=0;boxcol<9;boxcol+=3){
                HashSet<Character> set=new HashSet<>();
                for(int row=boxrow;row<boxrow+3;row++){
                    for(int col=boxcol;col<boxcol+3;col++){
                        char ch=board[row][col];
                        if(ch=='.'){
                            continue;
                        }
                        if(set.contains(ch)){
                            return false;
                        }
                        set.add(ch);
                    }
                }
            }

        }
        return true;
        
        
    }
}
