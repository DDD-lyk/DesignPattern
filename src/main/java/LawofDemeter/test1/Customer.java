package LawofDemeter.test1;

public class Customer implements ICustomer {

    public void findHourse(IHouse house) {
        house.Housing();
    }
}