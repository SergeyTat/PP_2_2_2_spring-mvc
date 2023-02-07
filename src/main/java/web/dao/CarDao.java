package web.dao;


import org.springframework.stereotype.Repository;
import web.model.Car;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;


public class CarDao {

    List<Car> carList;

    public CarDao() {

        List<Car> car = new ArrayList<>();


        car.add(new Car(1, "Lada", "qqq"));
        car.add(new Car(2, "BMB", "uuu"));
        car.add(new Car(3, "Mazda", "ppp"));
        car.add(new Car(4, "Opel", "ddd"));
        car.add(new Car(5, "Citroen", "aaa"));

        this.carList = car;

    }

    public List<Car> getCar(int i) {
        return carList.stream().limit(i).collect(Collectors.toList());
    }


}
