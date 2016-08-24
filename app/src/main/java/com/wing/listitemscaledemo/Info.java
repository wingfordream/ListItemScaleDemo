package com.wing.listitemscaledemo;

/**
 * @author Wing(wing_huang@hotmail.com)
 *         2016/8/24 12:31
 */
public class Info {

    private String name;
    private int imageRes;
    private int installed_count;
    private float size;
    private String introduce;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getImageRes() {
        return imageRes;
    }

    public void setImageRes(int imageRes) {
        this.imageRes = imageRes;
    }

    public int getInstalled_count() {
        return installed_count;
    }

    public void setInstalled_count(int installed_count) {
        this.installed_count = installed_count;
    }

    public float getSize() {
        return size;
    }

    public void setSize(float size) {
        this.size = size;
    }

    public String getIntroduce() {
        return introduce;
    }

    public void setIntroduce(String introduce) {
        this.introduce = introduce;
    }
}
