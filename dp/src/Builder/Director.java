package Builder;

public class Director {
    private Builder<SportCar> sportcar;
    private Builder<NormalCar> normalcar;

    void constructSportCar(Builder<SportCar> sportcar){
        sportcar.BuildName("range rover");
        sportcar.BuildModel("sport se 2023");
        sportcar.BuildColor("black red");
        sportcar.BuildPrice("300 000 dh");
        sportcar.BuildEngine("v12");
        ((SportCarBuilder)sportcar).BuildToit(true);
    }
    void constructNormalCar(Builder<NormalCar> normalcar){
        normalcar.BuildName("BMW");
        normalcar.BuildModel("M5");
        normalcar.BuildColor("black");
        normalcar.BuildPrice("300 000 dh");
        normalcar.BuildEngine("v8");
    }
}
