/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package easter_egg;
 
/**
 *
 * @author elias
 */
import java.applet.Applet;
import java.applet.AudioClip;
import java.net.URL;
import javax.swing.*;
import javax.sound.sampled.*;
import java.io.*;
 
public class Som {
    
    private Clip clipe;
    public Som(String arquivo) {
        tocar(arquivo);
    }
 
    public Som(){
        this.clipe = tocarMusica();
    }
    
    public void pararMusica(){
        this.clipe.stop();
    }
    public void tocar(String arquivo) {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File(arquivo).getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.start();
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
        }
         
    }
    
    public Clip tocarMusica() {
        try {
            AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("src/sounds/base.wav").getAbsoluteFile());
            Clip clip = AudioSystem.getClip();
            clip.open(audioInputStream);
            clip.loop(Clip.LOOP_CONTINUOUSLY);
            clip.start();
            return clip;
        } catch (Exception ex) {
            System.out.println("Erro ao executar SOM!");
            ex.printStackTrace();
            return null;
        }
         
    }
    
    
    
    
}