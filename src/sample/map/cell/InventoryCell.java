package sample.map.cell;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import sample.map.snake.Snake;
import sample.misc.PivotImage;
import sample.misc.Point;

public class InventoryCell extends Cell{
    public InventoryCell(PivotImage image) {
        super(image);
    }
    public InventoryCell(Point point, PivotImage image) {
        super(point.getX(), point.getY(), image);
    }
    public InventoryCell(int row, int column, PivotImage image) {
        super(row, column, image);
    }

    @Override
    public boolean checkMove() {
        return true;
    }

    @Override
    public boolean tryMove(Snake snake) {
        snake.grow();
        return false;
    }
}
