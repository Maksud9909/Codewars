package CodeWars;
class Swapper{

    public Object[] arguments;
    public void swapValues() {
        Object[] args = new Object[]{arguments[0],arguments[1]};
        Object temp = args[0];
        args[0] = args[1];
        args[1] = temp;
    }

    public Swapper(final Object[] args){
        arguments=args;
    }


}
