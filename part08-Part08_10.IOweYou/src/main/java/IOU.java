/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jeppe
 */
import java.util.HashMap;

public class IOU {
    private HashMap<String, Double> oweStatus;
    
    public IOU() {
        this.oweStatus = new HashMap<>();
    }
    
    public void setSum(String toWhom, double amount) {
        oweStatus.put(toWhom, amount);
    }
    
    public double howMuchDoIOweTo(String toWhom) {
        if (this.oweStatus.containsKey(toWhom)) {
            return this.oweStatus.get(toWhom);
        }
        
        return 0;
    }
}
