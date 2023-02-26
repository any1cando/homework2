public class TelephoneStation {
    private String name;
    private int year;
    private String color;

    public TelephoneStation(String name, int year, String color) {
        this.name = name;
        this.year = year;
        this.color = color;
    }

    public void call(String number) {
        System.out.println("Телефон " + name + " звонит по номеру " + number);
    }

    public void ring() {
        System.out.println("Дзынь-дзынь");
    }

    public void acceptCall() {
        System.out.println("Телефон " + name + " принял вызов");
    }

    @Override
    public String toString() {
        return "Телефон " + name + ", Год выпуска: " + year + ", Цвет: " + color;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        if (year <= 1900) {
            year = 2000;
        }
        this.year = year;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
}
