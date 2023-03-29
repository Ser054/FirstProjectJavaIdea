package org.crucial;
import org.apache.commons.lang3.ArrayUtils;
import org.crucial.geometry.Quadrate;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Geometric quadrate = new Quadrate(5);
        System.out.println(App.getFigureSquare(quadrate));
        Geometric circle = new Circle(10);
        System.out.println(App.getFigureSquare(circle));


        /**var quadrate = new Quadrate(3);
        var enlargedQuadrate = App.enlargeQuadrate(quadrate);
        System.out.println(enlargedQuadrate.getSide()); // 6*/


        /**System.out.println(App.isPalindrome("шалаш"));
        System.out.println(App.isPalindrome("ага"));
        System.out.println(App.isPalindrome("хекслет"));
        System.out.println(App.isPalindrome("Ага"));*/

        /**var user1 = new User(1, "Nick12");
        var user2 = new User(1, "Nick");
        System.out.println(user1.isEqual(user2));
        var user3 = new User(14, "Nick12");
        System.out.println(user1.isEqual(user3));*/

        /**var url1 = new Url("https://google.com");
        System.out.println(App.checkSecurity(url1));
        var url2 = new Url("http://example.com");
        System.out.println(App.checkSecurity(url2));*/

        /**Circle circl = new Circle(1, 2, 5);
        System.out.println(App.getCircumference(circl));*/

        /**var point = App.getNewPoint();
        System.out.println(point.getX() + " " + point.getY());*/

        /**System.out.println(App.getSquare(10, 10, 60));*/

        /**for (int i = 1; i <= 100; i++) {
            System.out.println(ConvertStr.convert(i));
        }*/

    }
}