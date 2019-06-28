import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class SeriesParameterizedTest {

    private int n;
    private int p;
    private int expectedFibo;
    private int expectedFact;
    private int expectedSumOfPow;


    public SeriesParameterizedTest(int n, int p, int expectedFibo,
                                   int expectedFact, int expectedSumOfPow){
        this.n = n;
        this.p = p;
        this.expectedFibo = expectedFibo;
        this.expectedFact = expectedFact;
        this.expectedSumOfPow = expectedSumOfPow;
    }

    @Parameterized.Parameters
    public static Collection<Integer[]> data() {
        return Arrays.asList(new Integer[][]{
                        {5, 2, 5, 120, 55},
                        {8, 2, 21, 40320, 204},
                        {0, 2, 0, 1, 0},
                        {1, 2, 1, 1, 1},
                        {2, 2, 1, 2, 5}
                }
        );
    }

    @Test
    public void fibonacci1Test() {
        Series series = new Series(n);
        int result = series.fibonacci1(series.getN());
        Assert.assertEquals(expectedFibo, result);
    }

    @Test
    public void fibonacci2Test() {
        Series series = new Series(n);
        int result = series.fibonacci2(series.getN());
        Assert.assertEquals(expectedFibo, result);
    }

    @Test
    public void factorial1est() {
        Series series = new Series(n);
        int result = series.factorial1(series.getN());
        Assert.assertEquals(expectedFact, result);
    }

    @Test
    public void factorial2Test() {
        Series series = new Series(n);
        int result = series.factorial2(series.getN());
        Assert.assertEquals(expectedFact, result);
    }

    @Test
    public void sumOfPowers1Test() {
        Series series = new Series(n);
        int result = series.sumOfPowers1(series.getN(), p);
        Assert.assertEquals(expectedSumOfPow, result);
    }

    @Test
    public void sumOfPowers2Test() {
        Series series = new Series(n);
        int result = series.sumOfPowers2(series.getN(), p);
        Assert.assertEquals(expectedSumOfPow, result);
    }
}