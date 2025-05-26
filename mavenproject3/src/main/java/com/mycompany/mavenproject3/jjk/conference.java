/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.jjk;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author Dell i5
 */
public class conference extends evenement  {
      private String theme;
    private List<String> intervenants;
    public conference (String id,String nom,LocalDateTime date,String lieu,int capaciteMax,List<participant> participants,String theme, List<String> intervenants ){
        super (id,nom,date,lieu,capaciteMax,participants);
        this.theme=theme;
        this.intervenants= new ArrayList<>();
        
        
    }

    @Override
    public void afficherDetails() {
        System.out.println("Conférence: " + nom + ", Thème: " + theme);
    }
     public String gettheme() { return theme; }
    public void settheme(String theme) { this.nom = theme; }

    
}
