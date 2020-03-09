package com.company;

public class GameCharacters {
    private String Character;
    private int Atk, Def, Spe, Lvl, Xp;
    public GameCharacters(String character, int atk, int def, int spe, int lvl, int xp){
        this.Character = character;
        this.Atk = atk;
        this.Def = def;
        this.Spe = spe;
        this.Lvl = lvl;
        this.Xp = xp;
    }

    public void setCharacter(String character) {Character = character;}
    public void setAtk(int atk) {this.Atk = atk;}
    public void setDef(int def) {this.Def = def;}
    public void setSpe(int spe) {this.Spe = spe;}
    public void setLvl(int lvl) {this.Lvl = lvl;}
    public void setXp(int xp) {this.Xp = xp;}

    public String getCharacter() {return Character;}
    public int getAtk() {return Atk;}
    public int getDef() {return Def;}
    public int getSpe() {return Spe;}
    public int getLvl() {return Lvl;}
    public int getXp() {return Xp;}

    public String charStats(){return "Character: " + Character + " (Lvl: " + Lvl + ")\n\nAttack: " + Atk + "\nDefense: " + Def + "\nSpeed: " + Spe;}
}
