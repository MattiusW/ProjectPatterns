package builder;

import builder.models.FamilyHouse;

public class Main {
    public static void main(String[] args) {

        //BUILDER
        House house = new House.HouseBuilder()
                .setAdress("ul. Kursowa 7")
                .setDoorsNumber(7)
                .setFloorsNumber(7)
                .setWindowsNumber(17)
                .build();

        //STATIC MANUFACTURING METHOD
        //from, of, valueOf, instanceOf
        boolean isTrue = true;
        Boolean.valueOf(isTrue);

        FamilyHouse familyHouse = FamilyHouse.from(house);

    }
}