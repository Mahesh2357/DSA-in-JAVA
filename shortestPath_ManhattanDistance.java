package String;

public class shortestPath_ManhattanDistance {
    public static int getManhattanDistance(String path) {
        int x = 0, y = 0;

        for (int i = 0; i < path.length(); i++) {
            char dir = path.charAt(i);

            if (dir == 'S') {
                y--;
            }
            if (dir == 'N') {
                y++;
            }
            if (dir == 'W') {
                x--;
            } else {
                x++;
            }
        }

        return Math.abs(x) + Math.abs(y);
    }

    public static void main(String[] args) {
        // 4 directions
        // E - east
        // W - west
        // N - north
        // S - South
        String p1 = "NSE";
        int n = getManhattanDistance(p1);
        System.out.println("Manhattan Distance: " + n);
    }
}
