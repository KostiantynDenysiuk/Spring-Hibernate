package com.luv2code.springdemo;

import java.util.ArrayList;
import java.util.Arrays;

public class TheHappiestFortuneService implements FortuneService {
    String fortune0;
    String fortune1;
    String fortune2;

    public void setFortune0(String fortune0) {
        this.fortune0 = fortune0;
    }

    public void setFortune1(String fortune1) {
        this.fortune1 = fortune1;
    }

    public void setFortune2(String fortune2) {
        this.fortune2 = fortune2;
    }

    @Override
    public String getFortune() {
        ArrayList<String> arrayFortunes= new ArrayList();
        arrayFortunes.add(fortune0);
        arrayFortunes.add(fortune1);
        arrayFortunes.add(fortune2);

        int n = (int) Math.floor(Math.random()*arrayFortunes.size());
        return arrayFortunes.get(n);
    }
}
