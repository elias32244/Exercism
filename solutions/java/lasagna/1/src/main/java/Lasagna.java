public class Lasagna {
    public int expectedMinutesInOven() { return 40 ;  }// TODO: define the 'expectedMinutesInOven()' method

    public int remainingMinutesInOven(int actualMinutes) { return 40 - actualMinutes; }// TODO: define the 'remainingMinutesInOven()' method

    public int preparationTimeInMinutes(int layers) { return layers * 2; }// TODO: define the 'preparationTimeInMinutes()' method

    public int totalTimeInMinutes(int layers,int actualMinutes) { return layers * 2 + actualMinutes ; }// TODO: define the 'totalTimeInMinutes()' method
}
