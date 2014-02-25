package sut.game03.core;

import playn.core.Image;
import playn.core.ImageLayer;
import playn.core.Pointer;
import sut.game03.Screen.SpriteScreen;
import tripleplay.game.Screen;
import tripleplay.game.ScreenStack;

import static playn.core.PlayN.assets;
import static playn.core.PlayN.graphics;

/**
 * Created by BkFamily on 11/2/2557.
 */
public class TestScreen extends Screen {
    private  ScreenStack se = new ScreenStack();
    private ScreenStack  sa = new ScreenStack();
    private SpriteScreen sp = new SpriteScreen(sa);
    private Image bgImage;
    private ImageLayer bgLayer;
    private Image stImage;
    private ImageLayer stLayer;
public TestScreen(ScreenStack se){
    this.se=se;
}

 public void wasShown(){

      bgImage = assets().getImage("images/bg.png");
      bgLayer = graphics().createImageLayer(bgImage);
     graphics().rootLayer().add(bgLayer);
      stImage = assets().getImage("images/start.png");
      stLayer = graphics().createImageLayer(stImage);
     graphics().rootLayer().add(stLayer);
     stLayer.setTranslation(150,156);

     stLayer.addListener(new Pointer.Adapter(){
         @Override
         public   void onPointerEnd(Pointer.Event event){
             se.push(new SpriteScreen(sa));

         }
     });
     bgLayer.addListener(new Pointer.Adapter(){

         @Override
        public void onPointerEnd (Pointer.Event event){
            se.remove(TestScreen.this);

         }

     });

 }
  @Override
    public void wasAdded(){

  }


}
