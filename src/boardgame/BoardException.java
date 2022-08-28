package boardgame;

import java.io.Serializable;

public class BoardException extends RuntimeException{
    private static final Serializable serial = 1L;

    public BoardException(String msg) {
        super(msg);
    }
}
