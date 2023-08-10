package task_2_3_4;

import java.util.Objects;

public class Device {
    protected String manufacturer;
    protected float price;
    protected String serialNumber;

    protected Device(String manufacturer, float price, String serialNumber) {
        this.manufacturer = manufacturer;
        this.price = price;
        this.serialNumber = serialNumber;
    }

    protected String getManufacturer() {
        return manufacturer;
    }
    protected void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
    protected float getPrice() {
        return price;
    }

    protected void setPrice(float price) {
        this.price = price;
    }

    protected String getSerialNumber() {
        return serialNumber;
    }

    protected void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    @Override
    public String toString () {
        return "Device: manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Device device)) return false;
        return Float.compare(device.getPrice(), getPrice()) == 0 && Objects.equals(getManufacturer(), device.getManufacturer()) && Objects.equals(getSerialNumber(), device.getSerialNumber());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getManufacturer(), getPrice(), getSerialNumber());
    }
}
