/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;


/**
 *
 * @author Dell i5
 */
public class gestionevenement {
     @Test
    void testAjouterEvenement() {
        GestionEvenements gestion = GestionEvenements.getInstance();
        Conference conf = new Conference("Conf1", "IA");
        assertDoesNotThrow(() -> gestion.ajouterEvenement(conf));
    }
    
}
