
public class Ball {
	
	private float x;
	private float y;
	private int radius;
	private float xDelta;
	private float yDelta;
	
	
	public Ball() {
		super();
		x = 0;
		y = 0;
		radius = 0;
		xDelta = 0;
		yDelta = 0;
	}


	public Ball(float x, float y, int radius, int speed, int direction) {
		super();
		this.x = x;
		this.y = y;
		this.radius = radius;
		this.xDelta = (float)(speed * (Math.cos(Math.toRadians(direction))));
		this.yDelta = (float)(speed * (Math.sin(Math.toRadians(direction))));
	}


	public float getX() {
		return x;
	}


	public void setX(float x) {
		this.x = x;
	}


	public float getY() {
		return y;
	}


	public void setY(float y) {
		this.y = y;
	}


	public int getRadius() {
		return radius;
	}


	public void setRadius(int radius) {
		this.radius = radius;
	}


	public float getxDelta() {
		return xDelta;
	}


	public void setxDelta(float xDelta) {
		this.xDelta = xDelta;
	}


	public float getyDelta() {
		return yDelta;
	}


	public void setyDelta(float yDelta) {
		this.yDelta = yDelta;
	}
	
	public void setXY(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	public void move() {
		x += xDelta;
		y += yDelta;
	}
	
	public void reflectHorizontal() {
		xDelta = -xDelta;
	}
	
	public void reflectVertical() {
		yDelta = -yDelta;
	}


	@Override
	public String toString() {
		return "Ball at (" + x + "," + y + ") of velocity (" + xDelta + "," + yDelta + ")";
	}
	
	
	

}
