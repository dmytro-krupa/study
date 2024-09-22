package lec2.lec2024.oop;

public class FileAccess {
    private String localField1;
    private String localField2;

    private String remoteField1;
    private String remoteField2;

    private String generalField1;
    private String generalField2;

    private FileAccess(String localField1, String localField2, String remoteField1, String remoteField2, String generalField1, String generalField2) {
        this.localField1 = localField1;
        this.localField2 = localField2;
        this.remoteField1 = remoteField1;
        this.remoteField2 = remoteField2;
        this.generalField1 = generalField1;
        this.generalField2 = generalField2;
    }

    public static FileAccess getLocalAccess(String localField1, String localField2, String generalField1, String generalField2){
        return new FileAccess(localField1, localField2, null, null, generalField1, generalField2);
    }
    public static FileAccess getRemoteAccess(String remoteField1, String remoteField2, String generalField1, String generalField2){
        return new FileAccess(null, null, remoteField1, remoteField2, generalField1, generalField2);

    }

}
