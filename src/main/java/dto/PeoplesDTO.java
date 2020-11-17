package dto;

import java.util.ArrayList;
import java.util.List;

public class PeoplesDTO {

    private List<PeopleDTO> allPeople = new ArrayList();
    private List<PeopleDTO> results = new ArrayList();

    public PeoplesDTO() {
    }

    public PeoplesDTO(List<PeopleDTO> results) {
        results.forEach((p) -> {
            allPeople.add(new PeopleDTO(p.getName(), p.getGender()));
        });
    }

    public List<PeopleDTO> getAllPeople() {
        return allPeople;
    }

    public void setAllPeople(List<PeopleDTO> allPeople) {
        this.allPeople = allPeople;
    }

}
