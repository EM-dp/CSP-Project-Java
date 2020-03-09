package com.company;

public class LvlSystem{
    public boolean LvlUpCheck(int lvl, int xp) {
        if (xp >= (lvl*100)){
            return true;
        }
        else {
            return false;
        }
    }

}
