import java.io.FileInputStream;
import java.util.*;

public class Main1 {
    public static void main(String[] args) {
        String file = "product.txt";
        Scanner sc;
        String temp;
        String[] product;
        Product p;
        ArrayList<Product> list = new ArrayList<>();

        try{
            sc = new Scanner(new FileInputStream(file));
            while(sc.hasNextLine()){
                temp = sc.nextLine();
                product = temp.split(",");
                p = new Product(product[0], Integer.parseInt(product[1]), product[2]);
                list.add(p);
            }
            for(Product pro : list){
                System.out.println(pro);
            }
        }catch (Exception e){
            e.printStackTrace();
        }




    }
}
