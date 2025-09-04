package Genums;

public enum Currency {
    GBP("£"), USD("$"), EUR("€");


private final String symbol;

Currency(String symbol){
    this.symbol = symbol;
}

public String symbol(){
    return symbol;
}

public String format(double amount){
    return symbol + String.format("%.2f",amount);
}

}