package seedu.classmate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

class ModuleTest {

    @Test
    void addPrerequisite_duplicateInput_noChange() {
        Module module = new Module("CG1111A", "Engineering Principles and Practice I");
        module.addPrerequisite("CS1010");
        module.addPrerequisite("CS1010"); // Duplicate code

        /*
         * Since prerequisites are stored as an ArrayList<String>,
         * Size of the ArrayList will increment without detecting duplicate entry
         */
        assertEquals(1, module.getPrerequisites().size(), "Prerequisite module should not be duplicated.");
    }
}
