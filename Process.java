public class Process implements Comparable<Process> {
    public String ProcessName;
    public int ProcessID;
    public int Duration;
    public int ArrivalTime;
    public int compareTo(Process process){
        int compareduration=process.ArrivalTime;
        return this.Duration-compareduration;
    }
}

