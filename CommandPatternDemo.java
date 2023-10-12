// Task-11 (Command Pattern)

import java.util.ArrayList;
import java.util.List;


interface Command {
    void execute();
}

class TicketSystem {
    private List<String> order = new ArrayList<>();

    public void addTicket(String ticket) {
        order.add(ticket);
        System.out.println("Added ticket: " + ticket);
    }

    public void removeTicket(String ticket) {
        order.remove(ticket);
        System.out.println("Removed ticket: " + ticket);
    }

    public void checkout() {
        System.out.println("Your order:");
        for (String ticket : order) {
            System.out.println("- " + ticket);
        }
        System.out.println("Total: $" + (order.size() * 60)); 
    }
}

class AddTicketCommand implements Command {
    private TicketSystem ticketSystem;
    private String ticket;

    public AddTicketCommand(TicketSystem ticketSystem, String ticket) {
        this.ticketSystem = ticketSystem;
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticketSystem.addTicket(ticket);
    }
}

class RemoveTicketCommand implements Command {
    private TicketSystem ticketSystem;
    private String ticket;

    public RemoveTicketCommand(TicketSystem ticketSystem, String ticket) {
        this.ticketSystem = ticketSystem;
        this.ticket = ticket;
    }

    @Override
    public void execute() {
        ticketSystem.removeTicket(ticket);
    }
}

class CheckoutCommand implements Command {
    private TicketSystem ticketSystem;

    public CheckoutCommand(TicketSystem ticketSystem) {
        this.ticketSystem = ticketSystem;
    }

    @Override
    public void execute() {
        ticketSystem.checkout();
    }
}

class User {
    private Command command;

    public void setCommand(Command command) {
        this.command = command;
    }

    public void executeCommand() {
        command.execute();
    }
}

public class CommandPatternDemo {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();
        User user = new User();

        Command addTicketCommand1 = new AddTicketCommand(ticketSystem, "Concert Ticket");
        Command addTicketCommand2 = new AddTicketCommand(ticketSystem, "Movie Ticket");
        Command removeTicketCommand = new RemoveTicketCommand(ticketSystem, "Concert Ticket");
        Command checkoutCommand = new CheckoutCommand(ticketSystem);

        user.setCommand(addTicketCommand1);
        user.executeCommand();

        user.setCommand(addTicketCommand2);
        user.executeCommand();

        user.setCommand(removeTicketCommand);
        user.executeCommand();

        user.setCommand(checkoutCommand);
        user.executeCommand();
    }
}
