package pxljam.entities;

import core.components.ColliderComponent;
import core.components.PSpriteComponent;
import core.entity.Entity;
import maths.Vector;
import pxljam.scripts.PlayerController;

/**
 * This class handles the entity of the player within the game
 * @author Alex Mitchell
 */
public class PlayerEntity extends Entity{

    Vector previous = new Vector(0,0);

    /**
     * Creates a PlayerEntity at a given position
     * @param x The x position
     * @param y The y position
     */
    public PlayerEntity(float x, float y){
        super(new Vector(x,y));

        addComponent(new PSpriteComponent(this, "player")); //Todo change the PSprite component
        addComponent(new PlayerController(this));
        addComponent(new ColliderComponent(this, null)); //Todo Change the Collider component
    }

    @Override
    public Vector getPosition(){
        Vector p = super.getPosition();
        System.err.println("Location: " + p.x + " " + p.y + " Difference: " + (p.x - previous.x) + " " + (p.y - previous.y));
        previous = new Vector(p);
        return super.getPosition();
    }
}


