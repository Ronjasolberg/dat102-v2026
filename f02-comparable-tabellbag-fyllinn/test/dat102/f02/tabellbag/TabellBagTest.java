package dat102.f02.tabellbag;

import  junit.framework.Assert.*;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import javax.print.DocFlavor;

class TabellBagTest {

	@Test
	void test() {
        BagADT<String> pose = new TabellBag<>(3);

        assertTrue(pose.isEmpty());
        assertEquals(2, pose.getNumberOfEntries());

        pose.add("eple"); // Nå er posen full
        assertFalse(pose.add("appelsin"));
        assertEquals(3, pose.getNumberOfEntries());

        assertFalse(pose.isEmpty());


    }

}
