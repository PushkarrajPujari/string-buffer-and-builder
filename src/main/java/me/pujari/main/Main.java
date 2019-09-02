/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package me.pujari.main;

import java.util.Date;

/**
 *
 * @author pushkarraj pujari
 * @since 02/09/2019
 */
public class Main {

    public static void main(String[] args) {
        String builder = stringBuilder("String");
        System.out.println(builder);
        String buffer = stringBuffer("String");
        System.out.println(buffer);
    }

    public static String stringBuilder(String one) {
        StringBuilder stringBuilder = new StringBuilder(one);
        stringBuilder.append(" Builder");
        return stringBuilder.toString();
    }

    public static String stringBuffer(String one) {
        StringBuffer stringBuffer = new StringBuffer(one);
        stringBuffer.append(" Buffer");
        return stringBuffer.toString();
    }
}
