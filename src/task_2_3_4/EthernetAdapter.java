package task_2_3_4;

import java.util.Objects;

public class EthernetAdapter extends Device {
    private int speed;
    private String mac;

    public EthernetAdapter(String manufacturer, float price, String serialNumber, int speed, String mac) {
        super(manufacturer, price, serialNumber);
        this.speed = speed;
        this.mac = mac;
    }

    public int getSpeed() {
        return speed;
    }

    public void setSpeed(int speed) {
        this.speed = speed;
    }

    public String getMac() {
        return mac;
    }

    public void setMac(String mac) {
        this.mac = mac;
    }
    @Override
    public String toString() {
        super.toString ();
        return super.toString() + ", speed=" + speed + ", mac=" + mac;
    }
    @Override
    public boolean equals(Object o) {
        super.equals (o);
        if (this == o) return true;
        if (!(o instanceof EthernetAdapter that)) return false;
        if (!super.equals(o)) return false;
        return getSpeed() == that.getSpeed() && Objects.equals(getMac(), that.getMac());
    }

    @Override
    public int hashCode() {
        super.hashCode();
        return Objects.hash(super.hashCode(), getSpeed(), getMac());
    }
}

