package Builder;

public class SportCarBuilder implements Builder<SportCar> {
    private SportCar sportcar;
    public SportCarBuilder() {
        this.sportcar = new SportCar();
    }
    @Override
    public void BuildName(String name) {
       sportcar.setName(name);
    }

    @Override
    public void BuildModel(String model) {
        sportcar.setModel(model);
    }

    @Override
    public void BuildPrice(String price) {
        sportcar.setPrix(price);
    }

    @Override
    public void BuildColor(String color) {
        sportcar.setColor(color);
    }

    @Override
    public void BuildEngine(String engine) {
        sportcar.setEngine(engine);
    }
    
    public void BuildToit(boolean toit){
        sportcar.setToit(toit);
    }

    @Override
    public SportCar getResult() {
        return sportcar;
    }
}
