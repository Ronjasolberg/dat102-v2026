package dat102.f05.stabel.lenketstabel;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class LenketStabelTest {

    StabelADT<Integer> stabelen;

    // Data som skal gjenbrukes i testene
    @BeforeEach
    void oppsett() {
        stabelen = new LenketStabel<>();
    }

	@Test
	void testeNyopprettetStabel() {
        assertTrue(stabelen.isEmpty());

        stabelen.push(10);
        assertFalse(stabelen.isEmpty());
        assertEquals(10, stabelen.peak());

	}

}
