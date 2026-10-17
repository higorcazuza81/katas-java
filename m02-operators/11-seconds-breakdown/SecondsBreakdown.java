void main() {
    // Convert seconds to hours, minutes, and seconds
    int totalSeconds = 3725;

    int hours = totalSeconds / 3600;
    int minutes = (totalSeconds % 3600) / 60;
    int seconds = totalSeconds % 60;

    IO.println(hours + "h " + minutes + "m " + seconds + "s");

}