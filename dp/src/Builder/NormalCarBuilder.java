package Builder;

public class NormalCarBuilder  implements Builder<NormalCar>{
    private NormalCar normalcar;

    public NormalCarBuilder() {
        this.normalcar = new NormalCar();
    }

    @Override
    public void BuildName(String name) {
            normalcar.setName(name);
    }

    @Override
    public void BuildModel(String model) {
       normalcar.setModel(model);
    }

    @Override
    public void BuildPrice(String price) {
       normalcar.setPrix(price);
    }

    @Override
    public void BuildColor(String color) {
        normalcar.setColor(color);
    }

    @Override
    public void BuildEngine(String engine) {
       normalcar.setEngine(engine);
    }

    public NormalCar getResult(){
        return normalcar;
    }
    
}
