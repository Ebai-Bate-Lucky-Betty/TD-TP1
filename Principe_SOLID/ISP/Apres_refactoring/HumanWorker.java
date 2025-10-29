public class HumanWorker implements Workable, Eatable {

    @Override public void work() { 
        System.out.println("Humans work"); 
    }

    @Override public void eat() { 
        System.out.println("Humans eat"); 
    }
}
