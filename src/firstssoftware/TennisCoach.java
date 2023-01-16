package firstssoftware;

import org.springframework.stereotype.Component;

@Component("thatcoach")
public class TennisCoach implements Coach{

    @Override
    public String getDailyWorkout() {
        return "Practice your backhand volley";
    }
}
