/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.mavenproject3.jjk;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import com.mycompany.mavenproject3.jjk.exception.CapaciteMaxAtteinteException;

/**
 *
 * @author Dell i5
 */
public abstract class evenement {
    protected   String id;
    protected  String nom;
    protected  LocalDateTime date;
    protected  String lieu;
    protected  int capaciteMax;
    protected List<participant> participants;
     public evenement(String id,String nom,LocalDateTime date,String lieu,int capaciteMax,List<participant> participants){
         this.id=id;
         this.nom=nom;
         this.date=date;
         this.lieu=lieu;
         this.capaciteMax=capaciteMax;
         this.participants= new ArrayList<>();
     }

    // Méthodes abstraites
    public  void ajouter(participant participant)
         throws CapaciteMaxAtteinteException{
        if (participants.size() >= capaciteMax) {
            throw new CapaciteMaxAtteinteException("Capacité maximale atteinte !");
        }
        participants.add(participant);
    }
    
    public  void annuler(){
        System.out.println("evenement annuler:"+ nom);
    }
    public abstract void afficherDetails();

    // Getters/Setters

    //id
    public String getId() { return id; }
    public void setId(String id) { this.id = id; }

    //participants
    public List<participant> getParticipants() { return participants; }
    public void setParticipants(List<participant> participants) { this.participants = participants; }

    //nom
    public String getNom() { return nom; }
    public void setNom(String nom) { this.nom = nom; }

    //lieu
    public String getLieu() { return lieu; }
    public void setLieu(String lieu) { this.lieu = lieu; }

    //capaciteMax
    public int getCapaciteMax() { return capaciteMax; }
    public void setCapaciteMax(int capaciteMax) { this.capaciteMax = capaciteMax; }

    //date
    public LocalDateTime getDate() { return date; }
    public void setDate(LocalDateTime date) { this.date = date; }
}
    

