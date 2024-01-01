package Builder;

public class NormalCar {
    private String name;
    private String model;
    private String color;
    private String engine;
    private String prix;

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

    @Override
    public String toString() {
        return "NormalCar [name=" + name + ", model=" + model + ", color=" + color + ", engine=" + engine + ", prix=" + prix+"]";
    }
    
}
