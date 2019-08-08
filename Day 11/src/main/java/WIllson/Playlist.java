package WIllson;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Playlist implements Playable {
    /*
    Glowna zaleta interfejsu
    Java sprawdza czy do listy wrzycamy klase, ktora
    bedzie implementowalą dany interfejs, tzn:
    czy klasa bedzie miala implemetcje metody play();
     */

    private List<Playable> tracks = new ArrayList<>();

    public void add(Playable playable) {
        tracks.add(playable);
    }
    // jaki metod musimy odtwarzac
    private PlayMode playMode;

    public PlayMode getPlayMode() {
        return playMode;
    }

    public void setPlayMode(PlayMode playMode) {
        this.playMode = playMode;
    }

    public Playlist() {
        playMode = PlayMode.SEQUANTIALLY;
    }


    @Override
    public void play() {
        /*
        switch - zamiennik IFa, jezeli mamy duzo ifow ne tek samej zmiennej
         */
        switch (playMode) {
            case SEQUANTIALLY:
                // if playMode = PlayMode.SEQENTIALLY;
                playSequentially();
                break;
            case RANDOMLY:
                playRandomly();
                break;
            case LOOP:
                playLoop();
                break;
        }
    }

    public void playSequentially() {
        for (Playable track : tracks) {
            track.play();
        }
    }

    public void playRandomly() {
        List<Playable> playListToPlay = new ArrayList<>(tracks);
        Collections.shuffle(playListToPlay);
        for (Playable playable : playListToPlay) {
            playable.play();
        }
    }

    public void playLoop() {
        int max = 10;
        for (int i = 0; i < max; i++) {
            playSequentially();
        }
    }



}
