package ChangedExample;

class GeometeryFactory {
    public Shape createShape(String shapeType) {
        if (shapeType == "Circle") {
            return new Circle();
        } else if (shapeType == "Square") {
            return new Square();
        } else if (shapeType == "Triangle") {
            return new Triangle();
        }
        return null;
    }
}
