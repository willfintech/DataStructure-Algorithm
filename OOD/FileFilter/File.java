package OOD.FileFilter;

import java.util.Date;

public class File {
    String fileName;
    int size;
    String type;  // txt doc pdf
    String creator;
    Date createDate;
    String content;

    public File(String fileName, int size, String type, String creator, Date createDate) {
        this.fileName = fileName;
        this.size = size;
        this.type = type;
        this.creator = creator;
        this.createDate = createDate;
    }

    private String addContent(String str) {
        this.content += str;
        return this.content;
    }
}

