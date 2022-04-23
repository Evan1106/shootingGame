package com.WitchHunter.Scene.WitchHunterScene;

import com.WitchHunter.Controller.SceneController;
import com.WitchHunter.utils.Global;
import com.WitchHunter.utils.Path;
import com.WitchHunter.Scene.Scene;

import java.awt.*;
import java.awt.event.KeyEvent;

public class SelectScene extends Scene {

    Image forTestOnly;

    @Override
    public void sceneBegin() {
        forTestOnly = SceneController.instance().irc().tryGetImage(new Path().img().actors().actors());
    }

    @Override
    public void sceneEnd() {

    }

    @Override
    public void paint(Graphics g) {
        g.setColor(Color.YELLOW);
        g.drawString("按下(A)開啟飛機遊戲，按下(B)開啟蝙蝠俠遊戲", Global.SCREEN_X/2-150, Global.SCREEN_Y/2);
    }

    @Override
    public void update() {

    }

    @Override
    public void keyPressed(int commandCode, long trigTime) {
        if(commandCode == KeyEvent.VK_A) {
            SceneController.instance().change(new SoloBattleMode());
        }
        if(commandCode == KeyEvent.VK_B) {
            SceneController.instance().change(new SoloBattleMode());
        }
    }
}
