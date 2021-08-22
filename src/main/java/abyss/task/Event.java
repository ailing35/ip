package abyss.task;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Event extends Task {
    protected LocalDate at;

    public Event(String description, LocalDate at) {
        super(description);
        this.at = at;
    }

    @Override
    public String toString() {
        return "  [E]" + super.toString() + " (at: " + at.format(DateTimeFormatter.ofPattern("dd MMM yyyy")) + ")";
    }

    @Override
    public String toFileEntry() {
        return "E | " + super.getIsDone() + " | " + super.description + " | " + this.at;
    }
}