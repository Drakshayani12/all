interface Drawable{
    public void draw();
}
public class Lamba {
    public static void main(String[] args) {
        int width = 10;
        Drawable d2 =()->
        {
            System.out.println("width"+width);
        };
        d2.draw();
    }
}
