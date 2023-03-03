package Week3.Day08_ternaries_switch;

public class Elevator {

    public static void main(String[] args) {

        int floorNum = 7;
        boolean floor1 = floorNum == 1;
        boolean floor2 = floorNum == 2;
        boolean floor3 = floorNum == 3;
        String result = "Invalid floor - " + floorNum;

        if(floor1 || floor2 || floor3) {
            result = "Floor " + floorNum + " is selected. Companies: ";
        if(floor1){
            result += "Lobby, Verizon, Starbucks";
        }else if (floor2) {
            result += "Cydeo, Nasa, Intelsat";
        }else{
            result += "Lyft, BofA, Steak house";
        }
        }
        System.out.println(result);
    }
}
/*
1. Create a class called Elevator. A variable named floorNumber is given, write a program that can display the floor info
			when floorNum is 1 -> print "Floor 1 selected. Companies: Lobby, Verizon, Starbucks"
			when floorNum is 2 -> print "Floor 2 selected. Companies: Cydeo, NASA, Intelsat"
			when floorNum is 3 -> print "Floor 3 selected. Companies: Lyft, BofA, Stake house"

			anything else: print "Invalid floor - 6"
 */