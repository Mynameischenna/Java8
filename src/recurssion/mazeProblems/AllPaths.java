package recurssion.mazeProblems;

public class AllPaths {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        mazeRestriction(row,col,maze,"");
    }

    private static void mazeRestriction(int rows, int col,boolean[][] maze,String p) {
        if(rows == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[rows][col]) return;// if you find river do not make recursive calls
        // if its visited its return
        // mark as false when you are visiting
        maze[rows][col]= false;
        // right
        if(col < maze.length-1){
            mazeRestriction(rows,col+1,maze,p+"R");
        }
        //down
        if(rows < maze[0].length-1) {
            mazeRestriction(rows+1,col, maze,p + "D");
        }
        //left
        if(col > 0){
            mazeRestriction(rows, col -1, maze,p + "L");
        }
        //up
        if(rows > 0){
            mazeRestriction(rows-1, col , maze,p + "U");
        }


        // while returning to previous class , restore the changes made while visiting
        maze[rows][col]= true;
    }
}
