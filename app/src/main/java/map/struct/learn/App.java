/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package map.struct.learn;

import map.struct.learn.dto.CarDto;
import map.struct.learn.mapper.CarMapper;
import map.struct.learn.model.Car;
import map.struct.learn.model.Person;

public class App {

    public static void main(String[] args) {
        Car car = new Car()
                .setMake("Lada")
                .setNumberOfSeats(4)
                .setOwner(new Person()
                        .setName("Фамилия Имя Отчество"))
                ;

        CarDto carDto = CarMapper.INSTANCE.carToCarDto(car);

        System.out.println(String.format("Mapped from car=%s\ninto car=%s", car, carDto));
    }
}
