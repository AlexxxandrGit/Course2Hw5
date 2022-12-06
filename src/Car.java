public class Car extends Transport implements Competing {

    public Car(String brand, String model, double engineVolume) {
        super(brand, model, engineVolume);
    }

    @Override
    public String getBrand() {
        return super.getBrand();
    }

    @Override
    public boolean equals(Object o) {
        return super.equals(o);
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void startMoving() {
        System.out.println("Старт для легкового авто");
    }

    @Override
    public void finishTheMove() {
        System.out.println("Финиш для легкового авто");
    }

    @Override
    public boolean service() {
        return Math.random() > 0.7 ;
    }

    @Override
    public void showsTheBestPitStop() {
        System.out.println("Лучшее время Пит Стоп для Легкового авто");
    }

    @Override
    public void showsTheBestLapTime() {
        System.out.println("Лучшеев время круга для легкового авто");
    }

    @Override
    public void showsTheMaximumSpeed() {
        System.out.println("Максимальная скорость для легкового авто");
    }


}