/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nos;

import entidades.No;
import java.util.ArrayList;

/**
 *
 * @author lab-blockchain
 */
public class Nos {
    private ArrayList<No> nos = new ArrayList<No>();
    
    public void addNo(No no){
        nos.add(no);
    }
    
    public void removeNo(No no){
        nos.remove(no);
    }
    
    
}


