package WIllson;

import lombok.AllArgsConstructor;
import lombok.Data;


@AllArgsConstructor
@Data
public class Song implements Playable{
    private String name;
    private String author;

    public void play() {
        System.out.println("Muzyka : "+author+", "+name);
    }

}

