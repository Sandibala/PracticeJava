package task5;
import java.time.Instant;

public class Event {
    private final Long userId;
    private final EventType type;
    private final Instant timestamp;

    public Event(Long userId, EventType type, Instant timestap){
        this.userId = userId;
        this.type = type;
        this.timestamp = timestap;
    }
    public Long getUserId() {
        return userId;
    }

    public EventType getType() {
        return type;
    }

    public Instant getTimestamp() {
        return timestamp;
    }
}
