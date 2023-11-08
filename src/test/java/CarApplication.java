public class CarApplication {
    public static void main(String[] args) {
        Car audi = new Car();
        audi.setModel("A8");
        audi.setColor("czerwony");
        audi.setProductionYear(2018);
        System.out.println(audi.getModel());
        System.out.println(audi.getColor());
        System.out.println(audi.getProductionYear());
        System.out.println(audi.isUsed());
        System.out.println(audi.getMileage());
        audi.drive(1);
        System.out.println(audi.isUsed());
        System.out.println(audi.getMileage());
    }
}
