package sut.game03.Screen;

import playn.core.*;
import tripleplay.game.Screen;
import tripleplay.game.ScreenStack;

import static playn.core.PlayN.assets;
import static playn.core.PlayN.graphics;

/**
 * Created by BkFamily on 11/2/2557.
 */
public class SpriteScreen extends Screen {
    private ScreenStack sa;
    private Image bgImage;
    private ImageLayer bgLayer;
    public SpriteScreen(ScreenStack sa){
        this.sa=sa;
    }
    public void wasShown(){
        bgImage = assets().getImage("images/bg.png");
        bgLayer = graphics().createImageLayer(bgImage);
        graphics().rootLayer().add(bgLayer);

        PlayN.keyboard().setListener(new Keyboard.Listener() {
            @Override
            public void onKeyDown(Keyboard.Event event) {

            }

            @Override
            public void onKeyTyped(Keyboard.TypedEvent typedEvent) {

            }

            @Override
            public void onKeyUp(Keyboard.Event event) {
                if(event.key() == Key.E)
                    sa.remove(SpriteScreen.this);
            }
        });
    }
}
