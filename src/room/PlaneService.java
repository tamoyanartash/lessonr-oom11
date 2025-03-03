package room;

public class PlaneService {
    public void task1(Plane plane) {
        System.out.println("Model:" + plane.getModel());
        System.out.println("Country:" + plane.getCountry());
        System.out.println("Year:" + plane.getYear());
        System.out.println("Hours:" + plane.getHours());
        System.out.println("Milatry:" + plane.isMilitary());
        System.out.println("Weight:" + plane.getWeight());
        System.out.println("Wingspan:" + plane.getWingspan());
        System.out.println("TopSpeed:" + plane.getTopSpeed());
        System.out.println("Seats:" + plane.getSeats());
        System.out.println("Cost:" + plane.getCost());
        System.out.println("-------------------");


    }

    public void task2(Plane plane) {
        if (plane.isMilitary()) {
            System.out.println("cost" + plane.getCost());
            System.out.println("TopSpeed" + plane.getTopSpeed());
        } else {
            System.out.println("Country" + plane.getCountry());
            System.out.println("Model" + plane.getModel());

        }

    }

    public Plane task3(Plane p1, Plane p2) {
        Plane neew = p1;
        if (p1.getYear() > p2.getYear()) {
            return neew;
        }
        return neew;

    }

    public String task4(Plane p1, Plane p2) {
        Plane max = p2;
        if (p1.getWingspan() > p2.getWingspan()) {
            max = p1;
        }
        return max.getModel();

    }

    public void task5(Plane p1, Plane p2, Plane p3) {
        if (p1.getSeats() > p2.getSeats() && (p1.getSeats() > p3.getSeats())) {
            System.out.println(p1.getCountry());
        } else if ((p2.getSeats() > p1.getSeats() && (p2.getSeats() > p3.getSeats()))) {
            System.out.println(p2.getCountry());

        } else {
            System.out.println(p3.getCountry());
        }

    }

    public void task6(Plane[] plans) {
        for (int i = 0; i < plans.length; i++) {
            if (plans[i].isMilitary() == false)
                System.out.println(plans[i].getModel());

        }

    }
    public void task7(Plane[] plans){
        for (int i = 0; i < plans.length; i++) {
            if (plans[i].isMilitary() && plans[i].getHours()> 100){
                System.out.println();
            }

        }
    }
}


