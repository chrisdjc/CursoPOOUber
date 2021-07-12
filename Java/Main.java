

class Main {
    public static void main(String[] args) {

        //-----impresión del hola mundo
        System.out.println("Hola mundo!");

        //------carro número 1
        UberX uberX = new UberX("AMQ123", new Account("CHRISTOPHER CAN", "CACC96"), "Volkswagen", "Gol");
        //uberX.passenger = 4;
        uberX.setPassenger(4);
        uberX.printDataCar();

        /*------carro número 2
        Car car2 = new Car("JSY394", new Account("JUSTINE BRICEÑO", "BCO96"));
        car2.passenger = 4;
        car2.printDataCar();*/
        
        UberVan uberVan = new UberVan("JSY394", new Account("JUSTINE BRICEÑO", "BCO96"));
        uberVan.setPassenger(6);
        uberVan.printDataCar();
    }
}