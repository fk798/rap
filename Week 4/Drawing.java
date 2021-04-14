public class Drawing {
    private String name;
    private boolean isDog;
    private int numLegs;
    private double height;
    public Drawing(String name, boolean isDog, int numLegs, double height) {
        this.name = name;
        this.isDog = isDog;
        this.numLegs = numLegs;
        this.height = height;
    }

    public static void main(String[] args) {
        Drawing dog = new Drawing("Joe", true, 4, 10.0);
    }
}
