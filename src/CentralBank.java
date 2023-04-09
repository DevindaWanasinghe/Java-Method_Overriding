public class CentralBank {
    int getInterestRate(){
        return 0;
    }
}
class BOC extends CentralBank{
    @Override
    int getInterestRate() {
        return 8;
    }
}
class PeoplesBank extends CentralBank{
    @Override
    int getInterestRate() {
        return 10;
    }
}
class CommercialBank extends CentralBank{
    @Override
    int getInterestRate() {
        return 12;
    }
}
class TestOverriding {
    public static void main(String[] args) {
        BOC b = new BOC();
        PeoplesBank p = new PeoplesBank();
        CommercialBank c = new CommercialBank();
        System.out.println("Interest Rate :- " + b.getInterestRate() + "%");
        System.out.println("Interest Rate :- " + p.getInterestRate() + "%");
        System.out.println("Interest Rate :- " + c.getInterestRate() + "%");
    }
}

