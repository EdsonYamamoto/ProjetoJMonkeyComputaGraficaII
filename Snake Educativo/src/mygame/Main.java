package mygame;

import com.jme3.app.SimpleApplication;
import com.jme3.material.Material;
import com.jme3.math.ColorRGBA;
import com.jme3.renderer.RenderManager;
import com.jme3.scene.Geometry;
import com.jme3.scene.shape.Box;
import model.GameConfig;
import model.Snake;

/**
 * This is the Main Class of your Game. You should only do initialization here.
 * Move your Logic into AppStates or Controls
 * @author normenhansen
 */
public class Main extends SimpleApplication {

    public static void main(String[] args) {
        Main app = new Main();
        app.start();
    }

    @Override
    public void simpleInitApp() {
        Snake s = new Snake(assetManager);
        Geometry geom = s.getGeo();

        rootNode.attachChild(geom);
    }

    @Override
    public void simpleUpdate(float tpf) {
        GameConfig.segundo += tpf;
        
        if (GameConfig.segundo>1-GameConfig.speed*0.1){
            GameConfig.score += GameConfig.segundo;
            GameConfig.segundo = 0.0f;
            service.Snake.Mover();
        }
        //TODO: add update code
    }

    @Override
    public void simpleRender(RenderManager rm) {
        //TODO: add render code
    }
}
