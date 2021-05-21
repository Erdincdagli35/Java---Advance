package com.company.parametres;

import java.util.List;
import java.util.stream.Collectors;

public class Map {
    private Long Id;
    private String Name;

    public Map(Long id, String name) {
        Id = id;
        Name = name;
    }

    public List<String> getByName(List<Map> map) {
        List<String> result = map.stream().
                map(m -> m.getName()).
                collect(Collectors.toList());
        return result;
    }

    public List<Long> getById(List<Map> map) {
        List<Long> result = map.stream().
                map(m -> m.getId()).
                collect(Collectors.toList());
        return result;
    }
    public List<String> getString(List<Map> map){
        List<String> result = map.stream()
                .map(m->m.toString())
                .collect(Collectors.toList());
        return result;
    }

    public Long getId() {
        return Id;
    }

    public String getName() {
        return Name;
    }

    public String toString() {
        return "Map : \nID : " + getId() + "\nName : " + getName();
    }
}
