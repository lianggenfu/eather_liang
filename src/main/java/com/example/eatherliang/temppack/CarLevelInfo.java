package com.example.eatherliang.temppack;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

public class CarLevelInfo {

    public int carLevel;
    public String carName;
    public String icon;
    public String carLevelText;

    public List<Supply> supplyInfoList;

    @Test
    public void test1(){
        List<CarLevelInfo> carLevelInfos = new ArrayList<>();
        List<Supply> supplies1 = new ArrayList<>();
        supplies1.add(new Supply(100,"1","一档","car",1));
        supplies1.add(new Supply(100,"1","一档","com",1));
        supplies1.add(new Supply(100,"1","一档","tax",1));
        carLevelInfos.add(new CarLevelInfo(100,"一档","","实惠",supplies1));
        List<Supply> supplies2 = new ArrayList<>();
        supplies1.add(new Supply(200,"1","二档","car",1));
        supplies1.add(new Supply(200,"1","二档","com",1));
        supplies1.add(new Supply(200,"1","二档","tax",1));
        carLevelInfos.add(new CarLevelInfo(200,"二档","","舒适",supplies2));
        List<Supply> supplies3 = new ArrayList<>();
        supplies1.add(new Supply(300,"1","三档","car",1));
        supplies1.add(new Supply(300,"1","三档","com",1));
        supplies1.add(new Supply(300,"1","三档","tax",1));
        carLevelInfos.add(new CarLevelInfo(300,"三档","","豪华",supplies3));

        List<CarLevelInfo> carLevelInfosSub = new ArrayList<>();
        List<Supply> supplies4 = new ArrayList<>();
        supplies1.add(new Supply(100,"1","一档","com",1));
        carLevelInfos.add(new CarLevelInfo(100,"一档","","实惠",supplies4));
        List<Supply> supplies5 = new ArrayList<>();
        supplies1.add(new Supply(200,"1","二档","com",1));
        supplies1.add(new Supply(200,"1","二档","tax",1));
        carLevelInfos.add(new CarLevelInfo(200,"二档","","舒适",supplies5));


        List<CarLevelInfo> result = resort(carLevelInfos,carLevelInfosSub);

        System.out.println("test");

    }

    private List<CarLevelInfo> resort(List<CarLevelInfo> carLevelInfos, List<CarLevelInfo> carLevelInfosSub) {
        return carLevelInfos;  //todo
    }

    class Supply{
        int carLevel;
        String carService;
        String carName;
        String SupplyAppId;
        int productType;
        String transportType;
        String supplyDesc;

        public Supply() {
        }

        public Supply(int carLevel, String carService, String carName, String supplyAppId, int productType) {
            this.carLevel = carLevel;
            this.carService = carService;
            this.carName = carName;
            SupplyAppId = supplyAppId;
            this.productType = productType;
        }

        public Supply(int carLevel, String carService, String carName, String supplyAppId, int productType, String transportType, String supplyDesc) {
            this.carLevel = carLevel;
            this.carService = carService;
            this.carName = carName;
            SupplyAppId = supplyAppId;
            this.productType = productType;
            this.transportType = transportType;
            this.supplyDesc = supplyDesc;
        }
    }

    public CarLevelInfo(int carLevel, String carName, String icon, String carLevelText, List<Supply> supplyInfoList) {
        this.carLevel = carLevel;
        this.carName = carName;
        this.icon = icon;
        this.carLevelText = carLevelText;
        this.supplyInfoList = supplyInfoList;
    }

}
