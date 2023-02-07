package web.Test;

import web.dao.CarDao;
import web.model.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDao carDao = new CarDao();
        List<Car> car = carDao.getCar(3);
        System.out.println(car);
    }
}
