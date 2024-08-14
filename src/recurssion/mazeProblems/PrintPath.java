package recurssion.mazeProblems;

import java.util.Arrays;

public class PrintPath {
    public static void main(String[] args) {
        int row = 0;
        int col = 0;
        boolean[][] maze = {
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path = {
                {0,0,0},
                {0,0,0},
                {0,0,0}
        };
        printPath(row,col,maze,"",path,1);
    }

    private static void printPath(int rows, int col,boolean[][] maze,String p,int[][] path,int step) {
        if(rows == maze.length-1 && col == maze[0].length-1){
            path[rows][col]= step;
            for(int[] arr : path){
                System.out.println(Arrays.toString(arr));
            }
            System.out.println(p);
            return;
        }
        if(!maze[rows][col]) return;// if you find river do not make recursive calls
        // if its visited its return
        // mark as false when you are visiting
        maze[rows][col]= false;
        path[rows][col]= step;
        // right
        if(col < maze.length-1){
            printPath(rows,col+1,maze,p+"R",path,step+1);
        }
        //down
        if(rows < maze[0].length-1) {
            printPath(rows+1, col , maze,p + "D",path,step+1);
        }
        //left
        if(col > 0){
            printPath(rows, col -1, maze,p + "L",path,step+1);
        }
        //up
        if(rows > 0){
            printPath(rows-1, col , maze,p + "U",path,step+1);
        }


        // while returning to previous class , restore the changes made while visiting
        maze[rows][col]= true;
//        path[rows][col]= 0;
    }
}
