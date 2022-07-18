public class Task1 {
    private String taskName;
    private String taskSolution;

    public Task1(String taskName, String taskSolution) {
        this.taskName = taskName;
        this.taskSolution = taskSolution;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getTaskSolution() {
        return taskSolution;
    }

    public void setTaskSolution(String taskSolution) {
        this.taskSolution = taskSolution;
    }

    @Override
    public String toString(){
        return getClass().getName() + "[taskName = " + taskName + ", taskSolution = " + taskSolution + "]";
    }
}

