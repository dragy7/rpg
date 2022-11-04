package com.company;

import com.company.entities.Player;
import com.company.entities.Race;

public class Game {

    private String name = "duranova hra za dobrodruzstvim ";
    private final double version = 0.1;
    private final String author = "Dragy";
    private GameDialog gameDialog;
    private Player player;

    public Game() {
        gameDialog = new GameDialog();
        player = new Player();
    }


    public void start() {
        gameDialog.intro(name, version, author);
        introMenu();
    }

    private void introMenu() {
        gameDialog.say("Vitej v poklidnem mestecku. V mestecku bydli tisice lidi. Je cas na vyber tvoji postavy");
        gameDialog.say("zvol si svoji rasu, ", "red");
        for (Race value : Race.values()) {
            gameDialog.say(value.toString(), "blue");

        }
        selectRace();
        storyIntro();
    }
    private void selectRace(){
        String userInput = gameDialog.userInput();
        boolean check = false;
        for (Race value : Race.values()) {
            if (userInput.trim().equalsIgnoreCase(value.toString())) {
                check = true;
                player.setRace(value);
                break;
            }
        }
        if (!check){
            selectRace();
            return;
        }
        System.out.println(player.getRace());
    }

    private void storyIntro(){
        gameDialog.say("Zvolil sis rasu " + player.getRace(), "red");
        gameDialog.say("-------------------------------------------------", "white");
        gameDialog.say("                     Hra začíná");
        gameDialog.say("-------------------------------------------------", "white");
        gameDialog.say("Vitej Tomasi v nasem poklidnem mestecku kde lidi prezivaji tvoji existenci");
        gameDialog.say("-------------------------------------------------", "white");
    }
}
