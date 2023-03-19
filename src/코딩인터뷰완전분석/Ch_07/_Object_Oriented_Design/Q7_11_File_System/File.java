package 코딩인터뷰완전분석.Ch_07._Object_Oriented_Design.Q7_11_File_System;

public class File extends Entry {
    private String content;
    private final int size;

    public File(String n, Directory p, int sz) {
        super(n, p);
        size = sz;
    }

    public int size() {
        return size;
    }

    public String getContents() {
        return content;
    }

    public void setContents(String c) {
        content = c;
    }
}
