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
public class concert extends evenement {
    private String artiste;
    private String genreMusical; // Correction de "genreMedical"

  public concert (String id,String nom,LocalDateTime date,String lieu,int capaciteMax,List<participant> participants,String artiste, String genreMusicale){
      super (id,nom,date,lieu,capaciteMax,participants);
      this.artiste=artiste;
      this.genreMusical=genreMusicale;
  }   

 

    @Override
    public void afficherDetails() {
        System.out.println("Artiste: " + artiste);
        System.out.println("Genre musical: " + genreMusical);
    }
}

    

