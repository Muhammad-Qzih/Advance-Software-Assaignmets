package Company.Implementation;

public abstract class User {
    private String name;
    private int id;
    private double hourlyRate;
    private int completedHours;

    private boolean connected = false;

    public User(String name, int id, double hourlyRate, int completedHours) {
        this.name = name;
        this.id = id;
        this.hourlyRate = hourlyRate;
        this.completedHours = completedHours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public double getHourlyRate() {
        return hourlyRate;
    }


    public int getCompletedHours() {
        return completedHours;
    }


    public String getDetails() {
        return "Name: " + name + "\n" +
                "ID: " + id + "\n" +
                "Hourly Rate: $" + hourlyRate + "\n" +
                "Completed Hours: " + completedHours;
    }

    public void setConnected(boolean connected) {
        this.connected = connected;
    }

    public boolean isConnected() {
        return this.connected;
    }
}