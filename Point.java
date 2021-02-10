public class Point {
	private int x;
	private int y;
    
	public Point(int x, int y) {
		this.x = x;
		this.y = y;
	}
    
	public int getX() {
		return x;
	}
    
	public void setX(int x) {
		this.x = x;
	}
    
	public int getY() {
		return y;
	}
    
	public void setY(int y) {
		this.y = y;
	}
    
	public static void findSlope(int x1, int y1, int x2, int y2) {
		double slope = 0.0;
		slope = (y2-y1)/(x2-x1);
		System.out.println(slope);
	}

}
