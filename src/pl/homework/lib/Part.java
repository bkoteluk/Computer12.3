package pl.homework.lib;

public abstract class Part {
    private String model;
    private String producer;
    private String serialNumber;

    public Part(String model, String producer, String serialNumber) {
        this.model = model;
        this.producer = producer;
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString() {
        return " model: " + model + "; producent: " + producer + "; s/n: " + serialNumber;
    }
}
