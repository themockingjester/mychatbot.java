package Hangman;
import java.awt.*;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;
public class Hangman {

        public void play_hangman() {
            String url = "https://hangmanwordgame.com/?fca=1&success=0#/round-results";
            if (Desktop.isDesktopSupported()) {
                Desktop desktop = Desktop.getDesktop();
                try {
                    desktop.browse(new URI(url));
                } catch (IOException | URISyntaxException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }

            } else {
                Runtime runtime = Runtime.getRuntime();
                try {
                    runtime.exec("xdg-open " + url);
                } catch (IOException e) {
                    // TODO Auto-generated catch block
                    e.printStackTrace();
                }
            }
        }
    }


