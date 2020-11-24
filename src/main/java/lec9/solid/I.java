package lec9.solid;

public class I {
    interface FileManager{
        void connectToServer();
        void deleteFile();
        void addFile();
        void moveFile();
    }

    class RemoteServerFileManager{}

    class RESTServerFileManager{}

    class LocalServerFileManager{}
}
