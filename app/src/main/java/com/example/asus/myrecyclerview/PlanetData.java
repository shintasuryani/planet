package com.example.asus.myrecyclerview;

import java.util.ArrayList;

public class PlanetData {
    public static String[][] data = new String[][]{
            {"MERKURIUS", "Planet Pertama", "http://informazone.com/storage/2017/05/merkurius.jpg"},
            {"VENUS", "Planet Kedua", "http://informazone.com/storage/2017/05/venus.jpg"},
            {"BUMI", "Planet Ketiga", "http://informazone.com/storage/2017/05/bumi.jpg"},
            {"MARS", "Planet Keempat", "http://informazone.com/storage/2017/05/mars-11012_1280.jpg"},
            {"YUPITER", "Planet Kelima", "http://informazone.com/storage/2017/05/omahberita.com-yupiter.jpg"},
            {"SATURNUS", "Planet Keenam", "http://informazone.com/storage/2017/05/saturnus.jpg"},
            {"URANUS", "Planet Ketujuh", "http://informazone.com/storage/2017/05/photojournal.jpl_.nasa_.gov_.jpg"},
            {"NEPTUNUS", "Planet Kedelapan", "http://informazone.com/storage/2017/05/neptunsJPG.jpg"},
    };

    public static ArrayList<Planet> getListData(){
        Planet planet= null;
        ArrayList<Planet> list = new ArrayList<>();
        for (String[] aData : data) {
            planet = new Planet();
            planet.setName(aData[0]);
            planet.setRemarks(aData[1]);
            planet.setPhoto(aData[2]);

            list.add(planet);
        }

        return list;
    }
}
