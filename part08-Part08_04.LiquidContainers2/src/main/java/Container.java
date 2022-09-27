/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeppe
 */
public class Container {
    private int liquid;
    
    public Container() {
        this.liquid = 0;
    }
    
    public int contains() {
        return liquid;
    }
    
    public void add(int amount) {
        if (amount + this.liquid > 100) {
            this.liquid = 100;
        }
        
        if (!(amount < 0)) {
            this.liquid += amount;
        }
    }
    
    public void remove(int amount) {
        if (this.liquid - amount < 0) {
            this.liquid = 0;
        }
        
        if (!(amount < 0)) {
            this.liquid -= amount;
        }
    }
    
    public String toString() {
        return this.liquid + "/100";
    }
    
}
