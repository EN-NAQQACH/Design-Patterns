package Builder;

public class App {
    public static void main(String[] args) throws Exception {
        Director dr = new Director();
        Builder<NormalCar> b = new NormalCarBuilder();
        dr.constructNormalCar(b);
        NormalCar nc = b.getResult();;
        System.out.println(nc);
    }
}
