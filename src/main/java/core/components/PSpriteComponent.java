package core.components;

import core.scene.Entity;
import maths.Vector;
import processing.core.PImage;

/**
 * Created by Callum Li on 9/15/17.
 */
public class PSpriteComponent extends Component {

    private Vector transform = new Vector(0, 0);
    private final String resourceID;

    public PSpriteComponent(Entity entity, String resourceID) {
        super(entity);
        this.resourceID = resourceID;
    }

    public String getResourceID() {
        return resourceID;
    }

    public Vector getTransform() {
        return transform;
    }
}
