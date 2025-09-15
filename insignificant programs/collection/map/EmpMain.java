public package List.Map;

import java.util.TreeMap;

public class EmpMain {
    public static void main(String[] args) {
        TreeMap<Emp,Double> tm = new TreeMap<Emp, Double>();
        tm.put(new Emp(22,"Jeff"),35.35);
        tm.put(new Emp(18,"Abi"),0.0);
        tm.put(new Emp(24,"Zorah"),55.555);

        for(Emp emp : tm.keySet())
            System.out.println(emp + " and earns Rs."+ tm.get(emp)+ " Crore.");
    }
}
 EmpMain {
    
}
