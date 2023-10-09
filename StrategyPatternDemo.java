// Task-6 (Strategy Pattern)

public class StrategyPatternDemo {
    public static void main(String[] args) {
        Context context = new Context(new OperationAdd());
        System.out.println(context.executeStrategy(5,4));
        context = new Context(new OperationSubstruct());
            System.out.println(context.executeStrategy(10,4));
            context = new Context(new OperationMult());
            System.out.println(context.executeStrategy(5,5));
            context = new Context(new OperationDiv());
            System.out.println(context.executeStrategy(25,5));
    }
}

class Context {
    private IStrategy strategy;
    public Context(IStrategy strategy){
        this.strategy = strategy;
    }
    public int executeStrategy(int num1, int num2){
        return strategy.doOperation(num1,num2);
    }
}

interface IStrategy {
    int doOperation(int a, int b);
}

class OperationAdd implements IStrategy {

    @Override
    public int doOperation(int a, int b) {
        return a+b;
    }
}

class OperationSubstruct implements IStrategy {

    @Override
    public int doOperation(int a, int b) {
        return a-b;
    }
}
class OperationMult implements IStrategy {

    @Override
    public int doOperation(int a, int b) {
        return a*b;
    }
}
class OperationDiv implements IStrategy {

    @Override
    public int doOperation(int a, int b) {
        return a/b;
    }
}