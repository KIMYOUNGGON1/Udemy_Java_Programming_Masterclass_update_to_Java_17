package section_12.theGenericClassChallenge;

import java.util.ArrayList;
import java.util.List;

public class Layer<T extends Mappable>{
    private List<T> mappedElements = new ArrayList<>();

    public Layer(List<T> mappedElements) {
        this.mappedElements = mappedElements;
    }

    public void renderLayer() {
        for (T elements : mappedElements) {
            elements.render();
        }
    }
}
