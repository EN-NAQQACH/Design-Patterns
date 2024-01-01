package Builder;

public interface Builder<type> {
    void BuildName(String name);
    void BuildModel(String model);
    void BuildPrice(String price);
    void BuildColor(String color);
    void BuildEngine(String engine);
    type getResult();
}
