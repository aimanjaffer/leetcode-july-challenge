class AngleClockHands{
    public double angleClock(int hour, int minutes) {
        if(hour==12)
            hour=0;
        int hourInMins = hour * 60 + minutes;
        double hourHandAngle = 0.5 * hourInMins;
        double minHandAngle = 6 * minutes;
        //System.out.println("min hand: "+minHandAngle);
        //System.out.println("hour hand: "+hourHandAngle);
        double angle = Math.abs(minHandAngle-hourHandAngle);
        return (angle > 180.0) ? (360.0-angle) : angle;
    }
}