package ru.job4j.condition;

import org.junit.Test;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class ChessBoardTest {
    @Test
    public void wayIs6() {
        int way = ChessBoard.way(3, 0, 9, 6);
        assertThat(way, is(6));
    }

    @Test
    public void wayIs5() {
        int way = ChessBoard.way(6, 7, 1, 2);
        assertThat(way, is(5));
    }

    @Test
    public void wayIs0() {
        int way = ChessBoard.way(0, 0, 5, 0);
        assertThat(way, is(0));
    }

}
