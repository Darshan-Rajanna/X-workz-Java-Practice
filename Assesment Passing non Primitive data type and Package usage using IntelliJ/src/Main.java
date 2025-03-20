import com.xworkz.services.Pushpa;
import com.xworkz.entities.*;
import com.xworkz.models.Virat;
import com.xworkz.enums.*;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        System.out.println("Pushpa Class Demonstration with useclip() function ");
            Clip[] clips = {
                    new Clip("Red"),
                    new Clip("Blue"),
                    new Clip("Green"),
                    new Clip("Yellow"),
                    new Clip("Black")
            };

            Pushpa pushpa = new Pushpa();
            pushpa.useClip(clips);

        System.out.println("-----------------------------------");

        Brush brush = new Brush(Color.BLUE);
        Clip clip = new Clip("Black");
        Ticket ticket = new Ticket(TicketType.VIP, 5000);
        Cricket cricket = new Cricket(ticket);

        System.out.println("Virat Class with all entities involved");
        System.out.println("------------------------------------");
        Virat virat = new Virat(brush, clip, cricket, ticket);

        virat.play();
        virat.clean();
        virat.relax();
        virat.gift();
        }
}