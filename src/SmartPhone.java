public class SmartPhone extends TelephoneStation {
    private String model;
    private int ram;
    private int memory;

    public SmartPhone(String name, int year, String color, String model, int ram, int memory) {
        super(name, year, color);
        this.model = model;
        this.ram = ram;
        this.memory = memory;
    }

    public void openApp(String appName) {
        System.out.println(getName() + " " + model + " открыл приложение " + appName);
    }

    public void deleteApp(String appName) {
        System.out.println(getName() + " " + model + " удалил приложение " + appName);
    }

    public void turnOnLight() {
        System.out.println(getName() + " " + model + " включил фонарик.");
    }

    @Override
    public String toString() {
        return "Смартфон " + getName() + ", Модель: " + model + ", Год выпуска: " + getYear() + ", Цвет: " + getColor() + ", " +
                "RAM " + ram + " gb, Память: " + memory + " gb";
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        if (ram <= 0) {
            ram = 8;
        }
        this.ram = ram;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        if (memory <= 0) {
            memory = 256;
        }
        this.memory = memory;
    }
}
