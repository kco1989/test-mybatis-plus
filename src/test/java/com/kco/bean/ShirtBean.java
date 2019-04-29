package com.kco.bean;

import com.google.gson.Gson;
import lombok.Data;

import javax.sound.midi.Soundbank;
import java.util.*;

/**
 * @author kco1989
 * @email kco1989@qq.com
 * @date 2019-04-23 15:08
 */
@Data
public class ShirtBean {
    private static final String[] brands = {"gucci", "Lining", "Uniqlo", "Jordan"};
    private static final String[] colors = {"red", "blue", "green", "white", "black", "orange"};
    private static final String[] models = {"S", "M", "L", "XL", "XXL", "XXXL", "XXXXL"};
    private static final Random RANDOM = new Random();
    private String brand;
    private String color;
    private String model;

    public static ShirtBean newShire() {
        ShirtBean shirtBean = new ShirtBean();
        shirtBean.setBrand(brands[RANDOM.nextInt(brands.length)]);
        shirtBean.setColor(colors[RANDOM.nextInt(colors.length)]);
        shirtBean.setModel(models[RANDOM.nextInt(models.length)]);
        return shirtBean;
    }

    public static void main(String[] args) {
//        Gson gson = new Gson();
//        for (int i = 0; i < 1000; i++) {
//            System.out.println(String.format("{\"index\": {\"_id\": \"%s\"}}", i));
//            System.out.println(gson.toJson(ShirtBean.newShire()));
//        }
    }

}
