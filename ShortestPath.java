package String;

public class ShortestPath {
    private int x, y;

    public ShortestPath(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getShortestPath(int p) {
        int distance = Math.abs(x) + Math.abs(y); 
        // Calculate the Manhattan distance.
        if (distance <= p) {
            return distance;
        } else {
            return -1; // Return -1 if the distance is greater than p, indicating no valid path within the given range.
        }
    }

    public static void main(String[] args) {
        int destinationX = 3; // Replace with the desired destination x-coordinate.
        int destinationY = 4; // Replace with the desired destination y-coordinate.
        int maximumPathLength = 7; // Replace with the maximum path length allowed.

        ShortestPath pathFinder = new ShortestPath(destinationX, destinationY);
        int shortestPath = pathFinder.getShortestPath(maximumPathLength);

        if (shortestPath != -1) {
            System.out.println("Shortest Path: " + shortestPath);
        } else {
            System.out.println("No valid path within the given range.");
        }
    }
}
