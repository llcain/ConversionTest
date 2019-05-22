

public class App {

    public static void main (String [] args) {

        int income;
        int qcdt, jcdt, josh, qpierce;
        qcdt = 1000;
        jcdt = 2096;
        josh = 600;
        qpierce = 1512;
        int monthlyBills;
        int mortgage;
        int jCarNote;
        int qCarNote;
        mortgage = 386;
        qCarNote = 319;
        jCarNote = 329;
        int moneyLeftOver;


        income = qcdt + jcdt + josh + qpierce;
        monthlyBills = mortgage + jCarNote + qCarNote;
        moneyLeftOver = income - monthlyBills;

        System.out.println(moneyLeftOver);




    }
}
