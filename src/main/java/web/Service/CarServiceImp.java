package web.Service;

import org.springframework.stereotype.Component;
import web.model.Car;
import java.util.ArrayList;
import java.util.List;
@Component
public class CarServiceImp implements CarService{
    private List<Car> car;
    {
        car = new ArrayList<>();
        car.add(new Car("Lada", 5, 2000));
        car.add(new Car("Lada", 6, 2001));
        car.add(new Car("Lada", 7, 2002));
        car.add(new Car("Lada", 8, 2003));
        car.add(new Car("Lada", 9, 2004));
    }
    @Override
    public List<Car> carList(Integer count) {
        if (count == null || count >=5) {
            return car;
        } else {
            return car.subList(0, count);
        }
    }
}
