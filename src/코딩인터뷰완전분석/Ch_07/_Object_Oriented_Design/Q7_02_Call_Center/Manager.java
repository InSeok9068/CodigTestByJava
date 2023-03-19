package Q7_02_Call_Center;

class Manager extends Q7_02_Call_Center.Employee {
    public Manager(Q7_02_Call_Center.CallHandler callHandler) {
        super(callHandler);
        rank = Q7_02_Call_Center.Rank.Manager;
    }
}
