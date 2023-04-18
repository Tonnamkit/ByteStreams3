package ByteStreams3;

public class LAB01 {
    public static void main(String[] args) {
        RedShapeDecorator s1 = new RedShapeDecorator(new Circle());
        s1.draw();
        System.out.println("---------------------------------------");
        RedShapeDecorator s2 = new RedShapeDecorator(new Rectangle());
        s2.draw();

    }
}
