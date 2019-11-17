package zad2;

public class Vehicle {

    private  String type;
    private  String producer;
    private  String model;
    private  String prodcutionYear;
    private  double mileage;
    private  String VIN;

    public Vehicle(String type, String producer, String model, String prodcutionYear, double mileage, String VIN) {
        this.type = type;
        this.producer = producer;
        this.model = model;
        this.prodcutionYear = prodcutionYear;
        this.mileage = mileage;
        this.VIN = VIN;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getProdcutionYear() {
        return prodcutionYear;
    }

    public void setProdcutionYear(String prodcutionYear) {
        this.prodcutionYear = prodcutionYear;
    }

    public double getMileage() {
        return mileage;
    }

    public void setMileage(double mileage) {
        this.mileage = mileage;
    }

    public String getVIN() {
        return VIN;
    }

    public void setVIN(String VIN) {
        this.VIN = VIN;
    }

    @Override
    public String toString() {
        return type +"; "+ producer +"; "+ model +"; "+ prodcutionYear +"; "+ mileage +"; "+ VIN;
    }
}
