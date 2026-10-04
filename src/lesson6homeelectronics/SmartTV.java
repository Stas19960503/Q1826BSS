package lesson6homeelectronics;

public class SmartTV extends HomeDevice
        implements Switchable, Controllable, EnergyEfficient {

    private boolean isOn;
    private int volume;              // громкость (0-100)
    private String currentChannel;   // текущий канал

    public SmartTV(String name, String manufacturer, int year,
                   int volume, String currentChannel) {
        super(name, manufacturer, year);
        this.volume = volume;
        this.currentChannel = currentChannel;
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
            this.volume = 0;
        } else if (power > 100) {
            this.volume = 100;
        } else {
            this.volume = power;
        }
    }

    @Override
    public int getPower() {
        return volume;
    }

    @Override
    public String getStatus() {
        if (isOn) {
            return "Включён, канал " + currentChannel + ", громкость " + volume + "%.";
        } else {
            return "Выключен.";
        }
    }

    @Override
    public double calculateEnergyConsumption() {
        return volume * 0.5 + 10;
    }

    @Override
    public String getEnergyClass() {
        if (volume <= 30) {
            return "A";
        } else if (volume <= 70) {
            return "B";
        } else {
            return "C";
        }
    }

    @Override
    public String getDeviceInfo() {
        return "Устройство: " + name
                + " | Производитель: " + manufacturer
                + " | Год выпуска: " + year
                + " | Канал: " + currentChannel
                + " | Громкость: " + volume + "%"
                + " | Состояние: " + (isOn ? "включён" : "выключен");
    }
}
