public class Run {
    public static void main(String[] args) {
        Triangle tg = new Triangle(3,3,3,"yellow");
        tg.setColor("blue");
        tg.setSide1(2);
        tg.setSide2(3);
        tg.setSide3(4);
        System.out.println(tg);
        Triangle tg1 = new Triangle(3,3,3,"yellow");
        System.out.println(tg1);
    }
}
