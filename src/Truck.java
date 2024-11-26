public class Truck {
    public String modelName;
    public int wheelsCount;
    public Truck(String modelName, int wheelsCount){
        this.modelName = modelName;
        this.wheelsCount = wheelsCount;
    }
    public int getWheelsCount(){
        return wheelsCount;
    }
    public void setWheelsCount(int wheelsCount){
        this.wheelsCount =wheelsCount;
    }
    public String getModelName(){
        return modelName;
    }
    public void setModelName(){
        this.modelName = modelName;
    }

    public void updateTyre() {
        System.out.println("Меняем покрышку");
    }

    public void checkEngine() {
        System.out.println("Проверяем двигатель");
    }

    public void checkTrailer() {
        System.out.println("Проверяем прицеп");
    }
}
