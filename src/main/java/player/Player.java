package player;

import lombok.Builder;
import lombok.Data;

@Data
@Builder
public class Player {

    public String name;
    public int saldo;

}
