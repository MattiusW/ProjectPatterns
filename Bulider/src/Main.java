public class Main {
    public static void main(String[] args) {

        House house = new House.HouseBuilder()
                .setAdress("ul. Kursowa 7")
                .setDoorsNumber(7)
                .setWindowsNumber(17)
                .build();

    }
}