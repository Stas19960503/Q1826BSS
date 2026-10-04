package lesson6homeelectronics;

public class LightBulb extends HomeDevice
        implements Switchable, Controllable, EnergyEfficient {

    private boolean isOn;
    private int brightness;
    private String color;

    public LightBulb(String name, String manufacturer, int year,
                     int brightness, String color) {
        super(name, manufacturer, year);
        this.brightness = brightness;
        this.color = color;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " включена.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " выключена.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setPower(int power) {

        if (power < 0) {
            this.brightness = 0;
        } else if (power > 100) {
            this.brightness = 100;
        } else {
            this.brightness = power;
        }
    }

    @Override
    public int getPower() {
        return brightness;
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return "Включена, яркость " + brightness + "%, цвет " + color + ".";
        } else {
            return "Выключена.";
        }
    }

    @Override
    public double calculateEnergyConsumption() {
        return brightness * 0.1;
    }

    @Override
    public String getEnergyClass() {
        if (brightness <= 50) {
            return "A";
        } else {
            return "B";
        }
    }

    @Override
    public String getDeviceInfo() {
        return "Устройство: " + name
                + " | Производитель: " + manufacturer
                + " | Год выпуска: " + year
                + " | Яркость: " + brightness + "%"
                + " | Цвет: " + color
                + " | Состояние: " + (isOn ? "включена" : "выключена");
    }
}
