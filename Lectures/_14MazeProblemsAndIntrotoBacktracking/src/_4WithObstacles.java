import java.util.*;
public class _4WithObstacles {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, false, true},
                {true, true, true}
        };
        pathObstacles("", maze, 0, 0);
    }

    static void pathObstacles(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1  && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        //maze[r][c] == false
        if(!maze[r][c]){
            return;
        }
        if(r < maze.length - 1){
            pathObstacles(p + 'D', maze, r + 1, c);
        }
        if(c < maze[0].length - 1){
            pathObstacles(p + 'R', maze, r, c + 1);
        }
    }
}
