package Builder;

public class SportCar {
    private String name;
    private String model;
    private String color;
    private String engine;
    private String prix;
    private boolean Toit;

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getModel() {
        return model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }
    public String getEngine() {
        return engine;
    }
    public void setEngine(String engine) {
        this.engine = engine;
    }
    public String getPrix() {
        return prix;
    }
    public void setPrix(String prix) {
        this.prix = prix;
    }
    public boolean isToit() {
        return Toit;
    }
    public void setToit(boolean toit) {
        Toit = toit;
    }
}
