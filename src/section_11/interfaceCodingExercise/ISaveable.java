package section_11.interfaceCodingExercise;

import java.util.List;

public interface ISaveable {
    List<String> write();

    void read(List<String> paramList);

}
