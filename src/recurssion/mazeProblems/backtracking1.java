package recurssion.mazeProblems;

import java.util.ArrayList;
import java.util.List;

// need to reach target , you either move down or right
public class backtracking1 {
    public static void main(String[] args) {
        int rows = 0;
        int col = 0;
//        System.out.println(findTraget(rows,col));
//        findTragetPri(rows,col,"");
//        System.out.println(findTragetDiaRet(rows,col,""));
        boolean[][] maze = {
                {true,true,true},
                {true,false,true},
                {true,true,true}
        };
        mazeRestriction(rows,col,maze,"");

    }



    private static int findTraget(int rows, int col) {
        if(rows == 1 || col == 1){
            return 1;
        }
        int c1 = findTraget(rows-1,col);
        int c2 = findTraget(rows,col-1);
        return c1+c2;
    }
    private static void mazeRestriction(int rows, int col,boolean[][] maze,String p) {
        if(rows == maze.length-1 && col == maze[0].length-1){
            System.out.println(p);
            return;
        }
        if(!maze[rows][col]) return;// if you find river do not make recursive calls
        if(rows < maze.length-1){
            mazeRestriction(rows+1,col,maze,p+"R");
        }
        if(col < maze[0].length-1) {
            mazeRestriction(rows, col +1, maze,p + "D");
        }
    }
    private static void findTragetPri(int rows, int col,String p) {
        if(rows == 1 && col == 1){
            System.out.println(p);
            return;
        }
        if(rows > 1){
            findTragetPri(rows-1,col,p+"R");
        }
        if(col > 1) {
            findTragetPri(rows, col - 1, p + "D");
        }
    }
    private static List<String> findTragetRet(int rows, int col,String p) {
        if(rows == 1 && col == 1){
            List<String> lis = new ArrayList<>();
            lis.add(p);
            return lis;
        }
        List<String> lis = new ArrayList<>();
        if(rows > 1){
            lis.addAll(findTragetRet(rows-1,col,p+"R"));
        }
//        if(rows>1 && col >1){
//            lis.addAll(findTragetRet(rows-1,col,p+"O")); // O - diagonal
//        }
        if(col > 1) {
            lis.addAll(findTragetRet(rows, col - 1, p + "D"));
        }
        return lis;
    }

    //Including diagonal also
    private static List<String> findTragetDiaRet(int rows, int col,String p) {
        if(rows == 1 && col == 1){
            List<String> lis = new ArrayList<>();
            lis.add(p);
            return lis;
        }
        List<String> lis = new ArrayList<>();
        if(rows > 1){
            lis.addAll(findTragetDiaRet(rows-1,col,p+"R"));
        }
        if(rows>1 && col >1){
            lis.addAll(findTragetDiaRet(rows-1,col-1,p+"O")); // O - diagonal
        }
        if(col > 1) {
            lis.addAll(findTragetDiaRet(rows, col - 1, p + "D"));
        }
        return lis;
    }
}
