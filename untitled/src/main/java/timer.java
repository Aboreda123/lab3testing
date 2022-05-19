public class timer {
    int time;
    public void setTimer(int intime){
        this.time = intime;
    }
    public void startHeater(int temp){
        heat heat= new heat();
        while(this.time!=0){
            heat.setTemp(temp);
            this.time--;
        }
    }
}
