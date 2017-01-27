package rectangularlove;

public class Rectangle {

    // coordinates of bottom left corner
    Integer leftX;
    Integer bottomY;

    // dimensions
    Integer width;
    Integer height;

    public Rectangle(Integer leftX, Integer bottomY, Integer width, Integer height) {
        this.leftX = leftX;
        this.bottomY = bottomY;
        this.width  = width;
        this.height = height;
    }

    public Rectangle() {}

    public String toString() {
        return String.format("(%d, %d, %d, %d)", leftX, bottomY, width, height);
    }

	@Override
	public int hashCode() {
		return leftX.hashCode() + bottomY.hashCode() + width.hashCode() + height.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (!(obj instanceof Rectangle)) {
			return false;
		}
		
		Rectangle rect = (Rectangle)obj;
		if (leftX.equals(rect.leftX) &&
				bottomY.equals(rect.bottomY) &&
				width.equals(rect.width) &&
				height.equals(rect.height)) {
			return true;
		} else {
			return false;
		}
	}
    
    
}
