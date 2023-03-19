package Q7_02_Call_Center;

class Respondent extends Q7_02_Call_Center.Employee {
    public Respondent(Q7_02_Call_Center.CallHandler callHandler) {
        super(callHandler);
        rank = Q7_02_Call_Center.Rank.Responder;
    }
}
