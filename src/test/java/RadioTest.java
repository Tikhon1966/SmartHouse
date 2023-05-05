import org.example.Radio;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class RadioTest {

    @Test
    public void shouldSetImpossibleNumberNextStation() {
        Radio radio = new Radio();

        radio.setNextStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberNextStation() {
        Radio radio = new Radio();

        radio.setNextStation(1);

        int expected = 2;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxNumberNextStation() {
        Radio radio = new Radio();

        radio.setNextStation(9);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetImpossibleNumberNextStation1() {
        Radio radio = new Radio();

        radio.setNextStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetImpossibleNumberPrevStation() {
        Radio radio = new Radio();

        radio.setPrevStation(-1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetNumberPrevStation() {
        Radio radio = new Radio();

        radio.setPrevStation(1);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinNumberPrevStation() {
        Radio radio = new Radio();

        radio.setPrevStation(0);

        int expected = 9;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetImpossibleNumberPrevStation1() {
        Radio radio = new Radio();

        radio.setPrevStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetImpossibleNumberStation() {
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
    public void shouldSetImpossibleNumberStation1() {
        Radio radio = new Radio();

        radio.setStation(10);

        int expected = 0;
        int actual = radio.getStation();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetImpossibleVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(-1);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(1);

        int expected = 2;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxVolume() {
        Radio radio = new Radio();

        radio.setIncreaseVolume(100);

        int expected = 0;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMinProvVolume() {
        Radio radio = new Radio();

        radio.setDecreaseVolume(0);

        int expected = 0;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetProvVolume() {
        Radio radio = new Radio();

        radio.setDecreaseVolume(10);

        int expected = 9;
        int actual = radio.getCurrentVolume();

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void shouldSetMaxProvVolume() {
        Radio radio = new Radio();

        radio.setDecreaseVolume(101);

        int expected = 0;
        int actual = radio.getCurrentVolume();


        Assertions.assertEquals(expected, actual);
    }
}
