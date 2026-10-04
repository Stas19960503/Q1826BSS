package lesson6homeelectronics;

public class Thermostat extends HomeDevice implements Switchable, Controllable {

    private boolean isOn;
    private int temperature;
    private int targetTemperature;

    public Thermostat(String name, String manufacturer, int year,
                      int temperature, int targetTemperature) {
        super(name, manufacturer, year);
        this.temperature = temperature;
        this.targetTemperature = targetTemperature;
        this.isOn = false;
    }

    @Override
    public void turnOn() {
        this.isOn = true;
        System.out.println(name + " включён.");
    }

    @Override
    public void turnOff() {
        this.isOn = false;
        System.out.println(name + " выключен.");
    }

    @Override
    public boolean isOn() {
        return isOn;
    }

    @Override
    public void setPower(int power) {
        if (power < 0) {
            this.targetTemperature = 0;
        } else if (power > 40) {
            this.targetTemperature = 40;
        } else {
            this.targetTemperature = power;
        }
    }

    @Override
    public int getPower() {
        int diff = Math.abs(targetTemperature - temperature);
        return Math.min(diff, 100);
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return "Работает, текущая " + temperature + "°C, целевая " + targetTemperature + "°C.";
        } else {
            return "Выключен.";
        }
    }

    @Override
    public String getDeviceInfo() {
        return "Устройство: " + name
                + " | Производитель: " + manufacturer
                + " | Год выпуска: " + year
                + " | Текущая t°: " + temperature + "°C"
                + " | Целевая t°: " + targetTemperature + "°C"
                + " | Состояние: " + (isOn ? "включён" : "выключен");
    }
}
