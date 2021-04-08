import javafx.beans.property.*;

public class Balloon {
    private DoubleProperty x = new SimpleDoubleProperty();
    private DoubleProperty y = new SimpleDoubleProperty();

    public Balloon(DoubleProperty x, DoubleProperty y) {
        this.x = x;
        this.y = y;
    }    

    public DoubleProperty getX() {
        return x;
    }

    public void setX(DoubleProperty x) {
        this.x = x;
    }

    public DoubleProperty getY() {
        return y;
    }

    public void setY(DoubleProperty y) {
        this.y = y;
    }

	public void move() {
        if (x.intValue() < 400) {
            x = new SimpleDoubleProperty(x.getValue() + 5);
        } else {
            x = new SimpleDoubleProperty(10);
        }
	}


}
