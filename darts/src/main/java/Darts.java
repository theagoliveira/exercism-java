class Darts {
    private double x;
    private double y;
    private double radius;

    Darts(double x, double y) {
        this.x = x;
        this.y = y;
        radius = Math.sqrt(x * x + y * y);
    }

    int score() {
        if (radius > 10)
            return 0;
        else if (radius > 5)
            return 1;
        else if (radius > 1)
            return 5;
        else
            return 10;
    }

}
