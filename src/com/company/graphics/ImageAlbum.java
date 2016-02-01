package com.company.graphics;

public enum ImageAlbum {

    //If you add another object to the game you must insert it in the enumeration here in order to get it's path
    RebelPlayer("/MilleniumFalcon65.png"),
    SithPlayer("/SithInfiltrator65.png"),
    EasyEmpireEnemy("/TIEFighter65.png"),
    SturdyEmpireEnemy("/StarDestroyer65.png"),
    EasyRebelsEnemy("/XWing65.png"),
    SturdyRebelsEnemy("/JediStarFighter65.png"),
    DoubleDamageBonus("/x2Bonus.png"),
    Bullet("/bullet.png"),
    Background("/bg.jpg"),
    Live("/live.png"),
    Gameover("/gameover.jpg"),
    HighScores("/highScores.png"),
    Explosion("/explosion.png"),
    ChooseSideBG("/ChooseSide.jpg"),
    MainMenu("/mainMenu.jpg"),
    Button("/button.png"),
    ButtonBar("/bar1.jpg");

    private String path;

    ImageAlbum(String path) {
        this.path = path;
    }

    public String getPath(){
        return this.path;
    }

}
