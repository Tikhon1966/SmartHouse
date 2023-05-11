import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetMaxAmountNextStation() {
        Radio radio = new Radio(12);

        radio.setStation(radio.getMaxStation());

        radio.nextStation();

        int expected = radio.getMinStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberNextStation() {
        Radio radio = new Radio();

        radio.setStation(radio.getMaxStation());

        radio.nextStation();

        int expected = radio.getMinStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberNextStation() {
        Radio radio = new Radio();

        radio.setStation(radio.getMinStation());

        radio.nextStation();

        int expected = radio.getMinStation() + 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxAmountPrevStation() {
        Radio radio = new Radio(12);

        radio.setStation(radio.getMaxStation());

        radio.prevStation();

        int expected = radio.getMaxStation() - 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberPrevStation() {
        Radio radio = new Radio();

        radio.setStation(radio.getMaxStation());

        radio.prevStation();

        int expected = radio.getMaxStation() - 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberPrevStation() {
        Radio radio = new Radio();

        radio.setStation(radio.getMinStation());

        radio.prevStation();

        int expected = radio.getMaxStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMinNumberStation() {
        Radio radio = new Radio();

        radio.setStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberStation() {
        Radio radio = new Radio();

        radio.setStation(1);

        int expected = 1;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxNumberStation() {
        Radio radio = new Radio();

        radio.setStation(10);

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxAmountStation() {
        Radio radio = new Radio(12);

        radio.setStation(15);

        int expected = radio.getMaxStation();
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetImpossibleVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(-1);

        int expected = radio.getMinStation();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(1);

        int expected = 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(101);

        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());
        radio.decreaseVolume();
        int expected = radio.getMinVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxDecreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.decreaseVolume();
        int expected = radio.getMaxVolume() - 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMinVolume());
        radio.increaseVolume();
        int expected = radio.getMinVolume() + 1;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }


    @Test
    public void shouldSetMaxIncreaseVolume() {
        Radio radio = new Radio();

        radio.setCurrentVolume(radio.getMaxVolume());
        radio.increaseVolume();
        int expected = radio.getMaxVolume();
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }
}
