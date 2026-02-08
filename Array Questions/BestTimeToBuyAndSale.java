public class BestTimeToBuyAndSale {
    static int maxProfitByBuyingSelling(int prices[]){
        int max =0;
        int profit=0;
        int buymini=prices[0];

        for(int i=0; i<prices.length; i++){
            // Calculate profit
            profit = prices[i] - buymini;

            if(profit>max){
                max = profit;
            }

            // Get minimum price to buy
            if(prices[i]<buymini){
                buymini = prices[i];
            }
        }
        return max;
    }
    public static void main(String[] args) {
        int prices[] = {7,1,5,3,6,4};
        System.out.println(maxProfitByBuyingSelling(prices));
    }
}
