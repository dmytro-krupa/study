package lec9.solid;

public class I {
    public static void main(String[] args) {
        RemoteServerFileManager fileManager = new RemoteServerFileManager();

        fileManager.connectToServer("");
        fileManager.deleteFile();
    }

    interface RemoteServerConnector{
        void connectToServer(String username);
    }

    interface FileManager{
        void deleteFile();
        void addFile();
        void moveFile();
    }

    static class RemoteServerFileManager implements FileManager, RemoteServerConnector{
        @Override
        public void connectToServer(String username) {

        }

        @Override
        public void deleteFile() {

        }

        @Override
        public void addFile() {

        }

        @Override
        public void moveFile() {

        }
    }

    static class RESTServerFileManager implements FileManager, RemoteServerConnector{
        @Override
        public void connectToServer(String username) {

        }

        @Override
        public void deleteFile() {

        }

        @Override
        public void addFile() {

        }

        @Override
        public void moveFile() {

        }
    }

    static class LocalServerFileManager implements FileManager{
        @Override
        public void deleteFile() {

        }

        @Override
        public void addFile() {

        }

        @Override
        public void moveFile() {

        }
    }
}
