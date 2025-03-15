import java.util.ArrayList;

public class _5InAllDirections {
    public static void main(String[] args) {
        boolean[][] maze = {
                {true, true, true},
                {true, true, true},
                {true, true, true}
        };
        System.out.println(pathAllDirectionsRet("", maze, 0, 0));
    }

    static void pathAllDirections(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            System.out.println(p);
            return;
        }
        if(!maze[r][c]){
            return;
        }
        //This will mark the cell as Visited if there is no obstacle there
        maze[r][c] = false;

        if(r < maze.length - 1){
            pathAllDirections(p + 'D', maze, r + 1, c);
        }
        if(c < maze.length - 1){
            pathAllDirections(p + 'R', maze, r, c + 1);
        }
        if(r > 0){
            pathAllDirections(p + 'U', maze, r - 1, c);
        }
        if(c > 0){
            pathAllDirections(p + 'L', maze, r, c - 1);
        }

        //This is the line where function end or returns to the above function call
        //so here we will restore the original cell values
        maze[r][c] = true;
    }

    static ArrayList<String> pathAllDirectionsRet(String p, boolean[][] maze, int r, int c){
        if(r == maze.length - 1 && c == maze[0].length - 1){
            ArrayList<String> list = new ArrayList<>();
            list.add(p);
            return list;
        }
        if(!maze[r][c]){
            return new ArrayList<>();
        }
        //This will mark the cell as Visited if there is no obstacle there
        maze[r][c] = false;
        ArrayList<String> ans = new ArrayList<>();
        if(r < maze.length - 1){
            ans.addAll(pathAllDirectionsRet(p + 'D', maze, r + 1, c));
        }
        if(c < maze.length - 1){
            ans.addAll(pathAllDirectionsRet(p + 'R', maze, r, c + 1));
        }
        if(r > 0){
            ans.addAll(pathAllDirectionsRet(p + 'U', maze, r - 1, c));
        }
        if(c > 0){
            ans.addAll(pathAllDirectionsRet(p + 'L', maze, r, c - 1));
        }

        //This is the line where function end or returns to the above function call
        //so here we will restore the original cell values
        maze[r][c] = true;
        return ans;
    }
}
