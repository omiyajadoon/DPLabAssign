package GitHubExample;
class TriangleGeometry extends Geometery {
    @Override
    public Shape createShape() {
        return new Triangle();
    }
}
