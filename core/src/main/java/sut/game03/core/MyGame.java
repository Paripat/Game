package sut.game03.core;

import static playn.core.PlayN.*;

import playn.core.*;
import playn.core.util.Clock;
import tripleplay.game.Screen;
import tripleplay.game.ScreenStack;


public class MyGame extends Game.Default {
    private static final int UPDATE_RATE=25;
    private ScreenStack ss = new ScreenStack();
    private ScreenStack se = new ScreenStack();
    protected final Clock.Source clock = new Clock.Source(UPDATE_RATE);
  public MyGame() {
    super(UPDATE_RATE); // call update every 33ms (30 times per second)
  }

  @Override
  public void init() {
      final Screen home = new HomeScreen(ss);
      final Screen test = new TestScreen(se);
      ss.push(home);
    // create and add background image layer
//    Image bgImage = assets().getImage("images/bg.png");
//    ImageLayer bgLayer = graphics().createImageLayer(bgImage);
//    graphics().rootLayer().add(bgLayer);
      PlayN.keyboard().setListener(new Keyboard.Adapter(){

          @Override
      public void onKeyUp(Keyboard.Event event){
              if(event.key() == Key.ESCAPE){
                  ss.popTo(home);
              }
          }
      });

  }

  @Override
  public void update(int delta) {
    ss.update(delta);
    se.update(delta);
  }

  @Override
  public void paint(float alpha) {
    // the background automatically paints itself, so no need to do anything here!
    clock.paint(alpha);
      ss.paint(clock);
      se.paint(clock);
  }
}
