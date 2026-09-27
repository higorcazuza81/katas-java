void main() {
    long bytes = 5368709120L;

    long kilobytes = bytes / 1024L;
    long megabytes = bytes / (1024L * 1024L);
    long gigabytes = bytes / (1024L * 1024L * 1024L);

    IO.println("Bytes: " + bytes);
    IO.println("Kilobytes: " + kilobytes);
    IO.println("Megabytes: " + megabytes);
    IO.println("Gigabytes: " + gigabytes);
}