package uy.edu.um.demo.midtermexam;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Team {
    String name;
    TeamMember coach;
    List<TeamMember> players;
}
