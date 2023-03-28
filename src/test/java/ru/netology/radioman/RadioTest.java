package ru.netology.radioman;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {
    @Test
    public void testMaxStationCount(){
            Radio radio = new Radio(30);
            radio.setCurrentStation(10);

            int expected = 10;
            int actual = radio.getCurrentStation();
            Assertions.assertEquals(expected, actual);
        }
    @Test
    public void testChangeStationNext() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.next();
        int expected = 2;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationNextEnd() {
        Radio radio = new Radio();
        radio.setCurrentStation(9);
        radio.next();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationPrev() {
        Radio radio = new Radio();
        radio.setCurrentStation(1);
        radio.prev();
        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeStationPrevEnd() {
        Radio radio = new Radio();
        radio.setCurrentStation(0);
        radio.prev();
        int expected = 9;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeSoundUp() {
        Radio radio = new Radio();
        radio.setCurrentSound(2);
        radio.changeSoundUp();
        int expected = 3;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void testChangeSoundUpEnd() {
        Radio radio = new Radio();
        radio.setCurrentSound(10);
        radio.changeSoundUp();
        int expected = 10;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeSoundLow() {
        Radio radio = new Radio();
        radio.setCurrentSound(8);
        radio.changeSoundLow();
        int expected = 7;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testChangeSoundEnd() {
        Radio radio = new Radio();
        radio.setCurrentSound(0);
        radio.changeSoundLow();
        int expected = 0;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationNumber() {
        Radio radio = new Radio();
        radio.setCurrentStation(3);

        int expected = 3;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationNumberTen() {
        Radio radio = new Radio();
        radio.setCurrentStation(10);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentStationNumberNegative() {
        Radio radio = new Radio();
        radio.setCurrentStation(-1);

        int expected = 0;
        int actual = radio.getCurrentStation();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentSound() {
        Radio radio = new Radio();
        radio.setCurrentSound(4);

        int expected = 4;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentSoundHigh() {
        Radio radio = new Radio();
        radio.setCurrentSound(11);

        int expected = 0;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testCurrentSoundNegative() {
        Radio radio = new Radio();
        radio.setCurrentSound(-1);

        int expected = 0;
        int actual = radio.getCurrentSound();
        Assertions.assertEquals(expected, actual);
    }
}
