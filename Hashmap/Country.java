package Com.Hashmap;

import java.util.HashMap;
import java.util.Map;
public class Country {
    private Map<String,String> countryMap=new HashMap<>();

    public Map<String, String> getCountryMap() {
        return countryMap;
    }

    public void setCountryMap(Map<String, String> countryMap) {
        this.countryMap = countryMap;
    }
    public void add(String cname,String capname){
        countryMap.put(cname,capname);
    }
    public String search(String cname){
        return countryMap.get(cname);
    }
}
