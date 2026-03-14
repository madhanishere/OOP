import java.util.*;
import java.util.ArrayList;
import java.util.stream.Collectors;

class Laptop {
    String brand;
    int price;

    Laptop(String brand, int price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return brand + " ($" + price + ")";
    }
}
class pricecomp implements Comparator<Laptop>{
    public int compare(Laptop l1,Laptop l2){
        return l1.price-l2.price;
    }
}
class brandcomp implements Comparator<Laptop>{
    public int compare(Laptop l1,Laptop l2){
        return l1.brand.compareTo(l2.brand);
    }
}
public class Comparator_eg {
    public static void main(String[] args) {
        ArrayList<Laptop> laptops = new ArrayList<>();
        laptops.add(new Laptop("Dell", 800));
        laptops.add(new Laptop("Apple", 1200));
        laptops.add(new Laptop("HP", 600));
//       Collections.sort(laptops,(l1, l2) -> l1.price - l2.price);
//        System.out.println(laptops.toString());
//        // RULE 1: Sort by Brand (Alphabetical)
//        Comparator<Laptop> brandRule = (l1, l2) -> l1.brand.compareTo(l2.brand);
//        Collections.sort(laptops, brandRule);
//        System.out.println("By Brand: " + laptops);
//
//        // RULE 2: Sort by Price (Low to High)
//        Comparator<Laptop> priceRule = (l1, l2) -> l1.price - l2.price;
//        Collections.sort(laptops, priceRule);
//        System.out.println("By Price: " + laptops);
//        List<String> al=laptops.stream().filter(l -> l.price<=600).map(l->l.brand).collect(Collectors.toList());
//        for(String s:al) System.out.println(s);
        long  i=laptops.stream().filter(l -> l.price>600).
                filter(l->l.price>800).count();

        System.out.println(i);
    }
}