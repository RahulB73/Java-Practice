 // Object Creating in java
 
 class TV {
    String name;
    String type;
    int price;
    
    public static void main(String[] args) {
       TV T1 = new TV();
       T1.name = "Samsung";
       T1.type = "LCD";
       T1.price = 15000;
       
       System.out.println(T1.name);
       System.out.println(T1.type);
       System.out.println(T1.price);
       System.out.println("-----------");
       
       TV T2 = new TV();
       T2.name = "Mi";
       T2.type = "LED";
       T2.price = 18000;
       
       System.out.println(T2.name);
       System.out.println(T2.type);
       System.out.println(T2.price);
       System.out.println("-----------");
       
       
       TV T3 = new TV();
       T3.name = "LG";
       T3.type = "OLED";
       T3.price = 16000;
       
       System.out.println(T2.name);
       System.out.println(T2.type);
       System.out.println(T2.price);
    }
}

