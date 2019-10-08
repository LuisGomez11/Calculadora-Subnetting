/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Main;

import java.util.ArrayList;

/**
 *
 * @author User
 */
public class Tabla {
    
    public ArrayList<Integer> lista = new ArrayList<>();

    public Tabla() {
        int r;
        for (int i = 0; i < 15; i++) {
            r = (int) Math.pow(2, i);
            lista.add(r);
        }
    }

    
}
