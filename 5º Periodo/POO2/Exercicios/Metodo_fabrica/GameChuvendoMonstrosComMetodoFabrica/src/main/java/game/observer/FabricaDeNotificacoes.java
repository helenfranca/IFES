package game.observer;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.newdawn.slick.Image;
import org.newdawn.slick.SlickException;

public class FabricaDeNotificacoes {

    String filePath;

    FabricaDeNotificacoes() {
        try {
            File file = new File(".");
            filePath = file.getCanonicalPath();
        } catch (IOException ex) {
            Logger.getLogger(FabricaDeNotificacoes.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public Image criarImagensNotificacao(String tipo) throws SlickException{

        Image image = null;
       System.out.println("Blabla");
        if (tipo.equalsIgnoreCase("gameover")) {
            System.out.println("Ta tudo null");
            image = new Image(filePath + "\\src\\main\\java\\gameover.png");
        } else if (tipo.equalsIgnoreCase("ganhou")) {
            image = new Image(filePath + "\\src\\main\\java\\ganhou.png");
        }
        
        return image;
    }

}
