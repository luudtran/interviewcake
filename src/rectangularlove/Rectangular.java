package rectangularlove;

public class Rectangular {
	
	public static Rectangle findIntersection(Rectangle a, Rectangle b) {
		if ((b.leftX + b.width <= a.leftX) ||
				(b.bottomY >= a.bottomY + a.height) ||
				(a.leftX + a.width <= b.leftX) ||
				(b.bottomY + b.height <= a.bottomY)) {
			return null;
		}
		
		int leftX = 0;
		int bottomY = 0;
		int width = 0;
		int height = 0;
		
		if (a.leftX < b.leftX) {
			leftX = b.leftX;
			width = a.leftX + a.width - b.leftX;
		} else if (a.leftX == b.leftX) {
			leftX = a.leftX;
			if (a.width < b.width) {
				width = a.width;
			} else {
				width = b.width;
			}
		} else {
			leftX = a.leftX;
			width = b.leftX + b.width - a.leftX;
		}
		
		if (a.bottomY < b.bottomY) {
			bottomY = b.bottomY;
			height = a.bottomY + a.height - b.bottomY;
		} else if (a.bottomY == b.bottomY) {
			bottomY = a.bottomY;
			if (a.height < b.height) {
				height = a.height;
			} else {
				height = b.height;
			}
		} else {
			bottomY = a.bottomY;
			height = b.bottomY + b.height - a.bottomY;
		}
				
		return new Rectangle(leftX, bottomY, width, height);
	}

}
