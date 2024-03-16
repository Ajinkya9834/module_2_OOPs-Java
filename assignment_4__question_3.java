class Vehicle{
    String name;
    int model;
    float price;
    String company;

        public void accept(String name, int model, float price, String company){
            this.name= name;
            this.model = model;
            this.price = price;
            this.company = company;
            System.out.println("inside");
        } 
        public void accept(String name, float price, String company){
            this.name =name;
            this.price = price;
            this.company = company;
            System.out.println("inside11");

        }

        public void display(){
            System.out.println("name: "+this.name+"  price: "+ this.price+"  model: " +this.model+"  company: " +this.company);
        }

}

class prog{
   public static void main(String[] args){

        Vehicle vehref = new Vehicle();
        Vehicle vehref1 = new Vehicle();

        vehref.accept("nano",80250.52f,"Tata");
        vehref1.accept("nano",45,10000.25f,"Tata");

        vehref.display();
        vehref1.display();
   
    }

    
   


}
