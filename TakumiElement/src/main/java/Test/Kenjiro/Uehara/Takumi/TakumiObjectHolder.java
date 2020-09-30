package Test.Kenjiro.Uehara.Takumi;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class TakumiObjectHolder {
    private final TakumiObject vision = new SimpleTakumiObject();
    private final List<TakumiObject> conepts = Arrays.asList(new SimpleTakumiObject(), new SimpleTakumiObject(), new SimpleTakumiObject());
    private final TakumiObject catchphrase = new SimpleTakumiObject();

    /**
     * return vision.
     *
     * @return vision
     */
    public TakumiObject getVision() {
        return vision;
    }

    /**
     * return conepts.
     *
     * @return conepts
     */
    public List<TakumiObject> getConepts() {
        return Collections.unmodifiableList(conepts);
    }

    /**
     * return catchphrase.
     *
     * @return catchphrase
     */
    public TakumiObject getCatchphrase() {
        return catchphrase;
    }
}
