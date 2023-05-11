package org.example;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int station = minStation;

    private int currentVolume;

    public int getStation() {
        return station;
    }

    public int getCurrentVolume() {
        return currentVolume;
    }

    public void setStation(int newStation) {
        if (newStation < 0) {
            return;
        }
        if (newStation > 9) {
            newStation = 9;
            station = newStation;
        } else {
            station = newStation;
        }
    }

    public void nextStation() {
        if (station == 9) {
            int nextStation = 0;
            setStation(nextStation);
        } else {
            int nextStation = station + 1;
            setStation(nextStation);
        }
    }

    public void prevStation() {
        if (station == 0) {
            int prevStation = 9;
            setStation(prevStation);
        } else {
            int prevStation = station - 1;
            setStation(prevStation);
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < 0) {
            return;
        }
        if (newCurrentVolume > 100) {
            newCurrentVolume = 100;
            currentVolume = newCurrentVolume;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume == 100) {
            int increaseVolume = 100;
            setCurrentVolume(increaseVolume);
        } else {
            int increaseVolume = currentVolume + 1;
            setCurrentVolume(increaseVolume);
        }

    }

    public void decreaseVolume() {
        if (currentVolume == 0) {
            int decreaseVolume = 0;
            setCurrentVolume(decreaseVolume);
        } else {
            int decreaseVolome = currentVolume - 1;
            setCurrentVolume(decreaseVolome);
        }
    }
}

