package WIllson;

import lombok.AllArgsConstructor;
import lombok.Data;
@AllArgsConstructor
@Data
public class Movie implements Playable{
    private String title;

    public void play() {
        System.out.println("Film : " + title);
    }
}
