/*
On an alphabet board, we start at position (0, 0), corresponding to character board[0][0].
Here, board = ["abcde", "fghij", "klmno", "pqrst", "uvwxy", "z"].

We may make the following moves:
'U' moves our position up one row, if the position exists on the board;
'D' moves our position down one row, if the position exists on the board;
'L' moves our position left one column, if the position exists on the board;
'R' moves our position right one column, if the position exists on the board;
'!' adds the character board[r][c] at our current position (r, c) to the answer.
(Here, the only positions that exist on the board are positions with letters on them.)

Return a sequence of moves that makes our answer equal to target in the minimum number of moves.  You may return any path that does so.
*/

class Solution {
    public String alphabetBoardPath(String target) {
        StringBuilder sb = new StringBuilder();
        int[] prev = new int[]{0,0};
        System.out.println(prev.length);
        for(char c:target.toCharArray()){
            int[] curr = getPos(c);
            sb.append(getPath(prev,curr));
            sb.append('!');
            prev = curr;
        }
        return sb.toString();
    }
    private int[] getPos(char c){
        int offset = c- 'a';
        int x = offset/5;
        int y = offset%5;
        return new int[]{x,y};
    }
    private String getPath(int[] from, int[] to){
        char x = to[0] >= from[0] ? 'D' : 'U';
        char y = to[1] >= from[1] ? 'R' : 'L';
        int xOff = Math.abs(to[0] - from[0]);
        int yOff = Math.abs(to[1] - from[1]);
        StringBuilder sb = new StringBuilder();
        if (x == 'U') {
            for (int i = 0; i < xOff; i++) { sb.append(x);}
            for (int i = 0; i < yOff; i++) { sb.append(y);}
        } else {
            for (int i = 0; i < yOff; i++) { sb.append(y);}
            for (int i = 0; i < xOff; i++) { sb.append(x);}            
        }
        return sb.toString();
    }
}
