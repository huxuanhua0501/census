package com.census;

import java.util.Random;

/**
 * @author hu_xuanhua_hua
 * @ClassName: fd
 * @Description: TODO
 * @date 2018-04-12 15:24
 * @versoin 1.0
 **/
public class fd {
    public static void main(String[] args) {
//        230336
//        195580
//        147615
//        395772
//        System.err.println(976*236);
//        System.err.println(889*220);
//        System.err.println(757*195);
//        System.err.println(2236 *177);
        int amax = 210336;
        int amin = 170336;
        Random randoma = new Random();
        int a = randoma.nextInt(amax) % (amax - amin + 1) + amin;


        int bmax = 175580;
        int bmin = 135580;
        Random randomb = new Random();
        int b = randomb.nextInt(bmax) % (bmax - bmin + 1) + bmin;


        int cmax = 127615;
        int cmin = 87615;
        Random randomc = new Random();
        int c = randomc.nextInt(cmax) % (cmax - cmin + 1) + cmin;


        int dmax = 375772;
        int dmin = 335772;
        Random randomd = new Random();
        int d = randomd.nextInt(dmax) % (dmax - dmin + 1) + dmin;

        System.err.println(a);
        System.err.println(b);
        System.err.println(c);
        System.err.println(d);

    }
}
