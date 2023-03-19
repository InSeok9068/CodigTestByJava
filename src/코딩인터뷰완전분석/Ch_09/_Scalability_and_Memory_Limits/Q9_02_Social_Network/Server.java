package 코딩인터뷰완전분석.Ch_09._Scalability_and_Memory_Limits.Q9_02_Social_Network;

import java.util.HashMap;

public class Server {
    HashMap<Integer, Machine> machines = new HashMap<Integer, Machine>();
    HashMap<Integer, Integer> personToMachineMap = new HashMap<Integer, Integer>();

    public Machine getMachineWithId(int machineID) {
        return machines.get(machineID);
    }

    public int getMachineIDForUser(int personID) {
        Integer machineID = personToMachineMap.get(personID);
        return machineID == null ? -1 : machineID;
    }

    public Person getPersonWithID(int personID) {
        Integer machineID = personToMachineMap.get(personID);
        if (machineID == null) {
            return null;
        }
        Machine machine = getMachineWithId(machineID);
        if (machine == null) {
            return null;
        }
        return machine.getPersonWithID(personID);
    }
}
