class Cashier {

    int n;
    int dsc;
    // int pro[];
    // int pri[];
    int m;
    Map<Integer,Integer> map;
    int c;
    public Cashier(int n, int discount, int[] products, int[] prices) {
        this.n=n;
        this.dsc=discount;
         m=products.length ;
        // pro=new int[m];
        // pri=new int[m];
        // this.pro=products;
        // this.pri=prices;
        map=new HashMap<>();
        for(int i=0;i<m;i++) map.put(products[i],prices[i]);
        this.c=1;
    }
    
    public double getBill(int[] product, int[] amount) {
        double total=0;
        for(int i=0;i<product.length;i++){
            total+=map.get(product[i])*amount[i];
        }
        if(c%n==0){
            c++;
            return total-(total*dsc)/100;
        }
        c++;
        return total;
    }
}

/**
 * Your Cashier object will be instantiated and called as such:
 * Cashier obj = new Cashier(n, discount, products, prices);
 * double param_1 = obj.getBill(product,amount);
 */