
import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {
        
        // Declaration
        List<Integer> list = new ArrayList<>();


        // add()
        list.add(10);
        list.add(20);
        list.add(30);
        System.out.println(list); // [10, 20, 30]
        
        // add(index, element)
        list.add(1, 15);
        System.out.println(list); // [10, 15, 20, 30]
        // get(index)
        System.out.println(list.get(2)); // 20
        
        
        // set(index, element)
        list.set(2, 25);
        System.out.println(list); // [10, 15, 25, 30]
        
        // remove(index)
        list.remove(1);
        System.out.println(list); // [10, 25, 30]  
        
        // remove(Object)
        list.remove(Integer.valueOf(25));
        System.out.println(list); // [10, 30]
        
        // size()
        System.out.println(list.size()); // 2
        
        // contains()
        System.out.println(list.contains(67)); // true
        
        
        // indexOf() & lastIndexOf()
        list.add(10);
        list.add(10);
        System.out.println(list);
        System.out.println(list.indexOf(10)); // 0
        System.out.println(list.lastIndexOf(10)); // 2
        
        // clear()
        list.clear();
        System.out.println(list.isEmpty()); 
        System.out.println(list); // []


    }
}




// Common List Methods (Very Important)

// add() -- normal add
// add(index, element)  -- add at particular index
// get(index)  -- get data from particular index
// set(index, element)  -- update data at particular index
// remove(index)  --- remove data at ith index
// remove(Object) -- remove element directly if don't know index
// size()  -- check the size of list
// contains()  -- boolean method to check whether given element are there are not
// indexOf()  -- get the index of particular element 
// lastIndexOf() -- give you last index
// clear()  -- clear all element