package Q7_02_Call_Center;

class Director extends Q7_02_Call_Center.Employee {
    public Director(Q7_02_Call_Center.CallHandler callHandler) {
        super(callHandler);
        rank = Q7_02_Call_Center.Rank.Director;
    }
}
