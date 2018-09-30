
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class PotterTest {

    int[] books;
    @BeforeEach
    public void init(){
        books = new int[]{};
    }
    @Test
    public void no_books_should_cost_zero(){
         assertThat(0).isEqualTo(Potter.costs(books));
    }
    @Test
    public void one_copy_of_first_book_cost_eight(){
        //0 -> 1st book of the serie
        //1 -> 2nd book of the serie ...
         assertThat(8).isEqualTo(Potter.costs(new int[]{0}) );
    }@Test
    public void one_copy_of_second_book_cost_eight(){
         assertThat(8).isEqualTo(Potter.costs(new int[]{1}) );
    }
    @Test
    public void one_copy_of_third_book_cost_eight(){
        assertThat(8).isEqualTo(Potter.costs(new int[]{2}) );
    }
    @Test
    public void one_copy_of_fourth_book_cost_eight(){
        assertThat(8).isEqualTo(Potter.costs(new int[]{3}) );
    }
    @Test
    public void one_copy_of_fifth_book_cost_eight(){
        assertThat(8).isEqualTo(Potter.costs(new int[]{4}) );
    }
    @Test
    public void two_copy_of_first_book_has_no_discount(){
        assertThat(16).isEqualTo(Potter.costs(new int[]{0,0}) );
    }@Test
    public void two_copy_of_fifth_book_has_no_discount(){
        assertThat(16).isEqualTo(Potter.costs(new int[]{4,4}) );
    }
    @Test
    public void one_copy_of_first_book_and_one_of_second_book(){
        assertThat(2 * 0.95*8 ).isEqualTo(Potter.costs(new int[]{0,1}) );
    }
}
