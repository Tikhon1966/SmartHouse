package org.example;

public class Radio {
    private int station;

    private int currentVolume;

    public int getStation() {
        return station;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setNextStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        if (newStation == 9) {
            station = 0;
        } else {
            station = newStation + 1;
        }
    }

    public void setPrevStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        if (newStation == 0) {
            station = 9;
        } else {
            station = newStation - 1;
        }
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            return;
        }
        station = newStation;
    }


    public void setIncreaseVolume(int newCarrentVolume) {
        if (newCarrentVolume < 0) {
            return;
        }
        if (newCarrentVolume >= 100) {
            return;
        }
        currentVolume = newCarrentVolume + 1;
    }

    public void setDecreaseVolume(int newCarrentVolume) {
        if (newCarrentVolume <= 0) {
            return;
        }
        if (newCarrentVolume > 100) {
            return;
        }
        currentVolume = newCarrentVolume - 1;


    }
}

