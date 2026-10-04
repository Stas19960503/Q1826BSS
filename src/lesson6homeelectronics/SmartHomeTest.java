package lesson6homeelectronics;

public class SmartHomeTest {
    public static void main(String[] args) {

        LightBulb lamp1 = new LightBulb("LED-лампа", "Philips", 2024, 75, "белый");
        LightBulb lamp2 = new LightBulb("Умная лампа", "Xiaomi", 2023, 40, "красный");

        Thermostat thermostat = new Thermostat("Термостат", "Bosch", 2024, 18, 25);

        SmartTV tv1 = new SmartTV("Smart TV", "Samsung", 2023, 50, "Первый");
        SmartTV tv2 = new SmartTV("Телевизор", "LG", 2022, 80, "СТС");

        System.out.println("========== МАССИВ HomeDevice[] ==========");
        HomeDevice[] devices = { lamp1, lamp2, thermostat, tv1, tv2 };

        for (HomeDevice device : devices) {
            System.out.println(device.getDeviceInfo());
        }

        System.out.println("\n========== МАССИВ Switchable[] ==========");
        Switchable[] switchables = { lamp1, lamp2, thermostat, tv1, tv2 };

        for (Switchable s : switchables) {
            s.turnOn();                                  // полиморфизм — у каждого свой метод
            System.out.println("Состояние: " + (s.isOn() ? "включено" : "выключено"));
        }

        System.out.println("\n========== МАССИВ EnergyEfficient[] ==========");
        EnergyEfficient[] efficientDevices = { lamp1, lamp2, tv1, tv2 };

        for (EnergyEfficient e : efficientDevices) {
            System.out.println("Потребление: " + e.calculateEnergyConsumption()
                    + " Вт | Класс: " + e.getEnergyClass());
        }

        System.out.println("\n========== ДЕМОНСТРАЦИЯ ==========");

        System.out.println("\n--- Меняем яркость lamp1 на 30 ---");
        lamp1.setPower(30);
        System.out.println("Статус: " + lamp1.getStatus());
        System.out.println("Энергия: " + lamp1.calculateEnergyConsumption() + " Вт");

        System.out.println("\n--- Меняем громкость tv1 на 25 ---");
        tv1.setPower(25);
        System.out.println("Статус: " + tv1.getStatus());
        System.out.println("Энергия: " + tv1.calculateEnergyConsumption() + " Вт");

        System.out.println("\n--- Меняем целевую t° термостата на 22 ---");
        thermostat.setPower(22);
        System.out.println("Статус: " + thermostat.getStatus());
        System.out.println("Мощность: " + thermostat.getPower());

        System.out.println("\n--- Выключаем все устройства ---");
        for (Switchable s : switchables) {
            s.turnOff();
        }
    }
}
