class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n=9;
        HashSet<Character>[] rows = new HashSet[n]; 
        HashSet<Character>[] cols = new HashSet[n];
        HashSet<Character>[] boxes = new HashSet[n];

        for(int i=0;i<n;i++){
            rows[i]=new HashSet<Character>();
            cols[i]=new HashSet<Character>();
            boxes[i]=new HashSet<Character>();
        }

        for(int i=0;i<n;i++){
            for(int j=0;j<n;j++){
                char val = board[i][j];
                if(val=='.')continue;
                if(!rows[i].add(val)) return false;
                if(!cols[j].add(val))return false;
                int idx = (i/3)*3+(j/3);
                if(!boxes[idx].add(val))return false;
            }
        }

        return true;
    }
}
