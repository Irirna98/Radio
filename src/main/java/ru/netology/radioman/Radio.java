package ru.netology.radioman;

public class Radio {
    private int currentStation;
    private int currentSound;
    private int maxStation;

    public Radio() {
        maxStation = 9;
    }

    public Radio(int stationCound) {
        maxStation = stationCound - 1;
    }

    public void next() {
        if (currentStation != maxStation) {
            currentStation++;
        } else {
            currentStation = 0;
        }
    }

    public void prev() {
        if (currentStation != 0) {
            currentStation--;
            return;
        }
        currentStation = maxStation;
    }

    public void changeSoundUp() {
        if (currentSound < 10) {
            currentSound++;
        } else {
            currentSound = 10;
        }

    }

    public void changeSoundLow() {
        if (currentSound != 0) {
            currentSound--;
        } else {
            currentSound = 0;
        }

    }


    public int getCurrentStation() {
        return currentStation;
    }

    public void setCurrentStation(int currentStation) {
        if (currentStation < 0) {
            return;
        }
        if (currentStation > maxStation) {
            return;
        }
        this.currentStation = currentStation;
    }

    public int getCurrentSound() {
        return currentSound;
    }

    public void setCurrentSound(int currentSound) {
        if (currentSound < 0) {
            return;
        }
        if (currentSound > 10) {
            return;
        }
        this.currentSound = currentSound;
    }
}