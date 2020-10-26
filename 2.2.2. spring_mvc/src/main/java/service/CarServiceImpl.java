package service;

import model.Car;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class CarServiceImpl implements CarSetvice{
    public List<Car> carList;

    @Override
    public List<Car> carListMethod() {
        this.carList=new ArrayList<>();
        this.carList.add(new Car("Red", 445, 4));
        this.carList.add(new Car("Black", 221, 3));
        this.carList.add(new Car("White", 135, 1));
        this.carList.add(new Car("Yellow", 408, 7));
        this.carList.add(new Car("Pink", 305, 2));
        return carList;
    }
    @Override
    public List quantityOfCar(int number){
       return carListMethod().subList(0,number);
    }

}
