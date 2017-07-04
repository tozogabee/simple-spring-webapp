package com.tozogabee;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.*;

/**
 * Created by java on 2017.07.04..
 */

@RestController
public class RichController {

    @RequestMapping("/rich")
    public String whoIsTheTeam()
    {
        return "I have got a BMW M5";
    }

    @RequestMapping("/rich/cars")
    public List<String> cars()
    {
        List<String> listOfCars=new ArrayList<String>();
        listOfCars.add("BMW M5");
        listOfCars.add("Audi A6 3.0 TFSI");
        listOfCars.add("Audi A7 3.0 TFSI");
        listOfCars.add(UUID.randomUUID().toString());
        listOfCars.add(LocalDateTime.now().toString());

        return listOfCars;
    }

    @RequestMapping("/rich/pc")
    public Map<String,List<String>> map() {
        Map<String, List<String>> pc = new HashMap<>();
        pc.put("TozoGabee",Arrays.asList("Audi 2.0 TFSI","BMW M5"));
        pc.put("Donald Trump", Arrays.asList("Rolls Royce","Winsmann","Mercedes Benz E55 AMG"));
        pc.put("Berki Krisztian",Arrays.asList("Maserati Quattroporte"));
        pc.put("Csuhai Janos",Arrays.asList("BMW 330i xdrive"));
        Set<Map.Entry<String, List<String>>> tmp = pc.entrySet();
        List<Map.Entry<String,List<String>>> tmpList=new ArrayList<Map.Entry<String, List<String>>>(tmp);
        Collections.sort(tmpList, new Comparator<Map.Entry<String, List<String>>>() {
            @Override
            public int compare(Map.Entry<String, List<String>> o1, Map.Entry<String, List<String>> o2) {
                return (o2.getKey().compareTo(o1.getKey()));
            }
        });

        return pc;
    }


}
