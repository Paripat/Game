package sut.game03.android;

import playn.android.GameActivity;
import playn.core.PlayN;

import sut.game03.core.MyGame;

public class MyGameActivity extends GameActivity {

  @Override
  public void main(){
    PlayN.run(new MyGame());
  }
}
