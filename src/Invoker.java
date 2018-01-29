public class Invoker {
    private Command command;
    public Invoker(Command command)
    {
        this.command = command;
    }
    public void action()
    {
        System.out.println("命令已发出！");
        command.execute();
    }
}
