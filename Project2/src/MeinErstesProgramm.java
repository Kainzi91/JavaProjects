
public class MeinErstesProgramm {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        /*
        Datentypen
        prmitiv :       Boolean 1 bit
                        char[2 Byte] unicode character (16 bit) ,
                        byte 1 Byte -128-128 ,
                        short 2 byte,
                        int 4 byte,
                        long 0L 8byte
                        float 0.0f 4 byte
                        double  0.0d 8 byte
        nicht primitive :
                        String
                        Array
        */
        int iWert=2;
        float fZahl = 3.4f;
        double dZahl= 4.12333d;

        /*
        Operatoren:
        unarey Operatoren: postfix , prefix z.B. ++,-- ,~ ,!
        arithmetische Operatoren : + ,- , * ,: , %
        shift Operatoren: >> ,<<
        relationale Operatoren <, > >= ,<= , == , != , instanceof
        bitweise Operatoren & , ^ , |,
        logic Operatoren: && , ||
        ternary Operatoren:  ?:
        assigment Operatoren =, +=,-= , *= ,/=, >>= ,<<=
         */
        int a=10;
        int b=10;
        System.out.println(a++ + ++a);
        System.out.println(b++ + b++);
        System.out.println(b);
        a=10;
        b=-10;

        System.out.println(~a); // -11 positive Zahlen beinhalten 0
        System.out.println(~b); // 9  positive Zahlen beinhalten 0
        boolean boo_c=true;
        System.out.println(!boo_c);
        System.out.println(10<<2); // 10*2^2
        System.out.println(10<<3); // 10*2^3
        System.out.println(20>>3); // 20/2^3

        //>> am 21.10.2022 beispiel
        //hochrechnen
        System.out.println(Math.pow(2.5,3.7));
        a=10;
        b=5;
        int c =20;

        System.out.println(a<b&&a<c); //false and true = false
        System.out.println(a<b&a<c);  //false and true = false

        System.out.println(a<b&&a++<c);
        System.out.println(a);
        System.out.println(a<b&&a++<c);
        System.out.println(a);

        short  shortA=10;
        short  shortB=10;
        shortA=(short)(shortA+shortB);
        System.out.println(shortA);








    }
}


