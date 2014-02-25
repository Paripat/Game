package sut.game03.core;

/**
 * Created by BkFamily on 11/2/2557.
 */

public class Zealot {
    private Sprite sprite;
    private int spriteIndex=0;
    private boolean hasLoaded = false;
//    private Body body;
}

public void setState(State state){
    this.State = state;
}

public   enum State{
    IDLE,RUN,ATTK
};

private State state = State.IDLE;
private int e=0;
private int offset=0;

public Zealot(final float x,final float y){
        this.sprite = SpriteLoader.getSprite("images/Sprite/Balada.json");


        }
