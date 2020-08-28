package com.kievprog.chukhnovm.hw1_3;

public class Vector3d {

    private double x;
    private double y;
    private double z;

    public Vector3d() {
    }

    public Vector3d(double x, double y, double z) {
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }

    /**
     * Sum of two vectors
     *
     * @param vector Vector3d
     * @return Vector3d
     */
    public Vector3d sum(Vector3d vector) {

        return new Vector3d(
            round(this.getX() + vector.getX()),
            round(this.getY() + vector.getY()),
            round(this.getZ() + vector.getZ())
        );
    }

    /**
     * Difference of two vectors
     *
     * @param vector Vector3d
     * @return Vector3d
     */
    public Vector3d diff(Vector3d vector) {

        return new Vector3d(
            round(this.getX() + vector.getX()),
            round(this.getY() + vector.getY()),
            round(this.getZ() + vector.getZ())
        );
    }

    /**
     * Scalar vector multiplication
     *
     * @param vector Vector3d
     * @return double
     */
    public double dot(Vector3d vector) {
        return this.getX() * vector.getX() + this.getY() * vector.getY() + this.getZ() * vector.getZ();
    }

    /**
     * Vector multiplication
     *
     * @param vector Vector3d
     * @return double
     */
    public Vector3d cross(Vector3d vector) {

        double x3 = round(this.getY() * vector.getZ() - this.getZ() * vector.getY());
        double y3 = round(this.getZ() * vector.getX() - this.getX() * vector.getZ());
        double z3 = round(this.getX() * vector.getY() - this.getY() * vector.getX());

        return new Vector3d(x3, y3, z3);
    }

    private double round(double num) {
        return Math.round(num * 100d) / 100d;
    }

    @Override
    public String toString() {
        return "Vector3d{" +
                "x=" + x +
                ", y=" + y +
                ", z=" + z +
                '}';
    }

}
