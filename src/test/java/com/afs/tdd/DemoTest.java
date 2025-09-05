package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DemoTest {
    @Test
    void should_increase_x_given_command_M_direction_N() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.execute(command);

        assertEquals(1 , marsRover.getY());
    }

    @Test
    void should_increase_x_given_command_M_direction_E() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.execute(command);

        assertEquals(1 , marsRover.getX());
    }
}
