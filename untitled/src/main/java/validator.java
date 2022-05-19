public class validator {

    public String cardvalidator(String cardnum){
        return cardnum.length()== 16 ? "valid":"invalid";
    }
    public String pinvalidator(String pinnum){
        return pinnum.length()== 4 ? "valid":"invalid";
    }
    public String access(String pin, String card, String mode,int amount){
        if(cardvalidator(card)=="invalid"||pinvalidator(pin)==("invalid"))
        {
            return "invalid card or pin";
        }
        money money = new money(1000);
        if(amount<0) return "cannot complete transaction";
        if(mode=="deposit") {
            money.deposit(amount);
        } else if (mode=="withdrawal") {
            int t =money.withdrawal(amount);
            if (t==-1) return "No sufficent amount";
        } else{
            return "undefined mode";
        }
        return "transaction success";
    }
}

