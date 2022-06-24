import Ticket.TicketPrice;
import org.testng.Assert;
import org.testng.annotations.Test;

public class UnitTest {
    @Test
    public void test1() {
        int res = 10 + 2;

        Assert.assertEquals(res, 12);
    }

    @Test
    public void ticketPrice_infant_freeTicket() {
        //Arrange - Given - pre-condition
        TicketPrice infant = new TicketPrice(1, 1000);

        //Act - When - real test happens now
        double result = infant.calculate();

        //Assert - Then - validation
        Assert.assertEquals(result, 0.0);
    }

    @Test
    public void ticketPrice_child_halfPrice() {
        TicketPrice child = new TicketPrice(5, 1000);
        double result = child.calculate();
        Assert.assertEquals(result, 500.0);
    }

    @Test
    public void ticketPrice_adult_halfPrice() {
        TicketPrice adult = new TicketPrice(25, 1000);
        double result = adult.calculate();
        Assert.assertEquals(result, 1000.0);
    }

    @Test
    public void ticketPrice_senior_halfPrice() {
        TicketPrice senior = new TicketPrice(85, 1000);
        double result = senior.calculate();
        Assert.assertEquals(result, 800.0);
    }
}
