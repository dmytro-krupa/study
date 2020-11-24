package lec9.solid;

import java.util.List;

public class S {
    static class User {
        private String name;
        private String surname;
        private List<Access> accessList;

        public boolean hasAccessToFile(String fileName){
            List<Access> neededAccess = accessDummyMethod(fileName);

            for(Access access : neededAccess){
                if(accessList.contains(access)){
                    return true;
                }
            }
            return false;
        }
    }

    static class Job {
        private String jobName;
        private List<Access> jobAccessList;

        public boolean hasAccessToFile(String fileName){
            List<Access> neededAccess = accessDummyMethod(fileName);

            for(Access access : neededAccess){
                if(jobAccessList.contains(access)){
                    return true;
                }
            }
            return false;
        }
    }

    static enum Access{
        A1,     //top access
        A2,
        B1,
        B2,
        C1,
        C2
    }


    public static List<Access> accessDummyMethod(String fileName){
        return null;
    }
}
