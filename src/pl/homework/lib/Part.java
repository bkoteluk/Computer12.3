package pl.homework.lib;

public abstract class Part {
    private String model;
    private String producer;
    private String sn;

    public Part(String model, String producer, String sn) {
        this.model = model;
        this.producer = producer;
        this.sn = sn;
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

    public String getSn() {
        return sn;
    }

    public void setSn(String sn) {
        this.sn = sn;
    }

    @Override
    public String toString() {
        return " model: " + model + "; producent: " + producer + "; s/n: " + sn;
    }
}
