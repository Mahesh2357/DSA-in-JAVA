package String;

public class Shortest_Path {
    public static float getPath(String path) {
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
        int x2 = x * x;
        int y2 = y * y;

        return (float) Math.sqrt(x2 + y2);
    }

    public static void main(String[] args) {
        // 4 directions
        // E - east
        // W - west
        // N - north
        // S - South
        String p1 = "NSE";
        float n = getPath(p1);
        System.out.println("Output: " + n);
    }
}
