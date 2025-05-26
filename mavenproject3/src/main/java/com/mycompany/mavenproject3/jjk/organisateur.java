/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.jjk;
import java.util.ArrayList;
import java.util.List;



/**
 *
 * @author Dell i5
 */
public class organisateur extends participant {
    protected List<evenement> evenementsOrganises ;
     
    public organisateur (String id,String nom,String email ){
        super (id,nom,email);
        this.evenementsOrganises= new ArrayList<>();
    }
    

    public void ajouterEvenement(evenement event) {
        evenementsOrganises.add(event);
    }
}

    

