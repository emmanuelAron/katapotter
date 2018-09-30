public class Potter {

    public static int costs(int[] books) {

        if(books.length == 1){
            return 8;
        }
        if(books.length == 2){
            return 2*8;
        }
        return 0;
    }
}
