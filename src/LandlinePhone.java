public class LandlinePhone extends TelephoneStation {
    private double tubeWireLength;

    public LandlinePhone(String name, int year, String color, double tubeWireLength) {
        super(name, year, color);
        this.tubeWireLength = tubeWireLength;
    }

    public void checkConnection() {
        System.out.println("Стационарный телефон " + getName() + " проверяет соединение...");
        System.out.println("Соединение в порядке.");
    }

    @Override
    public String toString() {
        return "Стационарный телефон " + getName() + ", Год выпуска: " + getYear() + ", Цвет: " + getColor();
    }

    public double getTubeWireLength() {
        return tubeWireLength;
    }

    public void setTubeWireLength(double tubeWireLength) {
        if (tubeWireLength <= 0) {
            tubeWireLength = 1;
        }
        this.tubeWireLength = tubeWireLength;
    }
}
