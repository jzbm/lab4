package org.example;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ColorTest {

    @Test
    void negativeRedValueThrows() {
        assertThrowsWithMessage(() -> new Color(-8, 0, 0), "Error");
    }

    @Test
    void negativeGreenValueThrows() {
        assertThrowsWithMessage(() -> new Color(0, -4, 0), "Error");
    }

    @Test
    void negativeBlueValueThrows() {
        assertThrowsWithMessage(() -> new Color(0, 0, -2), "Error");
    }

    @Test
    void excessiveRedValueThrows() {
        assertThrowsWithMessage(() -> new Color(290, 0, 0), "Error");
    }

    @Test
    void excessiveGreenValueThrows() {
        assertThrowsWithMessage(() -> new Color(0, 280, 0), "Error");
    }

    @Test
    void excessiveBlueValueThrows() {
        assertThrowsWithMessage(() -> new Color(0, 0, 270), "Error");
    }

    @Test
    void invalidAlphaValueThrows() {
        assertThrowsWithMessage(() -> new Color(0, 0, 0, -0.3f), "Error");
        assertThrowsWithMessage(() -> new Color(0, 0, 0, 1.2f), "Error");
    }

    @Test
    void validColorValuesPass() {
        assertDoesNotThrow(() -> new Color(5, 5, 5));
        assertDoesNotThrow(() -> new Color(250, 250, 250));
        assertDoesNotThrow(() -> new Color(110, 140, 210, 0.75f));
    }

    private void assertThrowsWithMessage(Runnable action, String expectedMessage) {
        IllegalArgumentException exception = assertThrows(IllegalArgumentException.class, action::run);
        assertEquals(expectedMessage, exception.getMessage());
    }
}
