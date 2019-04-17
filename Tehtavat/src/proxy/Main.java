/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proxy;

import java.util.Arrays;
import java.util.List;

/**
 *
 * @author hannu.korhonen
 */
public class Main {

    public static void main(String[] args) {

        List<ProxyImage> valokuvaKansio =
                Arrays.asList(
                        new ProxyImage("HiRes_10MB_Photo1"),
                        new ProxyImage("HiRes_10MB_Photo2"),
                        new ProxyImage("HiRes_10MB_Photo3"),
                        new ProxyImage("HiRes_10MB_Photo4"),
                        new ProxyImage("HiRes_10MB_Photo5"),
                        new ProxyImage("HiRes_10MB_Photo6"),
                        new ProxyImage("HiRes_10MB_Photo7"));

        for(ProxyImage image : valokuvaKansio) {
            image.showData();
        }
        for(ProxyImage image : valokuvaKansio) {
            image.displayImage();
        }
    }
}

