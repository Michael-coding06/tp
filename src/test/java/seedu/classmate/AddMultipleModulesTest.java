package seedu.classmate;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class AddMultipleModulesTest {

    @Test
    public void addMultiplePrerequisitesForAModule() {
        Module module = new Module("EE2026", "Digital Design");
        module.addPrerequisites("CG1111A", "CS1010");

        assertEquals(2, module.getPrerequisites().size());
        assertTrue(module.getPrerequisites().contains("CG1111A"));
        assertTrue(module.getPrerequisites().contains("CS1010"));
    }
}
