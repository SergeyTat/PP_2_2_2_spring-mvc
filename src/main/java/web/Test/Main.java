package web.Test;

import web.dao.CarDaoImpl;
import web.model.Car;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        CarDaoImpl carDao = new CarDaoImpl();
        List<Car> car = carDao.getCar(3);
        System.out.println(car);
    }
}
