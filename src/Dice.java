/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

import java.util.ArrayList;
import java.util.Random;

/**
 *
 * @author Administrator
 */
public class Dice {

    private int numberOfDice;
    private int dieMax;
    private int bonus;
    Random randomizer;
    private ArrayList<Integer> pool;

    public Dice(int numberOfDice, int dieMax, int bonus) {
        this.numberOfDice = numberOfDice;
        this.dieMax = dieMax;
        this.bonus = bonus;
        this.randomizer = new Random(System.currentTimeMillis());
        this.pool = new ArrayList<Integer>();
    }

    /**
     * @return the numberOfDice
     */
    public int getNumberOfDice() {
        return numberOfDice;
    }

    /**
     * @param numberOfDice the numberOfDice to set
     */
    public void setNumberOfDice(int numberOfDice) {
        this.numberOfDice = numberOfDice;
    }

    /**
     * @return the dieMax
     */
    public int getDieMax() {
        return dieMax;
    }

    /**
     * @param dieMax the dieMax to set
     */
    public void setDieMax(int dieMax) {
        this.dieMax = dieMax;
    }

    /**
     * @return the bonus
     */
    public int getBonus() {
        return bonus;
    }

    /**
     * @param bonus the bonus to set
     */
    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

    /**
     * @return the pool
     */
    public ArrayList<Integer> getPool() {
        return pool;
    }
    
    public void randomize() {
        randomizer.setSeed(System.currentTimeMillis());
    }

    public int roll(boolean reset) {
        if(reset) randomize();
        return randomizer.nextInt(getDieMax());        
    }

    public int rollSingle(boolean reset) {
        if(reset) randomize();
        return randomizer.nextInt(getDieMax() * getNumberOfDice()) + getBonus();
    }
    
    public ArrayList rollMany(boolean reset) {
        getPool().clear();
        
        for(int i=0;i<this.getNumberOfDice();i++) {
            getPool().add(this.roll(reset) + getBonus());
        }
        
        return(getPool());
    }
    
}
