package uy.edu.um.demo.midtermexam;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.util.Arrays;

public class TeamJsonMain {

    public static void main(String[] args) throws Exception {
        System.out.println(new ObjectMapper().writeValueAsString(Team.builder()
                .coach(new TeamMember("Juan", "Perez", 45))
                .players(Arrays.asList(new TeamMember("Pablo", "Perez", 21),
                        new TeamMember("Luis", "Gonzalez", 20)))
                .name("Equipo de las estrellas")
                .build()));

    }

}
