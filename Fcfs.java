import java.util.*;

public class Fcfs {
    public static void main(String[] args) {
        ArrayList<Process> processList = new ArrayList<>();
        ArrayList<Integer> turnarround = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int i=0,iteraion=1;
        for (;;)
        {
            System.out.println("Iteration "+iteraion+"."+"\n");
            iteraion++;
            System.out.print("Input n=");
            int processcounter=0;
            for (int n = scanner.nextInt();n>0;n--)
            {
                i++;
                System.out.print(i+".       ");
                Process process = new Process();
                process.ProcessID = i;
                process.ProcessName = scanner.next().toUpperCase();
                process.Duration = scanner.nextInt();
                process.ArrivalTime = scanner.nextInt();
                processList.add(process);
                processcounter++;
            }
            Collections.sort(processList);
            System.out.println("\n"+"Output:"+"\n");
            int timeline=0;
            for (int count_process=0;count_process<processList.size();count_process++)
            {
                System.out.println(processList.get(count_process).ProcessID+"    "+processList.get(count_process).ProcessName+"    "+timeline+"-"+(timeline+processList.get(count_process).Duration)+"    "+((timeline+processList.get(count_process).Duration)-processList.get(count_process).ArrivalTime));
                turnarround.add(((timeline+processList.get(count_process).Duration)-processList.get(count_process).ArrivalTime));
                timeline=timeline+processList.get(count_process).Duration;
            }
            System.out.print("\n"+"A.T.T=");
            int counter=0, sum=0;
            for (int turncounter=0;turncounter<turnarround.size();turncounter++)
            {
                sum=turnarround.get(turncounter)+sum;
                counter++;
            }
            float att=0;
            att= (sum/counter);
            System.out.println(att+"\n");
        }
    }
}