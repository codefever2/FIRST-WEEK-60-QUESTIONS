import java.util.*;

class studentlist
  {
    public static void main(String[] args)
    {
       int startingrollno=101;
       int totalnumberofstudents = 20;
       int noofgroups=4;
       int studentspergroup = totalnumberofstudents/noofgroups; 
      int[][] student = new int[studentspergroup][noofgroups];
        for(int i=0;i<studentspergroup;i++)
         {
           for(int j=0;j<noofgroups;j++)
             {
                student[i][j] = startingrollno;
                 startingrollno++;
             }
         }
      for(int j=0;j<noofgroups;j++)
      {
          System.out.println("Group "+(j+1)+" : ");
      for(int i=0;i<studentspergroup;i++)
      {
      System.out.println(student[i][j]);
      }
      }
    }
  }