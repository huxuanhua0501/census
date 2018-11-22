package com.census;

import java.text.DecimalFormat;
import java.util.Random;

/**
 * @author hu_xuanhua_hua
 * @ClassName: sd
 * @Description: TODO
 * @date 2018-04-12 15:53
 * @versoin 1.0
 **/
public class sd {
    public static void main(String[] args) {


//        int da = 10;
//        int xiao = 4;
//        Random randoma = new Random();
//        int daina = randoma.nextInt(da) % (da - xiao + 1) + xiao;
//        int dianb = randoma.nextInt(da) % (da - xiao + 1) + xiao;
//
//        System.err.println(daina * 0.01 + dianb * 0.001 + 1);

        int[] num = new int[]{
                184593,
                157763,
                125370,
                350316,
                174837,
                156931,
                108818,
                340633,
                173081,
                172277,
                93587,
                353205,
                212139,
                155288,
                102977,
                368842,
                203848,
                149269,
                102744,
                343485,
                175643,
                139757,
                101893,
                358448,
                178979,
                138630,
                109469,
                350041,
                193531,
                144776,
                106110,
                354165,
                181898,
                148570,
                113015,
                376322,
                192876,
                164686,
                123629,
                371650,
                211838,
                145168,
                129383,
                369009,
                174687,
                160666,
                91252,
                371190
        };
        for (int i = 0; i < num.length; i++) {
            int da = 10;
            int xiao = 4;
            Random randoma = new Random();
            int daina = randoma.nextInt(da) % (da - xiao + 1) + xiao;
            int dianb = randoma.nextInt(da) % (da - xiao + 1) + xiao;
            double k = daina * 0.01 + dianb * 0.001 + 1;
//            double k = daina * 0.0009 + dianb * 0.0005 + 1;
//            System.err.println(k);
            double value = k * num[i];

            System.err.println(new Double(value).intValue());
//            System.err.println(num[i]);
        }
    }
}
