package bussReserve;

public class Bus {
    private int busNo;
    private boolean ac;
    private int capacity;
    Bus(int no,boolean ac,int cap){
        this.busNo=no;
        this.ac=ac;
        this.capacity=cap;
    }

    public int getBusNo() {
        return busNo;
    }

    public boolean isAc() {
        return ac;
    }

    public int getCapacity(){  // Acces method
        return capacity;
    }

    public void setAc(boolean val) {
        this.ac = val;
    }

    public void setCapacity(int cap){ //mutator methods reset the value of a private variable.
        capacity = cap;
    }
    public void displayBusInfo(){
        System.out.println("Bus No:"+ busNo +" Ac:"+ ac +" Total Capacity:"+ capacity);
    }
}
