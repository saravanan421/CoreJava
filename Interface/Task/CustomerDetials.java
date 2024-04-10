package Com.Interface.Task;

public class CustomerDetials implements DoorDelivery, BonusPoints {
    private String customerName;
    private String phoneNumber;
    private String streetName;
    private double billAmount;
    private int distance;

    public CustomerDetials(String customerName, String phoneNumber, String streetName, double billAmount, int distance) {
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.streetName = streetName;
        this.billAmount = billAmount;
        this.distance = distance;
    }

    public int getDistance() {
        return distance;
    }

    public double getBillAmount() {
        return billAmount;
    }

    public String getStreetName() {
        return streetName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    public void setBillAmount(double billAmount) {
        this.billAmount = billAmount;
    }

    public void setStreetName(String streetName) {
        this.streetName = streetName;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    @Override
    public double calculateBonusPoints() {
        if (this.billAmount>=250){
            return this.billAmount/10;
        }
        return 0;
    }

    @Override
    public double deliveryCharge() {
        if (this.distance >=25) {
            return   this.distance*8  ;
        }
        else if (this.distance>=15 && this.distance<25) {
            return this.distance*5;

        } else if (this.distance<15) {
            return this.distance*2;
        }
        return 0;
    }


    @Override
    public String toString() {
        return "CustomerDetials" +
                "customerName='" + this.customerName + '\n' +
                "phoneNumber='" + this.phoneNumber + '\n' +
                "streetName='" + this.streetName + '\n' +
                "billAmount=" + this.billAmount +"\n"+
                "distance=" + this.distance +"\n"+
                "Bonus points="+calculateBonusPoints()+"\n"+"Delivery charge="+deliveryCharge();
    }
}
