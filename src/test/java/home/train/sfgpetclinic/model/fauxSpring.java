package home.train.sfgpetclinic.model;

import home.train.sfgpetclinic.fauxspring.Model;

import java.util.HashMap;
import java.util.Map;

public class fauxSpring implements Model {

    Map<String,Object> map= new HashMap<>();
    @Override
    public void addAttribute(String key, Object o) {
        map.put(key,o);
    }

    public Map<String, Object> getMap() {
        return map;
    }

    @Override
    public void addAttribute(Object o) {

    }
}
