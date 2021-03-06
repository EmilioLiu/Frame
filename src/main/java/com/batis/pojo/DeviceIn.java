package com.batis.pojo;

public class DeviceIn {
    private String code;
    private String inDate;
    private String provider;
    private String telenno;
    private Integer inNumber;
    private Integer price;
    private String buyer;

    public DeviceIn() {
    }

    public DeviceIn(String code, String inDate, String provider, String telenno, Integer inNumber, Integer price, String buyer) {
        this.code = code;
        this.inDate = inDate;
        this.provider = provider;
        this.telenno = telenno;
        this.inNumber = inNumber;
        this.price = price;
        this.buyer = buyer;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getInDate() {
        return inDate;
    }

    public void setInDate(String inDate) {
        this.inDate = inDate;
    }

    public String getProvider() {
        return provider;
    }

    public void setProvider(String provider) {
        this.provider = provider;
    }

    public String getTelenno() {
        return telenno;
    }

    public void setTelenno(String telenno) {
        this.telenno = telenno;
    }

    public Integer getInNumber() {
        return inNumber;
    }

    public void setInNumber(Integer inNumber) {
        this.inNumber = inNumber;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getBuyer() {
        return buyer;
    }

    public void setBuyer(String buyer) {
        this.buyer = buyer;
    }

    @Override
    public String toString() {
        return "DeviceIn{" +
                "code='" + code + '\'' +
                ", inDate='" + inDate + '\'' +
                ", provider='" + provider + '\'' +
                ", telenno='" + telenno + '\'' +
                ", inNumber=" + inNumber +
                ", price=" + price +
                ", buyer='" + buyer + '\'' +
                '}';
    }
}
