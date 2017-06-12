package HomeWork.module5;

import HomeWork.module5.api.API;
import HomeWork.module5.api.BookingComAPI;
import HomeWork.module5.api.GoogleAPI;
import HomeWork.module5.api.TripAdvisorAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<API> apis = new ArrayList<>();
        API api1 = new BookingComAPI();
        API api2 = new GoogleAPI();
        API api3 = new TripAdvisorAPI();


        apis.add(api1);
        apis.add(api2);
        apis.add(api3);

        Controller controller = new Controller(apis);

        System.out.println(Arrays.toString(controller.check(api1, api3)));
        System.out.println(Arrays.toString(controller.requstRooms(17000,2,"Kiev", "Urkaina")));

    }
}
