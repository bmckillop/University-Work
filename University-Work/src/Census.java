/**
 * Created by benm on 21/02/2017.
 */
public class Census {
    public static void main(String[] args) {

        int SecondsinYear = 31536000;
        int CurrentPopulation = 312032486;
        int BornPerYear = SecondsinYear / 7;
        int DiesPerYear = SecondsinYear / 13;
        int ImmigrantPerYear = SecondsinYear / 45;
        int Population2017 = CurrentPopulation + BornPerYear - DiesPerYear + ImmigrantPerYear ;
        int Population2018 = Population2017 + BornPerYear - DiesPerYear + ImmigrantPerYear ;
        int Population2019 = Population2018 + BornPerYear - DiesPerYear + ImmigrantPerYear ;
        int Population2020 = Population2019 + BornPerYear - DiesPerYear + ImmigrantPerYear ;
        int Population2021 = Population2020 + BornPerYear - DiesPerYear + ImmigrantPerYear ;

        System.out.println("Number of people born per year is " + BornPerYear);
        System.out.println("Number of people die per year is " + DiesPerYear);
        System.out.println("Number of immigrants that come per year is " + ImmigrantPerYear);


        System.out.println("Population in 2017 is " + Population2017);
        System.out.println("Population in 2018 is " + Population2018);
        System.out.println("Population in 2019 is " + Population2019);
        System.out.println("Population in 2020 is " + Population2020);
        System.out.println("Population in 2021 is " + Population2021);




    }


}
