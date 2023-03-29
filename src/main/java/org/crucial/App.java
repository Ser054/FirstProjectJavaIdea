package org.crucial;

import org.apache.commons.lang3.StringUtils;
import org.crucial.geometry.Quadrate;

import java.awt.*;

public class App {

    public static String getFigureSquare(Geometric geo) {
        return "Square of " + geo.getName() + " is " + geo.getSquare();
    }

    public static Quadrate enlargeQuadrate(Quadrate q) {
        return new Quadrate(q.getSide() * 2);
    }

    public static boolean isPalindrome(String str) {
        return str.toLowerCase().equals(StringUtils.reverse(str.toLowerCase()));

    }

    public static String checkSecurity(Url url) {
        if (url.getProtocol().equals("https")) {
            return "Connection to " + url.getHost() + " is secure";
        } else {
            return "Connection to " + url.getHost() + " is not secure";
        }
    }

    public static double getCircumference(Circle circle) {
        return circle.radius * 2 * Math.PI;
    }

    public static Point getNewPoint() {
        return new Point(5, 10);
    }

    public static double getSquare(int a, int b, int angle) {
        return (1.0/2.0)*(double)a*(double)b*Math.sin(angle*Math.PI/180);
    }
}
