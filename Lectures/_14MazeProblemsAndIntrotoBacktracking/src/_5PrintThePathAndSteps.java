import java.util.Arrays;

public class _5PrintThePathAndSteps {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        int[][] arr = new int[maze.length][maze[0].length];
        pathAndSteps("", 0, 0, maze, arr, 1);
    }

    static void pathAndSteps(String p, int r, int c, boolean[][] maze ,int[][] arr, int step){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            arr[r][c] = step;
            for (int[] row : arr){
                System.out.println(Arrays.toString(row));
            }
            System.out.println(p);
            System.out.println();
            return;

        }
        if(!maze[r][c]){
            return;
        }
        arr[r][c] = step;
        maze[r][c] = false;
        if(r < maze.length - 1){
            pathAndSteps(p + 'D', r + 1, c, maze, arr, step + 1);
        }
        if(c < maze[0].length - 1){
            pathAndSteps(p + 'R', r, c + 1, maze, arr, step + 1);
        }
        if(r > 0){
            pathAndSteps(p + 'U', r - 1, c, maze, arr, step + 1);
        }
        if(c > 0){
            pathAndSteps(p + 'L', r, c - 1, maze, arr, step + 1);
        }
        maze[r][c] = true;
        arr[r][c] = 0;
    }
}
