package org.project.loan.beans;

public class WeatherBean {
    /**
     * 城市名字
     */
    private String cityName;
    /**
     * 天气图片
     */
    private String img;
    /**
     * 省
     */
    private String province;
    /**
     * 区
     */
    private String area;
    private String WenDu;
    private String Air;
    public WeatherBean() {
    }

    public WeatherBean(String cityName, String img, String province, String area, String wenDu, String air) {
        this.cityName = cityName;
        this.img = img;
        this.province = province;
        this.area = area;
        WenDu = wenDu;
        Air = air;
    }

    public String getWenDu() {
        return WenDu;
    }

    public void setWenDu(String wenDu) {
        WenDu = wenDu;
    }

    public String getAir() {
        return Air;
    }

    public void setAir(String air) {
        Air = air;
    }

    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    @Override
    public String toString() {
        return "WeatherBean{" +
                "cityName='" + cityName + '\'' +
                ", img='" + img + '\'' +
                ", province='" + province + '\'' +
                ", area='" + area + '\'' +
                ", WenDu='" + WenDu + '\'' +
                ", Air='" + Air + '\'' +
                '}';
    }
}
