package org.example;

public class Radio {
    private int minStation = 0;
    private int maxStation = 9;
    private int station = minStation;
    private int minVolume = 0;
    private int maxVolume = 100;

    private int currentVolume = minVolume;

    public int getStation() {
        return station;
    }

    public int getMinStation() {
        return minStation;
    }

    public int getMaxStation() {
        return maxStation;
    }


    public int getCurrentVolume() {
        return currentVolume;
    }

    public int getMinVolume() {
        return minVolume;
    }

    public int getMaxVolume() {
        return maxVolume;
    }

    public Radio() {

    }

    public Radio(int amount) {
        maxStation = amount - 1;
    }

    public void setStation(int newStation) {
        if (newStation < minStation) {
            return;
        }
        if (newStation > maxStation) {
            newStation = maxStation;
            station = newStation;
        } else {
            station = newStation;
        }
    }

    public void nextStation() {
        if (station == maxStation) {
            int nextStation = minStation;
            setStation(nextStation);
        } else {
            int nextStation = station + 1;
            setStation(nextStation);
        }
    }

    public void prevStation() {
        if (station == minStation) {
            int prevStation = maxStation;
            setStation(prevStation);
        } else {
            int prevStation = station - 1;
            setStation(prevStation);
        }

    }

    public void setCurrentVolume(int newCurrentVolume) {
        if (newCurrentVolume < minVolume) {
            return;
        }
        if (newCurrentVolume > maxVolume) {
            newCurrentVolume = maxVolume;
            currentVolume = newCurrentVolume;
        } else {
            currentVolume = newCurrentVolume;
        }
    }

    public void increaseVolume() {
        if (currentVolume == getMaxVolume()) {
            int increaseVolume = maxVolume;
            setCurrentVolume(increaseVolume);
        } else {
            int increaseVolume = currentVolume + 1;
            setCurrentVolume(increaseVolume);
        }

    }

    public void decreaseVolume() {
        if (currentVolume == getMinVolume()) {
            int decreaseVolume = minVolume;
            setCurrentVolume(decreaseVolume);
        } else {
            int decreaseVolome = currentVolume - 1;
            setCurrentVolume(decreaseVolome);
        }
    }
}

