class Solution {
    public boolean isValidSudoku(char[][] board) {
        int n = board.length;
        List<Set<Character>> rows = new ArrayList<>(9);
        List<Set<Character>> cols = new ArrayList<>(9);
        List<Set<Character>> sq = new ArrayList<>(9);

        for (int i = 0; i < 9; i++) {
            rows.add(new HashSet<>());
            cols.add(new HashSet<>());
            sq.add(new HashSet<>());
        }

        for(int i=0; i<n; ++i){
            for (int j=0; j<n; ++j){
                if(board[i][j] == '.')
                    continue;
                
                int sqInd = (i/3)*3 + (j/3);
                // System.out.println("Square for ind [" + i +"][" + j + "]" + ": " + sqInd);
                boolean isRowAdded = rows.get(i).add(board[i][j]); // Row Check
                boolean isColAdded = cols.get(j).add(board[i][j]); // Col Check
                boolean isSqAdded = sq.get(sqInd).add(board[i][j]); // Square Check
                if(!isRowAdded || !isColAdded || !isSqAdded)
                    return false;
            }
        }
        return true;
    }
}
