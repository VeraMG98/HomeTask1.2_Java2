package com.company;

public class Shop {
    private String shopName;
    private String shopAddress;

    public Shop(String shopName, String shopAddress) {
        this.shopName = shopName;
        this.shopAddress = shopAddress;
    }

    public String getShopName() {
        return shopName;
    }

    public String getShopAddress() {
        return shopAddress;
    }
}
