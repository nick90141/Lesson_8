package task_2_3_4;

import java.util.Objects;

public class Monitor extends Device {
    public int resolutionX;
    public int resolutionY;

    public Monitor(String manufacturer, float price, String serialNumber, int resolutionX, int resolutionY) {
        super(manufacturer, price, serialNumber);
        this.resolutionX = resolutionX;
        this.resolutionY = resolutionY;
    }

    public int getResolutionX() {
        return resolutionX;
    }

    public void setResolutionX(int resolutionX) {
        this.resolutionX = resolutionX;
    }

    public int getResolutionY() {
        return resolutionY;
    }

    public void setResolutionY(int resolutionY) {
        this.resolutionY = resolutionY;
    }

    @Override
    public String toString () {
        return "Monitor: manufacturer = " + manufacturer + ", price = " + price + ", serialNumber = " + serialNumber + ", X = " + resolutionX + ", Y = " + resolutionY;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Monitor monitor)) return false;
        return getResolutionX() == monitor.getResolutionX() && getResolutionY() == monitor.getResolutionY();
    }

    @Override
    public int hashCode() {
        return Objects.hash(getResolutionX(), getResolutionY());
    }
}
