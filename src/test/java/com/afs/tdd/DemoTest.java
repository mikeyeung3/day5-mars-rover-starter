package com.afs.tdd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DemoTest {
    @Test
    void should_increase_y_given_command_M_direction_N() {
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

    @Test
    void should_decrease_y_given_command_M_direction_S() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.execute(command);

        assertEquals(-1 , marsRover.getY());
    }

    @Test
    void should_decrease_x_given_command_M_direction_W() {
        String command = "M";

        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.execute(command);

        assertEquals(-1 , marsRover.getX());
    }

    @Test
    void should_change_direction_to_W_given_command_L_direction_N() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.execute(command);

        assertEquals("W" , marsRover.getDirection());
    }

    @Test
    void should_change_direction_to_S_given_command_L_direction_W() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.execute(command);

        assertEquals("S" , marsRover.getDirection());
    }

    @Test
    void should_change_direction_to_E_given_command_L_direction_S() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.execute(command);

        assertEquals("E" , marsRover.getDirection());
    }

    @Test
    void should_change_direction_to_N_given_command_L_direction_E() {
        String command = "L";

        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.execute(command);

        assertEquals("N" , marsRover.getDirection());
    }

    @Test
    void should_change_direction_to_E_given_command_R_direction_N() {
        String command = "R";

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.execute(command);

        assertEquals("E" , marsRover.getDirection());
    }

    @Test
    void should_change_direction_to_S_given_command_R_direction_E() {
        String command = "R";

        MarsRover marsRover = new MarsRover(0, 0, "E");
        marsRover.execute(command);

        assertEquals("S" , marsRover.getDirection());
    }

    @Test
    void should_change_direction_to_W_given_command_R_direction_S() {
        String command = "R";

        MarsRover marsRover = new MarsRover(0, 0, "S");
        marsRover.execute(command);

        assertEquals("W" , marsRover.getDirection());
    }

    @Test
    void should_change_direction_to_N_given_command_R_direction_W() {
        String command = "R";

        MarsRover marsRover = new MarsRover(0, 0, "W");
        marsRover.execute(command);

        assertEquals("N" , marsRover.getDirection());
    }

    @Test
    void should_execute_sequence_of_commands_given_list_of_move_and_turn() {
        String[] commands = {"M", "R", "M", "L", "M"};

        MarsRover marsRover = new MarsRover(0, 0, "N");
        marsRover.batchExecute(commands);

        assertEquals(1, marsRover.getX());
        assertEquals(2, marsRover.getY());
        assertEquals("N", marsRover.getDirection());
    }

    @Test
    void should_do_nothing_given_batchExecute_with_empty_commands() {
        String[] commands = {};

        MarsRover marsRover = new MarsRover(5, 5, "S");
        marsRover.batchExecute(commands);

        assertEquals(5, marsRover.getX());
        assertEquals(5, marsRover.getY());
        assertEquals("S", marsRover.getDirection());
    }

    @Test
    void should_throw_exception_given_batchExecute_contains_invalid_command() {
        String[] commands = {"M", "X"};

        MarsRover marsRover = new MarsRover(0, 0, "N");

        assertThrows(IllegalStateException.class, () -> marsRover.batchExecute(commands));
    }
}
