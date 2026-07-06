package src;
public class searchServices {
    public static products linearSearch(products[]pdt , int key) {
        for(products p : pdt) {
            if(p.productId == key) return p;
        }
        return null;
    }
    public static products binarySearch(products[]pdt , int key) {
        int l = 0 ;
        int r = pdt.length -1;

        while(l <= r) {
            int mid = l + (r - l) /2 ;
            if(pdt[mid].productId == key) return pdt[mid];
            else if(pdt[mid].productId > key)  r = mid - 1;
            else l = mid + 1;
        }
        return null;
    }
}
