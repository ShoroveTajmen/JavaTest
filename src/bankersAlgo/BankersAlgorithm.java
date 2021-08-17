package bankersAlgo;

public class BankersAlgorithm {

    int process = 5;                               // Number of processes
    int resources = 3;                            // Number of resources
    int need[][] = new int[process][resources];
    int [][]max;
    int [][]allocation;
    int []available;
    int safeSequence[] = new int[process];

    void SetValues()
    {
        // P0, P1, P2, P3, P4 are the Process names here
        // Matrix Alocation
        allocation = new int[][] { { 0, 1, 0 }, //P0
                { 2, 0, 0 }, //P1
                { 3, 0, 2 }, //P2
                { 2, 1, 1 }, //P3
                { 0, 0, 2 } }; //P4

        // MAX Matrix
        max = new int[][] { { 7, 5, 3 }, //P0
                { 3, 2, 2 }, //P1
                { 9, 0, 2 }, //P2
                { 2, 2, 2 }, //P3
                { 4, 3, 3 } }; //P4

        // Available Resources
        available = new int[] { 3, 3, 2 };
    }

    void CheckISsafe()
    {
        int count=0;

        //visited array to find the already allocated process
        boolean visited[] = new boolean[process];
        for (int i = 0;i < process; i++)
        {
            visited[i] = false;
        }

        //work array to store the copy of available resources
        int work[] = new int[resources];
        for (int i = 0;i < resources; i++)
        {
            work[i] = available[i];
        }

        while (count<process)
        {
            boolean flag = false;
            for (int i = 0;i < process; i++)
            {
                if (visited[i] == false)
                {
                    int j;
                    for (j = 0;j < resources; j++)
                    {
                        if (need[i][j] > work[j])
                            break;
                    }
                    if (j == resources)
                    {
                        safeSequence[count++]=i;
                        visited[i]=true;
                        flag=true;

                        for (j = 0;j < resources; j++)
                        {
                            work[j] = work[j]+allocation[i][j];
                        }
                    }
                }
            }
            if (flag == false)
            {
                break;
            }
        }
        if (count < process)
        {
            System.out.println("System is UnSafe...");
        }
        else
        {
            //System.out.println("The given System is Safe");
            System.out.println("Sequence of processes...");
            for (int i = 0;i < process; i++)
            {
                System.out.print("P" + safeSequence[i]);
                if (i != process-1)
                    System.out.print(" -> ");
            }
        }
    }

    void NeedCalcu()
    {
        for (int i = 0;i < process; i++)
        {
            for (int j = 0;j < resources; j++)
            {
                need[i][j] = max[i][j]-allocation[i][j];
            }
        }
    }
    public static void main(String[] args) {
        {
            int i, j, k;
            BankersAlgorithm ba  = new BankersAlgorithm();

            ba.SetValues();
            //Calculate the Need Matrix
            ba.NeedCalcu();

            // Check whether system is in safe state or not
            ba.CheckISsafe();
        }
    }
}
