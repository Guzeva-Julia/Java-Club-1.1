public class Hryvnia {
    public static void main(String[] args)
    {
        int x = 4;
        
        if (x==1){
        System.out.println("1 гривня ");
    }
        else if (x>=2 && x<=4){
        System.out.println(x + " гривні ");
    }
        else if (x>=5 && x<=10){
        System.out.println(x + " гривень ");
    }
        else   {
        System.out.println("Число занадто велике для цього завдання");
    }

    }
}

